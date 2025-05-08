package Assignment;

public class RemovespecificChar {

	void m1(String input, char ch) {
		String output = "";
		int firstindex = input.indexOf(ch);
		int lastIndex = input.lastIndexOf(ch);
		for (int i = 0; i < input.length(); i++) {
			if (i !=firstindex && i!= lastIndex) {
				input=input.replace(input.charAt(lastIndex), ' ');
				input=input.replace(input.charAt(firstindex), ' ');
			}
		}
		System.out.println(output);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemovespecificChar rc = new RemovespecificChar();
		rc.m1("JayKauamarapqw", 'a');
	}

}
