import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;

import org.junit.Before;
import org.junit.Test;

public class DivisionApplicationIntegrationTest {
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
		viewMock.clickDivide();
		// then
		assertThat(viewMock.getTextC(), equalTo("c = 2.00"));
	}
	
	@Test	
	public final void testOutputForInvalidInput() {
		// given
		viewMock.setTextA("4");
		viewMock.setTextB("0");
		// when
		viewMock.clickDivide();
		// then
		assertThat(viewMock.getTextC(), equalTo("Division by zero"));
	}
}
