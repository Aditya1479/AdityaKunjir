package Interview;

public class StaticBlock {
	
	static {
		System.out.println("hi");
	}
	
	{
		System.out.println("gm");
	}
	public static void main(String[] args) {
		System.out.println("hello");
		StaticBlock s = new StaticBlock();
		System.out.println("techno");
		StaticBlock s1 = new StaticBlock();
		System.out.println("credits");
		
	}

}
