package CollectionsPackage.List;

import java.util.ArrayList;

public class ArrayList6 {
	{
		System.out.println("hi");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList6 aa = new ArrayList6();
		ArrayList<String> demo = new ArrayList();
		demo.add("Aditya");
		demo.add("Mukund");
		demo.add("Kunjir");
		demo.add("Radhika");
		demo.add("vrushali");
		demo.add("Chiuu");
		demo.add("Kunjir");
		System.out.println(demo);
		demo.remove("Kunjir");
		demo.remove(2);
		System.out.println(demo);
		
	}

}
