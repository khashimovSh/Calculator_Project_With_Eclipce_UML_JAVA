import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

import org.junit.Test;


public class DivisionTest {

	@Test
	public final void testOutputForValidInput() {
		// given
		Parameters parameters = new Parameters();
		parameters.put("a", Double.class, 4.0);
		parameters.put("b", Double.class, 2.0);
		Division division = new Division(parameters);
		// when
		division.run();
		// then
		assertThat(division.getStatus(), equalTo(0));
		assertThat(division.getResult(), closeTo(2.0, 0.01));
	}
	
	@Test
	public final void testOutputForInvalidInput() {
		// given
		Parameters parameters = new Parameters();
		parameters.put("a", Double.class, 4.0);
		parameters.put("b", Double.class, 0.0);
		Division division = new Division(parameters);
		// when
		division.run();
		// then
		assertThat(division.getStatus(), equalTo(1));
		assertThat(division.getErrorMessage(), equalTo("Division by zero"));
	}
}
