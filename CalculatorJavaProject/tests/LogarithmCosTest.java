import static org.hamcrest.Matchers.closeTo;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class LogarithmCosTest {
	@Test
	public final void testOutputForValidInput() {
		// given
		Parameters parameters = new Parameters();
		parameters.put("a", Double.class, 2.0);
		LogarithmCos logarithmCos = new LogarithmCos(parameters);
		// when
		logarithmCos.run();
		// then
		assertThat(logarithmCos.getStatus(), equalTo(0));
		assertThat(logarithmCos.getResult(), closeTo(-0.31, 0.01));
	}
	@Test
	public final void testOutputForInvalidInput() {
		// given
		Parameters parameters = new Parameters();
		parameters.put("a", Double.class, -2.0);
		LogarithmCos logCos = new LogarithmCos(parameters);
		// when
		logCos.run();
		// then
		assertThat(logCos.getStatus(), equalTo(2));
		assertThat(logCos.getErrorMessage(), 
				equalTo("Non-positive argument for logarithm"));
	}
	

}
