package CollectionsPackage.List;

import java.util.ArrayList;
import java.util.List;

public class IntersectionofList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> num1= new ArrayList<Integer>();
		num1.add(10);
		num1.add(05);
		num1.add(99);
		
		ArrayList<Integer> num12= new ArrayList<Integer>();
		num12.add(10);
		num12.add(05);
		num12.add(3);
		
		System.out.println(num1);
		System.out.println(num12);
		
		num1.retainAll(num12);//will retain only common elements from num1 and num2
		System.out.println(num1);
		System.out.println(num12);
		
	}

}
