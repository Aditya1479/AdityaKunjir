//Write a program to print non repeatative character from given String.

package Assignment;
public class Assignment22 {
	
	int getCharFreq(String input, char ch) {
		int count=0;
		for(int i=0; i<input.length();i++) {	
			if(input.charAt(i)==ch) {
				count++;
			}
		}
		return count;
	}

	void nonRepeatative(String input) {
		String output="";
		int count=0;
		for(int index=0;index<input.length();index++) {
			char ch =input.charAt(index);
			int frequency= getCharFreq(input, ch);
			if(frequency<2 && frequency>0) {
				output=output+ch;
				count=frequency;
			}
		}
		System.out.println(output + "---> " +count);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment22 as22 = new Assignment22();
		as22.nonRepeatative("technocredits");
	}

}
