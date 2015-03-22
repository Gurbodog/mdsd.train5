/**
 */
package Train5;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see Train5.Train5Factory
 * @model kind="package"
 * @generated
 */
public interface Train5Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Train5";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "hu.bme.mit.mdsd.train5";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "hu.bme.mit.mdsd.train5";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Train5Package eINSTANCE = Train5.impl.Train5PackageImpl.init();

	/**
	 * The meta object id for the '{@link Train5.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Train5.impl.NamedElementImpl
	 * @see Train5.impl.Train5PackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__ID = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Train5.impl.TrackElementImpl <em>Track Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Train5.impl.TrackElementImpl
	 * @see Train5.impl.Train5PackageImpl#getTrackElement()
	 * @generated
	 */
	int TRACK_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK_ELEMENT__ID = NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK_ELEMENT__STATE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Train</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK_ELEMENT__TRAIN = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK_ELEMENT__LENGTH = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Track Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK_ELEMENT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Track Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK_ELEMENT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Train5.impl.RouteImpl <em>Route</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Train5.impl.RouteImpl
	 * @see Train5.impl.Train5PackageImpl#getRoute()
	 * @generated
	 */
	int ROUTE = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE__ID = NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Current Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE__CURRENT_INDEX = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Route</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE__ROUTE = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE__SPEED = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Left Over</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE__LEFT_OVER = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Route</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Route</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Train5.impl.SwitchImpl <em>Switch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Train5.impl.SwitchImpl
	 * @see Train5.impl.Train5PackageImpl#getSwitch()
	 * @generated
	 */
	int SWITCH = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__ID = TRACK_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__STATE = TRACK_ELEMENT__STATE;

	/**
	 * The feature id for the '<em><b>Train</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__TRAIN = TRACK_ELEMENT__TRAIN;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__LENGTH = TRACK_ELEMENT__LENGTH;

	/**
	 * The feature id for the '<em><b>Neighbour</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__NEIGHBOUR = TRACK_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Switch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_FEATURE_COUNT = TRACK_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Switch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_OPERATION_COUNT = TRACK_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Train5.impl.SegmentImpl <em>Segment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Train5.impl.SegmentImpl
	 * @see Train5.impl.Train5PackageImpl#getSegment()
	 * @generated
	 */
	int SEGMENT = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT__ID = TRACK_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT__STATE = TRACK_ELEMENT__STATE;

	/**
	 * The feature id for the '<em><b>Train</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT__TRAIN = TRACK_ELEMENT__TRAIN;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT__LENGTH = TRACK_ELEMENT__LENGTH;

	/**
	 * The number of structural features of the '<em>Segment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT_FEATURE_COUNT = TRACK_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Segment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT_OPERATION_COUNT = TRACK_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Train5.impl.StationImpl <em>Station</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Train5.impl.StationImpl
	 * @see Train5.impl.Train5PackageImpl#getStation()
	 * @generated
	 */
	int STATION = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION__ID = TRACK_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION__STATE = TRACK_ELEMENT__STATE;

	/**
	 * The feature id for the '<em><b>Train</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION__TRAIN = TRACK_ELEMENT__TRAIN;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION__LENGTH = TRACK_ELEMENT__LENGTH;

	/**
	 * The number of structural features of the '<em>Station</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_FEATURE_COUNT = TRACK_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Station</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_OPERATION_COUNT = TRACK_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Train5.impl.SensorNetworkImpl <em>Sensor Network</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Train5.impl.SensorNetworkImpl
	 * @see Train5.impl.Train5PackageImpl#getSensorNetwork()
	 * @generated
	 */
	int SENSOR_NETWORK = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_NETWORK__ID = NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Sensors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_NETWORK__SENSORS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sensor Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_NETWORK_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Sensor Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_NETWORK_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Train5.impl.RailwayDiagramImpl <em>Railway Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Train5.impl.RailwayDiagramImpl
	 * @see Train5.impl.Train5PackageImpl#getRailwayDiagram()
	 * @generated
	 */
	int RAILWAY_DIAGRAM = 7;

	/**
	 * The feature id for the '<em><b>Trackelements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAILWAY_DIAGRAM__TRACKELEMENTS = 0;

	/**
	 * The feature id for the '<em><b>Sensors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAILWAY_DIAGRAM__SENSORS = 1;

	/**
	 * The feature id for the '<em><b>Routes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAILWAY_DIAGRAM__ROUTES = 2;

	/**
	 * The number of structural features of the '<em>Railway Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAILWAY_DIAGRAM_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Railway Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAILWAY_DIAGRAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Train5.impl.RoutePartImpl <em>Route Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Train5.impl.RoutePartImpl
	 * @see Train5.impl.Train5PackageImpl#getRoutePart()
	 * @generated
	 */
	int ROUTE_PART = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_PART__ID = NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_PART__NEXT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_PART__ELEMENT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_PART__PREVIOUS = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Route Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_PART_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Route Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_PART_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Train5.Signal <em>Signal</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Train5.Signal
	 * @see Train5.impl.Train5PackageImpl#getSignal()
	 * @generated
	 */
	int SIGNAL = 9;


	/**
	 * Returns the meta object for class '{@link Train5.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see Train5.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link Train5.NamedElement#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see Train5.NamedElement#getId()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Id();

	/**
	 * Returns the meta object for class '{@link Train5.TrackElement <em>Track Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Track Element</em>'.
	 * @see Train5.TrackElement
	 * @generated
	 */
	EClass getTrackElement();

	/**
	 * Returns the meta object for the attribute '{@link Train5.TrackElement#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see Train5.TrackElement#getState()
	 * @see #getTrackElement()
	 * @generated
	 */
	EAttribute getTrackElement_State();

	/**
	 * Returns the meta object for the reference '{@link Train5.TrackElement#getTrain <em>Train</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Train</em>'.
	 * @see Train5.TrackElement#getTrain()
	 * @see #getTrackElement()
	 * @generated
	 */
	EReference getTrackElement_Train();

	/**
	 * Returns the meta object for the attribute '{@link Train5.TrackElement#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see Train5.TrackElement#getLength()
	 * @see #getTrackElement()
	 * @generated
	 */
	EAttribute getTrackElement_Length();

	/**
	 * Returns the meta object for class '{@link Train5.Route <em>Route</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Route</em>'.
	 * @see Train5.Route
	 * @generated
	 */
	EClass getRoute();

	/**
	 * Returns the meta object for the containment reference list '{@link Train5.Route#getRoute <em>Route</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Route</em>'.
	 * @see Train5.Route#getRoute()
	 * @see #getRoute()
	 * @generated
	 */
	EReference getRoute_Route();

	/**
	 * Returns the meta object for the attribute '{@link Train5.Route#getSpeed <em>Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Speed</em>'.
	 * @see Train5.Route#getSpeed()
	 * @see #getRoute()
	 * @generated
	 */
	EAttribute getRoute_Speed();

	/**
	 * Returns the meta object for the attribute '{@link Train5.Route#getLeftOver <em>Left Over</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Left Over</em>'.
	 * @see Train5.Route#getLeftOver()
	 * @see #getRoute()
	 * @generated
	 */
	EAttribute getRoute_LeftOver();

	/**
	 * Returns the meta object for the attribute '{@link Train5.Route#getCurrentIndex <em>Current Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Current Index</em>'.
	 * @see Train5.Route#getCurrentIndex()
	 * @see #getRoute()
	 * @generated
	 */
	EAttribute getRoute_CurrentIndex();

	/**
	 * Returns the meta object for class '{@link Train5.Switch <em>Switch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Switch</em>'.
	 * @see Train5.Switch
	 * @generated
	 */
	EClass getSwitch();

	/**
	 * Returns the meta object for the reference list '{@link Train5.Switch#getNeighbour <em>Neighbour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Neighbour</em>'.
	 * @see Train5.Switch#getNeighbour()
	 * @see #getSwitch()
	 * @generated
	 */
	EReference getSwitch_Neighbour();

	/**
	 * Returns the meta object for class '{@link Train5.Segment <em>Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Segment</em>'.
	 * @see Train5.Segment
	 * @generated
	 */
	EClass getSegment();

	/**
	 * Returns the meta object for class '{@link Train5.Station <em>Station</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Station</em>'.
	 * @see Train5.Station
	 * @generated
	 */
	EClass getStation();

	/**
	 * Returns the meta object for class '{@link Train5.SensorNetwork <em>Sensor Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sensor Network</em>'.
	 * @see Train5.SensorNetwork
	 * @generated
	 */
	EClass getSensorNetwork();

	/**
	 * Returns the meta object for the reference list '{@link Train5.SensorNetwork#getSensors <em>Sensors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sensors</em>'.
	 * @see Train5.SensorNetwork#getSensors()
	 * @see #getSensorNetwork()
	 * @generated
	 */
	EReference getSensorNetwork_Sensors();

	/**
	 * Returns the meta object for class '{@link Train5.RailwayDiagram <em>Railway Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Railway Diagram</em>'.
	 * @see Train5.RailwayDiagram
	 * @generated
	 */
	EClass getRailwayDiagram();

	/**
	 * Returns the meta object for the containment reference list '{@link Train5.RailwayDiagram#getTrackelements <em>Trackelements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Trackelements</em>'.
	 * @see Train5.RailwayDiagram#getTrackelements()
	 * @see #getRailwayDiagram()
	 * @generated
	 */
	EReference getRailwayDiagram_Trackelements();

	/**
	 * Returns the meta object for the containment reference list '{@link Train5.RailwayDiagram#getSensors <em>Sensors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sensors</em>'.
	 * @see Train5.RailwayDiagram#getSensors()
	 * @see #getRailwayDiagram()
	 * @generated
	 */
	EReference getRailwayDiagram_Sensors();

	/**
	 * Returns the meta object for the containment reference list '{@link Train5.RailwayDiagram#getRoutes <em>Routes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Routes</em>'.
	 * @see Train5.RailwayDiagram#getRoutes()
	 * @see #getRailwayDiagram()
	 * @generated
	 */
	EReference getRailwayDiagram_Routes();

	/**
	 * Returns the meta object for class '{@link Train5.RoutePart <em>Route Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Route Part</em>'.
	 * @see Train5.RoutePart
	 * @generated
	 */
	EClass getRoutePart();

	/**
	 * Returns the meta object for the reference '{@link Train5.RoutePart#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Next</em>'.
	 * @see Train5.RoutePart#getNext()
	 * @see #getRoutePart()
	 * @generated
	 */
	EReference getRoutePart_Next();

	/**
	 * Returns the meta object for the reference '{@link Train5.RoutePart#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Element</em>'.
	 * @see Train5.RoutePart#getElement()
	 * @see #getRoutePart()
	 * @generated
	 */
	EReference getRoutePart_Element();

	/**
	 * Returns the meta object for the reference '{@link Train5.RoutePart#getPrevious <em>Previous</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Previous</em>'.
	 * @see Train5.RoutePart#getPrevious()
	 * @see #getRoutePart()
	 * @generated
	 */
	EReference getRoutePart_Previous();

	/**
	 * Returns the meta object for enum '{@link Train5.Signal <em>Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Signal</em>'.
	 * @see Train5.Signal
	 * @generated
	 */
	EEnum getSignal();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Train5Factory getTrain5Factory();

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
		 * The meta object literal for the '{@link Train5.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Train5.impl.NamedElementImpl
		 * @see Train5.impl.Train5PackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__ID = eINSTANCE.getNamedElement_Id();

		/**
		 * The meta object literal for the '{@link Train5.impl.TrackElementImpl <em>Track Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Train5.impl.TrackElementImpl
		 * @see Train5.impl.Train5PackageImpl#getTrackElement()
		 * @generated
		 */
		EClass TRACK_ELEMENT = eINSTANCE.getTrackElement();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRACK_ELEMENT__STATE = eINSTANCE.getTrackElement_State();

		/**
		 * The meta object literal for the '<em><b>Train</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACK_ELEMENT__TRAIN = eINSTANCE.getTrackElement_Train();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRACK_ELEMENT__LENGTH = eINSTANCE.getTrackElement_Length();

		/**
		 * The meta object literal for the '{@link Train5.impl.RouteImpl <em>Route</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Train5.impl.RouteImpl
		 * @see Train5.impl.Train5PackageImpl#getRoute()
		 * @generated
		 */
		EClass ROUTE = eINSTANCE.getRoute();

		/**
		 * The meta object literal for the '<em><b>Route</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROUTE__ROUTE = eINSTANCE.getRoute_Route();

		/**
		 * The meta object literal for the '<em><b>Speed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROUTE__SPEED = eINSTANCE.getRoute_Speed();

		/**
		 * The meta object literal for the '<em><b>Left Over</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROUTE__LEFT_OVER = eINSTANCE.getRoute_LeftOver();

		/**
		 * The meta object literal for the '<em><b>Current Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROUTE__CURRENT_INDEX = eINSTANCE.getRoute_CurrentIndex();

		/**
		 * The meta object literal for the '{@link Train5.impl.SwitchImpl <em>Switch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Train5.impl.SwitchImpl
		 * @see Train5.impl.Train5PackageImpl#getSwitch()
		 * @generated
		 */
		EClass SWITCH = eINSTANCE.getSwitch();

		/**
		 * The meta object literal for the '<em><b>Neighbour</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWITCH__NEIGHBOUR = eINSTANCE.getSwitch_Neighbour();

		/**
		 * The meta object literal for the '{@link Train5.impl.SegmentImpl <em>Segment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Train5.impl.SegmentImpl
		 * @see Train5.impl.Train5PackageImpl#getSegment()
		 * @generated
		 */
		EClass SEGMENT = eINSTANCE.getSegment();

		/**
		 * The meta object literal for the '{@link Train5.impl.StationImpl <em>Station</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Train5.impl.StationImpl
		 * @see Train5.impl.Train5PackageImpl#getStation()
		 * @generated
		 */
		EClass STATION = eINSTANCE.getStation();

		/**
		 * The meta object literal for the '{@link Train5.impl.SensorNetworkImpl <em>Sensor Network</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Train5.impl.SensorNetworkImpl
		 * @see Train5.impl.Train5PackageImpl#getSensorNetwork()
		 * @generated
		 */
		EClass SENSOR_NETWORK = eINSTANCE.getSensorNetwork();

		/**
		 * The meta object literal for the '<em><b>Sensors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENSOR_NETWORK__SENSORS = eINSTANCE.getSensorNetwork_Sensors();

		/**
		 * The meta object literal for the '{@link Train5.impl.RailwayDiagramImpl <em>Railway Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Train5.impl.RailwayDiagramImpl
		 * @see Train5.impl.Train5PackageImpl#getRailwayDiagram()
		 * @generated
		 */
		EClass RAILWAY_DIAGRAM = eINSTANCE.getRailwayDiagram();

		/**
		 * The meta object literal for the '<em><b>Trackelements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RAILWAY_DIAGRAM__TRACKELEMENTS = eINSTANCE.getRailwayDiagram_Trackelements();

		/**
		 * The meta object literal for the '<em><b>Sensors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RAILWAY_DIAGRAM__SENSORS = eINSTANCE.getRailwayDiagram_Sensors();

		/**
		 * The meta object literal for the '<em><b>Routes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RAILWAY_DIAGRAM__ROUTES = eINSTANCE.getRailwayDiagram_Routes();

		/**
		 * The meta object literal for the '{@link Train5.impl.RoutePartImpl <em>Route Part</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Train5.impl.RoutePartImpl
		 * @see Train5.impl.Train5PackageImpl#getRoutePart()
		 * @generated
		 */
		EClass ROUTE_PART = eINSTANCE.getRoutePart();

		/**
		 * The meta object literal for the '<em><b>Next</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROUTE_PART__NEXT = eINSTANCE.getRoutePart_Next();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROUTE_PART__ELEMENT = eINSTANCE.getRoutePart_Element();

		/**
		 * The meta object literal for the '<em><b>Previous</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROUTE_PART__PREVIOUS = eINSTANCE.getRoutePart_Previous();

		/**
		 * The meta object literal for the '{@link Train5.Signal <em>Signal</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Train5.Signal
		 * @see Train5.impl.Train5PackageImpl#getSignal()
		 * @generated
		 */
		EEnum SIGNAL = eINSTANCE.getSignal();

	}

} //Train5Package
