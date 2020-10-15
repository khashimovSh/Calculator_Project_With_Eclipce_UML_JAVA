import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

import org.junit.Test;


public class ExpressionIntegrationTest {

	@Test
	public final void testOutputForValidInput() {
		// given
		Parameters parameters = new Parameters();
		parameters.put("a", Double.class, 2.0);
		parameters.put("b", Double.class, 2.0);		
		Expression expression = new Expression(parameters);
		// when
		expression.run();
		// then
		assertThat(expression.getStatus(), equalTo(0));
		assertThat(expression.getResult(), closeTo(4.31, 0.01));
	}
	
	@Test
	public final void testOutputForInvalidInput() {
		// given
		Parameters parameters = new Parameters();
		parameters.put("a", Double.class, 2.0);
		parameters.put("b", Double.class, 0.0);		
		Expression expression = new Expression(parameters);
		// when
		expression.run();
		// then
		assertThat(expression.getStatus(), equalTo(1));
		assertThat(expression.getErrorMessage(), equalTo("Division by zero"));	
	}	
}
