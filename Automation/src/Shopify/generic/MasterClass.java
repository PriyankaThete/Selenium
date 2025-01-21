package Shopify.generic;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class MasterClass {
	public static WebDriver driver;
	public Properties con;
	public Properties loc;
	public Properties tes;


	//create constructor
	MasterClass() throws Exception{
		
		//add properties file 
		FileInputStream f1 = new FileInputStream("C:\\Users\\priya\\eclipse-workspace\\Automation\\repository\\config.properties");
		con = new Properties();
		con.load(f1);
		
		FileInputStream f2 = new FileInputStream("C:\\Users\\priya\\eclipse-workspace\\Automation\\repository\\locators.properties");
		loc = new Properties();
		loc.load(f2);
		
		FileInputStream f3 = new FileInputStream("C:\\Users\\priya\\eclipse-workspace\\Automation\\repository\\testdata.properties");
		tes = new Properties();
		tes.load(f3);
		
        System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\priya\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(con.getProperty("url"));
	
	}
}
