package seleniumAssertPacakage;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class explicitWaitDemo2 {
	WebDriver driver;
	WebDriverWait wait;

	@BeforeMethod
	void setup() {
		// System.setProperty("webdriver.chrome.driver",
		// ".\\chromeDriver\\chromedriver.exe");
		// System.setProperty("webdriver.chrome.driver",
		// ".\\chromeDriver\\chromedriver.exe");
		// System.setProperty("webdriver.chrome.driver",
		// ".\\chromeDriver\\chromedriver.exe");)
		this.driver = LaunchBrowser.launchChrome("https://www.facebook.com/");
		 wait = new WebDriverWait(driver, Duration.ofSeconds(30));
//		this.driver =new ChromeDriver();
//		driver.manage().window().maximize();
//		//driver.get("https://www.facebook.com/");
//		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	}

	
	
	@Test
	void fbDetails1() {

		// waitAbit(2000);
		this.driver.findElement(By.xpath("//a[text()=\"Create new account\"]")).click();
		
		driver.findElement(By.xpath("//span[@class='_5k_2 _5dba']/label[text()='Custom']")).click();
		System.out.println("Select Pronoun");
//		WebElement Pronoun = driver.findElement(By.xpath("//select[@name='preferred_pronoun']"));
//		wait.until(ExpectedConditions.visibilityOf(Pronoun));
		WebElement Pronoun=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@name='preferred_pronoun']")));
		Pronoun.click();
		Select Selectpronoun = new Select(Pronoun);
		List<WebElement> ListOFPronoun = Selectpronoun.getOptions();
		for (WebElement e : ListOFPronoun) {
			if (e.isSelected()) {
				System.out.println(e.getText());
			}
		}
		Selectpronoun.selectByValue("2");
		String PrintSelectedPronoun = Selectpronoun.getFirstSelectedOption().getText();
		System.out.println("Selected text is " + PrintSelectedPronoun);

	}

	@AfterMethod
	void tearDown() {
		driver.close();
	}
//	void waitAbit(int num) {
//		try {
//			Thread.sleep(num);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}

}
