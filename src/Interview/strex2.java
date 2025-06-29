package Interview;

//== operator checks the memory location
//equals() comapres the content

public class strex2 {
	
	public static void main(String[] args) {
		
		
		String str1 = new String("techno");
		String str2= "techno";
		String str3= "techno";
		String str4 = new String("techno");
		
		if(str1==str2) {
			System.out.println(1);
		}
		
		if(str1==str3) {
			System.out.println(2);
		}
		
		if(str1==str4) {
			System.out.println(3);
		}
		
		if(str2==str3) {
			System.out.println(4);
		}
		
		if(str1.equals(str2)) {
			System.out.println(5);
		}
		
		if(str1.equals(str3)) {
			System.out.println(6);
		}
		
		if(str1.equals(str4)) {
			System.out.println(7);
		}
		System.out.println("end");
		
	}
	
}
