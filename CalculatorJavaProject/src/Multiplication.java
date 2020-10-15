/**
 * 
 */

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author Adam
 */
public class Multiplication extends MathAlgorithm implements IMathAlgorithm {
	private final double a;
	private final double b;

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 */
	public Multiplication(Parameters parameters) {
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
		status = 0;
		result = a * b;
		// end-user-code
	}
}