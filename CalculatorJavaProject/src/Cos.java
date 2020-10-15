/**
 * 
 */

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author Shakhzod
 */
public class Cos extends MathAlgorithm implements IMathAlgorithm {
	private final double a;

	
	public Cos(Parameters parameters) {
		a = parameters.get("a", Double.class);
	}

	
	public void run() {
		double rad = Math.toRadians(a);
		result = Math.cos(rad);
	}
}