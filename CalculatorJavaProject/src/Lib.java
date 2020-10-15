/**
 * 
 */

import java.text.DecimalFormat;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author Shakhzod
 */
public class Lib {
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 */
	public static double convertTextToNumber(String text) {
		// begin-user-code
		return Double.parseDouble(text);
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 */
	public static String convertNumberToText(double number) {
		// begin-user-code
		DecimalFormat decimalFormat = new DecimalFormat("0.00");
		return decimalFormat.format(number);
		// end-user-code
	}
}