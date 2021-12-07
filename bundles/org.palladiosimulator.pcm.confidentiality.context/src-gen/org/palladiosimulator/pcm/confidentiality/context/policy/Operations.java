/**
 */
package org.palladiosimulator.pcm.confidentiality.context.policy;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Operations</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.palladiosimulator.pcm.confidentiality.context.policy.PolicyPackage#getOperations()
 * @model
 * @generated
 */
public enum Operations implements Enumerator
{
	/**
	 * The '<em><b>STRING EQUAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRING_EQUAL_VALUE
	 * @generated
	 * @ordered
	 */
	STRING_EQUAL(0, "STRING_EQUAL", "STRING_EQUAL"),

	/**
	 * The '<em><b>BOOLEAN EQUAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOOLEAN_EQUAL_VALUE
	 * @generated
	 * @ordered
	 */
	BOOLEAN_EQUAL(0, "BOOLEAN_EQUAL", "BOOLEAN_EQUAL"),

	/**
	 * The '<em><b>INTEGER EQUAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTEGER_EQUAL_VALUE
	 * @generated
	 * @ordered
	 */
	INTEGER_EQUAL(0, "INTEGER_EQUAL", "INTEGER_EQUAL"),

	/**
	 * The '<em><b>DOUBLE EQUAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOUBLE_EQUAL_VALUE
	 * @generated
	 * @ordered
	 */
	DOUBLE_EQUAL(0, "DOUBLE_EQUAL", "DOUBLE_EQUAL"),

	/**
	 * The '<em><b>DATE EQUAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATE_EQUAL_VALUE
	 * @generated
	 * @ordered
	 */
	DATE_EQUAL(0, "DATE_EQUAL", "DATE_EQUAL"),

	/**
	 * The '<em><b>TIME EQUAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIME_EQUAL_VALUE
	 * @generated
	 * @ordered
	 */
	TIME_EQUAL(0, "TIME_EQUAL", "TIME_EQUAL"),

	/**
	 * The '<em><b>DATETIME EQUAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATETIME_EQUAL_VALUE
	 * @generated
	 * @ordered
	 */
	DATETIME_EQUAL(0, "DATETIME_EQUAL", "DATETIME_EQUAL"),

	/**
	 * The '<em><b>DAYTIMEDURATION EQUAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DAYTIMEDURATION_EQUAL_VALUE
	 * @generated
	 * @ordered
	 */
	DAYTIMEDURATION_EQUAL(0, "DAYTIMEDURATION_EQUAL", "DAYTIMEDURATION_EQUAL"),

	/**
	 * The '<em><b>YEARMONTHDURATION EQUAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #YEARMONTHDURATION_EQUAL_VALUE
	 * @generated
	 * @ordered
	 */
	YEARMONTHDURATION_EQUAL(0, "YEARMONTHDURATION_EQUAL", "YEARMONTHDURATION_EQUAL"),

	/**
	 * The '<em><b>STRING EQUAL IGNORE CASE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRING_EQUAL_IGNORE_CASE_VALUE
	 * @generated
	 * @ordered
	 */
	STRING_EQUAL_IGNORE_CASE(0, "STRING_EQUAL_IGNORE_CASE", "STRING_EQUAL_IGNORE_CASE"),

	/**
	 * The '<em><b>ANYURI EQUAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANYURI_EQUAL_VALUE
	 * @generated
	 * @ordered
	 */
	ANYURI_EQUAL(0, "ANYURI_EQUAL", "ANYURI_EQUAL"),

	/**
	 * The '<em><b>X500NAME EQUAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #X500NAME_EQUAL_VALUE
	 * @generated
	 * @ordered
	 */
	X500NAME_EQUAL(0, "X500NAME_EQUAL", "X500NAME_EQUAL"),

	/**
	 * The '<em><b>RFC822NAME EQUAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RFC822NAME_EQUAL_VALUE
	 * @generated
	 * @ordered
	 */
	RFC822NAME_EQUAL(0, "RFC822NAME_EQUAL", "RFC822NAME_EQUAL"),

	/**
	 * The '<em><b>HEXBINARY EQUAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEXBINARY_EQUAL_VALUE
	 * @generated
	 * @ordered
	 */
	HEXBINARY_EQUAL(0, "HEXBINARY_EQUAL", "HEXBINARY_EQUAL"),

	/**
	 * The '<em><b>BASE64BINARY EQUAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BASE64BINARY_EQUAL_VALUE
	 * @generated
	 * @ordered
	 */
	BASE64BINARY_EQUAL(0, "BASE64BINARY_EQUAL", "BASE64BINARY_EQUAL"),

	/**
	 * The '<em><b>INTEGER ADD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTEGER_ADD_VALUE
	 * @generated
	 * @ordered
	 */
	INTEGER_ADD(0, "INTEGER_ADD", "INTEGER_ADD"),

	/**
	 * The '<em><b>DOUBLE ADD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOUBLE_ADD_VALUE
	 * @generated
	 * @ordered
	 */
	DOUBLE_ADD(0, "DOUBLE_ADD", "DOUBLE_ADD"),

	/**
	 * The '<em><b>INTEGER SUBTRACT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTEGER_SUBTRACT_VALUE
	 * @generated
	 * @ordered
	 */
	INTEGER_SUBTRACT(0, "INTEGER_SUBTRACT", "INTEGER_SUBTRACT"),

	/**
	 * The '<em><b>DOUBLE SUBTRACT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOUBLE_SUBTRACT_VALUE
	 * @generated
	 * @ordered
	 */
	DOUBLE_SUBTRACT(0, "DOUBLE_SUBTRACT", "DOUBLE_SUBTRACT"),

	/**
	 * The '<em><b>INTEGER MULTIPLY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTEGER_MULTIPLY_VALUE
	 * @generated
	 * @ordered
	 */
	INTEGER_MULTIPLY(0, "INTEGER_MULTIPLY", "INTEGER_MULTIPLY"),

	/**
	 * The '<em><b>DOUBLE MULTIPLY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOUBLE_MULTIPLY_VALUE
	 * @generated
	 * @ordered
	 */
	DOUBLE_MULTIPLY(0, "DOUBLE_MULTIPLY", "DOUBLE_MULTIPLY"),

	/**
	 * The '<em><b>INTEGER DIVIDE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTEGER_DIVIDE_VALUE
	 * @generated
	 * @ordered
	 */
	INTEGER_DIVIDE(0, "INTEGER_DIVIDE", "INTEGER_DIVIDE"),

	/**
	 * The '<em><b>DOUBLE DIVIDE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOUBLE_DIVIDE_VALUE
	 * @generated
	 * @ordered
	 */
	DOUBLE_DIVIDE(0, "DOUBLE_DIVIDE", "DOUBLE_DIVIDE"),

	/**
	 * The '<em><b>INTEGER MOD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTEGER_MOD_VALUE
	 * @generated
	 * @ordered
	 */
	INTEGER_MOD(0, "INTEGER_MOD", "INTEGER_MOD"),

	/**
	 * The '<em><b>INTEGER ABS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTEGER_ABS_VALUE
	 * @generated
	 * @ordered
	 */
	INTEGER_ABS(0, "INTEGER_ABS", "INTEGER_ABS"),

	/**
	 * The '<em><b>DOUBLE ABS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOUBLE_ABS_VALUE
	 * @generated
	 * @ordered
	 */
	DOUBLE_ABS(0, "DOUBLE_ABS", "DOUBLE_ABS"),

	/**
	 * The '<em><b>ROUND</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ROUND_VALUE
	 * @generated
	 * @ordered
	 */
	ROUND(0, "ROUND", "ROUND"),

	/**
	 * The '<em><b>FLOOR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FLOOR_VALUE
	 * @generated
	 * @ordered
	 */
	FLOOR(0, "FLOOR", "FLOOR"),

	/**
	 * The '<em><b>STRING NORMALIZE SPACE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRING_NORMALIZE_SPACE_VALUE
	 * @generated
	 * @ordered
	 */
	STRING_NORMALIZE_SPACE(0, "STRING_NORMALIZE_SPACE", "STRING_NORMALIZE_SPACE"),

	/**
	 * The '<em><b>STRING NORMALIZE TO LOWER CASE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRING_NORMALIZE_TO_LOWER_CASE_VALUE
	 * @generated
	 * @ordered
	 */
	STRING_NORMALIZE_TO_LOWER_CASE(0, "STRING_NORMALIZE_TO_LOWER_CASE", "STRING_NORMALIZE_TO_LOWER_CASE"),

	/**
	 * The '<em><b>DOUBLE TO INTEGER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOUBLE_TO_INTEGER_VALUE
	 * @generated
	 * @ordered
	 */
	DOUBLE_TO_INTEGER(0, "DOUBLE_TO_INTEGER", "DOUBLE_TO_INTEGER"),

	/**
	 * The '<em><b>INTEGER TO DOUBLE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTEGER_TO_DOUBLE_VALUE
	 * @generated
	 * @ordered
	 */
	INTEGER_TO_DOUBLE(0, "INTEGER_TO_DOUBLE", "INTEGER_TO_DOUBLE"),

	/**
	 * The '<em><b>OR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OR_VALUE
	 * @generated
	 * @ordered
	 */
	OR(0, "OR", "OR"),

	/**
	 * The '<em><b>AND</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AND_VALUE
	 * @generated
	 * @ordered
	 */
	AND(0, "AND", "AND"),

	/**
	 * The '<em><b>NOF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOF_VALUE
	 * @generated
	 * @ordered
	 */
	NOF(0, "N_OF", "N_OF"),

	/**
	 * The '<em><b>NOT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOT_VALUE
	 * @generated
	 * @ordered
	 */
	NOT(0, "NOT", "NOT"),

	/**
	 * The '<em><b>PRESENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRESENT_VALUE
	 * @generated
	 * @ordered
	 */
	PRESENT(0, "PRESENT", "PRESENT"),

	/**
	 * The '<em><b>INTEGER GREATER THAN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTEGER_GREATER_THAN_VALUE
	 * @generated
	 * @ordered
	 */
	INTEGER_GREATER_THAN(0, "INTEGER_GREATER_THAN", "INTEGER_GREATER_THAN"),

	/**
	 * The '<em><b>INTEGER GREATER THAN OR EQUAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTEGER_GREATER_THAN_OR_EQUAL_VALUE
	 * @generated
	 * @ordered
	 */
	INTEGER_GREATER_THAN_OR_EQUAL(0, "INTEGER_GREATER_THAN_OR_EQUAL", "INTEGER_GREATER_THAN_OR_EQUAL"),

	/**
	 * The '<em><b>INTEGER LESS THAN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTEGER_LESS_THAN_VALUE
	 * @generated
	 * @ordered
	 */
	INTEGER_LESS_THAN(0, "INTEGER_LESS_THAN", "INTEGER_LESS_THAN"),

	/**
	 * The '<em><b>INTEGER LESS THAN OR EQUAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTEGER_LESS_THAN_OR_EQUAL_VALUE
	 * @generated
	 * @ordered
	 */
	INTEGER_LESS_THAN_OR_EQUAL(0, "INTEGER_LESS_THAN_OR_EQUAL", "INTEGER_LESS_THAN_OR_EQUAL"),

	/**
	 * The '<em><b>DOUBLE GREATER THAN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOUBLE_GREATER_THAN_VALUE
	 * @generated
	 * @ordered
	 */
	DOUBLE_GREATER_THAN(0, "DOUBLE_GREATER_THAN", "DOUBLE_GREATER_THAN"),

	/**
	 * The '<em><b>DOUBLE GREATER THAN OR EQUAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOUBLE_GREATER_THAN_OR_EQUAL_VALUE
	 * @generated
	 * @ordered
	 */
	DOUBLE_GREATER_THAN_OR_EQUAL(0, "DOUBLE_GREATER_THAN_OR_EQUAL", "DOUBLE_GREATER_THAN_OR_EQUAL"),

	/**
	 * The '<em><b>DOUBLE LESS THAN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOUBLE_LESS_THAN_VALUE
	 * @generated
	 * @ordered
	 */
	DOUBLE_LESS_THAN(0, "DOUBLE_LESS_THAN", "DOUBLE_LESS_THAN"),

	/**
	 * The '<em><b>DOUBLE LESS THAN OR EQUAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOUBLE_LESS_THAN_OR_EQUAL_VALUE
	 * @generated
	 * @ordered
	 */
	DOUBLE_LESS_THAN_OR_EQUAL(0, "DOUBLE_LESS_THAN_OR_EQUAL", "DOUBLE_LESS_THAN_OR_EQUAL"),

	/**
	 * The '<em><b>DATETIME ADD DAYTIMEDURATION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATETIME_ADD_DAYTIMEDURATION_VALUE
	 * @generated
	 * @ordered
	 */
	DATETIME_ADD_DAYTIMEDURATION(0, "DATETIME_ADD_DAYTIMEDURATION", "DATETIME_ADD_DAYTIMEDURATION"),

	/**
	 * The '<em><b>DATETIME ADD YEARMONTHDURATION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATETIME_ADD_YEARMONTHDURATION_VALUE
	 * @generated
	 * @ordered
	 */
	DATETIME_ADD_YEARMONTHDURATION(0, "DATETIME_ADD_YEARMONTHDURATION", "DATETIME_ADD_YEARMONTHDURATION"),

	/**
	 * The '<em><b>DATETIME SUBTRACT DAYTIMEDURATION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATETIME_SUBTRACT_DAYTIMEDURATION_VALUE
	 * @generated
	 * @ordered
	 */
	DATETIME_SUBTRACT_DAYTIMEDURATION(0, "DATETIME_SUBTRACT_DAYTIMEDURATION", "DATETIME_SUBTRACT_DAYTIMEDURATION"),

	/**
	 * The '<em><b>DATETIME SUBTRACT YEARMONTHDURATION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATETIME_SUBTRACT_YEARMONTHDURATION_VALUE
	 * @generated
	 * @ordered
	 */
	DATETIME_SUBTRACT_YEARMONTHDURATION(0, "DATETIME_SUBTRACT_YEARMONTHDURATION", "DATETIME_SUBTRACT_YEARMONTHDURATION"),

	/**
	 * The '<em><b>DATE ADD YEARMONTHDURATION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATE_ADD_YEARMONTHDURATION_VALUE
	 * @generated
	 * @ordered
	 */
	DATE_ADD_YEARMONTHDURATION(0, "DATE_ADD_YEARMONTHDURATION", "DATE_ADD_YEARMONTHDURATION"),

	/**
	 * The '<em><b>DATE SUBTRACT YEARMONTHDURATION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATE_SUBTRACT_YEARMONTHDURATION_VALUE
	 * @generated
	 * @ordered
	 */
	DATE_SUBTRACT_YEARMONTHDURATION(0, "DATE_SUBTRACT_YEARMONTHDURATION", "DATE_SUBTRACT_YEARMONTHDURATION"),

	/**
	 * The '<em><b>STRING GREATER THAN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRING_GREATER_THAN_VALUE
	 * @generated
	 * @ordered
	 */
	STRING_GREATER_THAN(0, "STRING_GREATER_THAN", "STRING_GREATER_THAN"),

	/**
	 * The '<em><b>STRING GREATER THAN OR EQUAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRING_GREATER_THAN_OR_EQUAL_VALUE
	 * @generated
	 * @ordered
	 */
	STRING_GREATER_THAN_OR_EQUAL(0, "STRING_GREATER_THAN_OR_EQUAL", "STRING_GREATER_THAN_OR_EQUAL"),

	/**
	 * The '<em><b>STRING LESS THAN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRING_LESS_THAN_VALUE
	 * @generated
	 * @ordered
	 */
	STRING_LESS_THAN(0, "STRING_LESS_THAN", "STRING_LESS_THAN"),

	/**
	 * The '<em><b>STRING LESS THAN OR EQUAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRING_LESS_THAN_OR_EQUAL_VALUE
	 * @generated
	 * @ordered
	 */
	STRING_LESS_THAN_OR_EQUAL(0, "STRING_LESS_THAN_OR_EQUAL", "STRING_LESS_THAN_OR_EQUAL"),

	/**
	 * The '<em><b>TIME GREATER THAN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIME_GREATER_THAN_VALUE
	 * @generated
	 * @ordered
	 */
	TIME_GREATER_THAN(0, "TIME_GREATER_THAN", "TIME_GREATER_THAN"),

	/**
	 * The '<em><b>TIME GREATER THAN OR EQUAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIME_GREATER_THAN_OR_EQUAL_VALUE
	 * @generated
	 * @ordered
	 */
	TIME_GREATER_THAN_OR_EQUAL(0, "TIME_GREATER_THAN_OR_EQUAL", "TIME_GREATER_THAN_OR_EQUAL"),

