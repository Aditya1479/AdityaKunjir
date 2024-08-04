package Interview;
public class StringsMethods {
	
	//Method which prints the all character in the string in forward
	void ForwardString(String input)
	{
		int count =0;
		for(int i= 0;i <input.length();i++) {
			System.out.println(i + " Character is  " + input.charAt(i));
		}
	}
	
	
	//Method which prints the all character in the string in Reverse
	void BackwardString(String input)
		{
			for(int i= input.length()-1;i >=0;i--) {
				System.out.println(i + " Character is  " + input.charAt(i));
			}	
	}
	
	void CharcterFrequency(String input, char ch)
	{
		int count =0;
		for(int i= 0;i <input.length();i++) {
		if(input.charAt(i)== ch) {
			count++;		
			}
		}
		System.out.println(" Frequency of " +ch+ " in " +input+ " -> "+count);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "Akanksha";
		System.out.println(input.length());
		StringsMethods s = new StringsMethods();
		s.ForwardString(input);
		System.out.println("=================================");
		s.BackwardString(input);
		System.out.println("=================================");
		s.CharcterFrequency(input, 'A');
	}

}