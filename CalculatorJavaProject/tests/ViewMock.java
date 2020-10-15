import java.awt.event.ActionListener;

public class ViewMock implements IView {
	private String textA;
	private String textB;
	private String textC;
	private ActionListener multiplyListener;
	private ActionListener divideListener;
	private ActionListener logarithmListener;
	private ActionListener expressionListener;
	private ActionListener expression2Listener;
	private ActionListener logarithmCosListener;
	private ActionListener cosListener;

	@Override
	public String getTextA() {
		return textA;
	}

	@Override
	public String getTextB() {
		return textB;
	}

	@Override	
	public void setTextC(String text) {
		this.textC = text;
	}

	@Override	
	public void addMultiplyListener(ActionListener listener) {
		this.multiplyListener = listener;
	}

	@Override	
	public void addDivideListener(ActionListener listener) {
		this.divideListener = listener;
	}

	@Override	
	public void addLogarithmListener(ActionListener listener) {
		this.logarithmListener = listener;
	}

	@Override	
	public void addExpressionListener(ActionListener listener) {
		this.expressionListener = listener;
	}

	@Override	
	public void addExpression2Listener(ActionListener listener) {
		this.expression2Listener = listener;
	}
	@Override
	public void addLogarithmCosListener(ActionListener listener){
		this.logarithmCosListener = listener;
	}
	@Override
	public void addCosListener(ActionListener listener){
		this.cosListener = listener;
	}
		
	public void setTextA(String text) {
		this.textA = text;
	}

	public void setTextB(String text) {
		this.textB = text;
	}
		
	public String getTextC() {
		return textC;
	}
		
	public void clickMultiply() {
		if (multiplyListener == null)
			throw new RuntimeException("Unregistered multiply listener");
		multiplyListener.actionPerformed(null);
	}	
	
	public void clickDivide() {
		if (divideListener == null)
			throw new RuntimeException("Unregistered divide listener");
		divideListener.actionPerformed(null);
	}
	
	public void clickCalculateLogarirthm() {
		if (logarithmListener == null)
			throw new RuntimeException("Unregistered logarithm listener");
		logarithmListener.actionPerformed(null);
	}
	
	public void clickCalculateExpression() {
		if (expressionListener == null)
			throw new RuntimeException("Unregistered expression listener");
		expressionListener.actionPerformed(null);
	}
	
	public void clickCalculateExpression2() {
		if (expression2Listener == null)
			throw new RuntimeException("Unregistered expression2 listener");
		expression2Listener.actionPerformed(null);
	}
	public void clickCalculateLogarithmCos(){
		if (logarithmCosListener == null)
			throw new RuntimeException("Unregistered expression listener");
		logarithmCosListener.actionPerformed(null);
	}
	public void clickCalculateCos(){
		if (cosListener == null)
			throw new RuntimeException("Unregistered expression listener");
		cosListener.actionPerformed(null);
	}
}
