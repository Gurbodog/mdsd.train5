/**
 */
package Train5;

import java.math.BigInteger;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Route</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Train5.Route#getCurrentIndex <em>Current Index</em>}</li>
 *   <li>{@link Train5.Route#getRoute <em>Route</em>}</li>
 *   <li>{@link Train5.Route#getSpeed <em>Speed</em>}</li>
 *   <li>{@link Train5.Route#getLeftOver <em>Left Over</em>}</li>
 * </ul>
 * </p>
 *
 * @see Train5.Train5Package#getRoute()
 * @model
 * @generated
 */
public interface Route extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Route</b></em>' containment reference list.
	 * The list contents are of type {@link Train5.RoutePart}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Route</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Route</em>' containment reference list.
	 * @see Train5.Train5Package#getRoute_Route()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<RoutePart> getRoute();

	/**
	 * Returns the value of the '<em><b>Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Speed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Speed</em>' attribute.
	 * @see #setSpeed(BigInteger)
	 * @see Train5.Train5Package#getRoute_Speed()
	 * @model
	 * @generated
	 */
	BigInteger getSpeed();

	/**
	 * Sets the value of the '{@link Train5.Route#getSpeed <em>Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Speed</em>' attribute.
	 * @see #getSpeed()
	 * @generated
	 */
	void setSpeed(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Left Over</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left Over</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left Over</em>' attribute.
	 * @see #setLeftOver(BigInteger)
	 * @see Train5.Train5Package#getRoute_LeftOver()
	 * @model
	 * @generated
	 */
	BigInteger getLeftOver();

	/**
	 * Sets the value of the '{@link Train5.Route#getLeftOver <em>Left Over</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left Over</em>' attribute.
	 * @see #getLeftOver()
	 * @generated
	 */
	void setLeftOver(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Current Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current Index</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Index</em>' attribute.
	 * @see #setCurrentIndex(BigInteger)
	 * @see Train5.Train5Package#getRoute_CurrentIndex()
	 * @model
	 * @generated
	 */
	BigInteger getCurrentIndex();

	/**
	 * Sets the value of the '{@link Train5.Route#getCurrentIndex <em>Current Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Index</em>' attribute.
	 * @see #getCurrentIndex()
	 * @generated
	 */
	void setCurrentIndex(BigInteger value);

} // Route
