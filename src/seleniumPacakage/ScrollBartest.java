package seleniumPacakage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollBartest {
	
	WebDriver driver;
	 void waitAbit(int value) {
		try {
			Thread.sleep(value);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	void verifyScrollBar() {
		System.setProperty("webDriver.chrome.driver", ".\\ChromeDriver\\chromedriver.exe");
		this.driver = new ChromeDriver();
		
		driver.get("http://automationbykrishna.com/");
		driver.manage().window().maximize();
		
		System.out.println("Step: Click on Basic Element");
		WebElement BasicElement = driver.findElement(By.xpath("//a[@id='basicelements']"));
		BasicElement.click();
		waitAbit(1000);
		WebElement CheckBox2 = driver.findElement(By.xpath("//input[@id='inlineCheckbox2']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", CheckBox2);
		CheckBox2.click();
		
	}
	
	void tearDown() {
		driver.close();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new ScrollBartest().verifyScrollBar();
	}	

}
