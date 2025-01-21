package Test;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class readProFile {

	public static void main(String[] args) throws Exception {
		//set location of properties file
		File f1 = new File("C:\\Users\\priya\\eclipse-workspace\\Automation\\repository\\config.properties");
		
		//create fileinputstream class object to load properties file
		FileInputStream fis1 = new FileInputStream(f1);
		
		//create properties class object to read properties file 
		Properties pro1 = new Properties();
		pro1.load(fis1);
		
		File f2 = new File("C:\\Users\\priya\\eclipse-workspace\\Automation\\repository\\locators.properties");
		FileInputStream fis2 = new FileInputStream(f2);
		Properties pro2 = new Properties();
		pro2.load(fis2);
		
		File f3 = new File("C:\\Users\\priya\\eclipse-workspace\\Automation\\repository\\testdata.properties");
		FileInputStream fis3 = new FileInputStream(f3);
		Properties pro3 = new Properties();
		pro3.load(fis3);
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\priya\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		 
	    //launching chrome
	    WebDriver driver = new ChromeDriver(); 
	    
	    driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
	    //use to maximize window
		driver.manage().window().maximize();
		
	    //use to open url by using property file
	    driver.get(pro1.getProperty("url"));
	    
	    //pass value using properties file 
	    driver.findElement(By.xpath(pro2.getProperty("email"))).sendKeys(pro3.getProperty("data1"));
	    driver.close();
	}

}
