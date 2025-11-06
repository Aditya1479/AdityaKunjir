package seleniumPacakage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class firstTestCase {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("Step- Launch Chrome Browser");
		System.setProperty("webDriver.chrome.driver", ".\\ChromeDriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		System.out.println("Maximize ChromeDriver");
		driver.manage().window().maximize();
		
		System.out.println("Step- Launch Amazoan website");
		driver.get("http://www.automationbykrishna.com/");
		
		System.out.println("Step-Click on registration");
		WebElement registrationElement= driver.findElement(By.id("registration2"));
		registrationElement.click();
		
		Thread.sleep(3000);
		System.out.println("Step- write Aditya in uname");
		WebElement userName=driver.findElement(By.id("unameSignin"));
		userName.sendKeys("Aditya");
		
		
		System.out.println("Step- write Kunjir in password field");
		WebElement password=driver.findElement(By.id("pwdSignin"));
		password.sendKeys("Kunjir123");
		
		System.out.println("Step- click on submit button");
		driver.findElement(By.id("btnsubmitdetails")).click();
		
		System.out.println("Verify Success ! Alert Message");
		Alert alert=driver.switchTo().alert();
		String alertText= alert.getText();
		System.out.println("Alert text => " +alertText);
		if(alertText.equals("Success!")) {
			System.out.println("Test passed");
		}else {
			System.out.println("Test failed");
		}
		alert.accept();
		
		userName.clear();
		password.clear();
		System.out.println("Checking case where password should contain characters <8");
		userName.sendKeys("Aditya");
		password.sendKeys("abcd");
		driver.findElement(By.id("btnsubmitdetails")).click();
		System.out.println("Verify Success ! Alert Message");
		Alert alert1=driver.switchTo().alert();
		String alertText1= alert1.getText();
		System.out.println("Alert text => " +alertText1);
		if(alertText1.equals("Failed! please enter strong password")) {
			System.out.println("Test passed");
		}else {
			System.out.println("Test failed");
		}
		alert.accept();
		
		driver.close();

	}

}
