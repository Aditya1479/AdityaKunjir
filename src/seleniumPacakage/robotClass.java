package seleniumPacakage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class robotClass {
	
	WebDriver driver;
	@Test
	void robot() throws AWTException {
		driver=LaunchBrowser.launchChrome("http://automationbykrishna.com");
		driver.findElement(By.id("basicelements")).click();
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		WebElement chooseFile= driver.findElement(By.xpath("//input[@id='exampleInputFile']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()",chooseFile );
		
		
		StringSelection str= new StringSelection("d:\\Docs\\AdityaKunjir.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
		Robot rb = new Robot();
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyRelease(KeyEvent.VK_TAB);
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyRelease(KeyEvent.VK_TAB);
		rb.keyPress(KeyEvent.VK_ENTER);
        rb.keyRelease(KeyEvent.VK_ENTER);
		
		System.out.println("Key pressent");
	}
}
