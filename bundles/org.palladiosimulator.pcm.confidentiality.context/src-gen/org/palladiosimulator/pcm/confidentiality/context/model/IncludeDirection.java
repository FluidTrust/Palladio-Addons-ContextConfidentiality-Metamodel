/**
 */
package org.palladiosimulator.pcm.confidentiality.context.model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Include Direction</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.palladiosimulator.pcm.confidentiality.context.model.ModelPackage#getIncludeDirection()
 * @model
 * @generated
 */
public enum IncludeDirection implements Enumerator {
    /**
     * The '<em><b>TOP DOWN</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #TOP_DOWN_VALUE
     * @generated
     * @ordered
     */
    TOP_DOWN(0, "TOP_DOWN", "TOP_DOWN"),

    /**
     * The '<em><b>BOTTOM UP</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #BOTTOM_UP_VALUE
     * @generated
     * @ordered
     */
    BOTTOM_UP(1, "BOTTOM_UP", "BOTTOM_UP");

    /**
     * The '<em><b>TOP DOWN</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #TOP_DOWN
     * @model
     * @generated
     * @ordered
     */
    public static final int TOP_DOWN_VALUE = 0;

    /**
     * The '<em><b>BOTTOM UP</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #BOTTOM_UP
     * @model
     * @generated
     * @ordered
     */
    public static final int BOTTOM_UP_VALUE = 1;

    /**
     * An array of all the '<em><b>Include Direction</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final IncludeDirection[] VALUES_ARRAY = new IncludeDirection[] { TOP_DOWN, BOTTOM_UP, };

    /**
     * A public read-only list of all the '<em><b>Include Direction</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List<IncludeDirection> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>Include Direction</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static IncludeDirection get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            IncludeDirection result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Include Direction</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static IncludeDirection getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            IncludeDirection result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Include Direction</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static IncludeDirection get(int value) {
        switch (value) {
        case TOP_DOWN_VALUE:
            return TOP_DOWN;
        case BOTTOM_UP_VALUE:
            return BOTTOM_UP;
        }
        return null;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private final int value;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private final String name;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private final String literal;

    /**
     * Only this class can construct instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private IncludeDirection(int value, String name, String literal) {
        this.value = value;
        this.name = name;
        this.literal = literal;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getValue() {
        return value;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getName() {
        return name;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getLiteral() {
        return literal;
    }

    /**
     * Returns the literal value of the enumerator, which is its string representation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        return literal;
    }

} //IncludeDirection
