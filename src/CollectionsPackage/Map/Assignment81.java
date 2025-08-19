package CollectionsPackage.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Assignment81 {
	void printWordfreq(String str) {
		String[] arrOfdWords= str.split(" ");
		Map<String,Integer> mapOfWords= new <String,Integer> HashMap();
		
		for(String word: arrOfdWords) {
			if(mapOfWords.containsKey(word)) {
				int count= mapOfWords.get(word);
				mapOfWords.put(word, count+1);
			}else {
				mapOfWords.put(word, 1);
			}
		}
		System.out.println(mapOfWords);
	}
	
	//how to return any hashMap
	Map<String,Integer> getrintWordfreq(String str) {
		String[] arrOfdWords= str.split(" ");
		Map<String,Integer> mapOfWords= new <String,Integer> TreeMap();
		
		for(String word: arrOfdWords) {
			if(mapOfWords.containsKey(word)) {
				int count= mapOfWords.get(word);
				mapOfWords.put(word, count+1);
			}else {
				mapOfWords.put(word, 1);
			}
		}
		return mapOfWords;
	}
	
	void printWord(Map<String,Integer> wordMap ) {
		Set<String> keys= wordMap.keySet();
		for(String currentKey: keys) {
			if(wordMap.get(currentKey)>1) {
				System.out.println(currentKey + "->"  +wordMap.get(currentKey));
			}
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "hello techno techno hi credits hi techno hello techno";
		Assignment81 as81= new Assignment81();
		//as81.printWordfreq(str);
		Map<String,Integer>wordFreqMap=as81.getrintWordfreq(str);
		as81.printWord(wordFreqMap);
	}

}
