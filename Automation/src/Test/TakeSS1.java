package Test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;

public class TakeSS1 {
	WebDriver driver;

	//ITest Result provide us  the test case execution status and result 
	public void capturess(ITestResult result) throws Exception {
		if(ITestResult.FAILURE == result.getStatus())
		{
			//create reference of TakesScreenshot interface and type casting 
			TakesScreenshot ts = (TakesScreenshot) driver;
			
			//use getScreenshotAs() to capture SS
			File src = ts.getScreenshotAs(OutputType.FILE) ;
			
			//copy file to specific location
			File des = new File("./screenshot/" +result.getName() + ".png");
			FileUtils.copyFile(src, des);
			System.out.println(result.getName() + "Method failure Screenshot Capture");
		}
		
	}

}
