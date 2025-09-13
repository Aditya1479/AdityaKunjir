package Interview;

public class student {
	

	public student(int rno, String name, String city, double percentage, char grade) {
		super();
		this.rno = rno;
		this.name = name;
		this.city = city;
		this.percentage = percentage;
		this.grade = grade;
	}
	
	
	int rno;
	String name;
	String city;
	double percentage;
	char grade;

	@Override
	public String toString() {
		return name+ " - > " +rno;
		
	}

}
