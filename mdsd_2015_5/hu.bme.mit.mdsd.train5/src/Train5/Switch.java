/**
 */
package Train5;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Switch</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Train5.Switch#getNeighbour <em>Neighbour</em>}</li>
 * </ul>
 * </p>
 *
 * @see Train5.Train5Package#getSwitch()
 * @model
 * @generated
 */
public interface Switch extends TrackElement {
	/**
	 * Returns the value of the '<em><b>Neighbour</b></em>' reference list.
	 * The list contents are of type {@link Train5.Segment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Neighbour</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Neighbour</em>' reference list.
	 * @see Train5.Train5Package#getSwitch_Neighbour()
	 * @model lower="2"
	 * @generated
	 */
	EList<Segment> getNeighbour();

} // Switch
