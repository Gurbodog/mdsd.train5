/**
 */
package Train5;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Route Part</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Train5.RoutePart#getNext <em>Next</em>}</li>
 *   <li>{@link Train5.RoutePart#getElement <em>Element</em>}</li>
 *   <li>{@link Train5.RoutePart#getPrevious <em>Previous</em>}</li>
 * </ul>
 * </p>
 *
 * @see Train5.Train5Package#getRoutePart()
 * @model
 * @generated
 */
public interface RoutePart extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next</em>' reference.
	 * @see #setNext(RoutePart)
	 * @see Train5.Train5Package#getRoutePart_Next()
	 * @model
	 * @generated
	 */
	RoutePart getNext();

	/**
	 * Sets the value of the '{@link Train5.RoutePart#getNext <em>Next</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next</em>' reference.
	 * @see #getNext()
	 * @generated
	 */
	void setNext(RoutePart value);

	/**
	 * Returns the value of the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element</em>' reference.
	 * @see #setElement(TrackElement)
	 * @see Train5.Train5Package#getRoutePart_Element()
	 * @model required="true"
	 * @generated
	 */
	TrackElement getElement();

	/**
	 * Sets the value of the '{@link Train5.RoutePart#getElement <em>Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element</em>' reference.
	 * @see #getElement()
	 * @generated
	 */
	void setElement(TrackElement value);

	/**
	 * Returns the value of the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Previous</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Previous</em>' reference.
	 * @see #setPrevious(RoutePart)
	 * @see Train5.Train5Package#getRoutePart_Previous()
	 * @model
	 * @generated
	 */
	RoutePart getPrevious();

	/**
	 * Sets the value of the '{@link Train5.RoutePart#getPrevious <em>Previous</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Previous</em>' reference.
	 * @see #getPrevious()
	 * @generated
	 */
	void setPrevious(RoutePart value);

} // RoutePart
