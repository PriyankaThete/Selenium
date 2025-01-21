package Test;

import java.io.File;
import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Excel {

	public static void main(String[] args) throws Exception {
		// specify the file location
		File src =new File("C:\\Users\\priya\\Downloads\\Vrinda Store Data Analysis.xlsx");
		
		//load file 
		FileInputStream fis = new FileInputStream(src);
		
		//load workbook
		XSSFWorkbook wb = new XSSFWorkbook(fis);
	
		//load worksheet
		XSSFSheet sh = wb.getSheet("Vrinda Store");
		
		//print the loaded sheet name
		System.out.println(sh.getSheetName());
		
		//printing sheet data 
		System.out.println(sh.getRow(0).getCell(1).getStringCellValue());
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\priya\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		 
	    //launching chrome
	    WebDriver driver = new ChromeDriver(); 
	    
	    //use to open url
	    driver.get("https://www.facebook.com/");
	    
	    //use to maximize window
		driver.manage().window().maximize();
		
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    String a = sh.getRow(2).getCell(1).getStringCellValue();
	    driver.findElement(By.id("email")).sendKeys(a);
	}

}

