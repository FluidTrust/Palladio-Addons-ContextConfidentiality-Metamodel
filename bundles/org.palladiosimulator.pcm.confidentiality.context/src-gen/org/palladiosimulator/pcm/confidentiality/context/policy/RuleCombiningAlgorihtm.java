/**
 */
package org.palladiosimulator.pcm.confidentiality.context.policy;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Rule Combining Algorihtm</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.palladiosimulator.pcm.confidentiality.context.policy.PolicyPackage#getRuleCombiningAlgorihtm()
 * @model
 * @generated
 */
public enum RuleCombiningAlgorihtm implements Enumerator
{
	/**
	 * The '<em><b>DENY OVERRIDES</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DENY_OVERRIDES_VALUE
	 * @generated
	 * @ordered
	 */
	DENY_OVERRIDES(0, "DENY_OVERRIDES", "DENY_OVERRIDES"),

	/**
	 * The '<em><b>PERMIT OVERRIDES</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PERMIT_OVERRIDES_VALUE
	 * @generated
	 * @ordered
	 */
	PERMIT_OVERRIDES(1, "PERMIT_OVERRIDES", "PERMIT_OVERRIDES"),

	/**
	 * The '<em><b>FIRST APPLICABLE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FIRST_APPLICABLE_VALUE
	 * @generated
	 * @ordered
	 */
	FIRST_APPLICABLE(2, "FIRST_APPLICABLE", "FIRST_APPLICABLE"),

	/**
	 * The '<em><b>ONLY ONE APPLICABLE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ONLY_ONE_APPLICABLE_VALUE
	 * @generated
	 * @ordered
	 */
	ONLY_ONE_APPLICABLE(3, "ONLY_ONE_APPLICABLE", "ONLY_ONE_APPLICABLE"),

	/**
	 * The '<em><b>ORDERED DENY OVERRIDES</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ORDERED_DENY_OVERRIDES_VALUE
	 * @generated
	 * @ordered
	 */
	ORDERED_DENY_OVERRIDES(4, "ORDERED_DENY_OVERRIDES", "ORDERED_DENY_OVERRIDES"),

	/**
	 * The '<em><b>ORDERED PERMIT OVERRIDES</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ORDERED_PERMIT_OVERRIDES_VALUE
	 * @generated
	 * @ordered
	 */
	ORDERED_PERMIT_OVERRIDES(5, "ORDERED_PERMIT_OVERRIDES", "ORDERED_PERMIT_OVERRIDES"),

	/**
	 * The '<em><b>DENY UNLESS PERMIT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DENY_UNLESS_PERMIT_VALUE
	 * @generated
	 * @ordered
	 */
	DENY_UNLESS_PERMIT(6, "DENY_UNLESS_PERMIT", "DENY_UNLESS_PERMIT"),

	/**
	 * The '<em><b>PERMIT UNLESS DENY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PERMIT_UNLESS_DENY_VALUE
	 * @generated
	 * @ordered
	 */
	PERMIT_UNLESS_DENY(7, "PERMIT_UNLESS_DENY", "PERMIT_UNLESS_DENY");

	/**
	 * The '<em><b>DENY OVERRIDES</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DENY_OVERRIDES
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DENY_OVERRIDES_VALUE = 0;

	/**
	 * The '<em><b>PERMIT OVERRIDES</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PERMIT_OVERRIDES
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PERMIT_OVERRIDES_VALUE = 1;

	/**
	 * The '<em><b>FIRST APPLICABLE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FIRST_APPLICABLE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FIRST_APPLICABLE_VALUE = 2;

	/**
	 * The '<em><b>ONLY ONE APPLICABLE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ONLY_ONE_APPLICABLE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ONLY_ONE_APPLICABLE_VALUE = 3;

	/**
	 * The '<em><b>ORDERED DENY OVERRIDES</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ORDERED_DENY_OVERRIDES
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ORDERED_DENY_OVERRIDES_VALUE = 4;

	/**
	 * The '<em><b>ORDERED PERMIT OVERRIDES</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ORDERED_PERMIT_OVERRIDES
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ORDERED_PERMIT_OVERRIDES_VALUE = 5;

	/**
	 * The '<em><b>DENY UNLESS PERMIT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DENY_UNLESS_PERMIT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DENY_UNLESS_PERMIT_VALUE = 6;

	/**
	 * The '<em><b>PERMIT UNLESS DENY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PERMIT_UNLESS_DENY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PERMIT_UNLESS_DENY_VALUE = 7;

	/**
	 * An array of all the '<em><b>Rule Combining Algorihtm</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final RuleCombiningAlgorihtm[] VALUES_ARRAY =
		new RuleCombiningAlgorihtm[]
		{
			DENY_OVERRIDES,
			PERMIT_OVERRIDES,
			FIRST_APPLICABLE,
			ONLY_ONE_APPLICABLE,
			ORDERED_DENY_OVERRIDES,
			ORDERED_PERMIT_OVERRIDES,
			DENY_UNLESS_PERMIT,
			PERMIT_UNLESS_DENY,
		};

	/**
	 * A public read-only list of all the '<em><b>Rule Combining Algorihtm</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<RuleCombiningAlgorihtm> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Rule Combining Algorihtm</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RuleCombiningAlgorihtm get(String literal)
	{
		for (int i = 0; i < VALUES_ARRAY.length; ++i)
		{
			RuleCombiningAlgorihtm result = VALUES_ARRAY[i];
			if (result.toString().equals(literal))
			{
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Rule Combining Algorihtm</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RuleCombiningAlgorihtm getByName(String name)
	{
		for (int i = 0; i < VALUES_ARRAY.length; ++i)
		{
			RuleCombiningAlgorihtm result = VALUES_ARRAY[i];
			if (result.getName().equals(name))
			{
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Rule Combining Algorihtm</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RuleCombiningAlgorihtm get(int value)
	{
		switch (value)
		{
			case DENY_OVERRIDES_VALUE: return DENY_OVERRIDES;
			case PERMIT_OVERRIDES_VALUE: return PERMIT_OVERRIDES;
			case FIRST_APPLICABLE_VALUE: return FIRST_APPLICABLE;
			case ONLY_ONE_APPLICABLE_VALUE: return ONLY_ONE_APPLICABLE;
			case ORDERED_DENY_OVERRIDES_VALUE: return ORDERED_DENY_OVERRIDES;
			case ORDERED_PERMIT_OVERRIDES_VALUE: return ORDERED_PERMIT_OVERRIDES;
			case DENY_UNLESS_PERMIT_VALUE: return DENY_UNLESS_PERMIT;
			case PERMIT_UNLESS_DENY_VALUE: return PERMIT_UNLESS_DENY;
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
	private RuleCombiningAlgorihtm(int value, String name, String literal)
	{
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue()
	{
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName()
	{
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral()
	{
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString()
	{
		return literal;
	}
	
} //RuleCombiningAlgorihtm
