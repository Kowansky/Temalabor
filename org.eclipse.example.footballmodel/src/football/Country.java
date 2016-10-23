/**
 */
package football;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Country</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link football.Country#getName <em>Name</em>}</li>
 *   <li>{@link football.Country#getChampions <em>Champions</em>}</li>
 *   <li>{@link football.Country#getCups <em>Cups</em>}</li>
 * </ul>
 *
 * @see football.FootballPackage#getCountry()
 * @model
 * @generated
 */
public interface Country extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see football.FootballPackage#getCountry_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link football.Country#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Champions</b></em>' containment reference list.
	 * The list contents are of type {@link football.Championship}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Champions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Champions</em>' containment reference list.
	 * @see football.FootballPackage#getCountry_Champions()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Championship> getChampions();

	/**
	 * Returns the value of the '<em><b>Cups</b></em>' containment reference list.
	 * The list contents are of type {@link football.Cup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cups</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cups</em>' containment reference list.
	 * @see football.FootballPackage#getCountry_Cups()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Cup> getCups();

} // Country
