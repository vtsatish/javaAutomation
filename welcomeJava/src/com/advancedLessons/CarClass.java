package com.advancedLessons;

public class CarClass extends Machine{
	
	public int wheels = 4;
	
	public CarClass() {
		super();
		this.machineName = "Car";
	}
	
	public CarClass(int wheels) {
		this();
		this.wheels = wheels;
	}

	public void driveCar() {
		System.out.println(machineName + "driving..\n");
	}

}
