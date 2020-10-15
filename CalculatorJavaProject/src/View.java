/**
 * 
 */

import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.*;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author Shakhzod
 */
@SuppressWarnings("serial")
public class View extends JFrame implements IView {
	private final int WINDOW_WIDTH = 400;
	private final int WINDOW_HEIGHT = 250;

	private JLabel lblTitle, lblA, lblB, lblC;
	private JTextField txtA, txtB;
	private JButton btnMultiply, btnDivide, btnLogarithm, btnExpression,
			btnExpression2, btnLogarithmCos, btnCos;
	private JPanel pnlParam, pnlButton, pnlExpression, pnlExpression2,
			pnlLogarithmCos, pnlCos;

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 */
	public View() {
		// begin-user-code
		setTitle("Calculator");
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		lblTitle = new JLabel("Calculator performs mathematical operations",
				JLabel.CENTER);
		lblA = new JLabel("a = ", JLabel.RIGHT);
		lblB = new JLabel("b = ", JLabel.RIGHT);
		lblC = new JLabel("", JLabel.CENTER);
		txtA = new JTextField(10);
		txtB = new JTextField(10);
		btnMultiply = new JButton("Multiply");
		btnDivide = new JButton("Divide");
		btnLogarithm = new JButton("log(a)");
		btnExpression = new JButton("(a * b) + (a / b) - log(a)");
		btnExpression2 = new JButton("[(a * b) + (a / b) - log(a)] / log(a)");
		btnLogarithmCos = new JButton("log(a)-cos(a)");
		btnCos = new JButton("cos(a)");
		btnDivide.setPreferredSize(btnMultiply.getPreferredSize());
		btnLogarithm.setPreferredSize(btnMultiply.getPreferredSize());
		pnlParam = new JPanel();
		pnlButton = new JPanel();
		pnlExpression = new JPanel();
		pnlExpression2 = new JPanel();
		pnlLogarithmCos = new JPanel();
		pnlCos = new JPanel();

		setLayout(new GridLayout(0, 1));
		// title
		add(lblTitle);
		// a, b, c
		pnlParam.add(lblA);
		pnlParam.add(txtA);
		pnlParam.add(lblB);
		pnlParam.add(txtB);
		add(pnlParam);
		add(lblC);
		// buttons
		pnlButton.add(btnMultiply);
		pnlButton.add(btnDivide);
		pnlButton.add(btnLogarithm);
		add(pnlButton);
		pnlExpression.add(btnExpression);
		add(pnlExpression);
		pnlExpression2.add(btnExpression2);
		add(pnlExpression2);
		pnlLogarithmCos.add(btnLogarithmCos);
		add(pnlLogarithmCos);
		pnlCos.add(btnCos);
		add(pnlCos);

		setResizable(false);
		setLocationRelativeTo(null);
		getRootPane().setDefaultButton(btnMultiply);
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 */
	public static void main(String[] args) {
		// begin-user-code
		View view = new View();
		Controller controller = new Controller();
		controller.registerListeners(view);
		view.setVisible(true);
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 */
	@Override
	public String getTextA() {
		// begin-user-code
		return txtA.getText();
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 */
	@Override
	public String getTextB() {
		// begin-user-code
		return txtB.getText();
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 */
	@Override
	public void setTextC(String text) {
		// begin-user-code
		lblC.setText(text);
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 */
	@Override
	public void addMultiplyListener(ActionListener listener) {
		// begin-user-code
		btnMultiply.addActionListener(listener);
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 */
	@Override
	public void addDivideListener(ActionListener listener) {
		// begin-user-code
		btnDivide.addActionListener(listener);
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 */
	@Override
	public void addLogarithmListener(ActionListener listener) {
		// begin-user-code
		btnLogarithm.addActionListener(listener);
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 */
	@Override
	public void addExpressionListener(ActionListener listener) {
		// begin-user-code
		btnExpression.addActionListener(listener);
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 */
	@Override
	public void addExpression2Listener(ActionListener listener) {
		// begin-user-code
		btnExpression2.addActionListener(listener);
		// end-user-code
	}


	public void addLogarithmCosListener(ActionListener listener) {
		btnLogarithmCos.addActionListener(listener);
	}
	public void addCosListener(ActionListener listener) {
		btnCos.addActionListener(listener);
	}
}