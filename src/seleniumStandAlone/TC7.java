package seleniumStandAlone;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import seleniumPacakage.LaunchBrowser;

public class TC7 {

	@Test
	public void login() {
		WebDriver driver = LaunchBrowser.launchChrome("https://rahulshettyacademy.com/client/#/auth/login");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.id("userEmail")).sendKeys("kunjiradi12@gmail.com");
		driver.findElement(By.id("userPassword")).sendKeys("Aditya@3098");
		driver.findElement(By.id("login")).click();

		String productSelection = "ZARA COAT 3";

		String addToCartLocator = String.format(
				"//h5//b[text()='%s']/parent::h5/following-sibling::button[contains(text(),' Add To Cart')]",
				productSelection);

		driver.findElement(By.xpath(addToCartLocator)).click();
		Assert.assertTrue(driver.findElement(By.xpath("//div[@aria-label='Product Added To Cart']")).isDisplayed());

		driver.findElement(By.xpath("//button[@routerlink='/dashboard/cart']")).click();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		String addedCardProductName = driver.findElement(By.xpath("//img[@class='itemImg']/following-sibling::h3"))
				.getText();
		Assert.assertEquals(addedCardProductName, productSelection);

		// 🔥 Wait until toast overlay disappears
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".ng-animating")));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement checkoutButton = driver.findElement(By.xpath("//button[text()='Checkout']"));
		js.executeScript("arguments[0].scrollIntoView({block: 'bottom'});", checkoutButton);

		// Wait for overlay to disappear
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".ng-animating")));

		// Scroll & click using JS for reliability
		js.executeScript("arguments[0].scrollIntoView(true);", checkoutButton);
		wait.until(ExpectedConditions.elementToBeClickable(checkoutButton));

		js.executeScript("arguments[0].click();", checkoutButton);

		System.out.println("Step: Enter CVV Number");
		driver.findElement(By.xpath("//div[(text()='CVV Code ')]/following-sibling::input")).sendKeys("511");

		System.out.println("Step: Enter Name on the Card");
		driver.findElement(By.xpath("//div[(text()='Name on Card ')]/following-sibling::input")).sendKeys("Mahesh");

		WebElement placeOrderBtn = driver.findElement(By.xpath("//*[contains(text(),'Place Order')]"));
		js.executeScript("arguments[0].scrollIntoView({block: 'bottom'});", placeOrderBtn);
		placeOrderBtn.click();
		
		String actualMsg = driver.findElement(By.xpath("//div[@aria-label='Please Enter Full Shipping Information']"))
				.getAttribute("aria-label");
		Assert.assertEquals(actualMsg, "Please Enter Full Shipping Information");

		driver.close();
	}
}