	/**
	 * The '<em><b>TIME LESS THAN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIME_LESS_THAN_VALUE
	 * @generated
	 * @ordered
	 */
	TIME_LESS_THAN(0, "TIME_LESS_THAN", "TIME_LESS_THAN"),

	/**
	 * The '<em><b>TIME LESS THAN OR EQUAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIME_LESS_THAN_OR_EQUAL_VALUE
	 * @generated
	 * @ordered
	 */
	TIME_LESS_THAN_OR_EQUAL(0, "TIME_LESS_THAN_OR_EQUAL", "TIME_LESS_THAN_OR_EQUAL"),

	/**
	 * The '<em><b>TIME IN RANGE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIME_IN_RANGE_VALUE
	 * @generated
	 * @ordered
	 */
	TIME_IN_RANGE(0, "TIME_IN_RANGE", "TIME_IN_RANGE"),

	/**
	 * The '<em><b>DATETIME GREATER THAN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATETIME_GREATER_THAN_VALUE
	 * @generated
	 * @ordered
	 */
	DATETIME_GREATER_THAN(0, "DATETIME_GREATER_THAN", "DATETIME_GREATER_THAN"),

	/**
	 * The '<em><b>DATETIME GREATER THAN OR EQUAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATETIME_GREATER_THAN_OR_EQUAL_VALUE
	 * @generated
	 * @ordered
	 */
	DATETIME_GREATER_THAN_OR_EQUAL(0, "DATETIME_GREATER_THAN_OR_EQUAL", "DATETIME_GREATER_THAN_OR_EQUAL"),

	/**
	 * The '<em><b>DATETIME LESS THAN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATETIME_LESS_THAN_VALUE
	 * @generated
	 * @ordered
	 */
	DATETIME_LESS_THAN(0, "DATETIME_LESS_THAN", "DATETIME_LESS_THAN"),

	/**
	 * The '<em><b>DATETIME LESS THAN OR EQUAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATETIME_LESS_THAN_OR_EQUAL_VALUE
	 * @generated
	 * @ordered
	 */
	DATETIME_LESS_THAN_OR_EQUAL(0, "DATETIME_LESS_THAN_OR_EQUAL", "DATETIME_LESS_THAN_OR_EQUAL"),

	/**
	 * The '<em><b>DATE GREATER THAN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATE_GREATER_THAN_VALUE
	 * @generated
	 * @ordered
	 */
	DATE_GREATER_THAN(0, "DATE_GREATER_THAN", "DATE_GREATER_THAN"),

	/**
	 * The '<em><b>DATE GREATER THAN OR EQUAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATE_GREATER_THAN_OR_EQUAL_VALUE
	 * @generated
	 * @ordered
	 */
	DATE_GREATER_THAN_OR_EQUAL(0, "DATE_GREATER_THAN_OR_EQUAL", "DATE_GREATER_THAN_OR_EQUAL"),

	/**
	 * The '<em><b>DATE LESS THAN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATE_LESS_THAN_VALUE
	 * @generated
	 * @ordered
	 */
	DATE_LESS_THAN(0, "DATE_LESS_THAN", "DATE_LESS_THAN"),

	/**
	 * The '<em><b>DATE LESS THAN OR EQUAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATE_LESS_THAN_OR_EQUAL_VALUE
	 * @generated
	 * @ordered
	 */
	DATE_LESS_THAN_OR_EQUAL(0, "DATE_LESS_THAN_OR_EQUAL", "DATE_LESS_THAN_OR_EQUAL"),

	/**
	 * The '<em><b>STRING ONE AND ONLY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRING_ONE_AND_ONLY_VALUE
	 * @generated
	 * @ordered
	 */
	STRING_ONE_AND_ONLY(0, "STRING_ONE_AND_ONLY", "STRING_ONE_AND_ONLY"),

	/**
	 * The '<em><b>STRING BAG SIZE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRING_BAG_SIZE_VALUE
	 * @generated
	 * @ordered
	 */
	STRING_BAG_SIZE(0, "STRING_BAG_SIZE", "STRING_BAG_SIZE"),

	/**
	 * The '<em><b>STRING IS IN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRING_IS_IN_VALUE
	 * @generated
	 * @ordered
	 */
	STRING_IS_IN(0, "STRING_IS_IN", "STRING_IS_IN"),

	/**
	 * The '<em><b>STRING BAG</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRING_BAG_VALUE
	 * @generated
	 * @ordered
	 */
	STRING_BAG(0, "STRING_BAG", "STRING_BAG"),

	/**
	 * The '<em><b>BOOLEAN ONE AND ONLY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOOLEAN_ONE_AND_ONLY_VALUE
	 * @generated
	 * @ordered
	 */
	BOOLEAN_ONE_AND_ONLY(0, "BOOLEAN_ONE_AND_ONLY", "BOOLEAN_ONE_AND_ONLY"),

	/**
	 * The '<em><b>BOOLEAN BAG SIZE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOOLEAN_BAG_SIZE_VALUE
	 * @generated
	 * @ordered
	 */
	BOOLEAN_BAG_SIZE(0, "BOOLEAN_BAG_SIZE", "BOOLEAN_BAG_SIZE"),

	/**
	 * The '<em><b>BOOLEAN IS IN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOOLEAN_IS_IN_VALUE
	 * @generated
	 * @ordered
	 */
	BOOLEAN_IS_IN(0, "BOOLEAN_IS_IN", "BOOLEAN_IS_IN"),

	/**
	 * The '<em><b>BOOLEAN BAG</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOOLEAN_BAG_VALUE
	 * @generated
	 * @ordered
	 */
	BOOLEAN_BAG(0, "BOOLEAN_BAG", "BOOLEAN_BAG"),

	/**
	 * The '<em><b>INTEGER ONE AND ONLY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTEGER_ONE_AND_ONLY_VALUE
	 * @generated
	 * @ordered
	 */
	INTEGER_ONE_AND_ONLY(0, "INTEGER_ONE_AND_ONLY", "INTEGER_ONE_AND_ONLY"),

	/**
	 * The '<em><b>INTEGER BAG SIZE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTEGER_BAG_SIZE_VALUE
	 * @generated
	 * @ordered
	 */
	INTEGER_BAG_SIZE(0, "INTEGER_BAG_SIZE", "INTEGER_BAG_SIZE"),

	/**
	 * The '<em><b>INTEGER IS IN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTEGER_IS_IN_VALUE
	 * @generated
	 * @ordered
	 */
	INTEGER_IS_IN(0, "INTEGER_IS_IN", "INTEGER_IS_IN"),

	/**
	 * The '<em><b>INTEGER BAG</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTEGER_BAG_VALUE
	 * @generated
	 * @ordered
	 */
	INTEGER_BAG(0, "INTEGER_BAG", "INTEGER_BAG"),

	/**
	 * The '<em><b>DOUBLE ONE AND ONLY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOUBLE_ONE_AND_ONLY_VALUE
	 * @generated
	 * @ordered
	 */
	DOUBLE_ONE_AND_ONLY(0, "DOUBLE_ONE_AND_ONLY", "DOUBLE_ONE_AND_ONLY"),

	/**
	 * The '<em><b>DOUBLE BAG SIZE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOUBLE_BAG_SIZE_VALUE
	 * @generated
	 * @ordered
	 */
	DOUBLE_BAG_SIZE(0, "DOUBLE_BAG_SIZE", "DOUBLE_BAG_SIZE"),

	/**
	 * The '<em><b>DOUBLE IS IN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOUBLE_IS_IN_VALUE
	 * @generated
	 * @ordered
	 */
	DOUBLE_IS_IN(0, "DOUBLE_IS_IN", "DOUBLE_IS_IN"),

	/**
	 * The '<em><b>DOUBLE BAG</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOUBLE_BAG_VALUE
	 * @generated
	 * @ordered
	 */
	DOUBLE_BAG(0, "DOUBLE_BAG", "DOUBLE_BAG"),

	/**
	 * The '<em><b>TIME ONE AND ONLY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIME_ONE_AND_ONLY_VALUE
	 * @generated
	 * @ordered
	 */
	TIME_ONE_AND_ONLY(0, "TIME_ONE_AND_ONLY", "TIME_ONE_AND_ONLY"),

	/**
	 * The '<em><b>TIME BAG SIZE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIME_BAG_SIZE_VALUE
	 * @generated
	 * @ordered
	 */
	TIME_BAG_SIZE(0, "TIME_BAG_SIZE", "TIME_BAG_SIZE"),

	/**
	 * The '<em><b>TIME IS IN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIME_IS_IN_VALUE
	 * @generated
	 * @ordered
	 */
	TIME_IS_IN(0, "TIME_IS_IN", "TIME_IS_IN"),

	/**
	 * The '<em><b>TIME BAG</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIME_BAG_VALUE
	 * @generated
	 * @ordered
	 */
	TIME_BAG(0, "TIME_BAG", "TIME_BAG"),

	/**
	 * The '<em><b>DATE ONE AND ONLY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATE_ONE_AND_ONLY_VALUE
	 * @generated
	 * @ordered
	 */
	DATE_ONE_AND_ONLY(0, "DATE_ONE_AND_ONLY", "DATE_ONE_AND_ONLY"),

	/**
	 * The '<em><b>DATE BAG SIZE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATE_BAG_SIZE_VALUE
	 * @generated
	 * @ordered
	 */
	DATE_BAG_SIZE(0, "DATE_BAG_SIZE", "DATE_BAG_SIZE"),

	/**
	 * The '<em><b>DATE IS IN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATE_IS_IN_VALUE
	 * @generated
	 * @ordered
	 */
	DATE_IS_IN(0, "DATE_IS_IN", "DATE_IS_IN"),

	/**
	 * The '<em><b>DATE BAG</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATE_BAG_VALUE
	 * @generated
	 * @ordered
	 */
	DATE_BAG(0, "DATE_BAG", "DATE_BAG"),

	/**
	 * The '<em><b>DATETIME ONE AND ONLY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATETIME_ONE_AND_ONLY_VALUE
	 * @generated
	 * @ordered
	 */
	DATETIME_ONE_AND_ONLY(0, "DATETIME_ONE_AND_ONLY", "DATETIME_ONE_AND_ONLY"),

	/**
	 * The '<em><b>DATETIME BAG SIZE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATETIME_BAG_SIZE_VALUE
	 * @generated
	 * @ordered
	 */
	DATETIME_BAG_SIZE(0, "DATETIME_BAG_SIZE", "DATETIME_BAG_SIZE"),

	/**
	 * The '<em><b>DATETIME IS IN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATETIME_IS_IN_VALUE
	 * @generated
	 * @ordered
	 */
	DATETIME_IS_IN(0, "DATETIME_IS_IN", "DATETIME_IS_IN"),

	/**
	 * The '<em><b>DATETIME BAG</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATETIME_BAG_VALUE
	 * @generated
	 * @ordered
	 */
	DATETIME_BAG(0, "DATETIME_BAG", "DATETIME_BAG"),

	/**
	 * The '<em><b>ANYURI ONE AND ONLY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANYURI_ONE_AND_ONLY_VALUE
	 * @generated
	 * @ordered
	 */
	ANYURI_ONE_AND_ONLY(0, "ANYURI_ONE_AND_ONLY", "ANYURI_ONE_AND_ONLY"),

	/**
	 * The '<em><b>ANYURI BAG SIZE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANYURI_BAG_SIZE_VALUE
	 * @generated
	 * @ordered
	 */
	ANYURI_BAG_SIZE(0, "ANYURI_BAG_SIZE", "ANYURI_BAG_SIZE"),

	/**
	 * The '<em><b>ANYURI IS IN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANYURI_IS_IN_VALUE
	 * @generated
	 * @ordered
	 */
	ANYURI_IS_IN(0, "ANYURI_IS_IN", "ANYURI_IS_IN"),

	/**
	 * The '<em><b>ANYURI BAG</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANYURI_BAG_VALUE
	 * @generated
	 * @ordered
	 */
	ANYURI_BAG(0, "ANYURI_BAG", "ANYURI_BAG"),

	/**
	 * The '<em><b>HEXBINARY ONE AND ONLY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEXBINARY_ONE_AND_ONLY_VALUE
	 * @generated
	 * @ordered
	 */
	HEXBINARY_ONE_AND_ONLY(0, "HEXBINARY_ONE_AND_ONLY", "HEXBINARY_ONE_AND_ONLY"),

	/**
	 * The '<em><b>HEXBINARY BAG SIZE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEXBINARY_BAG_SIZE_VALUE
	 * @generated
	 * @ordered
	 */
	HEXBINARY_BAG_SIZE(0, "HEXBINARY_BAG_SIZE", "HEXBINARY_BAG_SIZE"),

	/**
	 * The '<em><b>HEXBINARY IS IN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEXBINARY_IS_IN_VALUE
	 * @generated
	 * @ordered
	 */
	HEXBINARY_IS_IN(0, "HEXBINARY_IS_IN", "HEXBINARY_IS_IN"),

	/**
	 * The '<em><b>HEXBINARY BAG</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEXBINARY_BAG_VALUE
	 * @generated
	 * @ordered
	 */
	HEXBINARY_BAG(0, "HEXBINARY_BAG", "HEXBINARY_BAG"),

	/**
	 * The '<em><b>BASE64BINARY ONE AND ONLY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BASE64BINARY_ONE_AND_ONLY_VALUE
	 * @generated
	 * @ordered
	 */
	BASE64BINARY_ONE_AND_ONLY(0, "BASE64BINARY_ONE_AND_ONLY", "BASE64BINARY_ONE_AND_ONLY"),

	/**
	 * The '<em><b>BASE64BINARY BAG SIZE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BASE64BINARY_BAG_SIZE_VALUE
	 * @generated
	 * @ordered
	 */
	BASE64BINARY_BAG_SIZE(0, "BASE64BINARY_BAG_SIZE", "BASE64BINARY_BAG_SIZE"),

	/**
	 * The '<em><b>BASE64BINARY IS IN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BASE64BINARY_IS_IN_VALUE
	 * @generated
	 * @ordered
	 */
	BASE64BINARY_IS_IN(0, "BASE64BINARY_IS_IN", "BASE64BINARY_IS_IN"),

	/**
	 * The '<em><b>BASE64BINARY BAG</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BASE64BINARY_BAG_VALUE
	 * @generated
	 * @ordered
	 */
	BASE64BINARY_BAG(0, "BASE64BINARY_BAG", "BASE64BINARY_BAG"),

	/**
	 * The '<em><b>DAYTIMEDURATION ONE AND ONLY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DAYTIMEDURATION_ONE_AND_ONLY_VALUE
	 * @generated
	 * @ordered
	 */
	DAYTIMEDURATION_ONE_AND_ONLY(0, "DAYTIMEDURATION_ONE_AND_ONLY", "DAYTIMEDURATION_ONE_AND_ONLY"),

	/**
	 * The '<em><b>DAYTIMEDURATION BAG SIZE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DAYTIMEDURATION_BAG_SIZE_VALUE
	 * @generated
	 * @ordered
	 */
	DAYTIMEDURATION_BAG_SIZE(0, "DAYTIMEDURATION_BAG_SIZE", "DAYTIMEDURATION_BAG_SIZE"),

	/**
	 * The '<em><b>DAYTIMEDURATION IS IN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DAYTIMEDURATION_IS_IN_VALUE
	 * @generated
	 * @ordered
	 */
	DAYTIMEDURATION_IS_IN(0, "DAYTIMEDURATION_IS_IN", "DAYTIMEDURATION_IS_IN"),

	/**
	 * The '<em><b>DAYTIMEDURATION BAG</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DAYTIMEDURATION_BAG_VALUE
	 * @generated
	 * @ordered
	 */
	DAYTIMEDURATION_BAG(0, "DAYTIMEDURATION_BAG", "DAYTIMEDURATION_BAG"),

	/**
	 * The '<em><b>YEARMONTHDURATION ONE AND ONLY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #YEARMONTHDURATION_ONE_AND_ONLY_VALUE
	 * @generated
	 * @ordered
	 */
	YEARMONTHDURATION_ONE_AND_ONLY(0, "YEARMONTHDURATION_ONE_AND_ONLY", "YEARMONTHDURATION_ONE_AND_ONLY"),

	/**
	 * The '<em><b>YEARMONTHDURATION BAG SIZE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #YEARMONTHDURATION_BAG_SIZE_VALUE
	 * @generated
	 * @ordered
	 */
	YEARMONTHDURATION_BAG_SIZE(0, "YEARMONTHDURATION_BAG_SIZE", "YEARMONTHDURATION_BAG_SIZE"),

	/**
	 * The '<em><b>YEARMONTHDURATION IS IN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #YEARMONTHDURATION_IS_IN_VALUE
	 * @generated
	 * @ordered
	 */
	YEARMONTHDURATION_IS_IN(0, "YEARMONTHDURATION_IS_IN", "YEARMONTHDURATION_IS_IN"),

