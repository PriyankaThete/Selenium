package Test;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.URL;

public class SeleniumGrid {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		 DesiredCapabilities capabilities = new DesiredCapabilities();
	        capabilities.setBrowserName("chrome");
	        capabilities.setPlatform(Platform.WINDOWS);

	        // Hub URL
	        String hubURL = "http://localhost:4444/wd/hub";
	        
	        // Remote WebDriver
	        RemoteWebDriver driver = new RemoteWebDriver(new URL(hubURL), capabilities);
	        
	        // Test Execution
	        driver.get("https://www.example.com");
	        System.out.println("Title: " + driver.getTitle());
	        
	        // Close Browser
	        driver.quit();
	}

}
