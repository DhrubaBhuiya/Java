package JUnitTests;

import static org.junit.Assert.*;

import org.junit.Test;

import JUnitClasses.Pattern1;

public class Pattern1Test {

	@Test
	public void test() {
		Pattern1 p = new Pattern1();
		String str="    1 \n  1 2 1 \n1 2 3 2 1 \n";
		assertEquals(str, p.print(3));
	}

}
