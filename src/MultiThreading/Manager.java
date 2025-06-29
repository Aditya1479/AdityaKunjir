package MultiThreading;

public class Manager {
		
	public static void main(String[] args) {
		
	
	Employee emp = new Employee();
	emp.setName("Aditya");
	emp.start(); //start method calls the run method present inside employee class
	
	Employee2 emp2= new Employee2();
	emp2.setName("Aakanksha");
	emp2.start();//start method calls the run method present inside employee2 class
	
	System.out.println("End");
	}
}