package Encapsulation;

public class client {

		public static void main(String[] args) {
			car c = new car();
			c.setSpeed(-250);
			//Car speed cant be negative value
			//so class should be logically correct
			
			c.speed=-250;
			//you are accessing instance variable directly it should be private
			
			c.display();
		}
}
