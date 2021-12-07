/**
 */
package org.palladiosimulator.pcm.confidentiality.context.policy;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Category</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.palladiosimulator.pcm.confidentiality.context.policy.PolicyPackage#getCategory()
 * @model
 * @generated
 */
public enum Category implements Enumerator
{
	/**
	 * The '<em><b>SUBJECT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUBJECT_VALUE
	 * @generated
	 * @ordered
	 */
	SUBJECT(0, "SUBJECT", "SUBJECT"),

	/**
	 * The '<em><b>RESOURCE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESOURCE_VALUE
	 * @generated
	 * @ordered
	 */
	RESOURCE(1, "RESOURCE", "RESOURCE"),

	/**
	 * The '<em><b>ENVIRONMENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENVIRONMENT_VALUE
	 * @generated
	 * @ordered
	 */
	ENVIRONMENT(2, "ENVIRONMENT", "ENVIRONMENT"),

	/**
	 * The '<em><b>ACTION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACTION_VALUE
	 * @generated
	 * @ordered
	 */
	ACTION(3, "ACTION", "ACTION");

	/**
	 * The '<em><b>SUBJECT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUBJECT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SUBJECT_VALUE = 0;

	/**
	 * The '<em><b>RESOURCE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESOURCE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RESOURCE_VALUE = 1;

	/**
	 * The '<em><b>ENVIRONMENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENVIRONMENT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ENVIRONMENT_VALUE = 2;

	/**
	 * The '<em><b>ACTION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACTION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ACTION_VALUE = 3;

	/**
	 * An array of all the '<em><b>Category</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Category[] VALUES_ARRAY =
		new Category[]
		{
			SUBJECT,
			RESOURCE,
			ENVIRONMENT,
			ACTION,
		};

	/**
	 * A public read-only list of all the '<em><b>Category</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Category> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Category</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Category get(String literal)
	{
		for (int i = 0; i < VALUES_ARRAY.length; ++i)
		{
			Category result = VALUES_ARRAY[i];
			if (result.toString().equals(literal))
			{
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Category</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Category getByName(String name)
	{
		for (int i = 0; i < VALUES_ARRAY.length; ++i)
		{
			Category result = VALUES_ARRAY[i];
			if (result.getName().equals(name))
			{
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Category</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Category get(int value)
	{
		switch (value)
		{
			case SUBJECT_VALUE: return SUBJECT;
			case RESOURCE_VALUE: return RESOURCE;
			case ENVIRONMENT_VALUE: return ENVIRONMENT;
			case ACTION_VALUE: return ACTION;
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
	private Category(int value, String name, String literal)
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
	
} //Category
