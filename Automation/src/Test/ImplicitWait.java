package Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\priya\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
	    //launching chrome
	    WebDriver driver = new ChromeDriver(); 
		
	    //use to open url
	    driver.get("https://www.google.com/");
	    
	    //use to maximize window
		driver.manage().window().maximize();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("iphone");
		
		//handling Auto suggestion
		List<WebElement> suggestion = driver.findElements(By.xpath("//ul[@role='listbox']/li"));
		String expectedoutput ="iPhone 16";
		for(int i = 0; i<suggestion.size();i++)
		{
			if(suggestion.get(i).getText().equalsIgnoreCase(expectedoutput))
			{
				suggestion.get(i).click();			}
		}
		

	}

}
