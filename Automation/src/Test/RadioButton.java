package Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) throws Exception {
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
		
		driver.findElement(By.xpath("(//a[text()='Create new account'])")).click();
		
		//Radiobutton 
		//1st way
		driver.findElement(By.xpath("//input[@value=1]")).click();
	    Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@value=2]")).click();
	    Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@value=-1]")).click();

		//2nd way by using list
		List<WebElement> radio = driver.findElements(By.xpath("//input[@type='radio']"));
		System.out.println("total radio buttons : "+ radio.size());
		radio.get(0).click();
		
		//verify button is selected or not 
		System.out.println(radio.get(0).isSelected());
		
		//verify button is enable or not
		System.out.println(radio.get(1).isEnabled());
		
		//verify button is displayed or not
		System.out.println(radio.get(2).isDisplayed());

		//industrial way
		List<WebElement> radios = driver.findElements(By.xpath("//label[@class='_58mt']"));
		System.out.println("total radio buttons : "+ radios.size());
		String expectedResult = "Female";
		for(int i=0;i<radios.size();i++)
		{
			if(radios.get(i).getText().equalsIgnoreCase(expectedResult))
			{
				radios.get(i).click();
				System.out.println(expectedResult + "clicked");
			}
		}
		
		//checkbox
		
		driver.get("https://app.endtest.io/guides/docs/how-to-test-checkboxes/");
		
		List<WebElement> checkbox = driver.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println("Total checkboxes :" + checkbox.size() );
		checkbox.get(0).click();
		checkbox.get(2).click();
		

	}

}
