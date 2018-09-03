/**
 * Copyright (c) 2015-2017 Obeo, Inria
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 	
 * Contributors:
 * - William Piers <william.piers@obeo.fr>
 * - Philippe Merle <philippe.merle@inria.fr>
 * - Faiez Zalila <faiez.zalila@inria.fr>
 */
package ossweruntime;

import org.eclipse.cmf.occi.core.MixinBase;

import org.eclipse.cmf.occi.infrastructure.Os_tpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ubuntu bionicbeaver python</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ossweruntime.Ubuntu_bionicbeaver_python#getOpenstackRuntimeId <em>Openstack Runtime Id</em>}</li>
 * </ul>
 *
 * @see ossweruntime.OssweruntimePackage#getUbuntu_bionicbeaver_python()
 * @model
 * @generated
 */
public interface Ubuntu_bionicbeaver_python extends Os_tpl, MixinBase {
	/**
	 * Returns the value of the '<em><b>Openstack Runtime Id</b></em>' attribute.
	 * The default value is <code>"e02f6965-0c9e-45e0-9a54-e2730bd05749"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Openstack Runtime Id</em>' attribute.
	 * @see #setOpenstackRuntimeId(String)
	 * @see ossweruntime.OssweruntimePackage#getUbuntu_bionicbeaver_python_OpenstackRuntimeId()
	 * @model default="e02f6965-0c9e-45e0-9a54-e2730bd05749" dataType="org.eclipse.cmf.occi.core.String" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.modmacao.org/openstack/swe/ecore!Ubuntu_bionicbeaver_python!openstackRuntimeId'"
	 * @generated
	 */
	String getOpenstackRuntimeId();

	/**
	 * Sets the value of the '{@link ossweruntime.Ubuntu_bionicbeaver_python#getOpenstackRuntimeId <em>Openstack Runtime Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Openstack Runtime Id</em>' attribute.
	 * @see #getOpenstackRuntimeId()
	 * @generated
	 */
	void setOpenstackRuntimeId(String value);

} // Ubuntu_bionicbeaver_python
