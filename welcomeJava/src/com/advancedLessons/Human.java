package com.advancedLessons;

import java.util.ArrayList;

public class Human implements EntityInterface{

	 ArrayList<String> al = new ArrayList<String>();
	
	public void readText(){
		
	}
	
	@Override
	public void showInfo() {
		// TODO Auto-generated method stub
		System.out.println("Human Info");
	}
	
	public void addFriends() {

		 al.add("A");
		 al.add("B");
		 
		 
	}
	
	public void listFriends() {
		for(String str: al) {
			System.out.println(str+"\n");
		}
	}
	
	public void listFriends(ArrayList<?> newal) {
		
		for(Object obnew: newal) {
			System.out.println(obnew);
		}
		
	}

}
