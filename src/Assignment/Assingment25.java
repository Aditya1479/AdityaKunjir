package Assignment;

public class Assingment25 {

	void m1(String input) {
		for(int i=0; i<input.length();i++) {
			char ch = input.charAt(i);
			int count=0;
			if(ch!='*') {
			for(int index=0;index<input.length();index++) {
				if(ch==input.charAt(index)) {
					count++;
				}
			}
			input= input.replace(ch, '*');
			System.out.println(ch+ " " +count);
			}
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assingment25 as25= new Assingment25();
		as25.m1("aakansha");
	}

}
