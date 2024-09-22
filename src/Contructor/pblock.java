package Contructor;

public class pblock {
	{
		System.out.println(2);
	}
	pblock(){
		System.out.println(1);
	}
	pblock(String str){
		this();
		System.out.println(3);
	}
}
