import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;

import org.junit.Test;

public class LogarithmTest {
	
	@Test
	public final void testOutputForValidInput() {
		// given
		Parameters parameters = new Parameters();
		parameters.put("a", Double.class, 2.0);
		Logarithm logarithm = new Logarithm(parameters);
		// when
		logarithm.run();
		// then
		assertThat(logarithm.getStatus(), equalTo(0));
		assertThat(logarithm.getResult(), closeTo(0.69, 0.01));
	}
	
	@Test
	public final void testOutputForInvalidInput() {
		// given
		Parameters parameters = new Parameters();
		parameters.put("a", Double.class, -2.0);
		Logarithm log = new Logarithm(parameters);
		// when
		log.run();
		// then
		assertThat(log.getStatus(), equalTo(2));
		assertThat(log.getErrorMessage(), 
				equalTo("Non-positive argument for logarithm"));
	}
}