	/**
	 * The '<em><b>YEARMONTHDURATION BAG</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #YEARMONTHDURATION_BAG_VALUE
	 * @generated
	 * @ordered
	 */
	YEARMONTHDURATION_BAG(0, "YEARMONTHDURATION_BAG", "YEARMONTHDURATION_BAG"),

	/**
	 * The '<em><b>X500NAME ONE AND ONLY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #X500NAME_ONE_AND_ONLY_VALUE
	 * @generated
	 * @ordered
	 */
	X500NAME_ONE_AND_ONLY(0, "X500NAME_ONE_AND_ONLY", "X500NAME_ONE_AND_ONLY"),

	/**
	 * The '<em><b>X500NAME BAG SIZE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #X500NAME_BAG_SIZE_VALUE
	 * @generated
	 * @ordered
	 */
	X500NAME_BAG_SIZE(0, "X500NAME_BAG_SIZE", "X500NAME_BAG_SIZE"),

	/**
	 * The '<em><b>X500NAME IS IN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #X500NAME_IS_IN_VALUE
	 * @generated
	 * @ordered
	 */
	X500NAME_IS_IN(0, "X500NAME_IS_IN", "X500NAME_IS_IN"),

	/**
	 * The '<em><b>X500NAME BAG</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #X500NAME_BAG_VALUE
	 * @generated
	 * @ordered
	 */
	X500NAME_BAG(0, "X500NAME_BAG", "X500NAME_BAG"),

	/**
	 * The '<em><b>RFC822NAME ONE AND ONLY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RFC822NAME_ONE_AND_ONLY_VALUE
	 * @generated
	 * @ordered
	 */
	RFC822NAME_ONE_AND_ONLY(0, "RFC822NAME_ONE_AND_ONLY", "RFC822NAME_ONE_AND_ONLY"),

	/**
	 * The '<em><b>RFC822NAME BAG SIZE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RFC822NAME_BAG_SIZE_VALUE
	 * @generated
	 * @ordered
	 */
	RFC822NAME_BAG_SIZE(0, "RFC822NAME_BAG_SIZE", "RFC822NAME_BAG_SIZE"),

	/**
	 * The '<em><b>RFC822NAME IS IN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RFC822NAME_IS_IN_VALUE
	 * @generated
	 * @ordered
	 */
	RFC822NAME_IS_IN(0, "RFC822NAME_IS_IN", "RFC822NAME_IS_IN"),

	/**
	 * The '<em><b>RFC822NAME BAG</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RFC822NAME_BAG_VALUE
	 * @generated
	 * @ordered
	 */
	RFC822NAME_BAG(0, "RFC822NAME_BAG", "RFC822NAME_BAG"),

	/**
	 * The '<em><b>IPADDRESS ONE AND ONLY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IPADDRESS_ONE_AND_ONLY_VALUE
	 * @generated
	 * @ordered
	 */
	IPADDRESS_ONE_AND_ONLY(0, "IPADDRESS_ONE_AND_ONLY", "IPADDRESS_ONE_AND_ONLY"),

	/**
	 * The '<em><b>IPADDRESS BAG SIZE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IPADDRESS_BAG_SIZE_VALUE
	 * @generated
	 * @ordered
	 */
	IPADDRESS_BAG_SIZE(0, "IPADDRESS_BAG_SIZE", "IPADDRESS_BAG_SIZE"),

	/**
	 * The '<em><b>IPADDRESS IS IN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IPADDRESS_IS_IN_VALUE
	 * @generated
	 * @ordered
	 */
	IPADDRESS_IS_IN(0, "IPADDRESS_IS_IN", "IPADDRESS_IS_IN"),

	/**
	 * The '<em><b>IPADDRESS BAG</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IPADDRESS_BAG_VALUE
	 * @generated
	 * @ordered
	 */
	IPADDRESS_BAG(0, "IPADDRESS_BAG", "IPADDRESS_BAG"),

	/**
	 * The '<em><b>DNSNAME ONE AND ONLY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DNSNAME_ONE_AND_ONLY_VALUE
	 * @generated
	 * @ordered
	 */
	DNSNAME_ONE_AND_ONLY(0, "DNSNAME_ONE_AND_ONLY", "DNSNAME_ONE_AND_ONLY"),

	/**
	 * The '<em><b>DNSNAME BAG SIZE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DNSNAME_BAG_SIZE_VALUE
	 * @generated
	 * @ordered
	 */
	DNSNAME_BAG_SIZE(0, "DNSNAME_BAG_SIZE", "DNSNAME_BAG_SIZE"),

	/**
	 * The '<em><b>DNSNAME IS IN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DNSNAME_IS_IN_VALUE
	 * @generated
	 * @ordered
	 */
	DNSNAME_IS_IN(0, "DNSNAME_IS_IN", "DNSNAME_IS_IN"),

	/**
	 * The '<em><b>DNSNAME BAG</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DNSNAME_BAG_VALUE
	 * @generated
	 * @ordered
	 */
	DNSNAME_BAG(0, "DNSNAME_BAG", "DNSNAME_BAG"),

	/**
	 * The '<em><b>STRING CONCATENATE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRING_CONCATENATE_VALUE
	 * @generated
	 * @ordered
	 */
	STRING_CONCATENATE(0, "STRING_CONCATENATE", "STRING_CONCATENATE"),

	/**
	 * The '<em><b>BOOLEAN FROM STRING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOOLEAN_FROM_STRING_VALUE
	 * @generated
	 * @ordered
	 */
	BOOLEAN_FROM_STRING(0, "BOOLEAN_FROM_STRING", "BOOLEAN_FROM_STRING"),

	/**
	 * The '<em><b>STRING FROM BOOLEAN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRING_FROM_BOOLEAN_VALUE
	 * @generated
	 * @ordered
	 */
	STRING_FROM_BOOLEAN(0, "STRING_FROM_BOOLEAN", "STRING_FROM_BOOLEAN"),

	/**
	 * The '<em><b>INTEGER FROM STRING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTEGER_FROM_STRING_VALUE
	 * @generated
	 * @ordered
	 */
	INTEGER_FROM_STRING(0, "INTEGER_FROM_STRING", "INTEGER_FROM_STRING"),

	/**
	 * The '<em><b>STRING FROM INTEGER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRING_FROM_INTEGER_VALUE
	 * @generated
	 * @ordered
	 */
	STRING_FROM_INTEGER(0, "STRING_FROM_INTEGER", "STRING_FROM_INTEGER"),

	/**
	 * The '<em><b>DOUBLE FROM STRING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOUBLE_FROM_STRING_VALUE
	 * @generated
	 * @ordered
	 */
	DOUBLE_FROM_STRING(0, "DOUBLE_FROM_STRING", "DOUBLE_FROM_STRING"),

	/**
	 * The '<em><b>STRING FROM DOUBLE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRING_FROM_DOUBLE_VALUE
	 * @generated
	 * @ordered
	 */
	STRING_FROM_DOUBLE(0, "STRING_FROM_DOUBLE", "STRING_FROM_DOUBLE"),

	/**
	 * The '<em><b>TIME FROM STRING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIME_FROM_STRING_VALUE
	 * @generated
	 * @ordered
	 */
	TIME_FROM_STRING(0, "TIME_FROM_STRING", "TIME_FROM_STRING"),

	/**
	 * The '<em><b>STRING FROM TIME</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRING_FROM_TIME_VALUE
	 * @generated
	 * @ordered
	 */
	STRING_FROM_TIME(0, "STRING_FROM_TIME", "STRING_FROM_TIME"),

	/**
	 * The '<em><b>DATE FROM STRING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATE_FROM_STRING_VALUE
	 * @generated
	 * @ordered
	 */
	DATE_FROM_STRING(0, "DATE_FROM_STRING", "DATE_FROM_STRING"),

	/**
	 * The '<em><b>STRING FROM DATE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRING_FROM_DATE_VALUE
	 * @generated
	 * @ordered
	 */
	STRING_FROM_DATE(0, "STRING_FROM_DATE", "STRING_FROM_DATE"),

	/**
	 * The '<em><b>DATETIME FROM STRING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATETIME_FROM_STRING_VALUE
	 * @generated
	 * @ordered
	 */
	DATETIME_FROM_STRING(0, "DATETIME_FROM_STRING", "DATETIME_FROM_STRING"),

	/**
	 * The '<em><b>STRING FROM DATETIME</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRING_FROM_DATETIME_VALUE
	 * @generated
	 * @ordered
	 */
	STRING_FROM_DATETIME(0, "STRING_FROM_DATETIME", "STRING_FROM_DATETIME"),

	/**
	 * The '<em><b>ANYURI FROM STRING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANYURI_FROM_STRING_VALUE
	 * @generated
	 * @ordered
	 */
	ANYURI_FROM_STRING(0, "ANYURI_FROM_STRING", "ANYURI_FROM_STRING"),

	/**
	 * The '<em><b>STRING FROM ANYURI</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRING_FROM_ANYURI_VALUE
	 * @generated
	 * @ordered
	 */
	STRING_FROM_ANYURI(0, "STRING_FROM_ANYURI", "STRING_FROM_ANYURI"),

	/**
	 * The '<em><b>DAYTIMEDURATION FROM STRING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DAYTIMEDURATION_FROM_STRING_VALUE
	 * @generated
	 * @ordered
	 */
	DAYTIMEDURATION_FROM_STRING(0, "DAYTIMEDURATION_FROM_STRING", "DAYTIMEDURATION_FROM_STRING"),

	/**
	 * The '<em><b>STRING FROM DAYTIMEDURATION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRING_FROM_DAYTIMEDURATION_VALUE
	 * @generated
	 * @ordered
	 */
	STRING_FROM_DAYTIMEDURATION(0, "STRING_FROM_DAYTIMEDURATION", "STRING_FROM_DAYTIMEDURATION"),

	/**
	 * The '<em><b>YEARMONTHDURATION FROM STRING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #YEARMONTHDURATION_FROM_STRING_VALUE
	 * @generated
	 * @ordered
	 */
	YEARMONTHDURATION_FROM_STRING(0, "YEARMONTHDURATION_FROM_STRING", "YEARMONTHDURATION_FROM_STRING"),

	/**
	 * The '<em><b>STRING FROM YEARMONTHDURATION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRING_FROM_YEARMONTHDURATION_VALUE
	 * @generated
	 * @ordered
	 */
	STRING_FROM_YEARMONTHDURATION(0, "STRING_FROM_YEARMONTHDURATION", "STRING_FROM_YEARMONTHDURATION"),

	/**
	 * The '<em><b>X500NAME FROM STRING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #X500NAME_FROM_STRING_VALUE
	 * @generated
	 * @ordered
	 */
	X500NAME_FROM_STRING(0, "X500NAME_FROM_STRING", "X500NAME_FROM_STRING"),

	/**
	 * The '<em><b>STRING FROM X500NAME</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRING_FROM_X500NAME_VALUE
	 * @generated
	 * @ordered
	 */
	STRING_FROM_X500NAME(0, "STRING_FROM_X500NAME", "STRING_FROM_X500NAME"),

	/**
	 * The '<em><b>RFC822NAME FROM STRING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RFC822NAME_FROM_STRING_VALUE
	 * @generated
	 * @ordered
	 */
	RFC822NAME_FROM_STRING(0, "RFC822NAME_FROM_STRING", "RFC822NAME_FROM_STRING"),

	/**
	 * The '<em><b>STRING FROM RFC822NAME</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRING_FROM_RFC822NAME_VALUE
	 * @generated
	 * @ordered
	 */
	STRING_FROM_RFC822NAME(0, "STRING_FROM_RFC822NAME", "STRING_FROM_RFC822NAME"),

	/**
	 * The '<em><b>IPADDRESS FROM STRING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IPADDRESS_FROM_STRING_VALUE
	 * @generated
	 * @ordered
	 */
	IPADDRESS_FROM_STRING(0, "IPADDRESS_FROM_STRING", "IPADDRESS_FROM_STRING"),

	/**
	 * The '<em><b>STRING FROM IPADDRESS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRING_FROM_IPADDRESS_VALUE
	 * @generated
	 * @ordered
	 */
	STRING_FROM_IPADDRESS(0, "STRING_FROM_IPADDRESS", "STRING_FROM_IPADDRESS"),

	/**
	 * The '<em><b>DNSNAME FROM STRING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DNSNAME_FROM_STRING_VALUE
	 * @generated
	 * @ordered
	 */
	DNSNAME_FROM_STRING(0, "DNSNAME_FROM_STRING", "DNSNAME_FROM_STRING"),

	/**
	 * The '<em><b>STRING FROM DNSNAME</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRING_FROM_DNSNAME_VALUE
	 * @generated
	 * @ordered
	 */
	STRING_FROM_DNSNAME(0, "STRING_FROM_DNSNAME", "STRING_FROM_DNSNAME"),

	/**
	 * The '<em><b>STRING STARTS WITH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRING_STARTS_WITH_VALUE
	 * @generated
	 * @ordered
	 */
	STRING_STARTS_WITH(0, "STRING_STARTS_WITH", "STRING_STARTS_WITH"),

	/**
	 * The '<em><b>ANYURI STARTS WITH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANYURI_STARTS_WITH_VALUE
	 * @generated
	 * @ordered
	 */
	ANYURI_STARTS_WITH(0, "ANYURI_STARTS_WITH", "ANYURI_STARTS_WITH"),

	/**
	 * The '<em><b>STRING ENDS WITH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRING_ENDS_WITH_VALUE
	 * @generated
	 * @ordered
	 */
	STRING_ENDS_WITH(0, "STRING_ENDS_WITH", "STRING_ENDS_WITH"),

	/**
	 * The '<em><b>ANYURI ENDS WITH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANYURI_ENDS_WITH_VALUE
	 * @generated
	 * @ordered
	 */
	ANYURI_ENDS_WITH(0, "ANYURI_ENDS_WITH", "ANYURI_ENDS_WITH"),

	/**
	 * The '<em><b>STRING CONTAINS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRING_CONTAINS_VALUE
	 * @generated
	 * @ordered
	 */
	STRING_CONTAINS(0, "STRING_CONTAINS", "STRING_CONTAINS"),

	/**
	 * The '<em><b>ANYURI CONTAINS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANYURI_CONTAINS_VALUE
	 * @generated
	 * @ordered
	 */
	ANYURI_CONTAINS(0, "ANYURI_CONTAINS", "ANYURI_CONTAINS"),

	/**
	 * The '<em><b>STRING SUBSTRING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRING_SUBSTRING_VALUE
	 * @generated
	 * @ordered
	 */
	STRING_SUBSTRING(0, "STRING_SUBSTRING", "STRING_SUBSTRING"),

	/**
	 * The '<em><b>ANYURI SUBSTRING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANYURI_SUBSTRING_VALUE
	 * @generated
	 * @ordered
	 */
	ANYURI_SUBSTRING(0, "ANYURI_SUBSTRING", "ANYURI_SUBSTRING"),

	/**
	 * The '<em><b>ANY OF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANY_OF_VALUE
	 * @generated
	 * @ordered
	 */
	ANY_OF(0, "ANY_OF", "ANY_OF"),

	/**
	 * The '<em><b>ALL OF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALL_OF_VALUE
	 * @generated
	 * @ordered
	 */
	ALL_OF(0, "ALL_OF", "ALL_OF"),

	/**
	 * The '<em><b>ANY OF ANY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANY_OF_ANY_VALUE
	 * @generated
	 * @ordered
	 */
	ANY_OF_ANY(0, "ANY_OF_ANY", "ANY_OF_ANY"),

	/**
	 * The '<em><b>ALL OF ANY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALL_OF_ANY_VALUE
	 * @generated
	 * @ordered
	 */
	ALL_OF_ANY(0, "ALL_OF_ANY", "ALL_OF_ANY"),

	/**
	 * The '<em><b>ANY OF ALL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANY_OF_ALL_VALUE
	 * @generated
	 * @ordered
	 */
	ANY_OF_ALL(0, "ANY_OF_ALL", "ANY_OF_ALL"),

	/**
	 * The '<em><b>ALL OF ALL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALL_OF_ALL_VALUE
	 * @generated
	 * @ordered
	 */
	ALL_OF_ALL(0, "ALL_OF_ALL", "ALL_OF_ALL"),

	/**
	 * The '<em><b>MAP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAP_VALUE
	 * @generated
	 * @ordered
	 */
	MAP(0, "MAP", "MAP"),

	/**
	 * The '<em><b>X500NAME MATCH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #X500NAME_MATCH_VALUE
	 * @generated
	 * @ordered
	 */
	X500NAME_MATCH(0, "X500NAME_MATCH", "X500NAME_MATCH"),

