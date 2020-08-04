package com.advancedLessons;
import java.io.*;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.*;
import java.time.format.DateTimeFormatter;


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
		 
		 LocalDateTime myObj = LocalDateTime.now();
		 System.out.println(myObj);
		 DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		 System.out.println(myObj.format(dtf));
		 
		 hm.addFriends();
		 hm.listFriends();

		 /* File operations*/		
		 FileOperations fop = new FileOperations();
		 try {
			fop.readAndPrintFile("newfile.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			System.out.println("Could not catch..\n");
		}
		 
/* process example*/		 
		 String command = "ping www.codejava.net";
		 
		 try {
		     Process process = Runtime.getRuntime().exec(command);
		  
		     BufferedReader reader = new BufferedReader(
		             new InputStreamReader(process.getInputStream()));
		     String line;
		     while ((line = reader.readLine()) != null) {
		         System.out.println(line);
		         System.out.println(Colors.Blue.toString());
		     }
		  
		     reader.close();
		  
		 } catch (IOException e) {
		     e.printStackTrace();
		 }
		
		 

	}

}
