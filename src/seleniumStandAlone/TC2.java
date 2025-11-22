package seleniumStandAlone;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import seleniumPacakage.LaunchBrowser;

public class TC2 {
	
	@Test
	public void login() {
		WebDriver driver=LaunchBrowser.launchChrome("https://rahulshettyacademy.com/client/#/auth/login");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("kunjiradi12@gmail.com");
		driver.findElement(By.xpath("//input[@id='userPassword']")).sendKeys("Aditya@3098");
		driver.findElement(By.xpath("//input[@id='login']")).click();
		if(driver.findElement(By.xpath("//div[@aria-label='Login Successfully']")).isDisplayed()) 
			System.out.println("test passeed");
		else {
			System.out.println("test failed");
		
		}
		
	int CategoriesCount=driver.findElements(By.xpath("//h6[text()='Categories']/parent::div[@class='py-2 border-bottom ml-3 p-4']//div[@class='form-group ng-star-inserted']")).size();
	int subCategorisCount=driver.findElements(By.xpath("//h6[text()='Sub Categories']/parent::div[@class='py-2 border-bottom ml-3 p-4']//div[@class='form-group ng-star-inserted']")).size();
	int searchForCount= driver.findElements(By.xpath("//h6[text()='Search For']/parent::div[@class='py-2 ml-3']//div[@class='form-group ng-star-inserted']")).size();
	System.out.println("Categorey count " +CategoriesCount+ " Sub Categorey count " +subCategorisCount+ " Search For" +searchForCount);
	if(CategoriesCount>0 && subCategorisCount>0 && searchForCount>0) {
		System.out.println("Test Passed");
	}else {
		System.out.println("Test Failed");
	}
	driver.close();
	
	}
}
