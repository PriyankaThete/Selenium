package Test;

import org.testng.annotations.Test;

public class PriorotyTestNG {
	@Test(priority = -10)
	public void a() {
		System.out.println("Test a");
	}
	@Test(priority = 0)
	public void b() {
		System.out.println("Test b");
	}
	
	@Test(priority = 2)
	public void c() {
		System.out.println("Test c");
	}
	
	@Test
	public void d() {
		System.out.println("Test d");
	}
}
