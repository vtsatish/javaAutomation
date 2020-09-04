package com.welcomeJava;
import java.util.*;

public class FirstClass {

	public static void main(String[] args) {
		//Simple print
		System.out.println("First Class Welcome");
		
		//Use Variable
		VariableLearn vl = new VariableLearn();
		System.out.println("Variables are \n");
		System.out.println(vl.smallnum + "\n");
		System.out.println(vl.num + "\n");
		System.out.println(vl.lnum + "\n");
		System.out.println(vl.dnum + "\n");
		
		if(!vl.condition) {
			System.out.println(vl.mychar + "\n");
			System.out.println(vl.bchar + "\n");
		}
		
		//working with text
		System.out.println("The original string : " + vl.str + "\n");
		System.out.println("---------------------------------------");

		//while loop
		while(vl.num >= 0) {
			System.out.println("\n looping count " + vl.num);
			vl.num--;
		}
		
		//for loop
		for(int i=0; i<=5;i++) {
			System.out.println("\n looping for count : " + i);
		}
	}

}
