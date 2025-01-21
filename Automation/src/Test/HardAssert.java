package Test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert {

	@Test
	public void testcase1() {
		String exp = "abc";
		String act = "ab";
		
		Assert.assertEquals(act, exp ," Strings are not equal ");
		
		System.out.println("Strings are equal");
	}
}
