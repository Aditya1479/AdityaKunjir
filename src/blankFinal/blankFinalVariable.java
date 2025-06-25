package blankFinal;

public class blankFinalVariable {
	
	final String gstNumber;
	final static int num;
	
	static {
		num=10;
	}
	
	
	blankFinalVariable(String gstnumber){
		this.gstNumber=gstnumber;
	}
	
	public blankFinalVariable() {
		this("a21311");
	}

		public static void main(String[] args) {
			blankFinalVariable a = new blankFinalVariable("a2121aaaaaaaa");
			blankFinalVariable a1 = new blankFinalVariable();
		}
}
