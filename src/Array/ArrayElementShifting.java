package Array;

import java.util.Arrays;

public class ArrayElementShifting {
	
	void leftsidezero() {
		int num[]= {0,8,3,0,1,2,0,2,5,0,9,0};
		int temp[]= new int[num.length];
		int count=0;
		for(int i=0;i<temp.length;i++) {
			if(num[i]==0) {
				count++;
			}
		}
		
		for(int i=0, j=count;i<temp.length;i++) {
			if(num[i]!=0) {
				temp[j]=num[i]; 
				j++;
				
			}
		}
	System.out.println(Arrays.toString(temp));
	}
	
	
	void rightsidezero() {
		int num[]= {0,8,3,0,1,2,0,2,5,0,9,0};
		int temp[]= new int[num.length];
		int count=0;
		for(int i =0;i<temp.length;i++) {
		if(num[i]!=0) {
			temp[count++]=num[i];
		}
		}
		System.out.println(Arrays.toString(temp));
			
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[]= {0,8,3,0,1,2,0,2,5,0,9,0};
		//int out[]= {0,0,0,0,8,3,1,2,2,5,9};
		ArrayElementShifting ar = new ArrayElementShifting();
		ar.leftsidezero();
		ar.rightsidezero();
		
	}	
}
