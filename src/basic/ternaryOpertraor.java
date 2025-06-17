package basic;

public class ternaryOpertraor {
	
	
	void m1() {
		String name="";
		int x= 9;
		if(x%3==0) {
			name="techno";
			System.out.println(name);
		}else {
			name="credits";
			System.out.println(name);
		}
	}
	
	
	void m2(int x) {
		String name="";
		name= x%3==0 ? "techno" : "credits" ;
		System.out.println(name);
	}	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ternaryOpertraor t1 = new ternaryOpertraor();
		t1.m1();
		
		t1.m2(10);
	}

}
