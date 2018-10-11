package JUnitTests;
import static org.junit.Assert.*;

import org.junit.Test;

import JUnitClasses.Add;
public class AddTest {
	@Test
	public void test() {
		Add a1 = new Add();
		assertEquals(27, a1.add(12, 15));
	}

}
