package TestNGseleniumPacakage;

import org.testng.annotations.Test;

public class dependsOn {
	
	@Test
	void searchAddToCart() {
		System.out.println("searchAddToCart");
	} 
	
	@Test (dependsOnMethods="searchAddToCart")
	void verifyAddToCart() {
		System.out.println("verifyAddToCart");
	}
	
	@Test (dependsOnMethods={"verifyAddToCart","searchAddToCart"})
	void verifyProductPayment() {
		System.out.println("verifyProductPayment");
	}
}
