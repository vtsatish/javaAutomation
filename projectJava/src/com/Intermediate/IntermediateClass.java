package com.Intermediate;

public class IntermediateClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LearnObjectProgramming lop = new LearnObjectProgramming();
		
		//Arrays
		lop.initArrayValues();
		for(int i=0;i<lop.aval.length;i++) {
			System.out.println("\n Array value of " + i + " is : " + lop.aval[i]);
		}
		
		for(String singlefruit : lop.fruits) {
			System.out.println("\n fruit is : " + singlefruit);
			
		}
		
		//multi dimension array
		for (int row =0 ; row < lop.grid.length; row++) {
			for(int col =0; col< lop.grid[row].length; col++) {
				System.out.println("\n Row is " + row + " and Column is " + col + " with value as " + lop.grid[row][col]);
				System.out.println("The year of birth for the person with age" +lop.grid[row][col]+  " is " + lop.calculateYob(lop.grid[row][col]));
			}
		}
		
		//Class, Methods,Return values
		EmployeeClass emp = new EmployeeClass();
		//emp.setEmpId(1);
		//emp.setEmpName("First Employee");
		System.out.println("\nName is " + emp.getEmpName() + " and employee id is: " + emp.getEmpId());
		System.out.println("\nStatic is same for all the objects and classes:\n");
		System.out.println(EmployeeClass.employerRegname);
		
		EmployeeClass emparray[] = new EmployeeClass[5];
		
		for(EmployeeClass empind : emparray) {
			empind = new EmployeeClass();
			System.out.println(empind.getEmpName() + "\n");
			System.out.println(empind.getEmpId() + "\n");
		}
		
		EmployeeClass.stmethod();
		
		StringBuffer stb = new StringBuffer("Initial");
		System.out.println(stb.substring(0, 3));
		
		System.out.println(emp.toString());
		emp = null;
		System.out.println(emp);

	}

}
