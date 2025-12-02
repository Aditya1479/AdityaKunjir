package seleniumPacakage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataDrivenExample {
	WebDriver driver;

	@BeforeMethod
	void setup() {
		System.out.println("Step- Launch Chrome Browser");
		this.driver = LaunchBrowser.launchChrome("http://www.automationbykrishna.com/");

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	}

	@Test(dataProvider = "loginDataProvider")
	void verifyLogin(String Uname, String Password, String ExpectedAlertString) {
		// TODO Auto-generated method stub
		System.out.println("Step-Click on registration");
		WebElement registrationElement = driver.findElement(By.id("registration2"));
		registrationElement.click();

		System.out.println("Step- write Aditya in uname");
		WebElement userName = driver.findElement(By.id("unameSignin"));
		userName.sendKeys(Uname);

		System.out.println("Step- write Kunjir in password field");
		WebElement password = driver.findElement(By.id("pwdSignin"));
		password.sendKeys(Password);

		System.out.println("Step- click on submit button");
		driver.findElement(By.id("btnsubmitdetails")).click();

		Alert alert = driver.switchTo().alert();
		String alertText = alert.getText();
		System.out.println("Alert text => " + alertText);

		Assert.assertEquals(alertText, ExpectedAlertString);
		alert.accept();

	}

	@DataProvider
	public Object[][] loginDataProvider() {
		Object[][] data = new Object[2][3];
		data[0][0] = "aditya";
		data[0][1] = "kunjir123";
		data[0][2] = "Success!";
		
		data[1][0] = "adi";
		data[1][1] = "kunji";
		data[1][2] = "Failed! please enter strong password";

		return data;
	}

	@AfterMethod
	void tearDown() {
		driver.close();
	}
}
