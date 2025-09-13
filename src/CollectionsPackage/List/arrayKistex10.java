package CollectionsPackage.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class arrayKistex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> l1 = new ArrayList(Arrays.asList("Aa","ee","cc","ddd"));
			System.out.println(l1);
			
			Collections.sort(l1);
			System.out.println(l1);
			
			Collections.sort(l1,Collections.reverseOrder());
			System.out.println(l1);
			
		TreeSet<String> t1= new TreeSet(Collections.reverseOrder());
		t1.add("Ab");
		t1.add("Bc");
		t1.add("Cd");
		System.out.println(t1);
		
	}

}
