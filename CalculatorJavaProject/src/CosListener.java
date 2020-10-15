/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author Shakhzod
 */
public class CosListener extends Listener {

	public CosListener(IView view) {
		super(view);
	}

	/** 
	 * <!-- begin-UML-doc -->
	 */
	@Override
	public Parameters getParameters(IView view) {
		Parameters parameters = new Parameters();
		double a = Lib.convertTextToNumber(view.getTextA());
		parameters.put("a", Double.class, a);
		return parameters;
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 */
	@Override
	public IMathAlgorithm getAlgorithm(Parameters parameters) {
		return new Cos(parameters);
	}

}