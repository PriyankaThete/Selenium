package Test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class TestNG {
	@Test
	public void a() {
		System.out.println("Test");
	}
	
	@BeforeTest
	public void b() {
		System.out.println("Before Test");
	}
	
	@AfterTest
	public void c() {
		System.out.println("After Test");
	}
	
	@BeforeClass
	public void d() {
		System.out.println("Before Class");
	}
	
	@AfterSuite
	public void e() {
		System.out.println("After Suite");
	}
	
	@BeforeSuite
	public void f() {
		System.out.println("Before Suite");
	}
	
	@AfterClass
	public void g() {
		System.out.println("After Class");
	}
	
	@BeforeMethod
	public void h() {
		System.out.println("Before Method");
	}
	
	@AfterMethod
	public void i() {
		System.out.println("After Method");
	}
	
	
	
}
