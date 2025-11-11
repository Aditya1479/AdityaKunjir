package TestNGPacakage_Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragandDropActions {
	
	@Test
	void verifyDragAndDropUsingActions() {
		WebDriver driver=LaunchBrowser.launchChrome("https://jqueryui.com/");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[text()='Droppable']")).click();
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		WebElement sourceElement= driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement targetElement= driver.findElement(By.xpath("//div[@id='droppable']"));
		
		Actions action = new Actions(driver);
		//action.dragAndDrop(sourceElement, targetElement).perform();
		//Option 2
		action.clickAndHold(sourceElement).moveToElement(targetElement).release().build().perform();
		//To perform multiple action build() needs to be called.
		driver.close();
	}
	
}
