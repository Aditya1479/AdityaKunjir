package basic;

import java.util.ArrayList;

class CP {

	ArrayList<String> getUniqueNameList(ArrayList<String> CP) {
		ArrayList<String> CP1 = new ArrayList<String>();
		for (int index = 0; index < CP.size(); index++) {
			String name = CP.get(index);

			if (CP.indexOf(name) == CP.lastIndexOf(name)) {
				CP1.add(name);
			}
			
		}
		System.out.println(CP1);
		return CP1;
	}

	public static void main(String[] args) {
		CP cp = new CP();
		ArrayList<String> CP1 = new ArrayList<String>();
		CP1.add("sakshi");
		CP1.add("Nivedita");
		CP1.add("Swati");
		CP1.add("Nivedita");
		CP1.add("Onkar");
		CP1.add("Jay");
		CP1.add("Jyoti");
		CP1.add("Nivedita");
		cp.getUniqueNameList(CP1);
	}
}
