package seleniumPacakage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5 {

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
		WebElement javaScriptConfBtn= driver.findElement(By.xpath("//button[text()='Javascript Confirmation']"));
		
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", javaScriptConfBtn);
		javaScriptConfBtn.click();
		
		Alert alert= driver.switchTo().alert();
		String actualText= alert.getText();
		String okBtnText="You pressed OK!";
		String cancelBtnText="You pressed Cancel!";
		alert.accept();
		String confirmationText= driver.findElement(By.xpath("//p[@id='pgraphdemo']")).getText();
		if(confirmationText.equals(okBtnText)) {
			System.out.println("User Click on Ok btn");
		}else {
			System.out.println("User Clik on Cancel btn");
		}
		driver.close();
	}

}
