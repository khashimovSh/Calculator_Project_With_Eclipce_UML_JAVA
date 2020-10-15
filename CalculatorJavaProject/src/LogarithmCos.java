/**
 * 
 */

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author Shakhzod
 */
public class LogarithmCos extends MathAlgorithm implements IMathAlgorithm {
	
	private final Logarithm logarithm;
	private final Cos cos;
	
	public LogarithmCos(Logarithm logarithm, Cos cos) {
		this.logarithm = logarithm;
		this.cos = cos;
	}

	
	public LogarithmCos(Parameters parameters) {
		this(new Logarithm(parameters), new Cos(parameters));
	}
	public void run() {
		try{
		double coss = getResult(cos);
		double log = getResult(logarithm);
		status = logarithm.getStatus();
		if (status == 2) {
			errorMessage = "Non-positive argument for logarithm";
		} else {
			log = getResult(logarithm);
		}
		result = log - coss;
		}
		catch(RuntimeException e){
			}
	}
}