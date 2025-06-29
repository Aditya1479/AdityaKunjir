package String;

public class stringBufferBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder builder = new StringBuilder("Aditya");
		builder.append("Mukund");
		builder.append("Kunjir");
		System.out.println(builder);
		
		///String class implementation for comparison
		String builder1 = new String("Aditya");
		builder1=("Mukund");
		builder1=("Kunjir");
		System.out.println(builder1);
		
		
		//In this  string class case Memory is initialised 11 times
		String str ="hi";
		for(int i=0; i<=10;i++) {
			str = str+i;
		}
		
		//In this  StringBuilder class case Memory is initialised 1 times
		StringBuilder str1 = new StringBuilder("hi");
		for(int i=0; i<=10;i++) {
			str1.append(i);
		}
		
	}

}
