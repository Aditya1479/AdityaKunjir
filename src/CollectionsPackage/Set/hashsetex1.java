package CollectionsPackage.Set;

import java.util.HashSet;

public class hashsetex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs = new HashSet<String>();
		
		hs.add("client1");
		hs.add("client2");
		hs.add("client3");
		hs.add("client1");
		hs.add("client4");
		hs.add("client4");
		hs.add("client2");
		hs.add("client4");
		hs.add("client2");
		
		System.out.println(hs.size());
		System.out.println(hs);
	}

}
