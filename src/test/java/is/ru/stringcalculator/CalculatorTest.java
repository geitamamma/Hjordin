package is.ru.stringcalculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest{

	@Test
	public void testEmptyString(){
		assertEquals(0, Calculator.add(""));
	}

	@Test
	public void testOneNumber(){
		assertEquals(1, Calculator.add("1"));
		assertEquals(4, Calculator.add("4"));
	}

	@Test
	public void testTwoNumbers(){
		assertEquals(3, Calculator.add("1,2"));
		assertEquals(10, Calculator.add("5,5"));
	}

	@Test
	public void testMultipleNumbers(){
		assertEquals(15, Calculator.add("2,2,7,4"));
		assertEquals(5, Calculator.add("1,1,1,1,1"));
	}
}