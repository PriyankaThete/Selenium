package Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	public static void main(String[] args) throws Exception {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\priya\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
	    // wait for particular duration
	    Thread.sleep(2000);
	    
	    //launching chrome
	    WebDriver driver = new ChromeDriver(); 
		
	    //use to open url
	    driver.get("https://www.facebook.com/");
	    
	    //use to maximize window
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//a[text()='Create new account'])")).click();
		
		//normal method
		List<WebElement> dropdown = driver.findElements(By.xpath("//select[@id='month']/option"));
		System.out.println("Total number of months : " +dropdown.size());
		dropdown.get(5).click();
		Thread.sleep(2000);
		
		//create object 
		WebElement dp = driver.findElement(By.xpath("//select[@id='month']"));
		Select month = new Select(dp);
		month.selectByVisibleText("Apr");
		month.selectByValue("2");
		month.selectByIndex(0);
		
		//industrial way
		List<WebElement> dropdown1 =month.getOptions();
		for(int i=0; i<dropdown1.size(); i++);
		{
			if(dropdown1.get(0).getText().equalsIgnoreCase("Jan"));
			dropdown1.get(0).click();
		}
		
		//4 way
		WebElement dp1 =driver.findElement(By.xpath("//select[@id='month']"));
		dp1.sendKeys("May");
		
		//5 way
		driver.findElement(By.id("month")).sendKeys("Jan");
		
		//6 way check if dropdown support multiselection
		System.out.println(month.isMultiple());
		
		//7 way deselect 
		month.deselectAll();
		month.deselectByIndex(0);
	}

}

