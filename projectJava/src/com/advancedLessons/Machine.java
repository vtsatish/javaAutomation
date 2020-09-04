package com.advancedLessons;
 
public class Machine implements EntityInterface{
	protected String machineName = "Default";
	private String color = "Default";
	public void start() {
		System.out.println(machineName + " started...\n");
	}
	
	public void stop() {
		System.out.println(machineName + " stopped...\n");
	}

	@Override
	public void showInfo() {
		// TODO Auto-generated method stub
		System.out.println("Machine Info");
	}

}
