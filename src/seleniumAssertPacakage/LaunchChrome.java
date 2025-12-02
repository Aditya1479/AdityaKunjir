package seleniumAssertPacakage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("Step- Launch Chrome Browser");
		System.setProperty("webDriver.chrome.driver", ".\\ChromeDriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		System.out.println("Maximize ChromeDriver");
		driver.manage().window().maximize();
		
		System.out.println("Step- Launch Amazoan website");
		driver.get("http://www.automationbykrishna.com/");
		System.out.println(driver.getTitle());
		
		System.out.println("Step- Navigate to Google");
		driver.navigate().to("https://www.google.com");
		//driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		
		driver.navigate().back();
		
		String title=driver.getTitle();
		if(title.equals("Login Signup Demo")) {
			System.out.println(title+ "-> Test Pass");
		}else {
			System.out.println(title+ "-> Test Failed");
		}
		System.out.println("step- close browser");
		driver.close();
	}

}
