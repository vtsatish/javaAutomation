package CollectionsTests;

import java.util.LinkedList;

import com.advancedLessons.CarClass;

public class LinkedClass {
	LinkedList<CarClass> carList = new LinkedList<CarClass>();
	
	public void addLinkedList() {
		carList.add(new CarClass());
		carList.addFirst(new CarClass());
		
	}
	
	public void iterateLinkedList() {
		for(CarClass cl: carList) {
			cl.driveCar();
		}
		
	}
	
	public void removeLinkedList() {
		carList.removeFirst();
		
	}

}
