/**
 */
package Train5.impl;

import Train5.Route;
import Train5.RoutePart;
import Train5.Train5Package;
import java.math.BigInteger;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Route</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Train5.impl.RouteImpl#getCurrentIndex <em>Current Index</em>}</li>
 *   <li>{@link Train5.impl.RouteImpl#getRoute <em>Route</em>}</li>
 *   <li>{@link Train5.impl.RouteImpl#getSpeed <em>Speed</em>}</li>
 *   <li>{@link Train5.impl.RouteImpl#getLeftOver <em>Left Over</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RouteImpl extends NamedElementImpl implements Route {
	/**
	 * The default value of the '{@link #getCurrentIndex() <em>Current Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentIndex()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger CURRENT_INDEX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCurrentIndex() <em>Current Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentIndex()
	 * @generated
	 * @ordered
	 */
	protected BigInteger currentIndex = CURRENT_INDEX_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRoute() <em>Route</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoute()
	 * @generated
	 * @ordered
	 */
	protected EList<RoutePart> route;

	/**
	 * The default value of the '{@link #getSpeed() <em>Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpeed()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger SPEED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSpeed() <em>Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpeed()
	 * @generated
	 * @ordered
	 */
	protected BigInteger speed = SPEED_EDEFAULT;

	/**
	 * The default value of the '{@link #getLeftOver() <em>Left Over</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeftOver()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger LEFT_OVER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLeftOver() <em>Left Over</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeftOver()
	 * @generated
	 * @ordered
	 */
	protected BigInteger leftOver = LEFT_OVER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RouteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Train5Package.Literals.ROUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RoutePart> getRoute() {
		if (route == null) {
			route = new EObjectContainmentEList<RoutePart>(RoutePart.class, this, Train5Package.ROUTE__ROUTE);
		}
		return route;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getSpeed() {
		return speed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpeed(BigInteger newSpeed) {
		BigInteger oldSpeed = speed;
		speed = newSpeed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Train5Package.ROUTE__SPEED, oldSpeed, speed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getLeftOver() {
		return leftOver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeftOver(BigInteger newLeftOver) {
		BigInteger oldLeftOver = leftOver;
		leftOver = newLeftOver;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Train5Package.ROUTE__LEFT_OVER, oldLeftOver, leftOver));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Train5Package.ROUTE__ROUTE:
				return ((InternalEList<?>)getRoute()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getCurrentIndex() {
		return currentIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentIndex(BigInteger newCurrentIndex) {
		BigInteger oldCurrentIndex = currentIndex;
		currentIndex = newCurrentIndex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Train5Package.ROUTE__CURRENT_INDEX, oldCurrentIndex, currentIndex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Train5Package.ROUTE__CURRENT_INDEX:
				return getCurrentIndex();
			case Train5Package.ROUTE__ROUTE:
				return getRoute();
			case Train5Package.ROUTE__SPEED:
				return getSpeed();
			case Train5Package.ROUTE__LEFT_OVER:
				return getLeftOver();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Train5Package.ROUTE__CURRENT_INDEX:
				setCurrentIndex((BigInteger)newValue);
				return;
			case Train5Package.ROUTE__ROUTE:
				getRoute().clear();
				getRoute().addAll((Collection<? extends RoutePart>)newValue);
				return;
			case Train5Package.ROUTE__SPEED:
				setSpeed((BigInteger)newValue);
				return;
			case Train5Package.ROUTE__LEFT_OVER:
				setLeftOver((BigInteger)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Train5Package.ROUTE__CURRENT_INDEX:
				setCurrentIndex(CURRENT_INDEX_EDEFAULT);
				return;
			case Train5Package.ROUTE__ROUTE:
				getRoute().clear();
				return;
			case Train5Package.ROUTE__SPEED:
				setSpeed(SPEED_EDEFAULT);
				return;
			case Train5Package.ROUTE__LEFT_OVER:
				setLeftOver(LEFT_OVER_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Train5Package.ROUTE__CURRENT_INDEX:
				return CURRENT_INDEX_EDEFAULT == null ? currentIndex != null : !CURRENT_INDEX_EDEFAULT.equals(currentIndex);
			case Train5Package.ROUTE__ROUTE:
				return route != null && !route.isEmpty();
			case Train5Package.ROUTE__SPEED:
				return SPEED_EDEFAULT == null ? speed != null : !SPEED_EDEFAULT.equals(speed);
			case Train5Package.ROUTE__LEFT_OVER:
				return LEFT_OVER_EDEFAULT == null ? leftOver != null : !LEFT_OVER_EDEFAULT.equals(leftOver);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (currentIndex: ");
		result.append(currentIndex);
		result.append(", speed: ");
		result.append(speed);
		result.append(", leftOver: ");
		result.append(leftOver);
		result.append(')');
		return result.toString();
	}

} //RouteImpl
