package com.advancedLessons;

public class CarClass extends Machine{
	public static int counter = 0;
	
	public int wheels = 4;
	
	public CarClass() {
		super();
		this.machineName = "Car";
		counter++;
	}
	
	public CarClass(int wheels) {
		this();
		this.wheels = wheels;
	}

	public void driveCar() {

		System.out.println(machineName + " named " + this.toString() + " driving..\n");
	}

}

