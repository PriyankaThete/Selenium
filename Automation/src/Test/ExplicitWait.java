package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\priya\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		 
	    //launching chrome
	    WebDriver driver = new ChromeDriver(); 
	    
	    //use to open url
	    driver.get("https://www.facebook.com/");
	    
	    //use to maximize window
		driver.manage().window().maximize();
		
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    driver.findElement(By.id("email")).sendKeys("prnk@gmail.com");
	    
	    //explicit wait
	    WebDriverWait wt = new WebDriverWait(driver,30);
	    wt.until(ExpectedConditions.visibilityOfElementLocated(By.id("pass"))).sendKeys("abcd");

	}

}
