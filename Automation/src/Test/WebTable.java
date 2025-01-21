package Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\priya\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		 
	    //launching chrome
	    WebDriver driver = new ChromeDriver(); 
	    
	    driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
	    //use to open url
	    driver.get("https://money.rediff.com/gainers");
	    
	    //use to maximize window
		driver.manage().window().maximize();
		
		//fetching links from web table
		List<WebElement> company = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]/a"));
		System.out.println("Total companys :" +company.size());
		
		List<WebElement> currentprice = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[4]"));
		System.out.println("Total currentprice :" +currentprice.size());
		
		String CompanyName = "Technopack Polymers";
		
		for(int i =0; i<company.size(); i++)
		{
			if(company.get(i).getText().equalsIgnoreCase(CompanyName))
			{
				//System.out.println(company.get(i).getText());
				System.out.println(company.get(i).getText()+"=="+currentprice.get(i).getText());
				company.get(i).click();
				System.out.println(driver.getTitle());
				break;
			}
		}
	}

}
