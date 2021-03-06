/**
 */
package fr.univcotedazur.webots.polycreate.impl;

import fr.univcotedazur.webots.polycreate.Condition;
import fr.univcotedazur.webots.polycreate.PolycreatePackage;
import fr.univcotedazur.webots.polycreate.Sequence;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.univcotedazur.webots.polycreate.impl.ConditionImpl#getAlternativeSequence <em>Alternative Sequence</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ConditionImpl extends MinimalEObjectImpl.Container implements Condition {
	/**
	 * The cached value of the '{@link #getAlternativeSequence() <em>Alternative Sequence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlternativeSequence()
	 * @generated
	 * @ordered
	 */
	protected Sequence alternativeSequence;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PolycreatePackage.Literals.CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sequence getAlternativeSequence() {
		return alternativeSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAlternativeSequence(Sequence newAlternativeSequence, NotificationChain msgs) {
		Sequence oldAlternativeSequence = alternativeSequence;
		alternativeSequence = newAlternativeSequence;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					PolycreatePackage.CONDITION__ALTERNATIVE_SEQUENCE, oldAlternativeSequence, newAlternativeSequence);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlternativeSequence(Sequence newAlternativeSequence) {
		if (newAlternativeSequence != alternativeSequence) {
			NotificationChain msgs = null;
			if (alternativeSequence != null)
				msgs = ((InternalEObject) alternativeSequence).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - PolycreatePackage.CONDITION__ALTERNATIVE_SEQUENCE, null, msgs);
			if (newAlternativeSequence != null)
				msgs = ((InternalEObject) newAlternativeSequence).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - PolycreatePackage.CONDITION__ALTERNATIVE_SEQUENCE, null, msgs);
			msgs = basicSetAlternativeSequence(newAlternativeSequence, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PolycreatePackage.CONDITION__ALTERNATIVE_SEQUENCE,
					newAlternativeSequence, newAlternativeSequence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case PolycreatePackage.CONDITION__ALTERNATIVE_SEQUENCE:
			return basicSetAlternativeSequence(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case PolycreatePackage.CONDITION__ALTERNATIVE_SEQUENCE:
			return getAlternativeSequence();
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
		case PolycreatePackage.CONDITION__ALTERNATIVE_SEQUENCE:
			setAlternativeSequence((Sequence) newValue);
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
		case PolycreatePackage.CONDITION__ALTERNATIVE_SEQUENCE:
			setAlternativeSequence((Sequence) null);
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
		case PolycreatePackage.CONDITION__ALTERNATIVE_SEQUENCE:
			return alternativeSequence != null;
		}
		return super.eIsSet(featureID);
	}

} //ConditionImpl
