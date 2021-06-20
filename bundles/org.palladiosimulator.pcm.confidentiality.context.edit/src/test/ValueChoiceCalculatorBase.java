package test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;

import tools.mdsd.library.emfeditutils.itempropertydescriptor.ValueChoiceCalculator;

/**
 * Base class for type safe {@link ValueChoiceCalculator} implementations.
 *
 * @param <T>
 *            The type of object, for which the value choice shall be calculated.
 * @param <R>
 *            The type of values.
 */
public abstract class ValueChoiceCalculatorBase<T extends EObject, R extends Object> implements ValueChoiceCalculator {

    private final Class<T> objectType;
    private final Class<R> childType;

    /**
     * Constructs the calculator.
     *
     * @param objectType
     *            The type of object, for which the value choice shall be calculated.
     * @param childType
     *            The type of values.
     */
    public ValueChoiceCalculatorBase(Class<T> objectType, Class<R> childType) {
        this.objectType = objectType;
        this.childType = childType;
    }

    /**
     * {@inheritDoc}
     *
     * The implementation performs a type check of the given parameters and delegates the call to
     * {@link #getValueChoiceTyped(EObject, List)}.
     *
     * If the type of the given object parameter does not match the defined object type passed to
     * the constructor, the given list of choices will be returned. The set of values passed to the
     * delegation method is filtered and casted to the value type passed to the constructor, keeping
     * the null value in the list.
     *
     * @see ValueChoiceCalculator#getValueChoice(Object, Collection)
     */
    @Override
    public Collection<?> getValueChoice(Object object, Collection<?> originalChoice) {
        var typedObject = Optional.ofNullable(object).filter(this.objectType::isInstance).map(this.objectType::cast);
        if (typedObject.isEmpty()) {
            return originalChoice;
        }
        if (originalChoice == null) {
            originalChoice = new ArrayList<>();
        }
        var typedList = originalChoice.stream().filter(v -> v == null || this.childType.isInstance(v))
                .map(this.childType::cast).collect(Collectors.toList());
        return getValueChoiceTyped(typedObject.get(), typedList);
    }

    /**
     * Calculates a list of value choices for a given object and a given list of available values.
     *
     * @param object
     *            The object to calculate the value selection for.
     * @param typedList
     *            A list of available values.
     * @return The derived list of value choices.
     */
    protected abstract Collection<?> getValueChoiceTyped(T object, List<R> typedList);

}
