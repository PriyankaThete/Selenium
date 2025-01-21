package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragNDrop {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\priya\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		 
	    //launching chrome
	    WebDriver driver = new ChromeDriver(); 
	    
	    driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
	    //use to maximize window
		driver.manage().window().maximize();
		
	    //use to open url
	    driver.get("https://jqueryui.com/droppable/");
	    
	    // 1st way
	    //switch to frame 
	    driver.switchTo().frame(0);
	    
	    //drag element 
	    WebElement Drag = driver.findElement(By.xpath("//div[@id='draggable']"));
	    
	    //drop element 
	    WebElement drop = driver.findElement(By.xpath("//div[@id='droppable']"));
	    
	    //drag n drop
	    Thread.sleep(2000);
	    Actions act = new Actions(driver);
	    act.dragAndDrop(Drag, drop).build().perform();
	    
	    //2nd way
	    driver.get("https://jqueryui.com/draggable/");
	    
	    driver.switchTo().frame(0);
	    
	    WebElement Drag1 = driver.findElement(By.xpath("//div[@id='draggable']"));
	    act.dragAndDropBy(Drag1, 100, 200).build().perform();

	}

}
