public class ExpressionListener extends Listener {

	public ExpressionListener(IView view) {
		super(view);
	}

	@Override
	public Parameters getParameters(IView view) {
		double a = Lib.convertTextToNumber(view.getTextA());
		double b = Lib.convertTextToNumber(view.getTextB());
		Parameters parameters = new Parameters();
		parameters.put("a", Double.class, a);
		parameters.put("b", Double.class, b);
		return parameters;
	}

	@Override
	public IMathAlgorithm getAlgorithm(Parameters parameters) {
		return new Expression(parameters);
	}
}