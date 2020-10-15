public class LogarithmListener extends Listener {

	public LogarithmListener(IView view) {
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
		return new Logarithm(parameters);
	}
}