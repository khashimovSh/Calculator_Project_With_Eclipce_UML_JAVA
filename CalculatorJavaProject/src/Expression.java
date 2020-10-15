/**
 * 
 */

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author Shakhzod
 */
public class Expression extends MathAlgorithm implements IMathAlgorithm {
	private final Multiplication multiplication;
	private final Division division;
	private final Logarithm logarithm;

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 */
	public Expression(Multiplication multiplication, Division division,
			Logarithm logarithm) {
		// begin-user-code
		this.multiplication = multiplication;
		this.division = division;
		this.logarithm = logarithm;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 */
	public Expression(Parameters parameters) {
		// begin-user-code
		this(new Multiplication(parameters), new Division(parameters),
				new Logarithm(parameters));
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 */
	public void run() {
		// begin-user-code
		// (a * b) + (a / b) - log(a)
		try {
			status = 0;
			result = getResult(multiplication) + getResult(division)
					- getResult(logarithm);
		} catch (RuntimeException e) {
		}
		// end-user-code
	}
}