	/**
	 * The '<em><b>RFC822NAME MATCH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RFC822NAME_MATCH_VALUE
	 * @generated
	 * @ordered
	 */
	RFC822NAME_MATCH(0, "RFC822NAME_MATCH", "RFC822NAME_MATCH"),

	/**
	 * The '<em><b>STRING REGEXP MATCH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRING_REGEXP_MATCH_VALUE
	 * @generated
	 * @ordered
	 */
	STRING_REGEXP_MATCH(0, "STRING_REGEXP_MATCH", "STRING_REGEXP_MATCH"),

	/**
	 * The '<em><b>ANYURI REGEXP MATCH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANYURI_REGEXP_MATCH_VALUE
	 * @generated
	 * @ordered
	 */
	ANYURI_REGEXP_MATCH(0, "ANYURI_REGEXP_MATCH", "ANYURI_REGEXP_MATCH"),

	/**
	 * The '<em><b>IPADDRESS REGEXP MATCH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IPADDRESS_REGEXP_MATCH_VALUE
	 * @generated
	 * @ordered
	 */
	IPADDRESS_REGEXP_MATCH(0, "IPADDRESS_REGEXP_MATCH", "IPADDRESS_REGEXP_MATCH"),

	/**
	 * The '<em><b>DNSNAME REGEXP MATCH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DNSNAME_REGEXP_MATCH_VALUE
	 * @generated
	 * @ordered
	 */
	DNSNAME_REGEXP_MATCH(0, "DNSNAME_REGEXP_MATCH", "DNSNAME_REGEXP_MATCH"),

	/**
	 * The '<em><b>RFC822NAME REGEXP MATCH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RFC822NAME_REGEXP_MATCH_VALUE
	 * @generated
	 * @ordered
	 */
	RFC822NAME_REGEXP_MATCH(0, "RFC822NAME_REGEXP_MATCH", "RFC822NAME_REGEXP_MATCH"),

	/**
	 * The '<em><b>X500NAME REGEXP MATCH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #X500NAME_REGEXP_MATCH_VALUE
	 * @generated
	 * @ordered
	 */
	X500NAME_REGEXP_MATCH(0, "X500NAME_REGEXP_MATCH", "X500NAME_REGEXP_MATCH"),

	/**
	 * The '<em><b>XPATH NODE COUNT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XPATH_NODE_COUNT_VALUE
	 * @generated
	 * @ordered
	 */
	XPATH_NODE_COUNT(0, "XPATH_NODE_COUNT", "XPATH_NODE_COUNT"),

	/**
	 * The '<em><b>XPATH NODE EQUAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XPATH_NODE_EQUAL_VALUE
	 * @generated
	 * @ordered
	 */
	XPATH_NODE_EQUAL(0, "XPATH_NODE_EQUAL", "XPATH_NODE_EQUAL"),

	/**
	 * The '<em><b>XPATH NODE MATCH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XPATH_NODE_MATCH_VALUE
	 * @generated
	 * @ordered
	 */
	XPATH_NODE_MATCH(0, "XPATH_NODE_MATCH", "XPATH_NODE_MATCH"),

	/**
	 * The '<em><b>STRING INTERSECTION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRING_INTERSECTION_VALUE
	 * @generated
	 * @ordered
	 */
	STRING_INTERSECTION(0, "STRING_INTERSECTION", "STRING_INTERSECTION"),

	/**
	 * The '<em><b>STRING AT LEAST ONE MEMBER OF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRING_AT_LEAST_ONE_MEMBER_OF_VALUE
	 * @generated
	 * @ordered
	 */
	STRING_AT_LEAST_ONE_MEMBER_OF(0, "STRING_AT_LEAST_ONE_MEMBER_OF", "STRING_AT_LEAST_ONE_MEMBER_OF"),

	/**
	 * The '<em><b>STRING UNION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRING_UNION_VALUE
	 * @generated
	 * @ordered
	 */
	STRING_UNION(0, "STRING_UNION", "STRING_UNION"),

	/**
	 * The '<em><b>STRING SUBSET</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRING_SUBSET_VALUE
	 * @generated
	 * @ordered
	 */
	STRING_SUBSET(0, "STRING_SUBSET", "STRING_SUBSET"),

	/**
	 * The '<em><b>STRING SET EQUALS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRING_SET_EQUALS_VALUE
	 * @generated
	 * @ordered
	 */
	STRING_SET_EQUALS(0, "STRING_SET_EQUALS", "STRING_SET_EQUALS"),

	/**
	 * The '<em><b>BOOLEAN INTERSECTION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOOLEAN_INTERSECTION_VALUE
	 * @generated
	 * @ordered
	 */
	BOOLEAN_INTERSECTION(0, "BOOLEAN_INTERSECTION", "BOOLEAN_INTERSECTION"),

	/**
	 * The '<em><b>BOOLEAN AT LEAST ONE MEMBER OF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOOLEAN_AT_LEAST_ONE_MEMBER_OF_VALUE
	 * @generated
	 * @ordered
	 */
	BOOLEAN_AT_LEAST_ONE_MEMBER_OF(0, "BOOLEAN_AT_LEAST_ONE_MEMBER_OF", "BOOLEAN_AT_LEAST_ONE_MEMBER_OF"),

	/**
	 * The '<em><b>BOOLEAN UNION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOOLEAN_UNION_VALUE
	 * @generated
	 * @ordered
	 */
	BOOLEAN_UNION(0, "BOOLEAN_UNION", "BOOLEAN_UNION"),

	/**
	 * The '<em><b>BOOLEAN SUBSET</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOOLEAN_SUBSET_VALUE
	 * @generated
	 * @ordered
	 */
	BOOLEAN_SUBSET(0, "BOOLEAN_SUBSET", "BOOLEAN_SUBSET"),

	/**
	 * The '<em><b>BOOLEAN SET EQUALS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOOLEAN_SET_EQUALS_VALUE
	 * @generated
	 * @ordered
	 */
	BOOLEAN_SET_EQUALS(0, "BOOLEAN_SET_EQUALS", "BOOLEAN_SET_EQUALS"),

	/**
	 * The '<em><b>INTEGER INTERSECTION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTEGER_INTERSECTION_VALUE
	 * @generated
	 * @ordered
	 */
	INTEGER_INTERSECTION(0, "INTEGER_INTERSECTION", "INTEGER_INTERSECTION"),

	/**
	 * The '<em><b>INTEGER AT LEAST ONE MEMBER OF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTEGER_AT_LEAST_ONE_MEMBER_OF_VALUE
	 * @generated
	 * @ordered
	 */
	INTEGER_AT_LEAST_ONE_MEMBER_OF(0, "INTEGER_AT_LEAST_ONE_MEMBER_OF", "INTEGER_AT_LEAST_ONE_MEMBER_OF"),

	/**
	 * The '<em><b>INTEGER UNION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTEGER_UNION_VALUE
	 * @generated
	 * @ordered
	 */
	INTEGER_UNION(0, "INTEGER_UNION", "INTEGER_UNION"),

	/**
	 * The '<em><b>INTEGER SUBSET</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTEGER_SUBSET_VALUE
	 * @generated
	 * @ordered
	 */
	INTEGER_SUBSET(0, "INTEGER_SUBSET", "INTEGER_SUBSET"),

	/**
	 * The '<em><b>INTEGER SET EQUALS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTEGER_SET_EQUALS_VALUE
	 * @generated
	 * @ordered
	 */
	INTEGER_SET_EQUALS(0, "INTEGER_SET_EQUALS", "INTEGER_SET_EQUALS"),

	/**
	 * The '<em><b>DOUBLE INTERSECTION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOUBLE_INTERSECTION_VALUE
	 * @generated
	 * @ordered
	 */
	DOUBLE_INTERSECTION(0, "DOUBLE_INTERSECTION", "DOUBLE_INTERSECTION"),

	/**
	 * The '<em><b>DOUBLE AT LEAST ONE MEMBER OF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOUBLE_AT_LEAST_ONE_MEMBER_OF_VALUE
	 * @generated
	 * @ordered
	 */
	DOUBLE_AT_LEAST_ONE_MEMBER_OF(0, "DOUBLE_AT_LEAST_ONE_MEMBER_OF", "DOUBLE_AT_LEAST_ONE_MEMBER_OF"),

	/**
	 * The '<em><b>DOUBLE UNION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOUBLE_UNION_VALUE
	 * @generated
	 * @ordered
	 */
	DOUBLE_UNION(0, "DOUBLE_UNION", "DOUBLE_UNION"),

	/**
	 * The '<em><b>DOUBLE SUBSET</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOUBLE_SUBSET_VALUE
	 * @generated
	 * @ordered
	 */
	DOUBLE_SUBSET(0, "DOUBLE_SUBSET", "DOUBLE_SUBSET"),

	/**
	 * The '<em><b>DOUBLE SET EQUALS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOUBLE_SET_EQUALS_VALUE
	 * @generated
	 * @ordered
	 */
	DOUBLE_SET_EQUALS(0, "DOUBLE_SET_EQUALS", "DOUBLE_SET_EQUALS"),

	/**
	 * The '<em><b>TIME INTERSECTION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIME_INTERSECTION_VALUE
	 * @generated
	 * @ordered
	 */
	TIME_INTERSECTION(0, "TIME_INTERSECTION", "TIME_INTERSECTION"),

	/**
	 * The '<em><b>TIME AT LEAST ONE MEMBER OF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIME_AT_LEAST_ONE_MEMBER_OF_VALUE
	 * @generated
	 * @ordered
	 */
	TIME_AT_LEAST_ONE_MEMBER_OF(0, "TIME_AT_LEAST_ONE_MEMBER_OF", "TIME_AT_LEAST_ONE_MEMBER_OF"),

	/**
	 * The '<em><b>TIME UNION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIME_UNION_VALUE
	 * @generated
	 * @ordered
	 */
	TIME_UNION(0, "TIME_UNION", "TIME_UNION"),

	/**
	 * The '<em><b>TIME SUBSET</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIME_SUBSET_VALUE
	 * @generated
	 * @ordered
	 */
	TIME_SUBSET(0, "TIME_SUBSET", "TIME_SUBSET"),

	/**
	 * The '<em><b>TIME SET EQUALS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIME_SET_EQUALS_VALUE
	 * @generated
	 * @ordered
	 */
	TIME_SET_EQUALS(0, "TIME_SET_EQUALS", "TIME_SET_EQUALS"),

	/**
	 * The '<em><b>DATE INTERSECTION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATE_INTERSECTION_VALUE
	 * @generated
	 * @ordered
	 */
	DATE_INTERSECTION(0, "DATE_INTERSECTION", "DATE_INTERSECTION"),

	/**
	 * The '<em><b>DATE AT LEAST ONE MEMBER OF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATE_AT_LEAST_ONE_MEMBER_OF_VALUE
	 * @generated
	 * @ordered
	 */
	DATE_AT_LEAST_ONE_MEMBER_OF(0, "DATE_AT_LEAST_ONE_MEMBER_OF", "DATE_AT_LEAST_ONE_MEMBER_OF"),

	/**
	 * The '<em><b>DATE UNION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATE_UNION_VALUE
	 * @generated
	 * @ordered
	 */
	DATE_UNION(0, "DATE_UNION", "DATE_UNION"),

	/**
	 * The '<em><b>DATE SUBSET</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATE_SUBSET_VALUE
	 * @generated
	 * @ordered
	 */
	DATE_SUBSET(0, "DATE_SUBSET", "DATE_SUBSET"),

	/**
	 * The '<em><b>DATE SET EQUALS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATE_SET_EQUALS_VALUE
	 * @generated
	 * @ordered
	 */
	DATE_SET_EQUALS(0, "DATE_SET_EQUALS", "DATE_SET_EQUALS"),

	/**
	 * The '<em><b>DATETIME INTERSECTION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATETIME_INTERSECTION_VALUE
	 * @generated
	 * @ordered
	 */
	DATETIME_INTERSECTION(0, "DATETIME_INTERSECTION", "DATETIME_INTERSECTION"),

	/**
	 * The '<em><b>DATETIME AT LEAST ONE MEMBER OF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATETIME_AT_LEAST_ONE_MEMBER_OF_VALUE
	 * @generated
	 * @ordered
	 */
	DATETIME_AT_LEAST_ONE_MEMBER_OF(0, "DATETIME_AT_LEAST_ONE_MEMBER_OF", "DATETIME_AT_LEAST_ONE_MEMBER_OF"),

	/**
	 * The '<em><b>DATETIME UNION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATETIME_UNION_VALUE
	 * @generated
	 * @ordered
	 */
	DATETIME_UNION(0, "DATETIME_UNION", "DATETIME_UNION"),

	/**
	 * The '<em><b>DATETIME SUBSET</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATETIME_SUBSET_VALUE
	 * @generated
	 * @ordered
	 */
	DATETIME_SUBSET(0, "DATETIME_SUBSET", "DATETIME_SUBSET"),

	/**
	 * The '<em><b>DATETIME SET EQUALS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATETIME_SET_EQUALS_VALUE
	 * @generated
	 * @ordered
	 */
	DATETIME_SET_EQUALS(0, "DATETIME_SET_EQUALS", "DATETIME_SET_EQUALS"),

	/**
	 * The '<em><b>ANYURI INTERSECTION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANYURI_INTERSECTION_VALUE
	 * @generated
	 * @ordered
	 */
	ANYURI_INTERSECTION(0, "ANYURI_INTERSECTION", "ANYURI_INTERSECTION"),

	/**
	 * The '<em><b>ANYURI AT LEAST ONE MEMBER OF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANYURI_AT_LEAST_ONE_MEMBER_OF_VALUE
	 * @generated
	 * @ordered
	 */
	ANYURI_AT_LEAST_ONE_MEMBER_OF(0, "ANYURI_AT_LEAST_ONE_MEMBER_OF", "ANYURI_AT_LEAST_ONE_MEMBER_OF"),

	/**
	 * The '<em><b>ANYURI UNION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANYURI_UNION_VALUE
	 * @generated
	 * @ordered
	 */
	ANYURI_UNION(0, "ANYURI_UNION", "ANYURI_UNION"),

	/**
	 * The '<em><b>ANYURI SUBSET</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANYURI_SUBSET_VALUE
	 * @generated
	 * @ordered
	 */
	ANYURI_SUBSET(0, "ANYURI_SUBSET", "ANYURI_SUBSET"),

	/**
	 * The '<em><b>ANYURI SET EQUALS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANYURI_SET_EQUALS_VALUE
	 * @generated
	 * @ordered
	 */
	ANYURI_SET_EQUALS(0, "ANYURI_SET_EQUALS", "ANYURI_SET_EQUALS"),

	/**
	 * The '<em><b>HEXBINARY INTERSECTION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEXBINARY_INTERSECTION_VALUE
	 * @generated
	 * @ordered
	 */
	HEXBINARY_INTERSECTION(0, "HEXBINARY_INTERSECTION", "HEXBINARY_INTERSECTION"),

	/**
	 * The '<em><b>HEXBINARY AT LEAST ONE MEMBER OF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEXBINARY_AT_LEAST_ONE_MEMBER_OF_VALUE
	 * @generated
	 * @ordered
	 */
	HEXBINARY_AT_LEAST_ONE_MEMBER_OF(0, "HEXBINARY_AT_LEAST_ONE_MEMBER_OF", "HEXBINARY_AT_LEAST_ONE_MEMBER_OF"),

	/**
	 * The '<em><b>HEXBINARY UNION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEXBINARY_UNION_VALUE
	 * @generated
	 * @ordered
	 */
	HEXBINARY_UNION(0, "HEXBINARY_UNION", "HEXBINARY_UNION"),

	/**
	 * The '<em><b>HEXBINARY SUBSET</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEXBINARY_SUBSET_VALUE
	 * @generated
	 * @ordered
	 */
	HEXBINARY_SUBSET(0, "HEXBINARY_SUBSET", "HEXBINARY_SUBSET"),

	/**
	 * The '<em><b>HEXBINARY SET EQUALS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEXBINARY_SET_EQUALS_VALUE
	 * @generated
	 * @ordered
	 */
	HEXBINARY_SET_EQUALS(0, "HEXBINARY_SET_EQUALS", "HEXBINARY_SET_EQUALS"),

	/**
	 * The '<em><b>BASE64BINARY INTERSECTION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BASE64BINARY_INTERSECTION_VALUE
	 * @generated
	 * @ordered
	 */
	BASE64BINARY_INTERSECTION(0, "BASE64BINARY_INTERSECTION", "BASE64BINARY_INTERSECTION"),

