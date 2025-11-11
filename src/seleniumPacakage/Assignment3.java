package seleniumPacakage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {

	WebDriver driver;

	void setup() {
		System.out.println("Step- Launch Chrome Browser");
		System.setProperty("webDriver.chrome.driver", ".\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		System.out.println("Maximize ChromeDriver");
		driver.manage().window().maximize();

		System.out.println("Step- Launch Amazoan website");
		driver.get("http://www.automationbykrishna.com/");
	}

	void verifyLoginTest() {
		setup();
		System.out.println("Step-Click on Basic Element");
		WebElement basicElement = driver.findElement(By.id("basicelements"));
		basicElement.click();

		
		System.out.println("Step- write Aditya in userFirstNaame");
		WebElement userFirstName = driver.findElement(By.id("UserFirstName"));
		String firstName = "Aditya";
		userFirstName.sendKeys(firstName);

		System.out.println("Step- write Aditya in userLastNaame");
		WebElement userLastName = driver.findElement(By.id("UserLastName"));
		String lastName = "Kunjir";
		userLastName.sendKeys(lastName);

		System.out.println("Step- write Magic Software in userCompanyName");
		WebElement userCompanyName = driver.findElement(By.id("UserCompanyName"));
		String companyName = "Magic Software";
		userCompanyName.sendKeys(companyName);

		System.out.println("Click on Submit button");
		WebElement submitButton = driver.findElement(By.xpath("//div[@id='firstRow']/div[1]//button"));
		submitButton.click();

		String expectedString = firstName + " and " + lastName + " and " + companyName;
		// System.out.println(expectedString);
		Alert jsAlert = driver.switchTo().alert();
		String actualText = jsAlert.getText();
		// System.out.println(actualText);
		if (expectedString.equals(actualText)) {
			System.out.println("Test Passed");
		} else {
			System.out.println("Test failed");
		}
		jsAlert.accept();

		tearDown();

	}

	void tearDown() {
		driver.close();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Assignment3().verifyLoginTest();

	}
}
