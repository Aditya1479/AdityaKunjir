package CollectionsPackage.List;

import java.util.ArrayList;

public class ArrayList5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> demo = new ArrayList();
		demo.add("Aditya");
		demo.add("Mukund");
		demo.add("Kunjir");
		demo.add("Radhika");
		demo.add("vrushali");
		demo.add("Chiuu");
		
		System.out.println(demo);
		
		//set method replace the string at given index
		String temp=demo.set(2, "Akanksha");//temp will display previous value= kunjir
		temp=demo.set(2, temp);
		System.out.println(temp);	
		System.out.println(demo.get(2));
		
		}	

}
