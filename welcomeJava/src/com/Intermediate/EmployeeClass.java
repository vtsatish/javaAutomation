package com.Intermediate;

 public class EmployeeClass {
	private String empName;
	private int empId;
	public static int classCounter = 0;
	public static String employerRegname = "Corporate inc";
	public final static int employerRCnumber = 1001;

	
	public EmployeeClass(String empName, int empId) {
		this.empName = empName;
		this.empId = empId;
		classCounter++;

	}
	public EmployeeClass() {
		System.out.println("\nDefault constructor with out parameters..\n");
		classCounter++;
		this.empName = "Place Holder Name";
		this.empId = classCounter;

	}
	
	public static void stmethod() {
		System.out.println("This is the static method.. and counter is :" + classCounter);
		
	}
	
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}

}
