package com.advancedLessons;
import com.Intermediate.*;

public class RunClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarClass satcar = new CarClass(5);
		satcar.start();
		satcar.driveCar();
		satcar.stop();
		
		EmployeeClass ecl = new EmployeeClass();
		 System.out.println(ecl.getEmpId()); 
		 
		 CarClass ccl = new CarClass();
		 Human hm = new Human();
		 
		 EntityInterface eifm = ccl;
		 eifm.showInfo();
		 EntityInterface eifh = hm;
		 eifh.showInfo();
		 

	}

}
