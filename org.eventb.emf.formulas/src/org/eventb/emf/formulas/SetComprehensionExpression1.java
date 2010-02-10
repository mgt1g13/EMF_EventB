/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eventb.emf.formulas;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Set Comprehension Expression1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eventb.emf.formulas.SetComprehensionExpression1#getIdentifiers <em>Identifiers</em>}</li>
 *   <li>{@link org.eventb.emf.formulas.SetComprehensionExpression1#getPredicate <em>Predicate</em>}</li>
 *   <li>{@link org.eventb.emf.formulas.SetComprehensionExpression1#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eventb.emf.formulas.FormulasPackage#getSetComprehensionExpression1()
 * @model
 * @generated
 */
public interface SetComprehensionExpression1 extends BExpressionResolved {
	/**
	 * Returns the value of the '<em><b>Identifiers</b></em>' containment reference list.
	 * The list contents are of type {@link org.eventb.emf.formulas.IdentifierExpression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identifiers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifiers</em>' containment reference list.
	 * @see org.eventb.emf.formulas.FormulasPackage#getSetComprehensionExpression1_Identifiers()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<IdentifierExpression> getIdentifiers();

	/**
	 * Returns the value of the '<em><b>Predicate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Predicate</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predicate</em>' reference.
	 * @see #setPredicate(BPredicateResolved)
	 * @see org.eventb.emf.formulas.FormulasPackage#getSetComprehensionExpression1_Predicate()
	 * @model required="true"
	 * @generated
	 */
	BPredicateResolved getPredicate();

	/**
	 * Sets the value of the '{@link org.eventb.emf.formulas.SetComprehensionExpression1#getPredicate <em>Predicate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Predicate</em>' reference.
	 * @see #getPredicate()
	 * @generated
	 */
	void setPredicate(BPredicateResolved value);

	/**
	 * Returns the value of the '<em><b>Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' reference.
	 * @see #setExpression(BExpressionResolved)
	 * @see org.eventb.emf.formulas.FormulasPackage#getSetComprehensionExpression1_Expression()
	 * @model required="true"
	 * @generated
	 */
	BExpressionResolved getExpression();

	/**
	 * Sets the value of the '{@link org.eventb.emf.formulas.SetComprehensionExpression1#getExpression <em>Expression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(BExpressionResolved value);

} // SetComprehensionExpression1
