package CollectionsPackage.List;

import java.util.ArrayList;

public class evenSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int evenSum=0;
		ArrayList<Integer> num1 = new ArrayList<Integer>();
			num1.add(12);
			num1.add(13);
			num1.add(15);
			num1.add(17);
			num1.add(10);
//			
//		for(int index=0;index<num1.size();index++) {
//			int num= num1.get(index);
//			if(num%2==0) {
//				evenSum= evenSum+num;
//			}
//		}
		//Enhanced for loop num1 will hold group of elements and no will hold actual value with index 
			
		for(int no: num1) {
			if(no%2==0) {
				evenSum= evenSum+no;
			}
		}
			
		System.out.println(evenSum);
	}	

}
