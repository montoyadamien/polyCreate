/**
 */
package fr.univcotedazur.webots.polycreate;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see fr.univcotedazur.webots.polycreate.PolycreateFactory
 * @model kind="package"
 * @generated
 */
public interface PolycreatePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "polycreate";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/polycreate";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "polycreate";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PolycreatePackage eINSTANCE = fr.univcotedazur.webots.polycreate.impl.PolycreatePackageImpl.init();

	/**
	 * The meta object id for the '{@link fr.univcotedazur.webots.polycreate.impl.MissionImpl <em>Mission</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.univcotedazur.webots.polycreate.impl.MissionImpl
	 * @see fr.univcotedazur.webots.polycreate.impl.PolycreatePackageImpl#getMission()
	 * @generated
	 */
	int MISSION = 0;

	/**
	 * The feature id for the '<em><b>Sequences</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION__SEQUENCES = 0;

	/**
	 * The number of structural features of the '<em>Mission</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Mission</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.univcotedazur.webots.polycreate.impl.SequenceImpl <em>Sequence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.univcotedazur.webots.polycreate.impl.SequenceImpl
	 * @see fr.univcotedazur.webots.polycreate.impl.PolycreatePackageImpl#getSequence()
	 * @generated
	 */
	int SEQUENCE = 1;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__ACTIONS = 0;

	/**
	 * The number of structural features of the '<em>Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE___RUN = 0;

	/**
	 * The number of operations of the '<em>Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link fr.univcotedazur.webots.polycreate.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.univcotedazur.webots.polycreate.impl.ActionImpl
	 * @see fr.univcotedazur.webots.polycreate.impl.PolycreatePackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 2;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION___RUN = 0;

	/**
	 * The number of operations of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link fr.univcotedazur.webots.polycreate.impl.PhysicalActionImpl <em>Physical Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.univcotedazur.webots.polycreate.impl.PhysicalActionImpl
	 * @see fr.univcotedazur.webots.polycreate.impl.PolycreatePackageImpl#getPhysicalAction()
	 * @generated
	 */
	int PHYSICAL_ACTION = 3;

	/**
	 * The number of structural features of the '<em>Physical Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ACTION___RUN = ACTION___RUN;

	/**
	 * The number of operations of the '<em>Physical Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ACTION_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.univcotedazur.webots.polycreate.impl.LogicalActionImpl <em>Logical Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.univcotedazur.webots.polycreate.impl.LogicalActionImpl
	 * @see fr.univcotedazur.webots.polycreate.impl.PolycreatePackageImpl#getLogicalAction()
	 * @generated
	 */
	int LOGICAL_ACTION = 4;

	/**
	 * The feature id for the '<em><b>Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_ACTION__CONDITIONS = ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Logical Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_ACTION___RUN = ACTION___RUN;

	/**
	 * The number of operations of the '<em>Logical Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_ACTION_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.univcotedazur.webots.polycreate.impl.ConditionImpl <em>Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.univcotedazur.webots.polycreate.impl.ConditionImpl
	 * @see fr.univcotedazur.webots.polycreate.impl.PolycreatePackageImpl#getCondition()
	 * @generated
	 */
	int CONDITION = 5;

	/**
	 * The feature id for the '<em><b>Alternative Sequence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__ALTERNATIVE_SEQUENCE = 0;

	/**
	 * The number of structural features of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION___IS_VALID = 0;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION___RUN = 1;

	/**
	 * The number of operations of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link fr.univcotedazur.webots.polycreate.impl.AlternativeSequenceImpl <em>Alternative Sequence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.univcotedazur.webots.polycreate.impl.AlternativeSequenceImpl
	 * @see fr.univcotedazur.webots.polycreate.impl.PolycreatePackageImpl#getAlternativeSequence()
	 * @generated
	 */
	int ALTERNATIVE_SEQUENCE = 6;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE_SEQUENCE__ACTIONS = SEQUENCE__ACTIONS;

	/**
	 * The feature id for the '<em><b>Next Sequence</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE_SEQUENCE__NEXT_SEQUENCE = SEQUENCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Alternative Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE_SEQUENCE_FEATURE_COUNT = SEQUENCE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE_SEQUENCE___RUN = SEQUENCE___RUN;

	/**
	 * The number of operations of the '<em>Alternative Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE_SEQUENCE_OPERATION_COUNT = SEQUENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.univcotedazur.webots.polycreate.impl.RotateImpl <em>Rotate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.univcotedazur.webots.polycreate.impl.RotateImpl
	 * @see fr.univcotedazur.webots.polycreate.impl.PolycreatePackageImpl#getRotate()
	 * @generated
	 */
	int ROTATE = 7;

	/**
	 * The feature id for the '<em><b>Degrees</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATE__DEGREES = PHYSICAL_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Rotate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATE_FEATURE_COUNT = PHYSICAL_ACTION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATE___RUN = PHYSICAL_ACTION___RUN;

	/**
	 * The number of operations of the '<em>Rotate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATE_OPERATION_COUNT = PHYSICAL_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.univcotedazur.webots.polycreate.impl.MoveForwardImpl <em>Move Forward</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.univcotedazur.webots.polycreate.impl.MoveForwardImpl
	 * @see fr.univcotedazur.webots.polycreate.impl.PolycreatePackageImpl#getMoveForward()
	 * @generated
	 */
	int MOVE_FORWARD = 8;

	/**
	 * The feature id for the '<em><b>Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_FORWARD__DISTANCE = PHYSICAL_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Move Forward</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_FORWARD_FEATURE_COUNT = PHYSICAL_ACTION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_FORWARD___RUN = PHYSICAL_ACTION___RUN;

	/**
	 * The number of operations of the '<em>Move Forward</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_FORWARD_OPERATION_COUNT = PHYSICAL_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.univcotedazur.webots.polycreate.impl.RotateLeftImpl <em>Rotate Left</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.univcotedazur.webots.polycreate.impl.RotateLeftImpl
	 * @see fr.univcotedazur.webots.polycreate.impl.PolycreatePackageImpl#getRotateLeft()
	 * @generated
	 */
	int ROTATE_LEFT = 9;

	/**
	 * The feature id for the '<em><b>Degrees</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATE_LEFT__DEGREES = ROTATE__DEGREES;

	/**
	 * The number of structural features of the '<em>Rotate Left</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATE_LEFT_FEATURE_COUNT = ROTATE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATE_LEFT___RUN = ROTATE___RUN;

	/**
	 * The number of operations of the '<em>Rotate Left</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATE_LEFT_OPERATION_COUNT = ROTATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.univcotedazur.webots.polycreate.impl.RotateRightImpl <em>Rotate Right</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.univcotedazur.webots.polycreate.impl.RotateRightImpl
	 * @see fr.univcotedazur.webots.polycreate.impl.PolycreatePackageImpl#getRotateRight()
	 * @generated
	 */
	int ROTATE_RIGHT = 10;

	/**
	 * The feature id for the '<em><b>Degrees</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATE_RIGHT__DEGREES = ROTATE__DEGREES;

	/**
	 * The number of structural features of the '<em>Rotate Right</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATE_RIGHT_FEATURE_COUNT = ROTATE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATE_RIGHT___RUN = ROTATE___RUN;

	/**
	 * The number of operations of the '<em>Rotate Right</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATE_RIGHT_OPERATION_COUNT = ROTATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.univcotedazur.webots.polycreate.impl.GrabImpl <em>Grab</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.univcotedazur.webots.polycreate.impl.GrabImpl
	 * @see fr.univcotedazur.webots.polycreate.impl.PolycreatePackageImpl#getGrab()
	 * @generated
	 */
	int GRAB = 11;

	/**
	 * The number of structural features of the '<em>Grab</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAB_FEATURE_COUNT = PHYSICAL_ACTION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAB___RUN = PHYSICAL_ACTION___RUN;

	/**
	 * The number of operations of the '<em>Grab</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAB_OPERATION_COUNT = PHYSICAL_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.univcotedazur.webots.polycreate.impl.ReleaseImpl <em>Release</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.univcotedazur.webots.polycreate.impl.ReleaseImpl
	 * @see fr.univcotedazur.webots.polycreate.impl.PolycreatePackageImpl#getRelease()
	 * @generated
	 */
	int RELEASE = 12;

	/**
	 * The number of structural features of the '<em>Release</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_FEATURE_COUNT = PHYSICAL_ACTION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE___RUN = PHYSICAL_ACTION___RUN;

	/**
	 * The number of operations of the '<em>Release</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_OPERATION_COUNT = PHYSICAL_ACTION_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link fr.univcotedazur.webots.polycreate.Mission <em>Mission</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mission</em>'.
	 * @see fr.univcotedazur.webots.polycreate.Mission
	 * @generated
	 */
	EClass getMission();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.univcotedazur.webots.polycreate.Mission#getSequences <em>Sequences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sequences</em>'.
	 * @see fr.univcotedazur.webots.polycreate.Mission#getSequences()
	 * @see #getMission()
	 * @generated
	 */
	EReference getMission_Sequences();

	/**
	 * Returns the meta object for class '{@link fr.univcotedazur.webots.polycreate.Sequence <em>Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequence</em>'.
	 * @see fr.univcotedazur.webots.polycreate.Sequence
	 * @generated
	 */
	EClass getSequence();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.univcotedazur.webots.polycreate.Sequence#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actions</em>'.
	 * @see fr.univcotedazur.webots.polycreate.Sequence#getActions()
	 * @see #getSequence()
	 * @generated
	 */
	EReference getSequence_Actions();

	/**
	 * Returns the meta object for the '{@link fr.univcotedazur.webots.polycreate.Sequence#run() <em>Run</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Run</em>' operation.
	 * @see fr.univcotedazur.webots.polycreate.Sequence#run()
	 * @generated
	 */
	EOperation getSequence__Run();

	/**
	 * Returns the meta object for class '{@link fr.univcotedazur.webots.polycreate.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see fr.univcotedazur.webots.polycreate.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for the '{@link fr.univcotedazur.webots.polycreate.Action#run() <em>Run</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Run</em>' operation.
	 * @see fr.univcotedazur.webots.polycreate.Action#run()
	 * @generated
	 */
	EOperation getAction__Run();

	/**
	 * Returns the meta object for class '{@link fr.univcotedazur.webots.polycreate.PhysicalAction <em>Physical Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Physical Action</em>'.
	 * @see fr.univcotedazur.webots.polycreate.PhysicalAction
	 * @generated
	 */
	EClass getPhysicalAction();

	/**
	 * Returns the meta object for class '{@link fr.univcotedazur.webots.polycreate.LogicalAction <em>Logical Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logical Action</em>'.
	 * @see fr.univcotedazur.webots.polycreate.LogicalAction
	 * @generated
	 */
	EClass getLogicalAction();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.univcotedazur.webots.polycreate.LogicalAction#getConditions <em>Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Conditions</em>'.
	 * @see fr.univcotedazur.webots.polycreate.LogicalAction#getConditions()
	 * @see #getLogicalAction()
	 * @generated
	 */
	EReference getLogicalAction_Conditions();

	/**
	 * Returns the meta object for class '{@link fr.univcotedazur.webots.polycreate.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition</em>'.
	 * @see fr.univcotedazur.webots.polycreate.Condition
	 * @generated
	 */
	EClass getCondition();

	/**
	 * Returns the meta object for the containment reference '{@link fr.univcotedazur.webots.polycreate.Condition#getAlternativeSequence <em>Alternative Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Alternative Sequence</em>'.
	 * @see fr.univcotedazur.webots.polycreate.Condition#getAlternativeSequence()
	 * @see #getCondition()
	 * @generated
	 */
	EReference getCondition_AlternativeSequence();

	/**
	 * Returns the meta object for the '{@link fr.univcotedazur.webots.polycreate.Condition#isValid() <em>Is Valid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Valid</em>' operation.
	 * @see fr.univcotedazur.webots.polycreate.Condition#isValid()
	 * @generated
	 */
	EOperation getCondition__IsValid();

	/**
	 * Returns the meta object for the '{@link fr.univcotedazur.webots.polycreate.Condition#run() <em>Run</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Run</em>' operation.
	 * @see fr.univcotedazur.webots.polycreate.Condition#run()
	 * @generated
	 */
	EOperation getCondition__Run();

	/**
	 * Returns the meta object for class '{@link fr.univcotedazur.webots.polycreate.AlternativeSequence <em>Alternative Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alternative Sequence</em>'.
	 * @see fr.univcotedazur.webots.polycreate.AlternativeSequence
	 * @generated
	 */
	EClass getAlternativeSequence();

	/**
	 * Returns the meta object for the reference '{@link fr.univcotedazur.webots.polycreate.AlternativeSequence#getNextSequence <em>Next Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Next Sequence</em>'.
	 * @see fr.univcotedazur.webots.polycreate.AlternativeSequence#getNextSequence()
	 * @see #getAlternativeSequence()
	 * @generated
	 */
	EReference getAlternativeSequence_NextSequence();

	/**
	 * Returns the meta object for class '{@link fr.univcotedazur.webots.polycreate.Rotate <em>Rotate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rotate</em>'.
	 * @see fr.univcotedazur.webots.polycreate.Rotate
	 * @generated
	 */
	EClass getRotate();

	/**
	 * Returns the meta object for the attribute '{@link fr.univcotedazur.webots.polycreate.Rotate#getDegrees <em>Degrees</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Degrees</em>'.
	 * @see fr.univcotedazur.webots.polycreate.Rotate#getDegrees()
	 * @see #getRotate()
	 * @generated
	 */
	EAttribute getRotate_Degrees();

	/**
	 * Returns the meta object for class '{@link fr.univcotedazur.webots.polycreate.MoveForward <em>Move Forward</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Move Forward</em>'.
	 * @see fr.univcotedazur.webots.polycreate.MoveForward
	 * @generated
	 */
	EClass getMoveForward();

	/**
	 * Returns the meta object for the attribute '{@link fr.univcotedazur.webots.polycreate.MoveForward#getDistance <em>Distance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Distance</em>'.
	 * @see fr.univcotedazur.webots.polycreate.MoveForward#getDistance()
	 * @see #getMoveForward()
	 * @generated
	 */
	EAttribute getMoveForward_Distance();

	/**
	 * Returns the meta object for class '{@link fr.univcotedazur.webots.polycreate.RotateLeft <em>Rotate Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rotate Left</em>'.
	 * @see fr.univcotedazur.webots.polycreate.RotateLeft
	 * @generated
	 */
	EClass getRotateLeft();

	/**
	 * Returns the meta object for class '{@link fr.univcotedazur.webots.polycreate.RotateRight <em>Rotate Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rotate Right</em>'.
	 * @see fr.univcotedazur.webots.polycreate.RotateRight
	 * @generated
	 */
	EClass getRotateRight();

	/**
	 * Returns the meta object for class '{@link fr.univcotedazur.webots.polycreate.Grab <em>Grab</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Grab</em>'.
	 * @see fr.univcotedazur.webots.polycreate.Grab
	 * @generated
	 */
	EClass getGrab();

	/**
	 * Returns the meta object for class '{@link fr.univcotedazur.webots.polycreate.Release <em>Release</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Release</em>'.
	 * @see fr.univcotedazur.webots.polycreate.Release
	 * @generated
	 */
	EClass getRelease();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PolycreateFactory getPolycreateFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link fr.univcotedazur.webots.polycreate.impl.MissionImpl <em>Mission</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.univcotedazur.webots.polycreate.impl.MissionImpl
		 * @see fr.univcotedazur.webots.polycreate.impl.PolycreatePackageImpl#getMission()
		 * @generated
		 */
		EClass MISSION = eINSTANCE.getMission();

		/**
		 * The meta object literal for the '<em><b>Sequences</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MISSION__SEQUENCES = eINSTANCE.getMission_Sequences();

		/**
		 * The meta object literal for the '{@link fr.univcotedazur.webots.polycreate.impl.SequenceImpl <em>Sequence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.univcotedazur.webots.polycreate.impl.SequenceImpl
		 * @see fr.univcotedazur.webots.polycreate.impl.PolycreatePackageImpl#getSequence()
		 * @generated
		 */
		EClass SEQUENCE = eINSTANCE.getSequence();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE__ACTIONS = eINSTANCE.getSequence_Actions();

		/**
		 * The meta object literal for the '<em><b>Run</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SEQUENCE___RUN = eINSTANCE.getSequence__Run();

		/**
		 * The meta object literal for the '{@link fr.univcotedazur.webots.polycreate.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.univcotedazur.webots.polycreate.impl.ActionImpl
		 * @see fr.univcotedazur.webots.polycreate.impl.PolycreatePackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '<em><b>Run</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTION___RUN = eINSTANCE.getAction__Run();

		/**
		 * The meta object literal for the '{@link fr.univcotedazur.webots.polycreate.impl.PhysicalActionImpl <em>Physical Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.univcotedazur.webots.polycreate.impl.PhysicalActionImpl
		 * @see fr.univcotedazur.webots.polycreate.impl.PolycreatePackageImpl#getPhysicalAction()
		 * @generated
		 */
		EClass PHYSICAL_ACTION = eINSTANCE.getPhysicalAction();

		/**
		 * The meta object literal for the '{@link fr.univcotedazur.webots.polycreate.impl.LogicalActionImpl <em>Logical Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.univcotedazur.webots.polycreate.impl.LogicalActionImpl
		 * @see fr.univcotedazur.webots.polycreate.impl.PolycreatePackageImpl#getLogicalAction()
		 * @generated
		 */
		EClass LOGICAL_ACTION = eINSTANCE.getLogicalAction();

		/**
		 * The meta object literal for the '<em><b>Conditions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGICAL_ACTION__CONDITIONS = eINSTANCE.getLogicalAction_Conditions();

		/**
		 * The meta object literal for the '{@link fr.univcotedazur.webots.polycreate.impl.ConditionImpl <em>Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.univcotedazur.webots.polycreate.impl.ConditionImpl
		 * @see fr.univcotedazur.webots.polycreate.impl.PolycreatePackageImpl#getCondition()
		 * @generated
		 */
		EClass CONDITION = eINSTANCE.getCondition();

		/**
		 * The meta object literal for the '<em><b>Alternative Sequence</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION__ALTERNATIVE_SEQUENCE = eINSTANCE.getCondition_AlternativeSequence();

		/**
		 * The meta object literal for the '<em><b>Is Valid</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONDITION___IS_VALID = eINSTANCE.getCondition__IsValid();

		/**
		 * The meta object literal for the '<em><b>Run</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONDITION___RUN = eINSTANCE.getCondition__Run();

		/**
		 * The meta object literal for the '{@link fr.univcotedazur.webots.polycreate.impl.AlternativeSequenceImpl <em>Alternative Sequence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.univcotedazur.webots.polycreate.impl.AlternativeSequenceImpl
		 * @see fr.univcotedazur.webots.polycreate.impl.PolycreatePackageImpl#getAlternativeSequence()
		 * @generated
		 */
		EClass ALTERNATIVE_SEQUENCE = eINSTANCE.getAlternativeSequence();

		/**
		 * The meta object literal for the '<em><b>Next Sequence</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALTERNATIVE_SEQUENCE__NEXT_SEQUENCE = eINSTANCE.getAlternativeSequence_NextSequence();

		/**
		 * The meta object literal for the '{@link fr.univcotedazur.webots.polycreate.impl.RotateImpl <em>Rotate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.univcotedazur.webots.polycreate.impl.RotateImpl
		 * @see fr.univcotedazur.webots.polycreate.impl.PolycreatePackageImpl#getRotate()
		 * @generated
		 */
		EClass ROTATE = eINSTANCE.getRotate();

		/**
		 * The meta object literal for the '<em><b>Degrees</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROTATE__DEGREES = eINSTANCE.getRotate_Degrees();

		/**
		 * The meta object literal for the '{@link fr.univcotedazur.webots.polycreate.impl.MoveForwardImpl <em>Move Forward</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.univcotedazur.webots.polycreate.impl.MoveForwardImpl
		 * @see fr.univcotedazur.webots.polycreate.impl.PolycreatePackageImpl#getMoveForward()
		 * @generated
		 */
		EClass MOVE_FORWARD = eINSTANCE.getMoveForward();

		/**
		 * The meta object literal for the '<em><b>Distance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOVE_FORWARD__DISTANCE = eINSTANCE.getMoveForward_Distance();

		/**
		 * The meta object literal for the '{@link fr.univcotedazur.webots.polycreate.impl.RotateLeftImpl <em>Rotate Left</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.univcotedazur.webots.polycreate.impl.RotateLeftImpl
		 * @see fr.univcotedazur.webots.polycreate.impl.PolycreatePackageImpl#getRotateLeft()
		 * @generated
		 */
		EClass ROTATE_LEFT = eINSTANCE.getRotateLeft();

		/**
		 * The meta object literal for the '{@link fr.univcotedazur.webots.polycreate.impl.RotateRightImpl <em>Rotate Right</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.univcotedazur.webots.polycreate.impl.RotateRightImpl
		 * @see fr.univcotedazur.webots.polycreate.impl.PolycreatePackageImpl#getRotateRight()
		 * @generated
		 */
		EClass ROTATE_RIGHT = eINSTANCE.getRotateRight();

		/**
		 * The meta object literal for the '{@link fr.univcotedazur.webots.polycreate.impl.GrabImpl <em>Grab</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.univcotedazur.webots.polycreate.impl.GrabImpl
		 * @see fr.univcotedazur.webots.polycreate.impl.PolycreatePackageImpl#getGrab()
		 * @generated
		 */
		EClass GRAB = eINSTANCE.getGrab();

		/**
		 * The meta object literal for the '{@link fr.univcotedazur.webots.polycreate.impl.ReleaseImpl <em>Release</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.univcotedazur.webots.polycreate.impl.ReleaseImpl
		 * @see fr.univcotedazur.webots.polycreate.impl.PolycreatePackageImpl#getRelease()
		 * @generated
		 */
		EClass RELEASE = eINSTANCE.getRelease();

	}

} //PolycreatePackage