	/**
	 * The '<em><b>BASE64BINARY AT LEAST ONE MEMBER OF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BASE64BINARY_AT_LEAST_ONE_MEMBER_OF_VALUE
	 * @generated
	 * @ordered
	 */
	BASE64BINARY_AT_LEAST_ONE_MEMBER_OF(0, "BASE64BINARY_AT_LEAST_ONE_MEMBER_OF", "BASE64BINARY_AT_LEAST_ONE_MEMBER_OF"),

	/**
	 * The '<em><b>BASE64BINARY UNION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BASE64BINARY_UNION_VALUE
	 * @generated
	 * @ordered
	 */
	BASE64BINARY_UNION(0, "BASE64BINARY_UNION", "BASE64BINARY_UNION"),

	/**
	 * The '<em><b>BASE64BINARY SUBSET</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BASE64BINARY_SUBSET_VALUE
	 * @generated
	 * @ordered
	 */
	BASE64BINARY_SUBSET(0, "BASE64BINARY_SUBSET", "BASE64BINARY_SUBSET"),

	/**
	 * The '<em><b>BASE64BINARY SET EQUALS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BASE64BINARY_SET_EQUALS_VALUE
	 * @generated
	 * @ordered
	 */
	BASE64BINARY_SET_EQUALS(0, "BASE64BINARY_SET_EQUALS", "BASE64BINARY_SET_EQUALS"),

	/**
	 * The '<em><b>DAYTIMEDURATION INTERSECTION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DAYTIMEDURATION_INTERSECTION_VALUE
	 * @generated
	 * @ordered
	 */
	DAYTIMEDURATION_INTERSECTION(0, "DAYTIMEDURATION_INTERSECTION", "DAYTIMEDURATION_INTERSECTION"),

	/**
	 * The '<em><b>DAYTIMEDURATION AT LEAST ONE MEMBER OF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DAYTIMEDURATION_AT_LEAST_ONE_MEMBER_OF_VALUE
	 * @generated
	 * @ordered
	 */
	DAYTIMEDURATION_AT_LEAST_ONE_MEMBER_OF(0, "DAYTIMEDURATION_AT_LEAST_ONE_MEMBER_OF", "DAYTIMEDURATION_AT_LEAST_ONE_MEMBER_OF"),

	/**
	 * The '<em><b>DAYTIMEDURATION UNION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DAYTIMEDURATION_UNION_VALUE
	 * @generated
	 * @ordered
	 */
	DAYTIMEDURATION_UNION(0, "DAYTIMEDURATION_UNION", "DAYTIMEDURATION_UNION"),

	/**
	 * The '<em><b>DAYTIMEDURATION SUBSET</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DAYTIMEDURATION_SUBSET_VALUE
	 * @generated
	 * @ordered
	 */
	DAYTIMEDURATION_SUBSET(0, "DAYTIMEDURATION_SUBSET", "DAYTIMEDURATION_SUBSET"),

	/**
	 * The '<em><b>DAYTIMEDURATION SET EQUALS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DAYTIMEDURATION_SET_EQUALS_VALUE
	 * @generated
	 * @ordered
	 */
	DAYTIMEDURATION_SET_EQUALS(0, "DAYTIMEDURATION_SET_EQUALS", "DAYTIMEDURATION_SET_EQUALS"),

	/**
	 * The '<em><b>YEARMONTHDURATION INTERSECTION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #YEARMONTHDURATION_INTERSECTION_VALUE
	 * @generated
	 * @ordered
	 */
	YEARMONTHDURATION_INTERSECTION(0, "YEARMONTHDURATION_INTERSECTION", "YEARMONTHDURATION_INTERSECTION"),

	/**
	 * The '<em><b>YEARMONTHDURATION AT LEAST ONE MEMBER OF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #YEARMONTHDURATION_AT_LEAST_ONE_MEMBER_OF_VALUE
	 * @generated
	 * @ordered
	 */
	YEARMONTHDURATION_AT_LEAST_ONE_MEMBER_OF(0, "YEARMONTHDURATION_AT_LEAST_ONE_MEMBER_OF", "YEARMONTHDURATION_AT_LEAST_ONE_MEMBER_OF"),

	/**
	 * The '<em><b>YEARMONTHDURATION UNION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #YEARMONTHDURATION_UNION_VALUE
	 * @generated
	 * @ordered
	 */
	YEARMONTHDURATION_UNION(0, "YEARMONTHDURATION_UNION", "YEARMONTHDURATION_UNION"),

	/**
	 * The '<em><b>YEARMONTHDURATION SUBSET</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #YEARMONTHDURATION_SUBSET_VALUE
	 * @generated
	 * @ordered
	 */
	YEARMONTHDURATION_SUBSET(0, "YEARMONTHDURATION_SUBSET", "YEARMONTHDURATION_SUBSET"),

	/**
	 * The '<em><b>YEARMONTHDURATION SET EQUALS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #YEARMONTHDURATION_SET_EQUALS_VALUE
	 * @generated
	 * @ordered
	 */
	YEARMONTHDURATION_SET_EQUALS(0, "YEARMONTHDURATION_SET_EQUALS", "YEARMONTHDURATION_SET_EQUALS"),

	/**
	 * The '<em><b>X500NAME INTERSECTION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #X500NAME_INTERSECTION_VALUE
	 * @generated
	 * @ordered
	 */
	X500NAME_INTERSECTION(0, "X500NAME_INTERSECTION", "X500NAME_INTERSECTION"),

	/**
	 * The '<em><b>X500NAME AT LEAST ONE MEMBER OF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #X500NAME_AT_LEAST_ONE_MEMBER_OF_VALUE
	 * @generated
	 * @ordered
	 */
	X500NAME_AT_LEAST_ONE_MEMBER_OF(0, "X500NAME_AT_LEAST_ONE_MEMBER_OF", "X500NAME_AT_LEAST_ONE_MEMBER_OF"),

	/**
	 * The '<em><b>X500NAME UNION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #X500NAME_UNION_VALUE
	 * @generated
	 * @ordered
	 */
	X500NAME_UNION(0, "X500NAME_UNION", "X500NAME_UNION"),

	/**
	 * The '<em><b>X500NAME SUBSET</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #X500NAME_SUBSET_VALUE
	 * @generated
	 * @ordered
	 */
	X500NAME_SUBSET(0, "X500NAME_SUBSET", "X500NAME_SUBSET"),

	/**
	 * The '<em><b>X500NAME SET EQUALS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #X500NAME_SET_EQUALS_VALUE
	 * @generated
	 * @ordered
	 */
	X500NAME_SET_EQUALS(0, "X500NAME_SET_EQUALS", "X500NAME_SET_EQUALS"),

	/**
	 * The '<em><b>RFC822NAME INTERSECTION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RFC822NAME_INTERSECTION_VALUE
	 * @generated
	 * @ordered
	 */
	RFC822NAME_INTERSECTION(0, "RFC822NAME_INTERSECTION", "RFC822NAME_INTERSECTION"),

	/**
	 * The '<em><b>RFC822NAME AT LEAST ONE MEMBER OF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RFC822NAME_AT_LEAST_ONE_MEMBER_OF_VALUE
	 * @generated
	 * @ordered
	 */
	RFC822NAME_AT_LEAST_ONE_MEMBER_OF(0, "RFC822NAME_AT_LEAST_ONE_MEMBER_OF", "RFC822NAME_AT_LEAST_ONE_MEMBER_OF"),

	/**
	 * The '<em><b>RFC822NAME UNION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RFC822NAME_UNION_VALUE
	 * @generated
	 * @ordered
	 */
	RFC822NAME_UNION(0, "RFC822NAME_UNION", "RFC822NAME_UNION"),

	/**
	 * The '<em><b>RFC822NAME SUBSET</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RFC822NAME_SUBSET_VALUE
	 * @generated
	 * @ordered
	 */
	RFC822NAME_SUBSET(0, "RFC822NAME_SUBSET", "RFC822NAME_SUBSET"),

	/**
	 * The '<em><b>RFC822NAME SET EQUALS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RFC822NAME_SET_EQUALS_VALUE
	 * @generated
	 * @ordered
	 */
	RFC822NAME_SET_EQUALS(0, "RFC822NAME_SET_EQUALS", "RFC822NAME_SET_EQUALS"),

	/**
	 * The '<em><b>IPADDRESS INTERSECTION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IPADDRESS_INTERSECTION_VALUE
	 * @generated
	 * @ordered
	 */
	IPADDRESS_INTERSECTION(0, "IPADDRESS_INTERSECTION", "IPADDRESS_INTERSECTION"),

	/**
	 * The '<em><b>IPADDRESS AT LEAST ONE MEMBER OF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IPADDRESS_AT_LEAST_ONE_MEMBER_OF_VALUE
	 * @generated
	 * @ordered
	 */
	IPADDRESS_AT_LEAST_ONE_MEMBER_OF(0, "IPADDRESS_AT_LEAST_ONE_MEMBER_OF", "IPADDRESS_AT_LEAST_ONE_MEMBER_OF"),

	/**
	 * The '<em><b>IPADDRESS UNION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IPADDRESS_UNION_VALUE
	 * @generated
	 * @ordered
	 */
	IPADDRESS_UNION(0, "IPADDRESS_UNION", "IPADDRESS_UNION"),

	/**
	 * The '<em><b>IPADDRESS SUBSET</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IPADDRESS_SUBSET_VALUE
	 * @generated
	 * @ordered
	 */
	IPADDRESS_SUBSET(0, "IPADDRESS_SUBSET", "IPADDRESS_SUBSET"),

	/**
	 * The '<em><b>IPADDRESS SET EQUALS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IPADDRESS_SET_EQUALS_VALUE
	 * @generated
	 * @ordered
	 */
	IPADDRESS_SET_EQUALS(0, "IPADDRESS_SET_EQUALS", "IPADDRESS_SET_EQUALS"),

	/**
	 * The '<em><b>DNSNAME INTERSECTION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DNSNAME_INTERSECTION_VALUE
	 * @generated
	 * @ordered
	 */
	DNSNAME_INTERSECTION(0, "DNSNAME_INTERSECTION", "DNSNAME_INTERSECTION"),

	/**
	 * The '<em><b>DNSNAME AT LEAST ONE MEMBER OF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DNSNAME_AT_LEAST_ONE_MEMBER_OF_VALUE
	 * @generated
	 * @ordered
	 */
	DNSNAME_AT_LEAST_ONE_MEMBER_OF(0, "DNSNAME_AT_LEAST_ONE_MEMBER_OF", "DNSNAME_AT_LEAST_ONE_MEMBER_OF"),

	/**
	 * The '<em><b>DNSNAME UNION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DNSNAME_UNION_VALUE
	 * @generated
	 * @ordered
	 */
	DNSNAME_UNION(0, "DNSNAME_UNION", "DNSNAME_UNION"),

	/**
	 * The '<em><b>DNSNAME SUBSET</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DNSNAME_SUBSET_VALUE
	 * @generated
	 * @ordered
	 */
	DNSNAME_SUBSET(0, "DNSNAME_SUBSET", "DNSNAME_SUBSET"),

	/**
	 * The '<em><b>DNSNAME SET EQUALS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DNSNAME_SET_EQUALS_VALUE
	 * @generated
	 * @ordered
	 */
	DNSNAME_SET_EQUALS(0, "DNSNAME_SET_EQUALS", "DNSNAME_SET_EQUALS");

	/**
	 * The '<em><b>STRING EQUAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRING_EQUAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int STRING_EQUAL_VALUE = 0;

	/**
	 * The '<em><b>BOOLEAN EQUAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOOLEAN_EQUAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BOOLEAN_EQUAL_VALUE = 0;

	/**
	 * The '<em><b>INTEGER EQUAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTEGER_EQUAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INTEGER_EQUAL_VALUE = 0;

	/**
	 * The '<em><b>DOUBLE EQUAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOUBLE_EQUAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DOUBLE_EQUAL_VALUE = 0;

	/**
	 * The '<em><b>DATE EQUAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATE_EQUAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DATE_EQUAL_VALUE = 0;

	/**
	 * The '<em><b>TIME EQUAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIME_EQUAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TIME_EQUAL_VALUE = 0;

	/**
	 * The '<em><b>DATETIME EQUAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATETIME_EQUAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DATETIME_EQUAL_VALUE = 0;

	/**
	 * The '<em><b>DAYTIMEDURATION EQUAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DAYTIMEDURATION_EQUAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DAYTIMEDURATION_EQUAL_VALUE = 0;

	/**
	 * The '<em><b>YEARMONTHDURATION EQUAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #YEARMONTHDURATION_EQUAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int YEARMONTHDURATION_EQUAL_VALUE = 0;

	/**
	 * The '<em><b>STRING EQUAL IGNORE CASE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRING_EQUAL_IGNORE_CASE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int STRING_EQUAL_IGNORE_CASE_VALUE = 0;

	/**
	 * The '<em><b>ANYURI EQUAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANYURI_EQUAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ANYURI_EQUAL_VALUE = 0;

	/**
	 * The '<em><b>X500NAME EQUAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #X500NAME_EQUAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int X500NAME_EQUAL_VALUE = 0;

	/**
	 * The '<em><b>RFC822NAME EQUAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RFC822NAME_EQUAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RFC822NAME_EQUAL_VALUE = 0;

	/**
	 * The '<em><b>HEXBINARY EQUAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEXBINARY_EQUAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HEXBINARY_EQUAL_VALUE = 0;

	/**
	 * The '<em><b>BASE64BINARY EQUAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BASE64BINARY_EQUAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BASE64BINARY_EQUAL_VALUE = 0;

	/**
	 * The '<em><b>INTEGER ADD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTEGER_ADD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INTEGER_ADD_VALUE = 0;

	/**
	 * The '<em><b>DOUBLE ADD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOUBLE_ADD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DOUBLE_ADD_VALUE = 0;

	/**
	 * The '<em><b>INTEGER SUBTRACT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTEGER_SUBTRACT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INTEGER_SUBTRACT_VALUE = 0;

	/**
	 * The '<em><b>DOUBLE SUBTRACT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOUBLE_SUBTRACT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DOUBLE_SUBTRACT_VALUE = 0;

	/**
	 * The '<em><b>INTEGER MULTIPLY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTEGER_MULTIPLY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INTEGER_MULTIPLY_VALUE = 0;

	/**
	 * The '<em><b>DOUBLE MULTIPLY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOUBLE_MULTIPLY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DOUBLE_MULTIPLY_VALUE = 0;

	/**
	 * The '<em><b>INTEGER DIVIDE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTEGER_DIVIDE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INTEGER_DIVIDE_VALUE = 0;

	/**
	 * The '<em><b>DOUBLE DIVIDE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOUBLE_DIVIDE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DOUBLE_DIVIDE_VALUE = 0;

	/**
	 * The '<em><b>INTEGER MOD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTEGER_MOD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INTEGER_MOD_VALUE = 0;

	/**
	 * The '<em><b>INTEGER ABS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTEGER_ABS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INTEGER_ABS_VALUE = 0;

	/**
	 * The '<em><b>DOUBLE ABS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOUBLE_ABS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DOUBLE_ABS_VALUE = 0;

	/**
	 * The '<em><b>ROUND</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ROUND
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ROUND_VALUE = 0;

	/**
	 * The '<em><b>FLOOR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FLOOR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FLOOR_VALUE = 0;

	/**
	 * The '<em><b>STRING NORMALIZE SPACE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRING_NORMALIZE_SPACE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int STRING_NORMALIZE_SPACE_VALUE = 0;

	/**
	 * The '<em><b>STRING NORMALIZE TO LOWER CASE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRING_NORMALIZE_TO_LOWER_CASE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int STRING_NORMALIZE_TO_LOWER_CASE_VALUE = 0;

	/**
	 * The '<em><b>DOUBLE TO INTEGER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOUBLE_TO_INTEGER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DOUBLE_TO_INTEGER_VALUE = 0;

	/**
	 * The '<em><b>INTEGER TO DOUBLE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTEGER_TO_DOUBLE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INTEGER_TO_DOUBLE_VALUE = 0;

	/**
	 * The '<em><b>OR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OR_VALUE = 0;

	/**
	 * The '<em><b>AND</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AND
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AND_VALUE = 0;

	/**
	 * The '<em><b>NOF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOF
	 * @model name="N_OF"
	 * @generated
	 * @ordered
	 */
	public static final int NOF_VALUE = 0;

