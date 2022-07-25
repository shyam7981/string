package string;





import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;


public class valid_brackets_tests {

}

	@Test
	public void isValidOrNot() {
	
		ValidParanthesis vp=mock(ValidParanthesis.class);
		
		when(vp.isValid("({})")).thenReturn(true);
		
		assertTrue(vp.isValid("({})"));
	}
	
	@Test
	public void isValidOrNot2() {
	
		ValidParanthesis vp=mock(ValidParanthesis.class);
		
		when(vp.isValid("()[]{)}")).thenReturn(false);
		
		assertFalse(vp.isValid("()[]{)}"));
	}
	
}