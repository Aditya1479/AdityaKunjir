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

public class tablewithHashMap {
	
	void printTheCountOfEachDept() throws InterruptedException {
		WebDriver driver = LaunchBrowser.launchChrome("http://automationbykrishna.com/");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		WebElement demoTable = driver.findElement(By.xpath("//a[@id='demotable']"));
		demoTable.click();
		
		List<WebElement> EmpDept = driver
				.findElements(By.xpath("//table[@class='table table-striped']/tbody/tr/td[5]"));
		Map<String, Integer> deptMap = new LinkedHashMap<String, Integer>();
		for (WebElement deptElemnet : EmpDept) {
			String dept = deptElemnet.getText();
			if (deptMap.containsKey(dept)) {
				int count = deptMap.get(dept);
				deptMap.put(dept, count + 1);
			} else {
				deptMap.put(dept, 1);
			}

		}
		System.out.println(deptMap);
		driver.close();
	}
	
	void printThenameswhoseAgeisgreateThan50() {
		List<String> expectedList= new ArrayList<String>(Arrays.asList("Ashton Cox","Brielle Williamson"));
		List<String> ActualList= new ArrayList<String>();	
		WebDriver driver = LaunchBrowser.launchChrome("https://datatables.net/");
		List<WebElement> rowCount = driver.findElements(By.xpath("//table[@id='example']/tbody/tr"));
		System.out.println("Number of Rows  " + rowCount.size());
		for(int rowno=1; rowno<=rowCount.size(); rowno++) {
			String ageText = driver.findElement(By.xpath("//table[@id='example']/tbody/tr["+rowno+"]/td[4]")).getText();
			int Age= Integer.parseInt(ageText);
			if(Age>50) {
				String empName= driver.findElement(By.xpath("//table[@id='example']/tbody/tr["+rowno+"]/td[1]")).getText();
				ActualList.add(empName);	
			}
		}
		if(ActualList.equals(expectedList)) {
			System.out.println(ActualList+ "Test Passed");
		}else {
			System.out.println("Test Failed");
		}
		driver.close();
	}
	
	
	void printThenameswhoseAgeisgreateThan50andlocationisLondon() {
		List<String> expectedList= new ArrayList<String>(Arrays.asList("Angelica Ramos","Bradley Greer","Bruno Nash"));
		List<String> ActualList= new ArrayList<String>();	
		WebDriver driver = LaunchBrowser.launchChrome("https://datatables.net/");
		List<WebElement> rowCount = driver.findElements(By.xpath("//table[@id='example']/tbody/tr"));
		System.out.println("Number of Rows  " + rowCount.size());
		for(int rowno=1; rowno<=rowCount.size(); rowno++) {
			String ageText = driver.findElement(By.xpath("//table[@id='example']/tbody/tr["+rowno+"]/td[4]")).getText();
			String country = driver.findElement(By.xpath("//table[@id='example']/tbody/tr["+rowno+"]/td[3]")).getText();
			int Age= Integer.parseInt(ageText);
			if(Age<50 && country.equals("London")) {
				String empName= driver.findElement(By.xpath("//table[@id='example']/tbody/tr["+rowno+"]/td[1]")).getText();
				ActualList.add(empName);	
			}
		}
		if(ActualList.equals(expectedList)) {
			System.out.println(ActualList+ "Test Passed");
		}else {
			System.out.println("Test Failed");
		}
		driver.close();
	}
	public static void main(String[] args) throws InterruptedException {
		new tablewithHashMap().printTheCountOfEachDept();
		new tablewithHashMap().printThenameswhoseAgeisgreateThan50();
		new tablewithHashMap().printThenameswhoseAgeisgreateThan50andlocationisLondon();
	}
}
