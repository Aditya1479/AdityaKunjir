package seleniumPacakage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("Step- Launch Chrome Browser");
		System.setProperty("webDriver.chrome.driver", ".\\ChromeDriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		System.out.println("Maximize ChromeDriver");
		driver.manage().window().maximize();
		
		System.out.println("Step- Launch Amazoan website");
		driver.get("http://www.automationbykrishna.com/");
		
		System.out.println("Step-Click on Basic Element");
		WebElement basicElement= driver.findElement(By.id("basicelements"));
		basicElement.click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Alert']")).click();
		
		Alert alert= driver.switchTo().alert();
		String alertText= alert.getText();
		if(alertText.contains("TechnoCredits")) {
			System.out.println("Test passed");
		}else {
			System.out.println("Test Failed");
		}
		alert.accept();
	}

}
