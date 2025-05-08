package Assignment;
class Assignment25{
	void display(String input){
		for(int index=0; index<input.length();index++){
			int count=0;
			char ch = input.charAt(index);
			if(ch != '*'){
				for(int innerIndex=0;innerIndex<input.length();innerIndex++){
					if(ch == input.charAt(innerIndex)){
						count++;	
					}
				}
				input=input.replace(ch,'*');
				System.out.println(ch+ " -> " +count);
			}
		}
		
	}
	 
	public static void main(String[] args){
		Assignment25 f = new Assignment25();
		f.display("aakanskha");
	}
}
					