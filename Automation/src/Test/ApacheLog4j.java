package Test;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ApacheLog4j {

	public static void main(String[] args) {
		// create log instance first 
		Logger logger = Logger.getLogger("ApacheLog4j");
		
		//configure log4j properties file
		PropertyConfigurator.configure("C:\\Users\\priya\\.m2\\repository\\log4j\\log4j\\1.2.17\\log4j-1.2.17.jar");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\priya\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		 
	    //launching chrome
	    WebDriver driver = new ChromeDriver(); 
	    
	    //use to open url
	    driver.get("https://www.facebook.com/");
	    logger.info("page is loaded");
	    //use to maximize window
		driver.manage().window().maximize();
		logger.info("maximized window");
		
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

}
