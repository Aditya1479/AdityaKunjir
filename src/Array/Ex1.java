package Array;

import java.util.Arrays;

public class Ex1 {
	int[] arr = {1,2,3,22,31,122};
	String[] names = {"Aditya","Harsh","Maulik","Krishna"};
	void m1 () {
		System.out.println("Length of array " +arr.length);
		System.out.println(Arrays.toString(names)+ "Length is " +names.length);
		System.out.println();
	}
	
	void m2(int[] arr) {
		System.out.println("Length Or array " +arr.length);
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {12,231,22};
		Ex1 ex = new Ex1();
		ex.m1();
		System.out.println("-------------------------------");
		ex.m2(a);
	}

}
