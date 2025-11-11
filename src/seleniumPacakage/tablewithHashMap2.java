//Firstly Calculated all Number of pages on table , after that calculate number of rows present on each page and
//calculated sum of of all rows present should be 57

package seleniumPacakage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tablewithHashMap2 {
	WebDriver driver;

	void setup() throws InterruptedException {
		driver = LaunchBrowser.launchChrome("https://datatables.net/");
		WebElement demoTable = driver.findElement(By.xpath("//table[@id='example']"));
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	int countRows() throws InterruptedException {

		List<WebElement> pageNumber = driver
				.findElements(By.xpath("//button[@class='dt-paging-button' or @class='dt-paging-button current']"));
		System.out.println(pageNumber.size());
		return pageNumber.size();
	}

	void CalculateRows() throws InterruptedException {
		setup();
		int totalPage = countRows();
		int totalrows = 0;

		List<WebElement> rowscount = driver.findElements(By.xpath("//table[@id='example']/tbody/tr"));

		for (int i = 1; i <= totalPage; i++) {
			driver.findElement(
					By.xpath("(//button[@class='dt-paging-button' or @class='dt-paging-button current'])[" + i + "]"))
					.click();

			List<WebElement> rowscount1 = driver.findElements(By.xpath("//table[@id='example']/tbody/tr"));
			System.out.println("Page " + i + " → Row count: " + rowscount1.size());

			totalrows += rowscount1.size();
		}

		String numberOfRowsString = driver.findElement(By.xpath("//div[@id='example_info']")).getText();
		String[] arr = numberOfRowsString.split(" ");
		int numberOfrows = Integer.parseInt(arr[5]);
		System.out.println("Total rows across all pages: " + totalrows);
		if (totalrows == numberOfrows) {
			System.out.println("Test Passed");
		} else {
			System.out.println("Test failed");
		}
		driver.close();
	}

	public static void main(String[] args) throws InterruptedException {
		new tablewithHashMap2().CalculateRows();
	}
}
