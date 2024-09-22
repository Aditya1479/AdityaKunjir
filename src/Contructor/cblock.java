package Contructor;

public class cblock extends pblock {
	{
		System.out.println(5);
	}
	cblock(){
		System.out.println(4);
	}
	cblock(boolean b){
		this();
		//this();
		System.out.println(6);
	}
	public static void main(String[] args) {
		cblock c = new cblock(true);
	}

}
