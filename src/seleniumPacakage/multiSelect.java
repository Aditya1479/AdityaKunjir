package seleniumPacakage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class multiSelect {
	WebDriver driver;
	void setup(String url) {
		//System.setProperty("webdriver.chrome.driver", ".\\chromeDriver\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", ".\\chromeDriver\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver", ".\\chromeDriver\\chromedriver.exe");)
		this.driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
	}
	
	void verfiyMultiSelectDropDownValues() {
		setup("http://www.automationbykrishna.com/");
		System.out.println("Step-Click on Basic Element");
		WebElement basicElement= driver.findElement(By.id("basicelements"));
		basicElement.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement multiSelectdropDown= driver.findElement(By.xpath("//select[@class='form-control']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", multiSelectdropDown);
		multiSelectdropDown.click();
		
		Select multiSelectdropDownValue= new Select(multiSelectdropDown);
		System.out.println("Dropdown is multiSelect --> "+multiSelectdropDownValue.isMultiple());
		multiSelectdropDownValue.selectByVisibleText("1");
		multiSelectdropDownValue.selectByVisibleText("4");
		
		List<WebElement> selectedValue= multiSelectdropDownValue.getAllSelectedOptions();
		System.out.println("List size" +selectedValue.size());
		for( WebElement i  : selectedValue ) {
			if(i.isSelected()) {
				System.out.println(i.getText());
			}
		}
		WebElement  secondLastSelectedElement= selectedValue.get(selectedValue.size()-2);
		System.out.println("Second Last selected element is " +secondLastSelectedElement.getText());
		driver.close();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new multiSelect().verfiyMultiSelectDropDownValues();
		
	}

}
