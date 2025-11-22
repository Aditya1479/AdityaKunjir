package seleniumStandAlone;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import seleniumPacakage.LaunchBrowser;

public class TC3 {

	@Test
	public void login() {
		WebDriver driver=LaunchBrowser.launchChrome("https://rahulshettyacademy.com/client/#/auth/login");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("kunjiradi12@gmail.com");
		driver.findElement(By.xpath("//input[@id='userPassword']")).sendKeys("Aditya@3098");
		driver.findElement(By.xpath("//input[@id='login']")).click();
		int productCount=driver.findElements(By.xpath("//div[@class='card']")).size();
		///////// after selecting electronics checkbox filter is not applied
		driver.close();
	
	}
}
