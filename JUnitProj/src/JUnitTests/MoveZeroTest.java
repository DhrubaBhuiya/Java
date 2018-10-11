package JUnitTests;
import static org.junit.Assert.*;

import org.junit.Test;

import JUnitClasses.MoveZero;
public class MoveZeroTest {

	@Test
	public void test() {
		MoveZero m1 = new MoveZero();
		int arr[] = {5,8,6,4,1,0,0};
		int arr1[] = {5,8,0,6,0,4,1};
		assertArrayEquals(arr, m1.move(arr1));
	}

}
