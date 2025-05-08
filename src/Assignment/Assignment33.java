package Assignment;

public class Assignment33 {
	
	void sumOfallEvent(int[] arr) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2 ==0) {
				sum= sum + arr[i];
			}
		}
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment33 as = new Assignment33();
		int[] input = {10,11,44,33,23};
		as.sumOfallEvent(input);
	}

}
