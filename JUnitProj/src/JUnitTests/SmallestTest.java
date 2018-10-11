package JUnitTests;

import static org.junit.Assert.*;

import org.junit.Test;

import JUnitClasses.Smallest;

public class SmallestTest {

	@Test
	public void test() {
		Smallest sm = new Smallest();
		assertEquals(5, sm.min(12, 6, 5));
	}

}
