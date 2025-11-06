package seleniumPacakage_Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragandDropActions {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=LaunchBrowser.launchChrome("https://jqueryui.com/");
		
		driver.findElement(By.xpath("//a[text()='Droppable']")).click();
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		Thread.sleep(3000);
		WebElement sourceElement= driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement targetElement= driver.findElement(By.xpath("//div[@id='droppable']"));
		
		Actions action = new Actions(driver);
		//action.dragAndDrop(sourceElement, targetElement).perform();
		//Option 2
		action.clickAndHold(sourceElement).moveToElement(targetElement).release().build().perform();
		//To perform multiple action build() needs to be called.
		
		
	}
}
