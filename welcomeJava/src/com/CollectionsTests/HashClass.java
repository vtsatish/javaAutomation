package com.CollectionsTests;

import java.util.HashMap;
import java.util.Map;

public class HashClass {
	HashMap<String, Integer> wordCount = new HashMap<String, Integer>();
	public void addToMap() {
		if(wordCount.containsKey("A")) {
			wordCount.replace("A", wordCount.get("A")+1);

		}
		else {
			wordCount.put("A", 1);
		}
		
	}
	public void iterateMap() {
		for(Map.Entry<String, Integer> myEntry : wordCount.entrySet()) {
			System.out.println(myEntry.getKey() + myEntry.getValue());
		}
		
	}
	public void removeFromMap() {
		wordCount.remove("A");
		
	}

}
