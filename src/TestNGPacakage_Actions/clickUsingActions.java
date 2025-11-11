package TestNGPacakage_Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class clickUsingActions {
	@Test
	void clickusingActionClass() {
		WebDriver driver=LaunchBrowser.launchChrome("http://automationbykrishna.com/");
		System.out.println("Step: Click on Demo Tables ");
		WebElement demoTable = driver.findElement(By.xpath("//a[@id='demotable']"));
		
		Actions action = new Actions(driver);
		action.click(demoTable).perform();
	}

}
