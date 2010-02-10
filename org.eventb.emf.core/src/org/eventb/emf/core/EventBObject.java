/**
 * Copyright (c) 2006, 2009 
 * University of Southampton, Heinrich-Heine University Dusseldorf and others.
 * All rights reserved. This program and the accompanying materials  are made
 * available under the terms of the Eclipse Public License v1.0 which accompanies this 
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 * 
 *
 * $Id$
 */
package org.eventb.emf.core;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event BObject</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.eventb.emf.core.CorePackage#getEventBObject()
 * @model abstract="true"
 * @generated
 */
public interface EventBObject extends EObject, EModelElement {
	/**
	 * <!-- begin-user-doc -->
	 *
	 * returns the nearest container of this element that is a sub-type eClass
	 * or null if no container of that type
	 *
	 * @param 	the EClass that is the super-type of the returned elements
	 * @return 	containing EventBObject that is a sub-type of eClass
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * returns the nearest container of this element that is a sub-type eClass
	 * or null if no container of that type
	 * @param 	the EClass that is the super-type of the returned elements
	 * @return 	containing EventBObject that is a sub-type of eClass
	 * 
	 * <!-- end-model-doc -->
	 * @model required="true" eClassRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='EventBObject bObject = this;\nwhile (!eClass.isSuperTypeOf(bObject.eClass()))\n\tif (bObject.eContainer() instanceof EventBObject) bObject=(EventBObject)bObject.eContainer();\n\telse return null;\nreturn bObject;'"
	 * @generated
	 */
	EventBObject getContaining(EClass eClass);

	/**
	 * <!-- begin-user-doc -->
	 * returns a list of elements that sub-type eClass and
	 * that are contained (directly or indirectly) by this element
	 *
	 * @param eClass	the EClass that is the super-type of the returned elements
	 * @param resolve	whether to resolve proxies
	 * @return list of EObjects contained in this element that sub-type eClass
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * returns a list of elements that sub-type eClass and
	 * that are contained (directly or indirectly) by this element
	 * @param  eClass - 	the EClass that is the super-type of the returned elements
	 * @param resolve - 	whether to resolve proxies
	 * 
	 * <!-- end-model-doc -->
	 * @model many="false" eClassRequired="true" resolveRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='EList<EObject> typeObjects = new BasicEList<EObject>();\ntypeObjects.add(null);\t//include the null object\nfor (TreeIterator<EObject>trit = EcoreUtil.getAllContents(this, resolve); trit.hasNext();){\n\tEObject o = trit.next();\n\tif (eClass.isSuperTypeOf(o.eClass())) typeObjects.add(o);\n}\nreturn typeObjects;'"
	 * @generated
	 */
	EList<EObject> getAllContained(EClass eClass, boolean resolve);

	/**
	 * <!-- begin-user-doc -->
	 * returns the URI of this element.
	 * (If the element is not loaded, the URI is obtained from the proxy without loading the element)
	 *
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated NOT
	 */
	URI getURI();

} // EventBObject