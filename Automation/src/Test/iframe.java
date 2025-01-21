package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\priya\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		 
	    //launching chrome
	    WebDriver driver = new ChromeDriver(); 
	    
	    driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
	    //use to maximize window
		driver.manage().window().maximize();
		
	    //use to open url
	    driver.get("https://paytm.com/");
	    
	    driver.findElement(By.xpath("//span[text()='Sign In']")).click();
	    Thread.sleep(2000);
	    
	    //switch to frame using web element 
	    int allFrames = driver.findElements(By.tagName("iFrame")).size();
	    System.out.println("total frames :" + allFrames);
	    
	    for(int i=0 ; i <allFrames ; i++)
	    {
	    	driver.switchTo().frame(i);
	    	driver.switchTo().frame(i);

	    	String exptext = "Open Paytm App";
	    	String  abc = driver.findElement(By.xpath("//span[text()='Open Paytm App']")).getText();
	    	
	    	if(abc.equalsIgnoreCase(exptext)) {
	    		System.out.println("element found");
	    		break;
	    	}else {
	    		System.out.println("element not found ");
	    	}
	    	
	    }
}
}
