package Interview;

import java.util.Comparator;

public class yearsOfExperienceComparator implements Comparator<Builder>{

	@Override
	public int compare(Builder o1, Builder o2) {
		// TODO Auto-generated method stub
		return o1.yoe-o2.yoe;
	}

}
