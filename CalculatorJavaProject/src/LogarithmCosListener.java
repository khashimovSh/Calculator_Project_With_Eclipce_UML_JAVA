/**
 * 
 */

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author Shahzod
 */
public class LogarithmCosListener extends Listener {
	
	public LogarithmCosListener(IView view) {
		super(view);
	}

	@Override
	public Parameters getParameters(IView view) {
		Parameters parameters = new Parameters();
		double a = Lib.convertTextToNumber(view.getTextA());
		parameters.put("a", Double.class, a);
		return parameters;
	}

	@Override
	public IMathAlgorithm getAlgorithm(Parameters parameters) {
		return new LogarithmCos(parameters);
	}
}