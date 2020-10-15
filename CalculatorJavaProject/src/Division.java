/**
 * 
 */

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author Shakhzod
 */
public class Division extends MathAlgorithm implements IMathAlgorithm {
	private final double a;
	private final double b;

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 */
	public Division(Parameters parameters) {
		// begin-user-code
		a = parameters.get("a", Double.class);
		b = parameters.get("b", Double.class);
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 */
	public void run() {
		// begin-user-code
		if (b == 0.0) {
			status = 1;
			errorMessage = "Division by zero";
		} else {
			status = 0;
			result = a / b;
		}
		// end-user-code
	}
}