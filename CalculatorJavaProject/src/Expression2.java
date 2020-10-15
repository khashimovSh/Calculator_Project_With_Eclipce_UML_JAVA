/**
 * 
 */

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author Shakhzod
 */
public class Expression2 extends MathAlgorithm implements IMathAlgorithm {
	private final Expression expression;
	private final Logarithm logarithm;

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 */
	public Expression2(Expression expression, Logarithm logarithm) {
		// begin-user-code
		this.expression = expression;
		this.logarithm = logarithm;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 */
	public Expression2(Parameters parameters) {
		// begin-user-code
		this(new Expression(parameters), new Logarithm(parameters));
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 */
	public void run() {
		// begin-user-code
		// expression(a, b) / log(a)
		try {
			double numerator = getResult(expression);
			double denominator = getResult(logarithm);
			if (denominator == 0) {
				status = 3;
				errorMessage = "log(a) = 0 results in division by 0";
			} else {
				status = 0;
				result = numerator / denominator;
			}
		} catch (RuntimeException e) {
		}
		// end-user-code
	}
}