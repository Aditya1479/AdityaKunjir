package seleniumPacakage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment6 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("Step- Launch Chrome Browser");
		System.setProperty("webDriver.chrome.driver", ".\\ChromeDriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		System.out.println("Maximize ChromeDriver");
		driver.manage().window().maximize();
		
		System.out.println("Step- Launch AutomatiobByKrishna website");
		driver.get("http://www.automationbykrishna.com/");
		
		System.out.println("Step-Click on Basic Element");
		WebElement basicElement= driver.findElement(By.id("basicelements"));
		basicElement.click();
		
		
		System.out.println("Step: Click on Javascript Confirmation button");
		WebElement javaScriptConfBtn= driver.findElement(By.xpath("//button[@id='javascriptPromp']"));
		
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", javaScriptConfBtn);
		javaScriptConfBtn.click();
		
		Alert alert= driver.switchTo().alert();
		String name="Aditya";
		alert.sendKeys(name);	
		alert.accept();
		String expetedString= "Hello "+name+"! How are you today?";
		String javascriotPromptText= driver.findElement(By.xpath("//p[@id='pgraphdemo']")).getText();
		System.out.println(javascriotPromptText);
		if(javascriotPromptText.equals(expetedString)) {
			System.out.println("Test Passed");
		}else {
			System.out.println("Test Failed");
		}
		driver.close();
	}

}
