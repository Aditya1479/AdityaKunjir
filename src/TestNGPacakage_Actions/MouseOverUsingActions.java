package TestNGPacakage_Actions;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseOverUsingActions {
	
	@Test
	void verifyMouseUsingActions() {
		WebDriver driver=LaunchBrowser.launchChrome("http://flipkart.com/");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		try{
		driver.findElement(By.xpath("//span[@role='button']")).click();
		}catch(NoSuchElementException e) {
			System.out.println("cross button is not find");
		}
		
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//span[text()='Electronics']"))).perform();
		System.out.println("electronics over");
	}
	
	public static void scrollFunction(WebDriver dr,WebElement e) {
		JavascriptExecutor js =(JavascriptExecutor) dr;
		js.executeScript("arguments[0].scrollIntoView(true)", e);
	}
}
