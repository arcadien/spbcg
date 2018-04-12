/**
 */
package test;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see test.TestPackage
 * @generated
 */
public interface TestFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TestFactory eINSTANCE = test.impl.TestFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Bundle A</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bundle A</em>'.
	 * @generated
	 */
	BundleA createBundleA();

	/**
	 * Returns a new object of class '<em>Bundle B</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bundle B</em>'.
	 * @generated
	 */
	BundleB createBundleB();

	/**
	 * Returns a new object of class '<em>Bundle C</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bundle C</em>'.
	 * @generated
	 */
	BundleC createBundleC();

	/**
	 * Returns a new object of class '<em>First Class Object</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>First Class Object</em>'.
	 * @generated
	 */
	FirstClassObject createFirstClassObject();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TestPackage getTestPackage();

} //TestFactory
