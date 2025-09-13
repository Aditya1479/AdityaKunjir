package Interview;

public class Builder implements Comparable<Builder>{
	
	String name;
	String city;
	int revenue;
	int yoe;
	
	public Builder(String name, String city, int revenue, int yoe) {
		super();
		this.name = name;
		this.city = city;
		this.revenue = revenue;
		this.yoe = yoe;
	}
	
	@Override
	public String toString() {
		return name+ "->" +city+ "->" +revenue+ "->" +yoe ;
		
	}




	@Override
	public int compareTo(Builder builder) {
		// TODO Auto-generated method stub
		return this.revenue- builder.revenue;
	}
	
}
