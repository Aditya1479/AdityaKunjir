package Contructor;

public class Child extends Parent {
//if default constructor is not defined in parent class it will throw an error
//Resolution: you need to create paramterized constructor in current class.	
//For eg:
	public Child() {
		super(10);
	}

}
