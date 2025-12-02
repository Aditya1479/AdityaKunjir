package seleniumAssertPacakage;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class seleniumSoftAssert {
	
	@Test
	void verifySoftAsseet() {
		String str="ADDDDDDDDDDDDDDDDDDd";
		String str1="Aditya";
		SoftAssert softAssert = new SoftAssert();
		System.out.println(1);
		softAssert.assertTrue(1==2, "Comparing the 1 with 2");
		System.out.println(2);
		softAssert.assertEquals(str, str1 , "str value " + str + " is not qual to str1 " +str1 );
		
		Assert.assertEquals(34, 44);
		System.out.println("After Hard Assert");
		System.out.println("Script execution will be stopped after failure of Hard Assert");
		System.out.println(3);
		softAssert.assertNotNull(str);
		System.out.println(str);
		
		softAssert.assertAll();
		System.out.println("hii");
	}
}
