package JUnitTests;

import static org.junit.Assert.*;

import org.junit.Test;

import JUnitClasses.Pattern5;

public class Pattern5Test {

	@Test
	public void test() {
		Pattern5 p = new Pattern5();
		String str="   *\n  **\n ***\n****\n";
		assertEquals(str, p.print(4));
	}

}
