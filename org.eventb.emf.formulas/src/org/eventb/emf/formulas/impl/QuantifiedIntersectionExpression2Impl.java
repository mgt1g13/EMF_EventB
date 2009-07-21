/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eventb.emf.formulas.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eventb.emf.formulas.BExpressionResolved;
import org.eventb.emf.formulas.BPredicateResolved;
import org.eventb.emf.formulas.FormulasPackage;
import org.eventb.emf.formulas.QuantifiedIntersectionExpression2;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Quantified Intersection Expression2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eventb.emf.formulas.impl.QuantifiedIntersectionExpression2Impl#getPredicate <em>Predicate</em>}</li>
 *   <li>{@link org.eventb.emf.formulas.impl.QuantifiedIntersectionExpression2Impl#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class QuantifiedIntersectionExpression2Impl extends BExpressionResolvedImpl implements QuantifiedIntersectionExpression2 {
	/**
	 * The cached value of the '{@link #getPredicate() <em>Predicate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPredicate()
	 * @generated
	 * @ordered
	 */
	protected BPredicateResolved predicate;

	/**
	 * The cached value of the '{@link #getExpression() <em>Expression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected BExpressionResolved expression;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuantifiedIntersectionExpression2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FormulasPackage.Literals.QUANTIFIED_INTERSECTION_EXPRESSION2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPredicateResolved getPredicate() {
		if (predicate != null && predicate.eIsProxy()) {
			InternalEObject oldPredicate = (InternalEObject)predicate;
			predicate = (BPredicateResolved)eResolveProxy(oldPredicate);
			if (predicate != oldPredicate) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FormulasPackage.QUANTIFIED_INTERSECTION_EXPRESSION2__PREDICATE, oldPredicate, predicate));
			}
		}
		return predicate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPredicateResolved basicGetPredicate() {
		return predicate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPredicate(BPredicateResolved newPredicate) {
		BPredicateResolved oldPredicate = predicate;
		predicate = newPredicate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormulasPackage.QUANTIFIED_INTERSECTION_EXPRESSION2__PREDICATE, oldPredicate, predicate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BExpressionResolved getExpression() {
		if (expression != null && expression.eIsProxy()) {
			InternalEObject oldExpression = (InternalEObject)expression;
			expression = (BExpressionResolved)eResolveProxy(oldExpression);
			if (expression != oldExpression) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FormulasPackage.QUANTIFIED_INTERSECTION_EXPRESSION2__EXPRESSION, oldExpression, expression));
			}
		}
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BExpressionResolved basicGetExpression() {
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpression(BExpressionResolved newExpression) {
		BExpressionResolved oldExpression = expression;
		expression = newExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormulasPackage.QUANTIFIED_INTERSECTION_EXPRESSION2__EXPRESSION, oldExpression, expression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FormulasPackage.QUANTIFIED_INTERSECTION_EXPRESSION2__PREDICATE:
				if (resolve) return getPredicate();
				return basicGetPredicate();
			case FormulasPackage.QUANTIFIED_INTERSECTION_EXPRESSION2__EXPRESSION:
				if (resolve) return getExpression();
				return basicGetExpression();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FormulasPackage.QUANTIFIED_INTERSECTION_EXPRESSION2__PREDICATE:
				setPredicate((BPredicateResolved)newValue);
				return;
			case FormulasPackage.QUANTIFIED_INTERSECTION_EXPRESSION2__EXPRESSION:
				setExpression((BExpressionResolved)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case FormulasPackage.QUANTIFIED_INTERSECTION_EXPRESSION2__PREDICATE:
				setPredicate((BPredicateResolved)null);
				return;
			case FormulasPackage.QUANTIFIED_INTERSECTION_EXPRESSION2__EXPRESSION:
				setExpression((BExpressionResolved)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case FormulasPackage.QUANTIFIED_INTERSECTION_EXPRESSION2__PREDICATE:
				return predicate != null;
			case FormulasPackage.QUANTIFIED_INTERSECTION_EXPRESSION2__EXPRESSION:
				return expression != null;
		}
		return super.eIsSet(featureID);
	}

} //QuantifiedIntersectionExpression2Impl
