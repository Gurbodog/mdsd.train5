/**
 */
package Train5.impl;

import Train5.SensorNetwork;
import Train5.Switch;
import Train5.Train5Package;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sensor Network</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Train5.impl.SensorNetworkImpl#getSensors <em>Sensors</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SensorNetworkImpl extends NamedElementImpl implements SensorNetwork {
	/**
	 * The cached value of the '{@link #getSensors() <em>Sensors</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensors()
	 * @generated
	 * @ordered
	 */
	protected EList<Switch> sensors;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SensorNetworkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Train5Package.Literals.SENSOR_NETWORK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Switch> getSensors() {
		if (sensors == null) {
			sensors = new EObjectResolvingEList<Switch>(Switch.class, this, Train5Package.SENSOR_NETWORK__SENSORS);
		}
		return sensors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Train5Package.SENSOR_NETWORK__SENSORS:
				return getSensors();
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
			case Train5Package.SENSOR_NETWORK__SENSORS:
				getSensors().clear();
				getSensors().addAll((Collection<? extends Switch>)newValue);
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
			case Train5Package.SENSOR_NETWORK__SENSORS:
				getSensors().clear();
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
			case Train5Package.SENSOR_NETWORK__SENSORS:
				return sensors != null && !sensors.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SensorNetworkImpl
