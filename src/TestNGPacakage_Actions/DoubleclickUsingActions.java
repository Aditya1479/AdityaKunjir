package TestNGPacakage_Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DoubleclickUsingActions {
	
	@Test
	void verifyDoubleClickUsingActions() {
		WebDriver driver = LaunchBrowser.launchChrome("http://automationbykrishna.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println("Step: Click on Basic Element ");
		WebElement basicElement = driver.findElement(By.xpath("//a[@id='basicelements']"));

		Actions action = new Actions(driver);
		action.click(basicElement).perform();

		WebElement doubleClickElement = driver.findElement(By.xpath("//a[@ondblclick=\"doubleClick()\"]"));
		scrollFunction(driver, doubleClickElement);
		action.doubleClick(doubleClickElement).perform();

		Alert alert = driver.switchTo().alert();
		String alertText = alert.getText();
		if (alertText.equals("You successfully double clicked it")) {
			System.out.println(alertText + " is > Test Passed");
		} else {
			System.out.println(alertText + " is > Test Failed");
		}
		driver.close();
	}

	public static void scrollFunction(WebDriver dr, WebElement e) {
		JavascriptExecutor js = (JavascriptExecutor) dr;
		js.executeScript("arguments[0].scrollIntoView(true)", e);
	}
}
