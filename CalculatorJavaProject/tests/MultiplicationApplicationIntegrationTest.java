import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;

import org.junit.Before;
import org.junit.Test;

public class MultiplicationApplicationIntegrationTest {
	private ViewMock viewMock;
	
	@Before
	public void setUp() {
		viewMock = new ViewMock();
		Controller controller = new Controller();
		controller.registerListeners(viewMock);
	}

	@Test
	public final void testOutputForValidInput() {
		// given
		viewMock.setTextA("4");
		viewMock.setTextB("2");
		// when
		viewMock.clickMultiply();
		// then
		assertThat(viewMock.getTextC(), equalTo("c = 8.00"));
	}
}
