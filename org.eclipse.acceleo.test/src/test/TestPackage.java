/**
 */
package test;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see test.TestFactory
 * @model kind="package"
 * @generated
 */
public interface TestPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "test";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://test.profile";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "test";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TestPackage eINSTANCE = test.impl.TestPackageImpl.init();

	/**
	 * The meta object id for the '{@link test.impl.BundleAImpl <em>Bundle A</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see test.impl.BundleAImpl
	 * @see test.impl.TestPackageImpl#getBundleA()
	 * @generated
	 */
	int BUNDLE_A = 0;

	/**
	 * The feature id for the '<em><b>Base Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_A__BASE_COMPONENT = 0;

	/**
	 * The number of structural features of the '<em>Bundle A</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_A_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Bundle A</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_A_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link test.impl.BundleBImpl <em>Bundle B</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see test.impl.BundleBImpl
	 * @see test.impl.TestPackageImpl#getBundleB()
	 * @generated
	 */
	int BUNDLE_B = 1;

	/**
	 * The feature id for the '<em><b>Base Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_B__BASE_COMPONENT = 0;

	/**
	 * The number of structural features of the '<em>Bundle B</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_B_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Bundle B</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_B_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link test.impl.BundleCImpl <em>Bundle C</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see test.impl.BundleCImpl
	 * @see test.impl.TestPackageImpl#getBundleC()
	 * @generated
	 */
	int BUNDLE_C = 2;

	/**
	 * The feature id for the '<em><b>Base Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_C__BASE_COMPONENT = BUNDLE_B__BASE_COMPONENT;

	/**
	 * The number of structural features of the '<em>Bundle C</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_C_FEATURE_COUNT = BUNDLE_B_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Bundle C</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_C_OPERATION_COUNT = BUNDLE_B_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link test.impl.FirstClassObjectImpl <em>First Class Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see test.impl.FirstClassObjectImpl
	 * @see test.impl.TestPackageImpl#getFirstClassObject()
	 * @generated
	 */
	int FIRST_CLASS_OBJECT = 3;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_CLASS_OBJECT__BASE_CLASS = 0;

	/**
	 * The number of structural features of the '<em>First Class Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_CLASS_OBJECT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>First Class Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_CLASS_OBJECT_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link test.BundleA <em>Bundle A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bundle A</em>'.
	 * @see test.BundleA
	 * @generated
	 */
	EClass getBundleA();

	/**
	 * Returns the meta object for the reference '{@link test.BundleA#getBase_Component <em>Base Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Component</em>'.
	 * @see test.BundleA#getBase_Component()
	 * @see #getBundleA()
	 * @generated
	 */
	EReference getBundleA_Base_Component();

	/**
	 * Returns the meta object for class '{@link test.BundleB <em>Bundle B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bundle B</em>'.
	 * @see test.BundleB
	 * @generated
	 */
	EClass getBundleB();

	/**
	 * Returns the meta object for the reference '{@link test.BundleB#getBase_Component <em>Base Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Component</em>'.
	 * @see test.BundleB#getBase_Component()
	 * @see #getBundleB()
	 * @generated
	 */
	EReference getBundleB_Base_Component();

	/**
	 * Returns the meta object for class '{@link test.BundleC <em>Bundle C</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bundle C</em>'.
	 * @see test.BundleC
	 * @generated
	 */
	EClass getBundleC();

	/**
	 * Returns the meta object for class '{@link test.FirstClassObject <em>First Class Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>First Class Object</em>'.
	 * @see test.FirstClassObject
	 * @generated
	 */
	EClass getFirstClassObject();

	/**
	 * Returns the meta object for the reference '{@link test.FirstClassObject#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see test.FirstClassObject#getBase_Class()
	 * @see #getFirstClassObject()
	 * @generated
	 */
	EReference getFirstClassObject_Base_Class();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TestFactory getTestFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link test.impl.BundleAImpl <em>Bundle A</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see test.impl.BundleAImpl
		 * @see test.impl.TestPackageImpl#getBundleA()
		 * @generated
		 */
		EClass BUNDLE_A = eINSTANCE.getBundleA();

		/**
		 * The meta object literal for the '<em><b>Base Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUNDLE_A__BASE_COMPONENT = eINSTANCE.getBundleA_Base_Component();

		/**
		 * The meta object literal for the '{@link test.impl.BundleBImpl <em>Bundle B</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see test.impl.BundleBImpl
		 * @see test.impl.TestPackageImpl#getBundleB()
		 * @generated
		 */
		EClass BUNDLE_B = eINSTANCE.getBundleB();

		/**
		 * The meta object literal for the '<em><b>Base Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUNDLE_B__BASE_COMPONENT = eINSTANCE.getBundleB_Base_Component();

		/**
		 * The meta object literal for the '{@link test.impl.BundleCImpl <em>Bundle C</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see test.impl.BundleCImpl
		 * @see test.impl.TestPackageImpl#getBundleC()
		 * @generated
		 */
		EClass BUNDLE_C = eINSTANCE.getBundleC();

		/**
		 * The meta object literal for the '{@link test.impl.FirstClassObjectImpl <em>First Class Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see test.impl.FirstClassObjectImpl
		 * @see test.impl.TestPackageImpl#getFirstClassObject()
		 * @generated
		 */
		EClass FIRST_CLASS_OBJECT = eINSTANCE.getFirstClassObject();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIRST_CLASS_OBJECT__BASE_CLASS = eINSTANCE.getFirstClassObject_Base_Class();

	}

} //TestPackage
