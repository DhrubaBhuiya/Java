package JUnitTests;

import static org.junit.Assert.*;

import org.junit.Test;

import JUnitClasses.Student;

public class StudentTest {

	@Test
	public void test() {
		Student s1 = new Student();
		int arr[] = {90,45,87,80,93,85,80,89,99,45,87,88,90,40,87,80,91,53,88,89};
		assertEquals(12, s1.check(arr));
	}

}
