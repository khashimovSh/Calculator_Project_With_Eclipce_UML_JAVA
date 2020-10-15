import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

import org.junit.Test;


public class MultiplicationTest {

	@Test
	public final void testOutputForValidInput() {
		// given
		Parameters parameters = new Parameters();
		parameters.put("a", Double.class, 4.0);
		parameters.put("b", Double.class, 2.0);
		Multiplication multiplication = new Multiplication(parameters);
		// when
		multiplication.run();
		// then
		assertThat(multiplication.getStatus(), equalTo(0));
		assertThat(multiplication.getResult(), closeTo(8.0, 0.01));
	}	
}
