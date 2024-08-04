package basic;

public class Practice1 {
	void display(String input) {
		
		for (int index = 0; index < input.length(); index++) {
			int count= 0;
			char ch = input.charAt(index);
			for(int innerIndex=0; innerIndex<input.length();innerIndex++) {
				if (ch == input.charAt(innerIndex)) {
					count++;
				}
			}	System.out.println(ch+ "====>" +count);					
		}
			
	}
		public static void main(String[] args) {
		Practice1 p = new Practice1();
		p.display("aaditya");
	}

}
