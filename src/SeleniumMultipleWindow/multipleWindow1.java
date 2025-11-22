package SeleniumMultipleWindow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import seleniumPacakage.LaunchBrowser;

public class multipleWindow1 {
	
	@Test
	void m1() {
		WebDriver driver=LaunchBrowser.launchChrome("https://www.amazon.com/");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("tv");
		driver.findElement(By.id("nav-search-submit-button")).click();
	}



}
