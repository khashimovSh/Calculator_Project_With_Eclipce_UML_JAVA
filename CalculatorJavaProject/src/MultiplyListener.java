public class MultiplyListener extends Listener {

	public MultiplyListener(IView view) {
		super(view);
	}

	@Override
	public Parameters getParameters(IView view) {
		Parameters parameters = new Parameters();
		double a = Lib.convertTextToNumber(view.getTextA());
		parameters.put("a", Double.class, a);
		double b = Lib.convertTextToNumber(view.getTextB());
		parameters.put("b", Double.class, b);
		return parameters;
	}

	@Override
	public IMathAlgorithm getAlgorithm(Parameters parameters) {
		return new Multiplication(parameters);
	}
}