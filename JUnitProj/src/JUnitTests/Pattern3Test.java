package JUnitTests;

import static org.junit.Assert.*;

import org.junit.Test;

import JUnitClasses.Pattern3;

public class Pattern3Test {

	@Test
	public void test() {
		Pattern3 p = new Pattern3();
		String str="****\n***\n**\n*\n";
		assertEquals(str, p.print(4));
	}

}
