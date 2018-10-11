package JUnitTests;

import static org.junit.Assert.*;

import org.junit.Test;

import JUnitClasses.CommonElem;

public class CommonElemTest {

	@Test
	public void test() {
		CommonElem c = new CommonElem();
		int arr1[]={1,2,3,4,5};
		int arr2[]={1,2,4,6,9};
		int arr3[]={1,2,4,7};
		assertEquals("124", c.common(arr1, arr2, arr3));
	}

}
