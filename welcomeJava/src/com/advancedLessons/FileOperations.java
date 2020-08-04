package com.advancedLessons;

import java.io.*;
import java.io.FileNotFoundException;
import java.util.*;

public class FileOperations {
	public void readAndPrintFile(String filePath) 
			throws FileNotFoundException,IOException{
		File myObj = new File(filePath); // Specify the filename
		
		if(myObj.exists()) {
		      Scanner myReader = new Scanner(myObj);
		      while (myReader.hasNextLine()) {
		        String data = myReader.nextLine();
		        System.out.println(data);
		      }
		      myReader.close();
			
		}
		else {
			myObj.createNewFile();
			FileWriter fw = new FileWriter(myObj);
			fw.append("This is new content");
			fw.close();
		}
		
	}

}
