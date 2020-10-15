/**
 * 
 */

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author Adam
 */
public class MathAlgorithm {
	protected int status;
	protected double result;
	protected String errorMessage;

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 */
	public int getStatus() {
		// begin-user-code
		return status;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 */
	public double getResult() {
		// begin-user-code
		return result;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 */
	public String getErrorMessage() {
		// begin-user-code
		return errorMessage;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 */
	protected double getResult(IMathAlgorithm algorithm) {
		// begin-user-code
		algorithm.run();
		if (algorithm.getStatus() > 0) {
			status = algorithm.getStatus();
			errorMessage = algorithm.getErrorMessage();
			throw new RuntimeException();
		}
		return algorithm.getResult();
	}
	// end-user-code
}
