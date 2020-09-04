package com.CollectionsTests;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import com.advancedLessons.Human;

public class ArrayListClass {
	
	ArrayList<Human> alh = new ArrayList<Human>();
	public void addHumans() throws Exception {
		alh.add(new Human());
		Thread.sleep(1000);
		alh.add(new Human());
		Thread.sleep(1000);
		alh.add(new Human());
		Thread.sleep(1000);
		alh.add(new Human());
		
	}
	
	public void sortHumans() {
		
		Collections.sort(alh, new sortByDate());
		
	}

	public void displayHumans() {
		// TODO Auto-generated method stub
		for(Human hm: alh) {
			System.out.println(hm.name);
		}
		
	}

}

class sortByDate implements Comparator<Human>{

	@Override
	public int compare(Human o1, Human o2) {

		return o1.name.compareTo(o2.name);
	}
	
}
