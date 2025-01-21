package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;

public class ShopifyAutomation {
    public static void main(String[] args) {
        // Set up ChromeDriver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\priya\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, 30);

        try {
            // 1. Navigate to Shopify Store
            driver.get("https://testshop2528.myshopify.com");
            driver.manage().window().maximize();

            // 2. Log in (if necessary)
           // driver.findElement(By.id("login-username")).sendKeys("your_email@example.com");
            driver.findElement(By.id("password")).sendKeys("123456789");
            driver.findElement(By.xpath("//button[@type='submit']")).click();

            // 3. Add a Bundle Offer
            driver.get("https://testshop2528.myshopify.com/admin/apps/pumper");
            driver.findElement(By.id("account_email")).sendKeys("thetepriyanka1999@gmail.com");
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']")));
            driver.findElement(By.xpath("//button[@type='submit']")).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']")));
            driver.findElement(By.id("account_password")).sendKeys("Piyu@2528");
            driver.findElement(By.xpath("//button[@type='submit']")).click();
            driver.get("https://admin.shopify.com/store/testshop2528/apps/discount-app-staging-3");
            
            int allFrames = driver.findElements(By.tagName("iFrame")).size();
    	    System.out.println("total frames :" + allFrames);
    	    
		    driver.findElement(By.xpath("//span[normalize-space()='Create new offer']")).click();

    	    
            WebElement addBundleButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Create a Bundle']")));
            addBundleButton.click();
           //driver.findElement(By.xpath("//button[normalize-space()='Create new offer']")).click();
           // driver.findElement(By.className("Polaris-Button Polaris-Button--pressable Polaris-Button--variantPrimary Polaris-Button--sizeMedium Polaris-Button--textAlignCenter")).click();
            // Fill out the bundle details
            driver.findElement(By.id("bundle-name")).sendKeys("Buy 3, Get 10% Off");
            driver.findElement(By.id("product-search")).sendKeys("Test Product");
            WebElement productOption = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[contains(text(), 'Test Product')]")));
            productOption.click();
            driver.findElement(By.xpath("//button[text()='Save']")).click();

            // 4. Verify Bundle Offer on Checkout
            driver.get("https://yourstorename.myshopify.com/products/test-product");
            driver.findElement(By.xpath("//button[text()='Add to Cart']")).click();
            driver.get("https://yourstorename.myshopify.com/cart");
            WebElement discount = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Discount Applied']")));
            if (discount.isDisplayed()) {
                System.out.println("Discount applied successfully.");
            } else {
                System.out.println("Discount not applied.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            //driver.quit();
        }
    }
}
