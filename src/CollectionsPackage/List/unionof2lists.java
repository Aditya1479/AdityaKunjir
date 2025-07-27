package CollectionsPackage.List;

import java.util.ArrayList;
import java.util.List;

public class unionof2lists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Double> num1= new ArrayList<Double>();
		num1.add(10.20);
		num1.add(05.23);
		num1.add(99.123);
		
		List<Double> num12= new ArrayList<Double>();
		num12.add(1.2);
		num12.add(05.23);
		num12.add(3.123);
		
		System.out.println(num1);
		System.out.println(num12);
		num1.addAll(num12); //it will append all num2 elements after the num1 elements.
		System.out.println(num1);
	}

}
