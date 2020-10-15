import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import static org.hamcrest.Matchers.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class Expression2Test {		
	@Mock
	private Expression expressionMock;
	
	@Mock
	private Logarithm logarithmMock;

	@Test
	public final void testOutputForValidInput() {
		// given a = 2, b = 2
		when(expressionMock.getStatus()).thenReturn(0);
		when(expressionMock.getResult()).thenReturn(4.30685);
		when(logarithmMock.getStatus()).thenReturn(0);
		when(logarithmMock.getResult()).thenReturn(0.69315);	
		Expression2 expression2 = new Expression2(expressionMock, logarithmMock);
		// when
		expression2.run();
		// then
		assertThat(expression2.getStatus(), equalTo(0));
		assertThat(expression2.getResult(), closeTo(6.21, 0.01));
	}

	@Test
	public final void testOutputForInvalidInput() {
		// given a = 1, b = 2
		when(expressionMock.getStatus()).thenReturn(0);
		when(expressionMock.getResult()).thenReturn(2.5);
		when(logarithmMock.getStatus()).thenReturn(0);
		when(logarithmMock.getResult()).thenReturn(0.0);	
		Expression2 expression2 = new Expression2(expressionMock, logarithmMock);		
		// when
		expression2.run();
		// then
		assertThat(expression2.getStatus(), equalTo(3));
		assertThat(expression2.getErrorMessage(),
				equalTo("log(a) = 0 results in division by 0"));
	}
}
