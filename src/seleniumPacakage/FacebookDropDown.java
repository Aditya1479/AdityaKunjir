package seleniumPacakage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookDropDown {
	WebDriver driver;
	void setup(String url) {
		//System.setProperty("webdriver.chrome.driver", ".\\chromeDriver\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", ".\\chromeDriver\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver", ".\\chromeDriver\\chromedriver.exe");)
		this.driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
	}
	void fbDetails() {
		setup("https://www.facebook.com/");
		waitAbit(2000);
		driver.findElement(By.xpath("//a[text()=\"Create new account\"]")).click();
		waitAbit(2000);
		driver.findElement(By.xpath("//div/input[@name='firstname']")).sendKeys("Aditya");
		driver.findElement(By.xpath("//div/input[@name='lastname']")).sendKeys("kunjir");
		//reg_email__
		driver.findElement(By.xpath("//div/input[@name='reg_email__']")).sendKeys("9552123881");
		//div/input[@name='reg_passwd__']
		driver.findElement(By.xpath("//div/input[@name='reg_passwd__']")).sendKeys("Aditya12@12");
		WebElement Date = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select select = new Select(Date);
		select.selectByIndex(29);
		waitAbit(2000);
		WebElement month = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		month.click();
		Select MonthSelect = new Select(month);
		MonthSelect.selectByVisibleText("Jun");
		System.out.println("Month selected");
		
		 List<WebElement> ListOfMonthSelect= MonthSelect.getOptions();
		 for(WebElement ListMonth : ListOfMonthSelect) {
			 System.out.println(ListMonth.getText());
		 }
		 WebElement Year= driver.findElement(By.xpath("//select[@name='birthday_year']"));
		 Select YearSelect = new Select(Year);
		 YearSelect.selectByValue("1998");
		 System.out.println("Year Selected");
		 
		 WebElement Gender = driver.findElement(By.xpath("//span[@class='_5k_2 _5dba']/label[text()='Male']"));
		 Gender.click();
		 System.out.println("Gender Selected");
		
		driver.findElement(By.xpath("//span[@class='_5k_2 _5dba']/label[text()='Custom']")).click();
		System.out.println("Select Pronoun");
		WebElement Pronoun = driver.findElement(By.xpath("//select[@name='preferred_pronoun']"));
		Pronoun.click();
		Select Selectpronoun = new Select(Pronoun);
		List<WebElement> ListOFPronoun= Selectpronoun.getOptions();
		for(WebElement e : ListOFPronoun) {
			if(e.isSelected()) {
				System.out.println(e.getText());
			}
			}
		Selectpronoun.selectByValue("2");
		String PrintSelectedPronoun =Selectpronoun.getFirstSelectedOption().getText();
		System.out.println("Selected text is " +PrintSelectedPronoun);
	}
	
	void waitAbit(int num) {
		try {
			Thread.sleep(num);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FacebookDropDown fb = new FacebookDropDown();
		fb.fbDetails();

	}

}
