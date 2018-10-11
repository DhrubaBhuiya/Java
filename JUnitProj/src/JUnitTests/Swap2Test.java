package JUnitTests;

import static org.junit.Assert.*;

import org.junit.Test;

import JUnitClasses.Swap2;

public class Swap2Test {

	@Test
	public void test() {
		Swap2 s = new Swap2();
		int arr[] = {12,18};
		assertArrayEquals(arr, s.swap(18, 12));
	}

}
