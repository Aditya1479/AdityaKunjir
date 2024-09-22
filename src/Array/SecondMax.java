package Array;

public class SecondMax {
	
	void m1(int[] input) {
		int firstMax= input[0];
		int SecondMax=input[1];
		if(firstMax<SecondMax) {
			firstMax=SecondMax;
			SecondMax=firstMax;
		}	
		for(int i=2;i<input.length;i++) {
			int no= input[i];
			if(firstMax<no) {//131<4891
				SecondMax=firstMax; //131
				firstMax=no; //4891			
			}
			else if(SecondMax<input[i]){
				SecondMax=input[i];
			}
		}
		System.out.println(firstMax);
		System.out.println(SecondMax);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SecondMax s = new SecondMax();
		int[] age= {131,45,2,4891,89,911};
		s.m1(age);
	}

}
