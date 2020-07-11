package com.advancedLessons;
 
public class Machine {
	protected String machineName = "Default";
	private String color = "Default";
	public void start() {
		System.out.println(machineName + " started...\n");
	}
	
	public void stop() {
		System.out.println(machineName + " stopped...\n");
	}

}
