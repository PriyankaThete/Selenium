package Test;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandle {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\priya\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		 
	    //launching chrome
	    WebDriver driver = new ChromeDriver(); 
	    
	    driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
	    //use to maximize window
		driver.manage().window().maximize();
		
	    //use to open url
	    driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
	    
	    
	    //javascript is used for clicking on new tab
	    JavascriptExecutor jse = (JavascriptExecutor) driver;
	    jse.executeScript("document.getElementById('newTabBtn').click()");
	    
	    //total number o open tab
	    Set<String> allWindowsId = driver.getWindowHandles();
	    System.out.println(allWindowsId);
	    //set return alphanumeric id 
	    Iterator<String> abc = allWindowsId.iterator();
	    String w1 = abc.next();//next elent from iterator
	    String w2 = abc.next();
	    
	    System.out.println("Parent winodow ID :" +w1);
	    System.out.println("Child winodow ID :" +w2);

	    driver.switchTo().window(w1);
	    System.out.println(driver.getTitle());
	    
	}

}
