package CollectionsPackage.Map;

import java.util.HashMap;
import java.util.Map;

public class mapex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> listofBuilder= new HashMap<String,Integer> ();
		listofBuilder.put("Kalpataru", 30);
		listofBuilder.put("Rohan", 80);
		listofBuilder.put("A1", 20);
		listofBuilder.put("Balaji", 35);
		//if you add same key with different value then value is older value override and new value is displayed
		listofBuilder.put("Balaji", 36);
		System.out.println(listofBuilder);
		System.out.println(listofBuilder.size());
		
		int temp= listofBuilder.put("Balaji", 92);
		System.out.println(temp);
		temp = listofBuilder.get("Balaji");
		System.out.println(temp);
		
		System.out.println(listofBuilder.containsKey("A1"));
		System.out.println(listofBuilder.containsValue(30));
	}

}
