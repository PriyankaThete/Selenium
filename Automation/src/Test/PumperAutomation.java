package Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class PumperAutomation {
	public static void main(String[] args) {
		// Set up ChromeDriver
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\priya\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, 30);

		try {
			// Step 1: Log in to Shopify Admin Panel
			driver.get("https://testshop2528.myshopify.com/admin");
			driver.manage().window().maximize();
			driver.findElement(By.id("account_email")).sendKeys("thetepriyanka1999@gmail.com");
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']")));
            driver.findElement(By.xpath("//button[@type='submit']")).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']")));
            driver.findElement(By.id("account_password")).sendKeys("Piyu@2528");
            driver.findElement(By.xpath("//button[@type='submit']")).click();

			// Step 2: Navigate to the Pumper App
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@type='button'])[6]"))).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Pumper"))).click();

			// Functional Event 1: Create a New Bundle Offer
			WebElement addBundleButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Add Bundle']")));
			addBundleButton.click();

			driver.findElement(By.id("bundle-name")).sendKeys("Buy 2, Get 10% Off");
			driver.findElement(By.id("search-products")).sendKeys("Test Product");
			WebElement selectProduct = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(), 'Test Product')]")));
			selectProduct.click();

			WebElement saveButton = driver.findElement(By.xpath("//button[text()='Save']"));
			saveButton.click();

			// Confirm Bundle Creation
			WebElement successMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(), 'Bundle created successfully')]")));
			if (successMessage.isDisplayed()) {
				System.out.println("Bundle created successfully.");
			}

			// Functional Event 2: Validate Discount Application at Checkout
			driver.get("https://yourstorename.myshopify.com/products/test-product");
			WebElement addToCart = driver.findElement(By.xpath("//button[text()='Add to Cart']"));
			addToCart.click();

			driver.get("https://yourstorename.myshopify.com/cart");
			WebElement discount = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(), '10% Discount Applied')]")));
			if (discount.isDisplayed()) {
				System.out.println("Discount applied successfully at checkout.");
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
