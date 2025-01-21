package Test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class dependantTestNG {
	@Test
	public void a() {
		Assert.assertTrue(3<6);
		System.out.println("Test a");
	}
	
	@Test
	public void b() {
		Assert.assertTrue(3>6);
		System.out.println("Test b");
	}
	
	@Test(dependsOnMethods = {"a","b"})
	public void c() {
		System.out.println("Test c");
	}
	
}
