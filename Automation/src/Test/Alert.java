package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\priya\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		 
	    //launching chrome
	    WebDriver driver = new ChromeDriver(); 
	    
	    driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
	    //use to maximize window
		driver.manage().window().maximize();
		
	    //use to open url
	    driver.get("https://demoqa.com/alerts");
	    
	    
	    //javascript is used for clicking on new tab
	    JavascriptExecutor jse = (JavascriptExecutor) driver;
	    jse.executeScript("document.getElementById('confirmButton').click()");
	    
	    //for selecting ok
	    driver.switchTo().alert().accept();
	    
	    //forseecting cancel
	    driver.switchTo().alert().dismiss();
	}

}
