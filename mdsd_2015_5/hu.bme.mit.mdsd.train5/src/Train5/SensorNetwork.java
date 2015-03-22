/**
 */
package Train5;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sensor Network</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Train5.SensorNetwork#getSensors <em>Sensors</em>}</li>
 * </ul>
 * </p>
 *
 * @see Train5.Train5Package#getSensorNetwork()
 * @model
 * @generated
 */
public interface SensorNetwork extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Sensors</b></em>' reference list.
	 * The list contents are of type {@link Train5.Switch}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sensors</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sensors</em>' reference list.
	 * @see Train5.Train5Package#getSensorNetwork_Sensors()
	 * @model
	 * @generated
	 */
	EList<Switch> getSensors();

} // SensorNetwork
