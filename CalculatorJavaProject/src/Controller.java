/**
 * 
 */

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author Shakhzod
 */
public class Controller {

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 */
	public void registerListeners(IView view) {
		// begin-user-code
		view.addMultiplyListener(new MultiplyListener(view));
		view.addDivideListener(new DivideListener(view));
		view.addLogarithmListener(new LogarithmListener(view));
		view.addExpressionListener(new ExpressionListener(view));
		view.addExpression2Listener(new Expression2Listener(view));
		view.addLogarithmCosListener(new LogarithmCosListener(view));
		view.addCosListener(new CosListener(view));
		// end-user-code
	}
}