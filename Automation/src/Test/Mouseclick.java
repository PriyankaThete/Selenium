package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouseclick {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\priya\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		 
	    //launching chrome
	    WebDriver driver = new ChromeDriver(); 
	    
	    driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
	    //use to maximize window
		driver.manage().window().maximize();
		
	    //use to open url
	    driver.get("https://www.flipkart.com/plus");
	    
	    WebElement electronics = driver.findElement(By.xpath("//*[text()='Electronics']"));
	    
	    //use action class for mouse simulation
	    Actions act = new Actions(driver);
	    act.moveToElement(electronics).build().perform();
	    //driver.findElement(By.xpath("//*[text()='Mobile']")).click();
	    driver.findElement(By.xpath("//*[text()='Mi']")).click();

	    //keyboard simulation
	    WebElement men = driver.findElement(By.xpath("//*[text()='Men']"));
	    act.sendKeys(men, Keys.ENTER).build().perform();
	    
	    //right click on web page
	    act.contextClick(electronics).build().perform();
	}

}
