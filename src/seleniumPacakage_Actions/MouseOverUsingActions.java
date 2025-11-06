package seleniumPacakage_Actions;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MouseOverUsingActions {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=LaunchBrowser.launchChrome("http://flipkart.com/");
		Thread.sleep(3000);
		try{
		driver.findElement(By.xpath("//span[@role='button']")).click();
		}catch(NoSuchElementException e) {
			System.out.println("cross button is not find");
		}
		
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//span[text()='Electronics']"))).perform();
	}
	
	public static void scrollFunction(WebDriver dr,WebElement e) {
		JavascriptExecutor js =(JavascriptExecutor) dr;
		js.executeScript("arguments[0].scrollIntoView(true)", e);
	}
}
