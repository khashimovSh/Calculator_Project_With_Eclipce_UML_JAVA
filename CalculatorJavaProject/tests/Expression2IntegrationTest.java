import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class Expression2IntegrationTest {		
		
	@Test
	public final void testOutputForValidInput() {
		// given
		Parameters parameters = new Parameters();
		parameters.put("a", Double.class, 2.0);
		parameters.put("b", Double.class, 2.0);		
		Expression2 expression2 = new Expression2(parameters);
		// when
		expression2.run();
		// then
		assertThat(expression2.getStatus(), equalTo(0));
		assertThat(expression2.getResult(), closeTo(6.21, 0.01));
	}
	
	@Test
	public final void testOutputForInvalidInput() {
		// given
		Parameters parameters = new Parameters();
		parameters.put("a", Double.class, 1.0);
		parameters.put("b", Double.class, 2.0);		
		Expression2 expression2 = new Expression2(parameters);
		// when
		expression2.run();
		// then
		assertThat(expression2.getStatus(), equalTo(3));
		assertThat(expression2.getErrorMessage(),
				equalTo("log(a) = 0 results in division by 0"));	
	}	
}
