package JUnitTests;

import static org.junit.Assert.*;

import org.junit.Test;

import JUnitClasses.LargestElem;

public class LargestElemTest {

	@Test
	public void test() {
		LargestElem l1 = new LargestElem();
		int arr[] = {15,12,96,6,5,45};
		int arr1[] = {96,45,15};
		assertArrayEquals(arr1, l1.largest(arr));
	}

}
