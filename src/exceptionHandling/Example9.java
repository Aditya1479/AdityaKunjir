package exceptionHandling;

public class Example9 {
	int newm1() {
		try {
			System.out.println("Hi");
			String str="techno";
			return str.substring(3,9).length();
		}catch(Exception ee){
			System.out.println("Hello");
		}finally {
			return "tchnocredits".length();
		}
	}
	int newm2() {
		try {
			System.out.println("Hi");
			String str="techno";
			return str.substring(1,4).length();
		}catch(Exception ee){
			System.out.println("Hello");
		}finally {
			return "tchnocredits".substring(7,20).length();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new Example9().newm1());
		System.out.println(new Example9().newm2());
	}

}
