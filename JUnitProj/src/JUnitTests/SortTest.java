package JUnitTests;

import static org.junit.Assert.*;

import org.junit.Test;

import JUnitClasses.Sort;

public class SortTest {

	@Test
	public void test() {
		Sort s1 = new Sort();
		int arr[]={20,8,6,4,12,3};
		int arr1[]={3,4,6,8,12,20};
		
		assertArrayEquals(arr1, s1.sort(arr));
	}

}
