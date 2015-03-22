/**
 */
package Train5;

import java.math.BigInteger;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Track Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Train5.TrackElement#getState <em>State</em>}</li>
 *   <li>{@link Train5.TrackElement#getTrain <em>Train</em>}</li>
 *   <li>{@link Train5.TrackElement#getLength <em>Length</em>}</li>
 * </ul>
 * </p>
 *
 * @see Train5.Train5Package#getTrackElement()
 * @model abstract="true"
 * @generated
 */
public interface TrackElement extends NamedElement {
	/**
	 * Returns the value of the '<em><b>State</b></em>' attribute.
	 * The default value is <code>"Go"</code>.
	 * The literals are from the enumeration {@link Train5.Signal}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' attribute.
	 * @see Train5.Signal
	 * @see #setState(Signal)
	 * @see Train5.Train5Package#getTrackElement_State()
	 * @model default="Go"
	 * @generated
	 */
	Signal getState();

	/**
	 * Sets the value of the '{@link Train5.TrackElement#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see Train5.Signal
	 * @see #getState()
	 * @generated
	 */
	void setState(Signal value);

	/**
	 * Returns the value of the '<em><b>Train</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Train</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Train</em>' reference.
	 * @see #setTrain(Route)
	 * @see Train5.Train5Package#getTrackElement_Train()
	 * @model
	 * @generated
	 */
	Route getTrain();

	/**
	 * Sets the value of the '{@link Train5.TrackElement#getTrain <em>Train</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Train</em>' reference.
	 * @see #getTrain()
	 * @generated
	 */
	void setTrain(Route value);

	/**
	 * Returns the value of the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Length</em>' attribute.
	 * @see #setLength(BigInteger)
	 * @see Train5.Train5Package#getTrackElement_Length()
	 * @model
	 * @generated
	 */
	BigInteger getLength();

	/**
	 * Sets the value of the '{@link Train5.TrackElement#getLength <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length</em>' attribute.
	 * @see #getLength()
	 * @generated
	 */
	void setLength(BigInteger value);

} // TrackElement
