//Write a method which displays swapping of first string with last string in given array
package Interview;

public class ArrayQ1 {
	
	void m1(String[] input) {
		String temp="";	
		getarraylist(input);
		temp=input[0];
		input[0]=input[input.length-1];
		input[input.length-1]=temp;
		System.out.println("----------------------");
		getarraylist(input);
	}
	String[] getarraylist(String[] a) {
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}	
		return a;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr ={ "Aditya", "Sayali", "Deepak", "Nivedita" };
		
		ArrayQ1 Q1 = new ArrayQ1();
		Q1.m1(arr);
	}

}
