/**
 */
package fr.univcotedazur.webots.polycreate.util;

import fr.univcotedazur.webots.polycreate.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see fr.univcotedazur.webots.polycreate.PolycreatePackage
 * @generated
 */
public class PolycreateAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PolycreatePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolycreateAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = PolycreatePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PolycreateSwitch<Adapter> modelSwitch = new PolycreateSwitch<Adapter>() {
		@Override
		public Adapter caseMission(Mission object) {
			return createMissionAdapter();
		}

		@Override
		public Adapter caseSequence(Sequence object) {
			return createSequenceAdapter();
		}

		@Override
		public Adapter caseAction(Action object) {
			return createActionAdapter();
		}

		@Override
		public Adapter caseSensorChecker(SensorChecker object) {
			return createSensorCheckerAdapter();
		}

		@Override
		public Adapter caseCondition(Condition object) {
			return createConditionAdapter();
		}

		@Override
		public Adapter caseRotate(Rotate object) {
			return createRotateAdapter();
		}

		@Override
		public Adapter caseMoveForward(MoveForward object) {
			return createMoveForwardAdapter();
		}

		@Override
		public Adapter caseGrab(Grab object) {
			return createGrabAdapter();
		}

		@Override
		public Adapter caseRelease(Release object) {
			return createReleaseAdapter();
		}

		@Override
		public Adapter caseWall(Wall object) {
			return createWallAdapter();
		}

		@Override
		public Adapter caseObjectInFront(ObjectInFront object) {
			return createObjectInFrontAdapter();
		}

		@Override
		public Adapter caseWallLeft(WallLeft object) {
			return createWallLeftAdapter();
		}

		@Override
		public Adapter caseWallRight(WallRight object) {
			return createWallRightAdapter();
		}

		@Override
		public Adapter caseWallFront(WallFront object) {
			return createWallFrontAdapter();
		}

		@Override
		public Adapter caseMoveBackward(MoveBackward object) {
			return createMoveBackwardAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.univcotedazur.webots.polycreate.Mission <em>Mission</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.univcotedazur.webots.polycreate.Mission
	 * @generated
	 */
	public Adapter createMissionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.univcotedazur.webots.polycreate.Sequence <em>Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.univcotedazur.webots.polycreate.Sequence
	 * @generated
	 */
	public Adapter createSequenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.univcotedazur.webots.polycreate.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.univcotedazur.webots.polycreate.Action
	 * @generated
	 */
	public Adapter createActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.univcotedazur.webots.polycreate.SensorChecker <em>Sensor Checker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.univcotedazur.webots.polycreate.SensorChecker
	 * @generated
	 */
	public Adapter createSensorCheckerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.univcotedazur.webots.polycreate.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.univcotedazur.webots.polycreate.Condition
	 * @generated
	 */
	public Adapter createConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.univcotedazur.webots.polycreate.Rotate <em>Rotate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.univcotedazur.webots.polycreate.Rotate
	 * @generated
	 */
	public Adapter createRotateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.univcotedazur.webots.polycreate.MoveForward <em>Move Forward</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.univcotedazur.webots.polycreate.MoveForward
	 * @generated
	 */
	public Adapter createMoveForwardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.univcotedazur.webots.polycreate.Grab <em>Grab</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.univcotedazur.webots.polycreate.Grab
	 * @generated
	 */
	public Adapter createGrabAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.univcotedazur.webots.polycreate.Release <em>Release</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.univcotedazur.webots.polycreate.Release
	 * @generated
	 */
	public Adapter createReleaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.univcotedazur.webots.polycreate.Wall <em>Wall</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.univcotedazur.webots.polycreate.Wall
	 * @generated
	 */
	public Adapter createWallAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.univcotedazur.webots.polycreate.ObjectInFront <em>Object In Front</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.univcotedazur.webots.polycreate.ObjectInFront
	 * @generated
	 */
	public Adapter createObjectInFrontAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.univcotedazur.webots.polycreate.WallLeft <em>Wall Left</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.univcotedazur.webots.polycreate.WallLeft
	 * @generated
	 */
	public Adapter createWallLeftAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.univcotedazur.webots.polycreate.WallRight <em>Wall Right</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.univcotedazur.webots.polycreate.WallRight
	 * @generated
	 */
	public Adapter createWallRightAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.univcotedazur.webots.polycreate.WallFront <em>Wall Front</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.univcotedazur.webots.polycreate.WallFront
	 * @generated
	 */
	public Adapter createWallFrontAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.univcotedazur.webots.polycreate.MoveBackward <em>Move Backward</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.univcotedazur.webots.polycreate.MoveBackward
	 * @generated
	 */
	public Adapter createMoveBackwardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //PolycreateAdapterFactory
