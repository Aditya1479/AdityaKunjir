package TestNGseleniumPacakage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class tableElements {
	
	@Test
	void TableElementsTest() {
		System.setProperty("webDriver.chrome.driver", ".\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://automationbykrishna.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		System.out.println("Step: Click on Demo Tables ");
		WebElement demoTable = driver.findElement(By.xpath("//a[@id='demotable']"));
		demoTable.click();

		List<WebElement> rowCount = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr"));
		System.out.println("Number of Rows  " + rowCount.size());
		int rowsize = rowCount.size();
		if (rowsize == 5) {
			System.out.println("Test Passed");
		} else {
			System.out.println("Test Failed");

		}

		List<WebElement> listOfColumns = driver.findElements(By.xpath("//table[@id='table1']//th"));
		System.out.println("Number of columns  " + listOfColumns.size());
		int Columnsize = listOfColumns.size();
		if (Columnsize == 4) {
			System.out.println("Test Passed");
		} else {
			System.out.println("Test Failed");

		}

		String firtrowData = driver.findElement(By.xpath("//table[@id='table1']/tbody//tr[1]")).getText();
		System.out.println(firtrowData);

		List<WebElement> firstrowlastColumn = driver.findElements(By.xpath("//table[@id='table1']/tbody//tr[1]//td"));
		for (int i = 1; i <= firstrowlastColumn.size(); i++) {
			String Text = driver
					.findElement(By.xpath("//table[@id='table1']/tbody//tr[" + rowsize + "]//td[" + i + "]")).getText();
			System.out.println(rowsize + " th row Data is > " + Text);
		}

		System.out.println("****************************");
		System.out.println("Printing the data Of all Rows");
		///////// Now print the data of all rows use loop inside loop
		for (int rowindex = 1; rowindex <= rowsize; rowindex++) {
			for (int i = 1; i <= firstrowlastColumn.size(); i++) {
				String Text = driver
						.findElement(By.xpath("//table[@id='table1']/tbody//tr[" + rowindex + "]//td[" + i + "]"))
						.getText();
				System.out.print(Text + " ");
			}
			System.out.println();
		}
		driver.close();
	}
}
