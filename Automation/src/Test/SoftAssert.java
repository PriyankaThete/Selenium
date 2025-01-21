package Test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SoftAssert {
	@Test
	public void testcase1() {
		int exp = 5+5;
		int act = 109;
		
		
		
		Assert.assertEquals(act, exp ," Strings are not equal ");
		System.out.println("Strings are equal");

	}		
	
	
   @Test	
   public void testcase2() {
		int a=5;
		int b=3+2;
		
		Assert.assertEquals(a, b ," Strings are not equal ");
		
		System.out.println("Strings are equal");
	}
}
