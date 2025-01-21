package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TakeSS2 {
//create object of first class
	TakeSS1 ts1 = new TakeSS1();
	
	@Test
	public void FacebookLogin() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\priya\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	    ts1.driver = new ChromeDriver(); 
	    ts1.driver.get("https://www.facebook.com/");
		ts1.driver.manage().window().maximize();
	    ts1.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    ts1.driver.findElement(By.id("email")).sendKeys("qwertyuio");
	    //put wrong element
	    ts1.driver.findElement(By.id("passs")).sendKeys("zxcvbnm");

	}
	
	@AfterMethod
	public void TakesScreenshot(ITestResult result2) throws Exception {
		ts1.capturess(result2);
		
	}
}
