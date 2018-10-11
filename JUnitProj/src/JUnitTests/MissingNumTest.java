package JUnitTests;

import static org.junit.Assert.*;

import org.junit.Test;

import JUnitClasses.MissingNum;

public class MissingNumTest {

	@Test
	public void test() {
		int[]arr={1,8,4,6,5,3,2};
		MissingNum m = new MissingNum();
		assertEquals(7, m.miss(arr));
	}

}
