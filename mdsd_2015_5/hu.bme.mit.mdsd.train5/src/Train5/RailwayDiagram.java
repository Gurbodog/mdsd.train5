/**
 */
package Train5;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Railway Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Train5.RailwayDiagram#getTrackelements <em>Trackelements</em>}</li>
 *   <li>{@link Train5.RailwayDiagram#getSensors <em>Sensors</em>}</li>
 *   <li>{@link Train5.RailwayDiagram#getRoutes <em>Routes</em>}</li>
 * </ul>
 * </p>
 *
 * @see Train5.Train5Package#getRailwayDiagram()
 * @model
 * @generated
 */
public interface RailwayDiagram extends EObject {
	/**
	 * Returns the value of the '<em><b>Trackelements</b></em>' containment reference list.
	 * The list contents are of type {@link Train5.TrackElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trackelements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trackelements</em>' containment reference list.
	 * @see Train5.Train5Package#getRailwayDiagram_Trackelements()
	 * @model containment="true"
	 * @generated
	 */
	EList<TrackElement> getTrackelements();

	/**
	 * Returns the value of the '<em><b>Sensors</b></em>' containment reference list.
	 * The list contents are of type {@link Train5.SensorNetwork}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sensors</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sensors</em>' containment reference list.
	 * @see Train5.Train5Package#getRailwayDiagram_Sensors()
	 * @model containment="true"
	 * @generated
	 */
	EList<SensorNetwork> getSensors();

	/**
	 * Returns the value of the '<em><b>Routes</b></em>' containment reference list.
	 * The list contents are of type {@link Train5.Route}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Routes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Routes</em>' containment reference list.
	 * @see Train5.Train5Package#getRailwayDiagram_Routes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Route> getRoutes();

} // RailwayDiagram
