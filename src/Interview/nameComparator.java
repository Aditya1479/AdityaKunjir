package Interview;

import java.util.Comparator;

public class nameComparator implements Comparator<Builder> {

	@Override
	public int compare(Builder o1, Builder o2) {
		// TODO Auto-generated method stub
		return o1.name.compareTo(o2.name);
	}

}
