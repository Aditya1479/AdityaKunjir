package Interview;

import java.util.TreeMap;
import java.util.TreeSet;

public class sortingwithStringBuilder {
	
	public static void main(String[] args) {
		
		TreeMap<StringBuilder, Integer> tp = new TreeMap<StringBuilder, Integer>();
		tp.put(new StringBuilder("Maulik"),11 );
		tp.put(new StringBuilder("Krishna"),12 );
		tp.put(new StringBuilder("Harsh"),2 );
		tp.put(new StringBuilder("Margi"),4 );
		System.out.println(tp);
		
		
		TreeSet<String> ts = new TreeSet<String>();
		ts.add("Maulik");
		ts.add("Krishna");
		ts.add("Harsh");
		ts.add("Margi");
		System.out.println(ts);
	}
}
