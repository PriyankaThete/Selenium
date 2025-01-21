package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\priya\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
	    // wait for particular duration
	    Thread.sleep(2000);
	    
	    //launching chrome
	    WebDriver driver = new ChromeDriver(); 
		
	    //use to open url
	    driver.get("https://www.facebook.com/");
	    
	    //use to maximize window
		driver.manage().window().maximize();
		
		//delete all cookies
		driver.manage().deleteAllCookies();
		
		//open url using navigate method
		driver.navigate().to("https://www.google.com/");
		
		//refresh page using navigate method
		driver.navigate().refresh();
		
		//get back to previous page using navigate 
		driver.navigate().back();
		
		//go forward to next page using navigate
		driver.navigate().forward();
		
		//fetch the url of webpage
		System.out.println(driver.getCurrentUrl());
		
		//fetch title of web page
		System.out.println(driver.getTitle());
		
		//close the browser
		driver.close();
	}

}
