package Interview;

public class Assignment90 implements Comparable<Assignment90>{
	
	String name;
	int rno;
	double marks;
	String city;
	
	public Assignment90(String name, int rno, double marks, String city) {
		super();
		this.name = name;
		this.rno = rno;
		this.marks = marks;
		this.city = city;
	}
	
	@Override
	public String toString() {
		return name+ "->" +rno+ "->" +marks+ "->" +city;
		
	}
	
	public int compareTo(Assignment90 assignment90) {
		return this.rno- assignment90.rno;
		
	}
	
}
