package Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTestNG {
	WebDriver driver;
	@BeforeClass
	public void a() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\priya\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	 
    //launching chrome
    driver = new ChromeDriver(); 
    
    //use to open url
    driver.get("https://www.facebook.com/");
    
    //use to maximize window
	driver.manage().window().maximize();
	
    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	@DataProvider
	public Object [][] createData() throws Exception{
		
		File f3 = new File("C:\\Users\\priya\\eclipse-workspace\\Automation\\repository\\testdata.properties");
		FileInputStream fis3 = new FileInputStream(f3);
		Properties pro3 = new Properties();
		pro3.load(fis3);
		
		Object arr[][]=new Object[2][2];
		arr[0][0]=pro3.getProperty("data1");
		arr[0][1]=pro3.getProperty("data2");
		arr[1][0]="testdata1";
		arr[1][1]="testdata2";

		return arr;
		
	}
	
	@Test(dataProvider = "createData")
	public void enterdata(String userName,String password) throws Exception {

		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("pass")).clear();

		Thread.sleep(2000);
		
		driver.findElement(By.id("email")).sendKeys(userName);
		driver.findElement(By.id("pass")).sendKeys(password);
		
		Thread.sleep(2000);
		

	}
	
	
	
}
