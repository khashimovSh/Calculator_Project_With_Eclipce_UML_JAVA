import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;

import org.junit.Test;

public class CosTest {
	@Test
	public final void testOutputForValidInput() {
		// given
		Parameters parameters = new Parameters();
		parameters.put("a", Double.class, 2.0);
		Cos cos = new Cos(parameters);
		// when
		cos.run();
		// then
		assertThat(cos.getStatus(), equalTo(0));
		assertThat(cos.getResult(), closeTo(1.00, 0.01));
	}
	

}
