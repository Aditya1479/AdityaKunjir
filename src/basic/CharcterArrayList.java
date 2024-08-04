package basic;

import java.util.ArrayList;

public class CharcterArrayList {

	void GetUniqueList(ArrayList<Character> Clist, char ch) {
		if(Clist.contains(ch)) {
			if (Clist.indexOf(ch) != Clist.lastIndexOf(ch)) {
				Clist.set(Clist.indexOf(ch), 'a');
				Clist.set(Clist.lastIndexOf(ch), 'b');
			}
		}System.out.println(Clist);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 

		ArrayList<Character> CharacterList = new ArrayList<Character>();
		CharacterList.add('e');
		CharacterList.add('p');
		CharacterList.add('t');
		CharacterList.add('q');
		CharacterList.add('a');
		CharacterList.add('c');
		CharacterList.add('t');
		CharacterList.add('t');
		CharacterList.add('u');
		System.out.println(CharacterList);
		char ch = 't';
		new CharcterArrayList().GetUniqueList(CharacterList,ch);

	}

}
