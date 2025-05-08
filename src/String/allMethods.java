package String;

import java.util.Arrays;

public class allMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("  ".length());
		System.out.println("Aditya".replace("Ad", "ty"));
		System.out.println("A d i t y a".replace(" ", ""));
		System.out.println(Arrays.toString("1,2,4,5,".split(",")));
		System.out.println(Arrays.toString("Aditya".split("")));
		System.out.println("Aditya".toUpperCase());
		System.out.println("Aditya".toLowerCase());
		System.out.println("Aditya".isEmpty());
		System.out.println("Aditya".contains("it"));
		System.out.println(" Adi  tya ".trim());
		int num =123;
		System.out.println(String.valueOf(num));
		System.out.println("A d i t y a".equals("Aditya"));
		System.out.println("aditya".equalsIgnoreCase("Aditya"));
		System.out.println("Aditya".concat(" Kunjir"));
		System.out.println(Arrays.toString("Aditya".toCharArray()));
		System.out.println("Aditya".startsWith("Ad"));
		System.out.println("Aditya".endsWith("ya"));
		
		String s1 = new String("Harsh");
		String s2 = new String("Harsh");
		String s3="Harsh";
		String s4="Harsh";
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));//this checks the occurence
		System.out.println(s1==s2); //this check the referecne memory of object
		System.out.println(s3==s4);
	}

}
