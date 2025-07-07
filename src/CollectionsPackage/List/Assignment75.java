//If given character having multiple occurances then replace first occurances with character 'a' and last occurances of the same character with 'b'.

package CollectionsPackage.List;

import java.util.ArrayList;

public class Assignment75 {

	ArrayList<Character> m1(ArrayList<Character> input) {
		for (int i = 0; i < input.size(); i++) {
			char ch = input.get(i);
			if (input.indexOf(ch) != input.lastIndexOf(ch)) {
				input.set(input.indexOf(ch), 'a');
				input.set(input.lastIndexOf(ch), 'b');
			}
		}

		return input;

	}

	public static void main(String[] args) {
		Assignment75 a75 = new Assignment75();
		ArrayList<Character> charList = new ArrayList<Character>();
		charList.add('e');
		charList.add('p');
		charList.add('t');
		charList.add('q');
		charList.add('a');
		charList.add('c');
		charList.add('t');
		charList.add('t');
		charList.add('u');
		System.out.println(charList);
		ArrayList<Character> output = a75.m1(charList);
		System.out.println(output);
	}
}
