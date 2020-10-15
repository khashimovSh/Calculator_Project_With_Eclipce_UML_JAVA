/**
 * 
 */

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author Shakhzod
 */
public class Logarithm extends MathAlgorithm implements IMathAlgorithm {
	private final double a;

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 */
	public Logarithm(Parameters parameters) {
		// begin-user-code
		a = parameters.get("a", Double.class);
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 */
	public void run() {
		// begin-user-code
		if (a <= 0.0) {
			status = 2;
			errorMessage = "Non-positive argument for logarithm";
		} else {
			status = 0;
			result = Math.log(a);
		}
		// end-user-code
	}
}