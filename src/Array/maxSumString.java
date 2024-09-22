package Array;

public class maxSumString {
	void m1(String[] arr) {
		int maxSum = 0;
		String maxSumName = "";
		for(int i=0; i<arr.length; i++) {
			int sum=0;
			for(int j=0; j<arr[i].length(); j++) {
				char ch = arr[i].charAt(j);
				if(Character.isDigit(ch)) {
					sum += Character.getNumericValue(ch);
				}
			}
			if(sum>maxSum) {
				maxSum = sum;
				maxSumName = arr[i];
			}
		}
		System.out.println("Name having max digit sum is: "+maxSumName+" ---> "+maxSum);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] input = new String[4];
		input[0] = "Ra98hu2l";
		input[1] = "technocredits";
		input[2] = "J6ay6";
		input[3] = "c999redits1";

		maxSumString mm = new maxSumString();
		mm.m1(input);
	}

}
