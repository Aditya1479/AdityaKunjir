package TestNGParameter;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class p1 {
	
	@Parameters({"browser","env"})
	@Test
	public void m1(@Optional("firefox") String browser,@Optional("Prod") String env) {
		System.out.println(browser+ " : " +env);
	}	
	
}
