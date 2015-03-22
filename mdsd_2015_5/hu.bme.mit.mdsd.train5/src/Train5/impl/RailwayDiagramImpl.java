/**
 */
package Train5.impl;

import Train5.RailwayDiagram;
import Train5.Route;
import Train5.SensorNetwork;
import Train5.TrackElement;
import Train5.Train5Package;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Railway Diagram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Train5.impl.RailwayDiagramImpl#getTrackelements <em>Trackelements</em>}</li>
 *   <li>{@link Train5.impl.RailwayDiagramImpl#getSensors <em>Sensors</em>}</li>
 *   <li>{@link Train5.impl.RailwayDiagramImpl#getRoutes <em>Routes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RailwayDiagramImpl extends MinimalEObjectImpl.Container implements RailwayDiagram {
	/**
	 * The cached value of the '{@link #getTrackelements() <em>Trackelements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrackelements()
	 * @generated
	 * @ordered
	 */
	protected EList<TrackElement> trackelements;

	/**
	 * The cached value of the '{@link #getSensors() <em>Sensors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensors()
	 * @generated
	 * @ordered
	 */
	protected EList<SensorNetwork> sensors;

	/**
	 * The cached value of the '{@link #getRoutes() <em>Routes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoutes()
	 * @generated
	 * @ordered
	 */
	protected EList<Route> routes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RailwayDiagramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Train5Package.Literals.RAILWAY_DIAGRAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TrackElement> getTrackelements() {
		if (trackelements == null) {
			trackelements = new EObjectContainmentEList<TrackElement>(TrackElement.class, this, Train5Package.RAILWAY_DIAGRAM__TRACKELEMENTS);
		}
		return trackelements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SensorNetwork> getSensors() {
		if (sensors == null) {
			sensors = new EObjectContainmentEList<SensorNetwork>(SensorNetwork.class, this, Train5Package.RAILWAY_DIAGRAM__SENSORS);
		}
		return sensors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Route> getRoutes() {
		if (routes == null) {
			routes = new EObjectContainmentEList<Route>(Route.class, this, Train5Package.RAILWAY_DIAGRAM__ROUTES);
		}
		return routes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Train5Package.RAILWAY_DIAGRAM__TRACKELEMENTS:
				return ((InternalEList<?>)getTrackelements()).basicRemove(otherEnd, msgs);
			case Train5Package.RAILWAY_DIAGRAM__SENSORS:
				return ((InternalEList<?>)getSensors()).basicRemove(otherEnd, msgs);
			case Train5Package.RAILWAY_DIAGRAM__ROUTES:
				return ((InternalEList<?>)getRoutes()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Train5Package.RAILWAY_DIAGRAM__TRACKELEMENTS:
				return getTrackelements();
			case Train5Package.RAILWAY_DIAGRAM__SENSORS:
				return getSensors();
			case Train5Package.RAILWAY_DIAGRAM__ROUTES:
				return getRoutes();
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
			case Train5Package.RAILWAY_DIAGRAM__TRACKELEMENTS:
				getTrackelements().clear();
				getTrackelements().addAll((Collection<? extends TrackElement>)newValue);
				return;
			case Train5Package.RAILWAY_DIAGRAM__SENSORS:
				getSensors().clear();
				getSensors().addAll((Collection<? extends SensorNetwork>)newValue);
				return;
			case Train5Package.RAILWAY_DIAGRAM__ROUTES:
				getRoutes().clear();
				getRoutes().addAll((Collection<? extends Route>)newValue);
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
			case Train5Package.RAILWAY_DIAGRAM__TRACKELEMENTS:
				getTrackelements().clear();
				return;
			case Train5Package.RAILWAY_DIAGRAM__SENSORS:
				getSensors().clear();
				return;
			case Train5Package.RAILWAY_DIAGRAM__ROUTES:
				getRoutes().clear();
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
			case Train5Package.RAILWAY_DIAGRAM__TRACKELEMENTS:
				return trackelements != null && !trackelements.isEmpty();
			case Train5Package.RAILWAY_DIAGRAM__SENSORS:
				return sensors != null && !sensors.isEmpty();
			case Train5Package.RAILWAY_DIAGRAM__ROUTES:
				return routes != null && !routes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RailwayDiagramImpl
