package Shopify.generic;

import org.openqa.selenium.By;

public class CommonMethod extends MasterClass{

	public CommonMethod() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void EnterEmail(String xpathkey,String testdata) {
		driver.findElement(By.xpath(loc.getProperty(xpathkey))).sendKeys(tes.getProperty(testdata));
		
	}

	public void SubmitButton(String xpathkey) {
		driver.findElement(By.xpath(loc.getProperty(xpathkey))).click();
	}
	
	public void EnterPassword(String xpathkey,String testdata) {
		driver.findElement(By.xpath(loc.getProperty(xpathkey))).sendKeys(tes.getProperty(testdata));
	}
	
}
