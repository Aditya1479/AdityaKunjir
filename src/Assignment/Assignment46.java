//Print the name having maximum digit sum from given array.
package Assignment;

public class Assignment46 {
	
	void printmaxdigitInString(String[] input) {
		int maxDigitSum=0;
		String name=" ";
		for(int i=0;i<input.length;i++) {
			int sum= digitSum(input[i]);
			if(sum>maxDigitSum) {
				maxDigitSum=sum;
				name=input[i];
			}
			
		}
		System.out.println(name+" -> " +maxDigitSum);
	}
	
	int digitSum(String input) {
		int num=0;
		for(int i=0;i<input.length();i++) {
			char ch = input.charAt(i);
			if(Character.isDigit(ch)) {
				num=num+ Character.getNumericValue(ch);			
			}
		}		
		return num;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] input = new String[4];
		input[0] = "Rah2u4l";
		input[1] = "Tech3no3credits";
		input[2] = "J6a6y";
		input[3] = "cred5it2s";
		
		Assignment46 as46= new Assignment46();
		as46.printmaxdigitInString(input);
	}

}
