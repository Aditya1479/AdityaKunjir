package Array;

public class CaseChange {

	void m1(String[] arr) {
		
		for(int i=0; i<arr.length;i++) {
			String output="";
			for(int j=0; j<arr[i].length();j++) {
				char ch = arr[i].charAt(j);
				if(Character.isUpperCase(ch)) {
					output +=Character.toLowerCase(ch);
				}
				else {
					output+=Character.toUpperCase(ch);
				}
			}
		System.out.println(output);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] input= new String[4];
		input[0]="Rahu2l";
		input[1]="technocredits";
		input[2]="J1ay6";
		input[3]="credits1";
		CaseChange cc = new CaseChange();
		cc.m1(input);
	}

}
