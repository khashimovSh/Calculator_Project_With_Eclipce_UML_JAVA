import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import static org.hamcrest.Matchers.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class ExpressionTest {		
	@Mock
	private Multiplication multiplicationMock;
	
	@Mock
	private Division divisionMock;

	@Mock
	private Logarithm logarithmMock;

	@Test
	public final void testOutputForValidInput() {
		// given
		when(multiplicationMock.getStatus()).thenReturn(0);
		when(multiplicationMock.getResult()).thenReturn(4.0);
		when(divisionMock.getStatus()).thenReturn(0);
		when(divisionMock.getResult()).thenReturn(1.0);	
		when(logarithmMock.getStatus()).thenReturn(0);
		when(logarithmMock.getResult()).thenReturn(0.69315);
		Expression expression = new Expression(
				multiplicationMock, divisionMock, logarithmMock);
		// when
		expression.run();
		// then
		assertThat(expression.getStatus(), equalTo(0));
		assertThat(expression.getResult(), closeTo(4.31, 0.01));
	}

	@Test
	public final void testOutputForInvalidInput() {
		// given
		when(multiplicationMock.getStatus()).thenReturn(0);
		when(multiplicationMock.getResult()).thenReturn(0.0);
		when(divisionMock.getStatus()).thenReturn(1);
		when(divisionMock.getErrorMessage()).thenReturn("Division by zero");	
		when(logarithmMock.getStatus()).thenReturn(0);
		when(logarithmMock.getResult()).thenReturn(0.69315);	
		Expression expression = new Expression(
				multiplicationMock, divisionMock, logarithmMock);
		// when
		expression.run();
		// then
		assertThat(expression.getStatus(), equalTo(1));
		assertThat(expression.getErrorMessage(), equalTo("Division by zero"));
	}	
}
