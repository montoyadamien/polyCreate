/**
 */
package fr.univcotedazur.webots.polycreate.impl;

import fr.univcotedazur.webots.polycreate.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PolycreateFactoryImpl extends EFactoryImpl implements PolycreateFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PolycreateFactory init() {
		try {
			PolycreateFactory thePolycreateFactory = (PolycreateFactory) EPackage.Registry.INSTANCE
					.getEFactory(PolycreatePackage.eNS_URI);
			if (thePolycreateFactory != null) {
				return thePolycreateFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PolycreateFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolycreateFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case PolycreatePackage.MISSION:
			return createMission();
		case PolycreatePackage.SEQUENCE:
			return createSequence();
		case PolycreatePackage.LOGICAL_ACTION:
			return createLogicalAction();
		case PolycreatePackage.CONDITION:
			return createCondition();
		case PolycreatePackage.ALTERNATIVE_SEQUENCE:
			return createAlternativeSequence();
		case PolycreatePackage.MOVE_FORWARD:
			return createMoveForward();
		case PolycreatePackage.ROTATE_LEFT:
			return createRotateLeft();
		case PolycreatePackage.ROTATE_RIGHT:
			return createRotateRight();
		case PolycreatePackage.GRAB:
			return createGrab();
		case PolycreatePackage.RELEASE:
			return createRelease();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mission createMission() {
		MissionImpl mission = new MissionImpl();
		return mission;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sequence createSequence() {
		SequenceImpl sequence = new SequenceImpl();
		return sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalAction createLogicalAction() {
		LogicalActionImpl logicalAction = new LogicalActionImpl();
		return logicalAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition createCondition() {
		ConditionImpl condition = new ConditionImpl();
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlternativeSequence createAlternativeSequence() {
		AlternativeSequenceImpl alternativeSequence = new AlternativeSequenceImpl();
		return alternativeSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MoveForward createMoveForward() {
		MoveForwardImpl moveForward = new MoveForwardImpl();
		return moveForward;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RotateLeft createRotateLeft() {
		RotateLeftImpl rotateLeft = new RotateLeftImpl();
		return rotateLeft;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RotateRight createRotateRight() {
		RotateRightImpl rotateRight = new RotateRightImpl();
		return rotateRight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Grab createGrab() {
		GrabImpl grab = new GrabImpl();
		return grab;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Release createRelease() {
		ReleaseImpl release = new ReleaseImpl();
		return release;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolycreatePackage getPolycreatePackage() {
		return (PolycreatePackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PolycreatePackage getPackage() {
		return PolycreatePackage.eINSTANCE;
	}

} //PolycreateFactoryImpl
