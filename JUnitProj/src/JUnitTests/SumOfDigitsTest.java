package JUnitTests;

import static org.junit.Assert.*;

import org.junit.Test;

import JUnitClasses.SumOfDigits;

public class SumOfDigitsTest {

	@Test
	public void test() {
		SumOfDigits s = new SumOfDigits();
		assertEquals(6, s.sum(123));
	}

}
