package JUnitTests;

import static org.junit.Assert.*;

import org.junit.Test;

import JUnitClasses.Pattern2;

public class Pattern2Test {

	@Test
	public void test() {
		Pattern2 p = new Pattern2();
		String str="1\n12\n123\n1234\n";
		assertEquals(str, p.print(4));
	}

}
