package basic;

class Test {
	void m1(String input) {
		for(int i=0;i<input.length();i++) {
			int count=0;
			char ch = input.charAt(i);
			if( ch != '*') {
			for(int inner=0;inner<input.length();inner++) {
				if(ch == input.charAt(inner)) {
					count++;
				}
			}
			System.out.println(ch+ ":- " +count);
			input=input.replace(ch, '*');
			}
		}
	}

	public static void main(String[] args) {
		Test t = new Test();
		t.m1("Aakanksha");
	}
}