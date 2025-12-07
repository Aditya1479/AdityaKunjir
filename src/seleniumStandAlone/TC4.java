package seleniumStandAlone;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import seleniumPacakage.LaunchBrowser;

public class TC4 {

	@Test
	public void login() {
		WebDriver driver=LaunchBrowser.launchChrome("https://rahulshettyacademy.com/client/#/auth/login");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("kunjiradi12@gmail.com");
		driver.findElement(By.xpath("//input[@id='userPassword']")).sendKeys("Aditya@3098");
		driver.findElement(By.xpath("//input[@id='login']")).click();
		String productSelection="ZARA COAT 3";
		
		String addToCartLocator=String.format("//h5//b[text()='ZARA COAT 3']/parent::h5/following-sibling::"
				+ "button[contains(text(),' Add To Cart')]",productSelection);
		
		
		driver.findElement(By.xpath(addToCartLocator)).click();
//		Alert alert= driver.switchTo().alert();
//		String actualValue= alert.getText();
		Assert.assertTrue(driver.findElement(By.xpath("//div[@aria-label='Product Added To Cart']")).isDisplayed());		
		driver.findElement(By.xpath("//button[@routerlink='/dashboard/cart']")).click();
		String addedCardProductName=driver.findElement(By.xpath("//img[@class='itemImg']/following-sibling::h3")).getText();
		Assert.assertEquals(addedCardProductName, productSelection);
		///////// after selecting electronics checkbox filter is not applied
		driver.close();
	
	}
}
