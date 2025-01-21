package Test;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class SkippingTestNG {
	//1st way
	//@Test
	public void a() {
		System.out.println("Test a");
	}
	
	//2nd way
	@Test(enabled = false)
	public void b() {
		System.out.println("Test b");
	}
	
	//3rd way 
	@Test
	public void c() {
		System.out.println("Test c");
		throw new SkipException("skipping Test c ");
		
	}
	
}
