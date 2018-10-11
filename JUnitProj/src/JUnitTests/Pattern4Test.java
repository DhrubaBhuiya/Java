package JUnitTests;

import static org.junit.Assert.*;

import org.junit.Test;

import JUnitClasses.Pattern4;

public class Pattern4Test {

	@Test
	public void test() {
		Pattern4 p = new Pattern4();
		String str="A\nBB\nCCC\nDDDD\n";
		assertEquals(str, p.print(4));
	}

}