	/**
	 * The '<em><b>NOT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NOT_VALUE = 0;

	/**
	 * The '<em><b>PRESENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRESENT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PRESENT_VALUE = 0;

	/**
	 * The '<em><b>INTEGER GREATER THAN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTEGER_GREATER_THAN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INTEGER_GREATER_THAN_VALUE = 0;

	/**
	 * The '<em><b>INTEGER GREATER THAN OR EQUAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTEGER_GREATER_THAN_OR_EQUAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INTEGER_GREATER_THAN_OR_EQUAL_VALUE = 0;

	/**
	 * The '<em><b>INTEGER LESS THAN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTEGER_LESS_THAN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INTEGER_LESS_THAN_VALUE = 0;

	/**
	 * The '<em><b>INTEGER LESS THAN OR EQUAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTEGER_LESS_THAN_OR_EQUAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INTEGER_LESS_THAN_OR_EQUAL_VALUE = 0;

	/**
	 * The '<em><b>DOUBLE GREATER THAN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOUBLE_GREATER_THAN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DOUBLE_GREATER_THAN_VALUE = 0;

	/**
	 * The '<em><b>DOUBLE GREATER THAN OR EQUAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOUBLE_GREATER_THAN_OR_EQUAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DOUBLE_GREATER_THAN_OR_EQUAL_VALUE = 0;

	/**
	 * The '<em><b>DOUBLE LESS THAN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOUBLE_LESS_THAN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DOUBLE_LESS_THAN_VALUE = 0;

	/**
	 * The '<em><b>DOUBLE LESS THAN OR EQUAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOUBLE_LESS_THAN_OR_EQUAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DOUBLE_LESS_THAN_OR_EQUAL_VALUE = 0;

	/**
	 * The '<em><b>DATETIME ADD DAYTIMEDURATION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATETIME_ADD_DAYTIMEDURATION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DATETIME_ADD_DAYTIMEDURATION_VALUE = 0;

	/**
	 * The '<em><b>DATETIME ADD YEARMONTHDURATION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATETIME_ADD_YEARMONTHDURATION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DATETIME_ADD_YEARMONTHDURATION_VALUE = 0;

	/**
	 * The '<em><b>DATETIME SUBTRACT DAYTIMEDURATION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATETIME_SUBTRACT_DAYTIMEDURATION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DATETIME_SUBTRACT_DAYTIMEDURATION_VALUE = 0;

	/**
	 * The '<em><b>DATETIME SUBTRACT YEARMONTHDURATION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATETIME_SUBTRACT_YEARMONTHDURATION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DATETIME_SUBTRACT_YEARMONTHDURATION_VALUE = 0;

	/**
	 * The '<em><b>DATE ADD YEARMONTHDURATION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATE_ADD_YEARMONTHDURATION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DATE_ADD_YEARMONTHDURATION_VALUE = 0;

	/**
	 * The '<em><b>DATE SUBTRACT YEARMONTHDURATION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATE_SUBTRACT_YEARMONTHDURATION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DATE_SUBTRACT_YEARMONTHDURATION_VALUE = 0;

	/**
	 * The '<em><b>STRING GREATER THAN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRING_GREATER_THAN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int STRING_GREATER_THAN_VALUE = 0;

	/**
	 * The '<em><b>STRING GREATER THAN OR EQUAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRING_GREATER_THAN_OR_EQUAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int STRING_GREATER_THAN_OR_EQUAL_VALUE = 0;

	/**
	 * The '<em><b>STRING LESS THAN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRING_LESS_THAN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int STRING_LESS_THAN_VALUE = 0;

	/**
	 * The '<em><b>STRING LESS THAN OR EQUAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRING_LESS_THAN_OR_EQUAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int STRING_LESS_THAN_OR_EQUAL_VALUE = 0;

	/**
	 * The '<em><b>TIME GREATER THAN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIME_GREATER_THAN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TIME_GREATER_THAN_VALUE = 0;

	/**
	 * The '<em><b>TIME GREATER THAN OR EQUAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIME_GREATER_THAN_OR_EQUAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TIME_GREATER_THAN_OR_EQUAL_VALUE = 0;

	/**
	 * The '<em><b>TIME LESS THAN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIME_LESS_THAN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TIME_LESS_THAN_VALUE = 0;

	/**
	 * The '<em><b>TIME LESS THAN OR EQUAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIME_LESS_THAN_OR_EQUAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TIME_LESS_THAN_OR_EQUAL_VALUE = 0;

	/**
	 * The '<em><b>TIME IN RANGE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIME_IN_RANGE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TIME_IN_RANGE_VALUE = 0;

	/**
	 * The '<em><b>DATETIME GREATER THAN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATETIME_GREATER_THAN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DATETIME_GREATER_THAN_VALUE = 0;

	/**
	 * The '<em><b>DATETIME GREATER THAN OR EQUAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATETIME_GREATER_THAN_OR_EQUAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DATETIME_GREATER_THAN_OR_EQUAL_VALUE = 0;

	/**
	 * The '<em><b>DATETIME LESS THAN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATETIME_LESS_THAN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DATETIME_LESS_THAN_VALUE = 0;

	/**
	 * The '<em><b>DATETIME LESS THAN OR EQUAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATETIME_LESS_THAN_OR_EQUAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DATETIME_LESS_THAN_OR_EQUAL_VALUE = 0;

	/**
	 * The '<em><b>DATE GREATER THAN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATE_GREATER_THAN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DATE_GREATER_THAN_VALUE = 0;

	/**
	 * The '<em><b>DATE GREATER THAN OR EQUAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATE_GREATER_THAN_OR_EQUAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DATE_GREATER_THAN_OR_EQUAL_VALUE = 0;

	/**
	 * The '<em><b>DATE LESS THAN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATE_LESS_THAN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DATE_LESS_THAN_VALUE = 0;

	/**
	 * The '<em><b>DATE LESS THAN OR EQUAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATE_LESS_THAN_OR_EQUAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DATE_LESS_THAN_OR_EQUAL_VALUE = 0;

	/**
	 * The '<em><b>STRING ONE AND ONLY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRING_ONE_AND_ONLY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int STRING_ONE_AND_ONLY_VALUE = 0;

	/**
	 * The '<em><b>STRING BAG SIZE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRING_BAG_SIZE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int STRING_BAG_SIZE_VALUE = 0;

	/**
	 * The '<em><b>STRING IS IN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRING_IS_IN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int STRING_IS_IN_VALUE = 0;

	/**
	 * The '<em><b>STRING BAG</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRING_BAG
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int STRING_BAG_VALUE = 0;

	/**
	 * The '<em><b>BOOLEAN ONE AND ONLY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOOLEAN_ONE_AND_ONLY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BOOLEAN_ONE_AND_ONLY_VALUE = 0;

	/**
	 * The '<em><b>BOOLEAN BAG SIZE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOOLEAN_BAG_SIZE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BOOLEAN_BAG_SIZE_VALUE = 0;

	/**
	 * The '<em><b>BOOLEAN IS IN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOOLEAN_IS_IN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BOOLEAN_IS_IN_VALUE = 0;

	/**
	 * The '<em><b>BOOLEAN BAG</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOOLEAN_BAG
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BOOLEAN_BAG_VALUE = 0;

	/**
	 * The '<em><b>INTEGER ONE AND ONLY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTEGER_ONE_AND_ONLY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INTEGER_ONE_AND_ONLY_VALUE = 0;

	/**
	 * The '<em><b>INTEGER BAG SIZE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTEGER_BAG_SIZE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INTEGER_BAG_SIZE_VALUE = 0;

	/**
	 * The '<em><b>INTEGER IS IN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTEGER_IS_IN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INTEGER_IS_IN_VALUE = 0;

	/**
	 * The '<em><b>INTEGER BAG</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTEGER_BAG
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INTEGER_BAG_VALUE = 0;

	/**
	 * The '<em><b>DOUBLE ONE AND ONLY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOUBLE_ONE_AND_ONLY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DOUBLE_ONE_AND_ONLY_VALUE = 0;

	/**
	 * The '<em><b>DOUBLE BAG SIZE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOUBLE_BAG_SIZE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DOUBLE_BAG_SIZE_VALUE = 0;

	/**
	 * The '<em><b>DOUBLE IS IN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOUBLE_IS_IN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DOUBLE_IS_IN_VALUE = 0;

	/**
	 * The '<em><b>DOUBLE BAG</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOUBLE_BAG
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DOUBLE_BAG_VALUE = 0;

	/**
	 * The '<em><b>TIME ONE AND ONLY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIME_ONE_AND_ONLY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TIME_ONE_AND_ONLY_VALUE = 0;

	/**
	 * The '<em><b>TIME BAG SIZE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIME_BAG_SIZE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TIME_BAG_SIZE_VALUE = 0;

	/**
	 * The '<em><b>TIME IS IN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIME_IS_IN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TIME_IS_IN_VALUE = 0;

	/**
	 * The '<em><b>TIME BAG</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIME_BAG
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TIME_BAG_VALUE = 0;

	/**
	 * The '<em><b>DATE ONE AND ONLY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATE_ONE_AND_ONLY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DATE_ONE_AND_ONLY_VALUE = 0;

	/**
	 * The '<em><b>DATE BAG SIZE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATE_BAG_SIZE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DATE_BAG_SIZE_VALUE = 0;

	/**
	 * The '<em><b>DATE IS IN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATE_IS_IN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DATE_IS_IN_VALUE = 0;

	/**
	 * The '<em><b>DATE BAG</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATE_BAG
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DATE_BAG_VALUE = 0;

	/**
	 * The '<em><b>DATETIME ONE AND ONLY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATETIME_ONE_AND_ONLY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DATETIME_ONE_AND_ONLY_VALUE = 0;

	/**
	 * The '<em><b>DATETIME BAG SIZE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATETIME_BAG_SIZE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DATETIME_BAG_SIZE_VALUE = 0;

	/**
	 * The '<em><b>DATETIME IS IN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATETIME_IS_IN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DATETIME_IS_IN_VALUE = 0;

	/**
	 * The '<em><b>DATETIME BAG</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATETIME_BAG
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DATETIME_BAG_VALUE = 0;

	/**
	 * The '<em><b>ANYURI ONE AND ONLY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANYURI_ONE_AND_ONLY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ANYURI_ONE_AND_ONLY_VALUE = 0;

	/**
	 * The '<em><b>ANYURI BAG SIZE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANYURI_BAG_SIZE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ANYURI_BAG_SIZE_VALUE = 0;

	/**
	 * The '<em><b>ANYURI IS IN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANYURI_IS_IN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ANYURI_IS_IN_VALUE = 0;

	/**
	 * The '<em><b>ANYURI BAG</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANYURI_BAG
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ANYURI_BAG_VALUE = 0;

	/**
	 * The '<em><b>HEXBINARY ONE AND ONLY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEXBINARY_ONE_AND_ONLY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HEXBINARY_ONE_AND_ONLY_VALUE = 0;

	/**
	 * The '<em><b>HEXBINARY BAG SIZE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEXBINARY_BAG_SIZE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HEXBINARY_BAG_SIZE_VALUE = 0;

	/**
	 * The '<em><b>HEXBINARY IS IN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEXBINARY_IS_IN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HEXBINARY_IS_IN_VALUE = 0;

	/**
	 * The '<em><b>HEXBINARY BAG</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEXBINARY_BAG
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HEXBINARY_BAG_VALUE = 0;

	/**
	 * The '<em><b>BASE64BINARY ONE AND ONLY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BASE64BINARY_ONE_AND_ONLY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BASE64BINARY_ONE_AND_ONLY_VALUE = 0;

	/**
	 * The '<em><b>BASE64BINARY BAG SIZE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BASE64BINARY_BAG_SIZE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BASE64BINARY_BAG_SIZE_VALUE = 0;

	/**
	 * The '<em><b>BASE64BINARY IS IN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BASE64BINARY_IS_IN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BASE64BINARY_IS_IN_VALUE = 0;

	/**
	 * The '<em><b>BASE64BINARY BAG</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BASE64BINARY_BAG
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BASE64BINARY_BAG_VALUE = 0;

	/**
	 * The '<em><b>DAYTIMEDURATION ONE AND ONLY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DAYTIMEDURATION_ONE_AND_ONLY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DAYTIMEDURATION_ONE_AND_ONLY_VALUE = 0;

	/**
	 * The '<em><b>DAYTIMEDURATION BAG SIZE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DAYTIMEDURATION_BAG_SIZE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DAYTIMEDURATION_BAG_SIZE_VALUE = 0;

	/**
	 * The '<em><b>DAYTIMEDURATION IS IN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DAYTIMEDURATION_IS_IN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DAYTIMEDURATION_IS_IN_VALUE = 0;

	/**
	 * The '<em><b>DAYTIMEDURATION BAG</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DAYTIMEDURATION_BAG
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DAYTIMEDURATION_BAG_VALUE = 0;

	/**
	 * The '<em><b>YEARMONTHDURATION ONE AND ONLY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #YEARMONTHDURATION_ONE_AND_ONLY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int YEARMONTHDURATION_ONE_AND_ONLY_VALUE = 0;

	/**
	 * The '<em><b>YEARMONTHDURATION BAG SIZE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #YEARMONTHDURATION_BAG_SIZE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int YEARMONTHDURATION_BAG_SIZE_VALUE = 0;

	/**
	 * The '<em><b>YEARMONTHDURATION IS IN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #YEARMONTHDURATION_IS_IN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int YEARMONTHDURATION_IS_IN_VALUE = 0;

	/**
	 * The '<em><b>YEARMONTHDURATION BAG</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #YEARMONTHDURATION_BAG
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int YEARMONTHDURATION_BAG_VALUE = 0;

	/**
	 * The '<em><b>X500NAME ONE AND ONLY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #X500NAME_ONE_AND_ONLY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int X500NAME_ONE_AND_ONLY_VALUE = 0;

	/**
	 * The '<em><b>X500NAME BAG SIZE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #X500NAME_BAG_SIZE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int X500NAME_BAG_SIZE_VALUE = 0;

	/**
	 * The '<em><b>X500NAME IS IN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #X500NAME_IS_IN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int X500NAME_IS_IN_VALUE = 0;

	/**
	 * The '<em><b>X500NAME BAG</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #X500NAME_BAG
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int X500NAME_BAG_VALUE = 0;

	/**
	 * The '<em><b>RFC822NAME ONE AND ONLY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RFC822NAME_ONE_AND_ONLY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RFC822NAME_ONE_AND_ONLY_VALUE = 0;

	/**
	 * The '<em><b>RFC822NAME BAG SIZE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RFC822NAME_BAG_SIZE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RFC822NAME_BAG_SIZE_VALUE = 0;

	/**
	 * The '<em><b>RFC822NAME IS IN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RFC822NAME_IS_IN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RFC822NAME_IS_IN_VALUE = 0;

	/**
	 * The '<em><b>RFC822NAME BAG</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RFC822NAME_BAG
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RFC822NAME_BAG_VALUE = 0;

	/**
	 * The '<em><b>IPADDRESS ONE AND ONLY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IPADDRESS_ONE_AND_ONLY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IPADDRESS_ONE_AND_ONLY_VALUE = 0;

	/**
	 * The '<em><b>IPADDRESS BAG SIZE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IPADDRESS_BAG_SIZE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IPADDRESS_BAG_SIZE_VALUE = 0;

	/**
	 * The '<em><b>IPADDRESS IS IN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IPADDRESS_IS_IN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IPADDRESS_IS_IN_VALUE = 0;

	/**
	 * The '<em><b>IPADDRESS BAG</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IPADDRESS_BAG
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IPADDRESS_BAG_VALUE = 0;

	/**
	 * The '<em><b>DNSNAME ONE AND ONLY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DNSNAME_ONE_AND_ONLY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DNSNAME_ONE_AND_ONLY_VALUE = 0;

	/**
	 * The '<em><b>DNSNAME BAG SIZE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DNSNAME_BAG_SIZE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DNSNAME_BAG_SIZE_VALUE = 0;

	/**
	 * The '<em><b>DNSNAME IS IN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DNSNAME_IS_IN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DNSNAME_IS_IN_VALUE = 0;

	/**
	 * The '<em><b>DNSNAME BAG</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DNSNAME_BAG
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DNSNAME_BAG_VALUE = 0;

	/**
	 * The '<em><b>STRING CONCATENATE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRING_CONCATENATE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int STRING_CONCATENATE_VALUE = 0;

	/**
	 * The '<em><b>BOOLEAN FROM STRING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOOLEAN_FROM_STRING
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BOOLEAN_FROM_STRING_VALUE = 0;

	/**
	 * The '<em><b>STRING FROM BOOLEAN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRING_FROM_BOOLEAN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int STRING_FROM_BOOLEAN_VALUE = 0;

	/**
	 * The '<em><b>INTEGER FROM STRING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTEGER_FROM_STRING
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INTEGER_FROM_STRING_VALUE = 0;

	/**
	 * The '<em><b>STRING FROM INTEGER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRING_FROM_INTEGER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int STRING_FROM_INTEGER_VALUE = 0;

	/**
	 * The '<em><b>DOUBLE FROM STRING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOUBLE_FROM_STRING
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DOUBLE_FROM_STRING_VALUE = 0;

	/**
	 * The '<em><b>STRING FROM DOUBLE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRING_FROM_DOUBLE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int STRING_FROM_DOUBLE_VALUE = 0;

	/**
	 * The '<em><b>TIME FROM STRING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIME_FROM_STRING
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TIME_FROM_STRING_VALUE = 0;

	/**
	 * The '<em><b>STRING FROM TIME</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRING_FROM_TIME
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int STRING_FROM_TIME_VALUE = 0;

	/**
	 * The '<em><b>DATE FROM STRING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATE_FROM_STRING
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DATE_FROM_STRING_VALUE = 0;

	/**
	 * The '<em><b>STRING FROM DATE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRING_FROM_DATE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int STRING_FROM_DATE_VALUE = 0;

	/**
	 * The '<em><b>DATETIME FROM STRING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATETIME_FROM_STRING
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DATETIME_FROM_STRING_VALUE = 0;

	/**
	 * The '<em><b>STRING FROM DATETIME</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRING_FROM_DATETIME
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int STRING_FROM_DATETIME_VALUE = 0;

	/**
	 * The '<em><b>ANYURI FROM STRING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANYURI_FROM_STRING
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ANYURI_FROM_STRING_VALUE = 0;

	/**
	 * The '<em><b>STRING FROM ANYURI</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRING_FROM_ANYURI
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int STRING_FROM_ANYURI_VALUE = 0;

	/**
	 * The '<em><b>DAYTIMEDURATION FROM STRING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DAYTIMEDURATION_FROM_STRING
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DAYTIMEDURATION_FROM_STRING_VALUE = 0;

	/**
	 * The '<em><b>STRING FROM DAYTIMEDURATION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRING_FROM_DAYTIMEDURATION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int STRING_FROM_DAYTIMEDURATION_VALUE = 0;

	/**
	 * The '<em><b>YEARMONTHDURATION FROM STRING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #YEARMONTHDURATION_FROM_STRING
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int YEARMONTHDURATION_FROM_STRING_VALUE = 0;

	/**
	 * The '<em><b>STRING FROM YEARMONTHDURATION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRING_FROM_YEARMONTHDURATION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int STRING_FROM_YEARMONTHDURATION_VALUE = 0;

	/**
	 * The '<em><b>X500NAME FROM STRING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #X500NAME_FROM_STRING
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int X500NAME_FROM_STRING_VALUE = 0;

	/**
	 * The '<em><b>STRING FROM X500NAME</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRING_FROM_X500NAME
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int STRING_FROM_X500NAME_VALUE = 0;

	/**
	 * The '<em><b>RFC822NAME FROM STRING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RFC822NAME_FROM_STRING
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RFC822NAME_FROM_STRING_VALUE = 0;

	/**
	 * The '<em><b>STRING FROM RFC822NAME</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRING_FROM_RFC822NAME
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int STRING_FROM_RFC822NAME_VALUE = 0;

	/**
	 * The '<em><b>IPADDRESS FROM STRING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IPADDRESS_FROM_STRING
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IPADDRESS_FROM_STRING_VALUE = 0;

	/**
	 * The '<em><b>STRING FROM IPADDRESS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRING_FROM_IPADDRESS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int STRING_FROM_IPADDRESS_VALUE = 0;

	/**
	 * The '<em><b>DNSNAME FROM STRING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DNSNAME_FROM_STRING
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DNSNAME_FROM_STRING_VALUE = 0;

	/**
	 * The '<em><b>STRING FROM DNSNAME</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRING_FROM_DNSNAME
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int STRING_FROM_DNSNAME_VALUE = 0;

	/**
	 * The '<em><b>STRING STARTS WITH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRING_STARTS_WITH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int STRING_STARTS_WITH_VALUE = 0;

	/**
	 * The '<em><b>ANYURI STARTS WITH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANYURI_STARTS_WITH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ANYURI_STARTS_WITH_VALUE = 0;

	/**
	 * The '<em><b>STRING ENDS WITH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRING_ENDS_WITH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int STRING_ENDS_WITH_VALUE = 0;

	/**
	 * The '<em><b>ANYURI ENDS WITH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANYURI_ENDS_WITH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ANYURI_ENDS_WITH_VALUE = 0;

	/**
	 * The '<em><b>STRING CONTAINS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRING_CONTAINS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int STRING_CONTAINS_VALUE = 0;

	/**
	 * The '<em><b>ANYURI CONTAINS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANYURI_CONTAINS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ANYURI_CONTAINS_VALUE = 0;

	/**
	 * The '<em><b>STRING SUBSTRING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRING_SUBSTRING
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int STRING_SUBSTRING_VALUE = 0;

	/**
	 * The '<em><b>ANYURI SUBSTRING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANYURI_SUBSTRING
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ANYURI_SUBSTRING_VALUE = 0;

	/**
	 * The '<em><b>ANY OF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANY_OF
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ANY_OF_VALUE = 0;

	/**
	 * The '<em><b>ALL OF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALL_OF
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ALL_OF_VALUE = 0;

	/**
	 * The '<em><b>ANY OF ANY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANY_OF_ANY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ANY_OF_ANY_VALUE = 0;

	/**
	 * The '<em><b>ALL OF ANY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALL_OF_ANY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ALL_OF_ANY_VALUE = 0;

	/**
	 * The '<em><b>ANY OF ALL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANY_OF_ALL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ANY_OF_ALL_VALUE = 0;

	/**
	 * The '<em><b>ALL OF ALL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALL_OF_ALL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ALL_OF_ALL_VALUE = 0;

	/**
	 * The '<em><b>MAP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MAP_VALUE = 0;

	/**
	 * The '<em><b>X500NAME MATCH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #X500NAME_MATCH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int X500NAME_MATCH_VALUE = 0;

	/**
	 * The '<em><b>RFC822NAME MATCH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RFC822NAME_MATCH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RFC822NAME_MATCH_VALUE = 0;

	/**
	 * The '<em><b>STRING REGEXP MATCH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRING_REGEXP_MATCH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int STRING_REGEXP_MATCH_VALUE = 0;

	/**
	 * The '<em><b>ANYURI REGEXP MATCH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANYURI_REGEXP_MATCH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ANYURI_REGEXP_MATCH_VALUE = 0;

	/**
	 * The '<em><b>IPADDRESS REGEXP MATCH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IPADDRESS_REGEXP_MATCH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IPADDRESS_REGEXP_MATCH_VALUE = 0;

	/**
	 * The '<em><b>DNSNAME REGEXP MATCH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DNSNAME_REGEXP_MATCH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DNSNAME_REGEXP_MATCH_VALUE = 0;

	/**
	 * The '<em><b>RFC822NAME REGEXP MATCH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RFC822NAME_REGEXP_MATCH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RFC822NAME_REGEXP_MATCH_VALUE = 0;

	/**
	 * The '<em><b>X500NAME REGEXP MATCH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #X500NAME_REGEXP_MATCH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int X500NAME_REGEXP_MATCH_VALUE = 0;

	/**
	 * The '<em><b>XPATH NODE COUNT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XPATH_NODE_COUNT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int XPATH_NODE_COUNT_VALUE = 0;

	/**
	 * The '<em><b>XPATH NODE EQUAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XPATH_NODE_EQUAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int XPATH_NODE_EQUAL_VALUE = 0;

	/**
	 * The '<em><b>XPATH NODE MATCH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XPATH_NODE_MATCH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int XPATH_NODE_MATCH_VALUE = 0;

	/**
	 * The '<em><b>STRING INTERSECTION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRING_INTERSECTION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int STRING_INTERSECTION_VALUE = 0;

	/**
	 * The '<em><b>STRING AT LEAST ONE MEMBER OF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRING_AT_LEAST_ONE_MEMBER_OF
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int STRING_AT_LEAST_ONE_MEMBER_OF_VALUE = 0;

	/**
	 * The '<em><b>STRING UNION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRING_UNION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int STRING_UNION_VALUE = 0;

	/**
	 * The '<em><b>STRING SUBSET</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRING_SUBSET
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int STRING_SUBSET_VALUE = 0;

	/**
	 * The '<em><b>STRING SET EQUALS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRING_SET_EQUALS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int STRING_SET_EQUALS_VALUE = 0;

	/**
	 * The '<em><b>BOOLEAN INTERSECTION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOOLEAN_INTERSECTION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BOOLEAN_INTERSECTION_VALUE = 0;

	/**
	 * The '<em><b>BOOLEAN AT LEAST ONE MEMBER OF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOOLEAN_AT_LEAST_ONE_MEMBER_OF
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BOOLEAN_AT_LEAST_ONE_MEMBER_OF_VALUE = 0;

	/**
	 * The '<em><b>BOOLEAN UNION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOOLEAN_UNION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BOOLEAN_UNION_VALUE = 0;

	/**
	 * The '<em><b>BOOLEAN SUBSET</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOOLEAN_SUBSET
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BOOLEAN_SUBSET_VALUE = 0;

	/**
	 * The '<em><b>BOOLEAN SET EQUALS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOOLEAN_SET_EQUALS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BOOLEAN_SET_EQUALS_VALUE = 0;

	/**
	 * The '<em><b>INTEGER INTERSECTION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTEGER_INTERSECTION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INTEGER_INTERSECTION_VALUE = 0;

	/**
	 * The '<em><b>INTEGER AT LEAST ONE MEMBER OF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTEGER_AT_LEAST_ONE_MEMBER_OF
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INTEGER_AT_LEAST_ONE_MEMBER_OF_VALUE = 0;

	/**
	 * The '<em><b>INTEGER UNION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTEGER_UNION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INTEGER_UNION_VALUE = 0;

	/**
	 * The '<em><b>INTEGER SUBSET</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTEGER_SUBSET
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INTEGER_SUBSET_VALUE = 0;

	/**
	 * The '<em><b>INTEGER SET EQUALS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTEGER_SET_EQUALS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INTEGER_SET_EQUALS_VALUE = 0;

	/**
	 * The '<em><b>DOUBLE INTERSECTION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOUBLE_INTERSECTION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DOUBLE_INTERSECTION_VALUE = 0;

	/**
	 * The '<em><b>DOUBLE AT LEAST ONE MEMBER OF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOUBLE_AT_LEAST_ONE_MEMBER_OF
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DOUBLE_AT_LEAST_ONE_MEMBER_OF_VALUE = 0;

	/**
	 * The '<em><b>DOUBLE UNION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOUBLE_UNION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DOUBLE_UNION_VALUE = 0;

	/**
	 * The '<em><b>DOUBLE SUBSET</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOUBLE_SUBSET
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DOUBLE_SUBSET_VALUE = 0;

	/**
	 * The '<em><b>DOUBLE SET EQUALS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOUBLE_SET_EQUALS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DOUBLE_SET_EQUALS_VALUE = 0;

	/**
	 * The '<em><b>TIME INTERSECTION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIME_INTERSECTION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TIME_INTERSECTION_VALUE = 0;

	/**
	 * The '<em><b>TIME AT LEAST ONE MEMBER OF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIME_AT_LEAST_ONE_MEMBER_OF
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TIME_AT_LEAST_ONE_MEMBER_OF_VALUE = 0;

	/**
	 * The '<em><b>TIME UNION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIME_UNION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TIME_UNION_VALUE = 0;

	/**
	 * The '<em><b>TIME SUBSET</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIME_SUBSET
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TIME_SUBSET_VALUE = 0;

	/**
	 * The '<em><b>TIME SET EQUALS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIME_SET_EQUALS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TIME_SET_EQUALS_VALUE = 0;

	/**
	 * The '<em><b>DATE INTERSECTION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATE_INTERSECTION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DATE_INTERSECTION_VALUE = 0;

	/**
	 * The '<em><b>DATE AT LEAST ONE MEMBER OF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATE_AT_LEAST_ONE_MEMBER_OF
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DATE_AT_LEAST_ONE_MEMBER_OF_VALUE = 0;

	/**
	 * The '<em><b>DATE UNION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATE_UNION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DATE_UNION_VALUE = 0;

	/**
	 * The '<em><b>DATE SUBSET</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATE_SUBSET
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DATE_SUBSET_VALUE = 0;

	/**
	 * The '<em><b>DATE SET EQUALS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATE_SET_EQUALS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DATE_SET_EQUALS_VALUE = 0;

	/**
	 * The '<em><b>DATETIME INTERSECTION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATETIME_INTERSECTION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DATETIME_INTERSECTION_VALUE = 0;

	/**
	 * The '<em><b>DATETIME AT LEAST ONE MEMBER OF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATETIME_AT_LEAST_ONE_MEMBER_OF
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DATETIME_AT_LEAST_ONE_MEMBER_OF_VALUE = 0;

	/**
	 * The '<em><b>DATETIME UNION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATETIME_UNION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DATETIME_UNION_VALUE = 0;

	/**
	 * The '<em><b>DATETIME SUBSET</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATETIME_SUBSET
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DATETIME_SUBSET_VALUE = 0;

	/**
	 * The '<em><b>DATETIME SET EQUALS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATETIME_SET_EQUALS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DATETIME_SET_EQUALS_VALUE = 0;

	/**
	 * The '<em><b>ANYURI INTERSECTION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANYURI_INTERSECTION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ANYURI_INTERSECTION_VALUE = 0;

	/**
	 * The '<em><b>ANYURI AT LEAST ONE MEMBER OF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANYURI_AT_LEAST_ONE_MEMBER_OF
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ANYURI_AT_LEAST_ONE_MEMBER_OF_VALUE = 0;

	/**
	 * The '<em><b>ANYURI UNION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANYURI_UNION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ANYURI_UNION_VALUE = 0;

	/**
	 * The '<em><b>ANYURI SUBSET</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANYURI_SUBSET
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ANYURI_SUBSET_VALUE = 0;

	/**
	 * The '<em><b>ANYURI SET EQUALS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANYURI_SET_EQUALS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ANYURI_SET_EQUALS_VALUE = 0;

	/**
	 * The '<em><b>HEXBINARY INTERSECTION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEXBINARY_INTERSECTION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HEXBINARY_INTERSECTION_VALUE = 0;

	/**
	 * The '<em><b>HEXBINARY AT LEAST ONE MEMBER OF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEXBINARY_AT_LEAST_ONE_MEMBER_OF
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HEXBINARY_AT_LEAST_ONE_MEMBER_OF_VALUE = 0;

	/**
	 * The '<em><b>HEXBINARY UNION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEXBINARY_UNION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HEXBINARY_UNION_VALUE = 0;

	/**
	 * The '<em><b>HEXBINARY SUBSET</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEXBINARY_SUBSET
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HEXBINARY_SUBSET_VALUE = 0;

	/**
	 * The '<em><b>HEXBINARY SET EQUALS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEXBINARY_SET_EQUALS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HEXBINARY_SET_EQUALS_VALUE = 0;

	/**
	 * The '<em><b>BASE64BINARY INTERSECTION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BASE64BINARY_INTERSECTION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BASE64BINARY_INTERSECTION_VALUE = 0;

	/**
	 * The '<em><b>BASE64BINARY AT LEAST ONE MEMBER OF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BASE64BINARY_AT_LEAST_ONE_MEMBER_OF
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BASE64BINARY_AT_LEAST_ONE_MEMBER_OF_VALUE = 0;

	/**
	 * The '<em><b>BASE64BINARY UNION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BASE64BINARY_UNION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BASE64BINARY_UNION_VALUE = 0;

	/**
	 * The '<em><b>BASE64BINARY SUBSET</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BASE64BINARY_SUBSET
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BASE64BINARY_SUBSET_VALUE = 0;

	/**
	 * The '<em><b>BASE64BINARY SET EQUALS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BASE64BINARY_SET_EQUALS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BASE64BINARY_SET_EQUALS_VALUE = 0;

	/**
	 * The '<em><b>DAYTIMEDURATION INTERSECTION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DAYTIMEDURATION_INTERSECTION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DAYTIMEDURATION_INTERSECTION_VALUE = 0;

	/**
	 * The '<em><b>DAYTIMEDURATION AT LEAST ONE MEMBER OF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DAYTIMEDURATION_AT_LEAST_ONE_MEMBER_OF
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DAYTIMEDURATION_AT_LEAST_ONE_MEMBER_OF_VALUE = 0;

	/**
	 * The '<em><b>DAYTIMEDURATION UNION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DAYTIMEDURATION_UNION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DAYTIMEDURATION_UNION_VALUE = 0;

	/**
	 * The '<em><b>DAYTIMEDURATION SUBSET</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DAYTIMEDURATION_SUBSET
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DAYTIMEDURATION_SUBSET_VALUE = 0;

	/**
	 * The '<em><b>DAYTIMEDURATION SET EQUALS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DAYTIMEDURATION_SET_EQUALS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DAYTIMEDURATION_SET_EQUALS_VALUE = 0;

	/**
	 * The '<em><b>YEARMONTHDURATION INTERSECTION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #YEARMONTHDURATION_INTERSECTION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int YEARMONTHDURATION_INTERSECTION_VALUE = 0;

	/**
	 * The '<em><b>YEARMONTHDURATION AT LEAST ONE MEMBER OF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #YEARMONTHDURATION_AT_LEAST_ONE_MEMBER_OF
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int YEARMONTHDURATION_AT_LEAST_ONE_MEMBER_OF_VALUE = 0;

	/**
	 * The '<em><b>YEARMONTHDURATION UNION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #YEARMONTHDURATION_UNION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int YEARMONTHDURATION_UNION_VALUE = 0;

	/**
	 * The '<em><b>YEARMONTHDURATION SUBSET</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #YEARMONTHDURATION_SUBSET
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int YEARMONTHDURATION_SUBSET_VALUE = 0;

	/**
	 * The '<em><b>YEARMONTHDURATION SET EQUALS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #YEARMONTHDURATION_SET_EQUALS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int YEARMONTHDURATION_SET_EQUALS_VALUE = 0;

	/**
	 * The '<em><b>X500NAME INTERSECTION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #X500NAME_INTERSECTION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int X500NAME_INTERSECTION_VALUE = 0;

	/**
	 * The '<em><b>X500NAME AT LEAST ONE MEMBER OF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #X500NAME_AT_LEAST_ONE_MEMBER_OF
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int X500NAME_AT_LEAST_ONE_MEMBER_OF_VALUE = 0;

	/**
	 * The '<em><b>X500NAME UNION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #X500NAME_UNION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int X500NAME_UNION_VALUE = 0;

	/**
	 * The '<em><b>X500NAME SUBSET</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #X500NAME_SUBSET
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int X500NAME_SUBSET_VALUE = 0;

	/**
	 * The '<em><b>X500NAME SET EQUALS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #X500NAME_SET_EQUALS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int X500NAME_SET_EQUALS_VALUE = 0;

	/**
	 * The '<em><b>RFC822NAME INTERSECTION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RFC822NAME_INTERSECTION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RFC822NAME_INTERSECTION_VALUE = 0;

	/**
	 * The '<em><b>RFC822NAME AT LEAST ONE MEMBER OF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RFC822NAME_AT_LEAST_ONE_MEMBER_OF
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RFC822NAME_AT_LEAST_ONE_MEMBER_OF_VALUE = 0;

	/**
	 * The '<em><b>RFC822NAME UNION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RFC822NAME_UNION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RFC822NAME_UNION_VALUE = 0;

	/**
	 * The '<em><b>RFC822NAME SUBSET</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RFC822NAME_SUBSET
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RFC822NAME_SUBSET_VALUE = 0;

	/**
	 * The '<em><b>RFC822NAME SET EQUALS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RFC822NAME_SET_EQUALS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RFC822NAME_SET_EQUALS_VALUE = 0;

	/**
	 * The '<em><b>IPADDRESS INTERSECTION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IPADDRESS_INTERSECTION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IPADDRESS_INTERSECTION_VALUE = 0;

	/**
	 * The '<em><b>IPADDRESS AT LEAST ONE MEMBER OF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IPADDRESS_AT_LEAST_ONE_MEMBER_OF
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IPADDRESS_AT_LEAST_ONE_MEMBER_OF_VALUE = 0;

	/**
	 * The '<em><b>IPADDRESS UNION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IPADDRESS_UNION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IPADDRESS_UNION_VALUE = 0;

	/**
	 * The '<em><b>IPADDRESS SUBSET</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IPADDRESS_SUBSET
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IPADDRESS_SUBSET_VALUE = 0;

	/**
	 * The '<em><b>IPADDRESS SET EQUALS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IPADDRESS_SET_EQUALS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IPADDRESS_SET_EQUALS_VALUE = 0;

	/**
	 * The '<em><b>DNSNAME INTERSECTION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DNSNAME_INTERSECTION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DNSNAME_INTERSECTION_VALUE = 0;

	/**
	 * The '<em><b>DNSNAME AT LEAST ONE MEMBER OF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DNSNAME_AT_LEAST_ONE_MEMBER_OF
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DNSNAME_AT_LEAST_ONE_MEMBER_OF_VALUE = 0;

	/**
	 * The '<em><b>DNSNAME UNION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DNSNAME_UNION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DNSNAME_UNION_VALUE = 0;

	/**
	 * The '<em><b>DNSNAME SUBSET</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DNSNAME_SUBSET
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DNSNAME_SUBSET_VALUE = 0;

	/**
	 * The '<em><b>DNSNAME SET EQUALS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DNSNAME_SET_EQUALS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DNSNAME_SET_EQUALS_VALUE = 0;

	/**
	 * An array of all the '<em><b>Operations</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Operations[] VALUES_ARRAY =
		new Operations[]
		{
			STRING_EQUAL,
			BOOLEAN_EQUAL,
			INTEGER_EQUAL,
			DOUBLE_EQUAL,
			DATE_EQUAL,
			TIME_EQUAL,
			DATETIME_EQUAL,
			DAYTIMEDURATION_EQUAL,
			YEARMONTHDURATION_EQUAL,
			STRING_EQUAL_IGNORE_CASE,
			ANYURI_EQUAL,
			X500NAME_EQUAL,
			RFC822NAME_EQUAL,
			HEXBINARY_EQUAL,
			BASE64BINARY_EQUAL,
			INTEGER_ADD,
			DOUBLE_ADD,
			INTEGER_SUBTRACT,
			DOUBLE_SUBTRACT,
			INTEGER_MULTIPLY,
			DOUBLE_MULTIPLY,
			INTEGER_DIVIDE,
			DOUBLE_DIVIDE,
			INTEGER_MOD,
			INTEGER_ABS,
			DOUBLE_ABS,
			ROUND,
			FLOOR,
			STRING_NORMALIZE_SPACE,
			STRING_NORMALIZE_TO_LOWER_CASE,
			DOUBLE_TO_INTEGER,
			INTEGER_TO_DOUBLE,
			OR,
			AND,
			NOF,
			NOT,
			PRESENT,
			INTEGER_GREATER_THAN,
			INTEGER_GREATER_THAN_OR_EQUAL,
			INTEGER_LESS_THAN,
			INTEGER_LESS_THAN_OR_EQUAL,
			DOUBLE_GREATER_THAN,
			DOUBLE_GREATER_THAN_OR_EQUAL,
			DOUBLE_LESS_THAN,
			DOUBLE_LESS_THAN_OR_EQUAL,
			DATETIME_ADD_DAYTIMEDURATION,
			DATETIME_ADD_YEARMONTHDURATION,
			DATETIME_SUBTRACT_DAYTIMEDURATION,
			DATETIME_SUBTRACT_YEARMONTHDURATION,
			DATE_ADD_YEARMONTHDURATION,
			DATE_SUBTRACT_YEARMONTHDURATION,
			STRING_GREATER_THAN,
			STRING_GREATER_THAN_OR_EQUAL,
			STRING_LESS_THAN,
			STRING_LESS_THAN_OR_EQUAL,
			TIME_GREATER_THAN,
			TIME_GREATER_THAN_OR_EQUAL,
			TIME_LESS_THAN,
			TIME_LESS_THAN_OR_EQUAL,
			TIME_IN_RANGE,
			DATETIME_GREATER_THAN,
			DATETIME_GREATER_THAN_OR_EQUAL,
			DATETIME_LESS_THAN,
			DATETIME_LESS_THAN_OR_EQUAL,
			DATE_GREATER_THAN,
			DATE_GREATER_THAN_OR_EQUAL,
			DATE_LESS_THAN,
			DATE_LESS_THAN_OR_EQUAL,
			STRING_ONE_AND_ONLY,
			STRING_BAG_SIZE,
			STRING_IS_IN,
			STRING_BAG,
			BOOLEAN_ONE_AND_ONLY,
			BOOLEAN_BAG_SIZE,
			BOOLEAN_IS_IN,
			BOOLEAN_BAG,
			INTEGER_ONE_AND_ONLY,
			INTEGER_BAG_SIZE,
			INTEGER_IS_IN,
			INTEGER_BAG,
			DOUBLE_ONE_AND_ONLY,
			DOUBLE_BAG_SIZE,
			DOUBLE_IS_IN,
			DOUBLE_BAG,
			TIME_ONE_AND_ONLY,
			TIME_BAG_SIZE,
			TIME_IS_IN,
			TIME_BAG,
			DATE_ONE_AND_ONLY,
			DATE_BAG_SIZE,
			DATE_IS_IN,
			DATE_BAG,
			DATETIME_ONE_AND_ONLY,
			DATETIME_BAG_SIZE,
			DATETIME_IS_IN,
			DATETIME_BAG,
			ANYURI_ONE_AND_ONLY,
			ANYURI_BAG_SIZE,
			ANYURI_IS_IN,
			ANYURI_BAG,
			HEXBINARY_ONE_AND_ONLY,
			HEXBINARY_BAG_SIZE,
			HEXBINARY_IS_IN,
			HEXBINARY_BAG,
			BASE64BINARY_ONE_AND_ONLY,
			BASE64BINARY_BAG_SIZE,
			BASE64BINARY_IS_IN,
			BASE64BINARY_BAG,
			DAYTIMEDURATION_ONE_AND_ONLY,
			DAYTIMEDURATION_BAG_SIZE,
			DAYTIMEDURATION_IS_IN,
			DAYTIMEDURATION_BAG,
			YEARMONTHDURATION_ONE_AND_ONLY,
			YEARMONTHDURATION_BAG_SIZE,
			YEARMONTHDURATION_IS_IN,
			YEARMONTHDURATION_BAG,
			X500NAME_ONE_AND_ONLY,
			X500NAME_BAG_SIZE,
			X500NAME_IS_IN,
			X500NAME_BAG,
			RFC822NAME_ONE_AND_ONLY,
			RFC822NAME_BAG_SIZE,
			RFC822NAME_IS_IN,
			RFC822NAME_BAG,
			IPADDRESS_ONE_AND_ONLY,
			IPADDRESS_BAG_SIZE,
			IPADDRESS_IS_IN,
			IPADDRESS_BAG,
			DNSNAME_ONE_AND_ONLY,
			DNSNAME_BAG_SIZE,
			DNSNAME_IS_IN,
			DNSNAME_BAG,
			STRING_CONCATENATE,
			BOOLEAN_FROM_STRING,
			STRING_FROM_BOOLEAN,
			INTEGER_FROM_STRING,
			STRING_FROM_INTEGER,
			DOUBLE_FROM_STRING,
			STRING_FROM_DOUBLE,
			TIME_FROM_STRING,
			STRING_FROM_TIME,
			DATE_FROM_STRING,
			STRING_FROM_DATE,
			DATETIME_FROM_STRING,
			STRING_FROM_DATETIME,
			ANYURI_FROM_STRING,
			STRING_FROM_ANYURI,
			DAYTIMEDURATION_FROM_STRING,
			STRING_FROM_DAYTIMEDURATION,
			YEARMONTHDURATION_FROM_STRING,
			STRING_FROM_YEARMONTHDURATION,
			X500NAME_FROM_STRING,
			STRING_FROM_X500NAME,
			RFC822NAME_FROM_STRING,
			STRING_FROM_RFC822NAME,
			IPADDRESS_FROM_STRING,
			STRING_FROM_IPADDRESS,
			DNSNAME_FROM_STRING,
			STRING_FROM_DNSNAME,
			STRING_STARTS_WITH,
			ANYURI_STARTS_WITH,
			STRING_ENDS_WITH,
			ANYURI_ENDS_WITH,
			STRING_CONTAINS,
			ANYURI_CONTAINS,
			STRING_SUBSTRING,
			ANYURI_SUBSTRING,
			ANY_OF,
			ALL_OF,
			ANY_OF_ANY,
			ALL_OF_ANY,
			ANY_OF_ALL,
			ALL_OF_ALL,
			MAP,
			X500NAME_MATCH,
			RFC822NAME_MATCH,
			STRING_REGEXP_MATCH,
			ANYURI_REGEXP_MATCH,
			IPADDRESS_REGEXP_MATCH,
			DNSNAME_REGEXP_MATCH,
			RFC822NAME_REGEXP_MATCH,
			X500NAME_REGEXP_MATCH,
			XPATH_NODE_COUNT,
			XPATH_NODE_EQUAL,
			XPATH_NODE_MATCH,
			STRING_INTERSECTION,
			STRING_AT_LEAST_ONE_MEMBER_OF,
			STRING_UNION,
			STRING_SUBSET,
			STRING_SET_EQUALS,
			BOOLEAN_INTERSECTION,
			BOOLEAN_AT_LEAST_ONE_MEMBER_OF,
			BOOLEAN_UNION,
			BOOLEAN_SUBSET,
			BOOLEAN_SET_EQUALS,
			INTEGER_INTERSECTION,
			INTEGER_AT_LEAST_ONE_MEMBER_OF,
			INTEGER_UNION,
			INTEGER_SUBSET,
			INTEGER_SET_EQUALS,
			DOUBLE_INTERSECTION,
			DOUBLE_AT_LEAST_ONE_MEMBER_OF,
			DOUBLE_UNION,
			DOUBLE_SUBSET,
			DOUBLE_SET_EQUALS,
			TIME_INTERSECTION,
			TIME_AT_LEAST_ONE_MEMBER_OF,
			TIME_UNION,
			TIME_SUBSET,
			TIME_SET_EQUALS,
			DATE_INTERSECTION,
			DATE_AT_LEAST_ONE_MEMBER_OF,
			DATE_UNION,
			DATE_SUBSET,
			DATE_SET_EQUALS,
			DATETIME_INTERSECTION,
			DATETIME_AT_LEAST_ONE_MEMBER_OF,
			DATETIME_UNION,
			DATETIME_SUBSET,
			DATETIME_SET_EQUALS,
			ANYURI_INTERSECTION,
			ANYURI_AT_LEAST_ONE_MEMBER_OF,
			ANYURI_UNION,
			ANYURI_SUBSET,
			ANYURI_SET_EQUALS,
			HEXBINARY_INTERSECTION,
			HEXBINARY_AT_LEAST_ONE_MEMBER_OF,
			HEXBINARY_UNION,
			HEXBINARY_SUBSET,
			HEXBINARY_SET_EQUALS,
			BASE64BINARY_INTERSECTION,
			BASE64BINARY_AT_LEAST_ONE_MEMBER_OF,
			BASE64BINARY_UNION,
			BASE64BINARY_SUBSET,
			BASE64BINARY_SET_EQUALS,
			DAYTIMEDURATION_INTERSECTION,
			DAYTIMEDURATION_AT_LEAST_ONE_MEMBER_OF,
			DAYTIMEDURATION_UNION,
			DAYTIMEDURATION_SUBSET,
			DAYTIMEDURATION_SET_EQUALS,
			YEARMONTHDURATION_INTERSECTION,
			YEARMONTHDURATION_AT_LEAST_ONE_MEMBER_OF,
			YEARMONTHDURATION_UNION,
			YEARMONTHDURATION_SUBSET,
			YEARMONTHDURATION_SET_EQUALS,
			X500NAME_INTERSECTION,
			X500NAME_AT_LEAST_ONE_MEMBER_OF,
			X500NAME_UNION,
			X500NAME_SUBSET,
			X500NAME_SET_EQUALS,
			RFC822NAME_INTERSECTION,
			RFC822NAME_AT_LEAST_ONE_MEMBER_OF,
			RFC822NAME_UNION,
			RFC822NAME_SUBSET,
			RFC822NAME_SET_EQUALS,
			IPADDRESS_INTERSECTION,
			IPADDRESS_AT_LEAST_ONE_MEMBER_OF,
			IPADDRESS_UNION,
			IPADDRESS_SUBSET,
			IPADDRESS_SET_EQUALS,
			DNSNAME_INTERSECTION,
			DNSNAME_AT_LEAST_ONE_MEMBER_OF,
			DNSNAME_UNION,
			DNSNAME_SUBSET,
			DNSNAME_SET_EQUALS,
		};

	/**
	 * A public read-only list of all the '<em><b>Operations</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Operations> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Operations</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Operations get(String literal)
	{
		for (int i = 0; i < VALUES_ARRAY.length; ++i)
		{
			Operations result = VALUES_ARRAY[i];
			if (result.toString().equals(literal))
			{
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Operations</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Operations getByName(String name)
	{
		for (int i = 0; i < VALUES_ARRAY.length; ++i)
		{
			Operations result = VALUES_ARRAY[i];
			if (result.getName().equals(name))
			{
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Operations</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Operations get(int value)
	{
		switch (value)
		{
			case STRING_EQUAL_VALUE: return STRING_EQUAL;
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
	private Operations(int value, String name, String literal)
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
	
} //Operations
