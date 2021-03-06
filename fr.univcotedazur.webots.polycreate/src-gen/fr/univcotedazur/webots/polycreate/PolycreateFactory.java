/**
 */
package fr.univcotedazur.webots.polycreate;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fr.univcotedazur.webots.polycreate.PolycreatePackage
 * @generated
 */
public interface PolycreateFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PolycreateFactory eINSTANCE = fr.univcotedazur.webots.polycreate.impl.PolycreateFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Mission</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mission</em>'.
	 * @generated
	 */
	Mission createMission();

	/**
	 * Returns a new object of class '<em>Sequence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sequence</em>'.
	 * @generated
	 */
	Sequence createSequence();

	/**
	 * Returns a new object of class '<em>Sensor Checker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sensor Checker</em>'.
	 * @generated
	 */
	SensorChecker createSensorChecker();

	/**
	 * Returns a new object of class '<em>Rotate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rotate</em>'.
	 * @generated
	 */
	Rotate createRotate();

	/**
	 * Returns a new object of class '<em>Move Forward</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Move Forward</em>'.
	 * @generated
	 */
	MoveForward createMoveForward();

	/**
	 * Returns a new object of class '<em>Grab</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Grab</em>'.
	 * @generated
	 */
	Grab createGrab();

	/**
	 * Returns a new object of class '<em>Release</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Release</em>'.
	 * @generated
	 */
	Release createRelease();

	/**
	 * Returns a new object of class '<em>Object In Front</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object In Front</em>'.
	 * @generated
	 */
	ObjectInFront createObjectInFront();

	/**
	 * Returns a new object of class '<em>Wall Left</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Wall Left</em>'.
	 * @generated
	 */
	WallLeft createWallLeft();

	/**
	 * Returns a new object of class '<em>Wall Right</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Wall Right</em>'.
	 * @generated
	 */
	WallRight createWallRight();

	/**
	 * Returns a new object of class '<em>Wall Front</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Wall Front</em>'.
	 * @generated
	 */
	WallFront createWallFront();

	/**
	 * Returns a new object of class '<em>Move Backward</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Move Backward</em>'.
	 * @generated
	 */
	MoveBackward createMoveBackward();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PolycreatePackage getPolycreatePackage();

} //PolycreateFactory
