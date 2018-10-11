package JUnitTests;

import static org.junit.Assert.*;

import org.junit.Test;

import JUnitClasses.Swap1;

public class Swap1Test {

	@Test
	public void test() {
		Swap1 s = new Swap1();
		int arr[] = {12,18};
		assertArrayEquals(arr, s.swap(18, 12));
	}

}
