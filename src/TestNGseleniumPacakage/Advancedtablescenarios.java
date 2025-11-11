package TestNGseleniumPacakage;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Advancedtablescenarios {
	@Test
	void printUniqueSurnameUsingSet() {
		WebDriver driver = LaunchBrowser.launchChrome("http://automationbykrishna.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement demoTable = driver.findElement(By.xpath("//a[@id='demotable']"));
		demoTable.click();
		// Thread.sleep(3000);
		Set<String> setExpectedLastNames = new LinkedHashSet<String>(
				Arrays.asList("Kanani", "Boda", "Sharma", "Patro"));
		// *********************************************////////////////
		// Option 1 to print the all rows on 3 column element
//		List<WebElement> row= driver.findElements(By.xpath("//table[@id='table1']/tbody/tr"));
//		System.out.println("Total rows: " + row.size());
//		for(int i=1; i<=row.size();i++) {
//			String Data= driver.findElement(By.xpath("//table[@id='table1']/tbody/tr["+i+"]/td[3]")).getText();
//			System.out.println("row" +i+ " "+Data);
		// **************************************Option2********************************//
		List<WebElement> listOfLastNameElement = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr/td[3]"));
		Set<String> setOfLastName = new LinkedHashSet<String>();
		for (WebElement lastName : listOfLastNameElement) {
			setOfLastName.add(lastName.getText());
		}
		System.out.println("Unique Last Name " + setOfLastName);
		if (setExpectedLastNames.equals(setOfLastName)) {
			System.out.println("Test Passed");
		} else {
			System.out.println("Test Failed");
		}
		driver.close();
	}

}
