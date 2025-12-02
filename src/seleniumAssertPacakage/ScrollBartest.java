package seleniumAssertPacakage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class ScrollBartest {

	WebDriver driver;

	@Test
	void verifyScrollBar() {
		System.setProperty("webDriver.chrome.driver", ".\\ChromeDriver\\chromedriver.exe");
		this.driver = new ChromeDriver();

		driver.get("http://automationbykrishna.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		System.out.println("Step: Click on Basic Element");
		WebElement BasicElement = driver.findElement(By.xpath("//a[@id='basicelements']"));
		BasicElement.click();

		WebElement CheckBox2 = driver.findElement(By.xpath("//input[@id='inlineCheckbox2']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", CheckBox2);
		CheckBox2.click();
		System.out.println("Checkbox Clicked!");
		tearDown();

	}

	@AfterMethod
	void tearDown() {
		driver.close();
	}

}
