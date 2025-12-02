package seleniumAssertPacakage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class firstTestCase {

	WebDriver driver;

	@BeforeMethod
	void setup() {
		System.out.println("Step- Launch Chrome Browser");
		System.setProperty("webDriver.chrome.driver", ".\\ChromeDriver\\chromedriver.exe");
		this.driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		System.out.println("Maximize ChromeDriver");
		driver.manage().window().maximize();

		System.out.println("Step- Launch Amazoan website");
		driver.get("http://www.automationbykrishna.com/");
	}

	@Test
	void verifyAlertText() {

		// TODO Auto-generated method stub

		System.out.println("Step-Click on registration");
		WebElement registrationElement = driver.findElement(By.id("registration2"));
		registrationElement.click();

		System.out.println("Step- write Aditya in uname");
		WebElement userName = driver.findElement(By.id("unameSignin"));
		userName.sendKeys("Aditya");

		System.out.println("Step- write Kunjir in password field");
		WebElement password = driver.findElement(By.id("pwdSignin"));
		password.sendKeys("Kunjir123");

		System.out.println("Step- click on submit button");
		driver.findElement(By.id("btnsubmitdetails")).click();

		System.out.println("Verify Success ! Alert Message");
		Alert alert = driver.switchTo().alert();
		String alertText = alert.getText();
		System.out.println("Alert text => " + alertText);

		Assert.assertEquals(alertText, "Success!");

		alert.accept();

		userName.clear();
		password.clear();
		System.out.println("Checking case where password should contain characters <8");
		userName.sendKeys("Aditya");
		password.sendKeys("abcd");
		driver.findElement(By.id("btnsubmitdetails")).click();
		System.out.println("Verify Success ! Alert Message");
		Alert alert1 = driver.switchTo().alert();
		String alertText1 = alert1.getText();
		System.out.println("Alert text => " + alertText1);

		Assert.assertEquals(alertText1, "Failed! please enter strong password");

		alert.accept();

	}

	@AfterMethod
	void tearDown() {
		driver.close();
	}

}
