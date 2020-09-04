package com.CollectionsTests;

import java.util.Iterator;
import java.util.LinkedList;

import com.advancedLessons.CarClass;

public class LinkedClass {
	LinkedList<CarClass> carList = new LinkedList<CarClass>();
	
	public void addLinkedList() {
		carList.add(new CarClass());
		carList.addFirst(new CarClass());
		
	}
	
	public void iterateLinkedList() {
		
		Iterator<CarClass> ir = carList.iterator();
		while(ir.hasNext()) {
			ir.next().driveCar();
		}
		
	}
	
	public void removeLinkedList() {
		carList.removeFirst();
		
	}

}
