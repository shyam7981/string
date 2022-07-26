package string;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;


public class valid_brackets_tests 
{
@Test
	public void areBracketsBalanced() {
	
		Valid_Brackets vb=mock(Valid_Brackets.class);
		
		when(vb.areBracketsBalanced("({})")).thenReturn(true);
		
		assertTrue(vb.areBracketsBalanced("({})"));
	}
	
	@Test
	public void isValidOrNot2() {
	
		Valid_Brackets vb=mock(Valid_Brackets.class);
		
		when(vb.areBracketsBalanced("()[]{)}")).thenReturn(false);
		
		assertFalse(vb.areBracketsBalanced("()[]{)}"));
	}
	
}