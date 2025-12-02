package seleniumAssertPacakage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Assignment4 {
	WebDriver driver;
	
	@BeforeMethod
	void setup() {
		System.out.println("Step- Launch Chrome Browser");
		System.setProperty("webDriver.chrome.driver", ".\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		System.out.println("Maximize ChromeDriver");
		driver.manage().window().maximize();

		System.out.println("Step- Launch Amazoan website");
		driver.get("http://www.automationbykrishna.com/");
	}
	
	@Test
	void verifyAlertTExt() {
		// TODO Auto-generated method stub

		System.out.println("Step-Click on Basic Element");
		WebElement basicElement = driver.findElement(By.id("basicelements"));
		basicElement.click();

		WebElement Alert=driver.findElement(By.xpath("//button[text()='Alert']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;

		// Scroll to element
		js.executeScript("arguments[0].scrollIntoView(true);", Alert);
		Alert.click();
		String ExpectedString="You must be TechnoCredits student!!";
		Alert alert = driver.switchTo().alert();
		String alertText = alert.getText();
		Assert.assertEquals(alertText, ExpectedString);
		
//		if (alertText.contains("TechnoCredits")) {
//			System.out.println("Test passed");
//		} else {
//			System.out.println("Test Failed");
//		}
		alert.accept();
	}
	
	@AfterMethod
	void tearDown() {
		driver.close();
	}

}
