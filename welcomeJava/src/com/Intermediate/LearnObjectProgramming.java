package com.Intermediate;
import java.time.*;

public class LearnObjectProgramming {
	int alen = 3;
	int[] aval = new int[alen];
	int[] number = {5,6,7,8,9};
	String[] words = new String[5];
	String[] fruits = {"apple", "banana", "Gua", "Grapes", "Mango"};
	int [][] grid = {
			{101,201,301},
			{401,501,601},
			{701,801,901}
	};
	
	public void initArrayValues() {
		for(int i=0 ; i<aval.length ; i++) {
			aval[i] = i*10;
		}
	}
	
	public void initStringValues() {
		words[0] = "Hello";
		words[1] = "words";
		words[2] = "are";
		words[3] = "used for";
		words[4] = "learning";
	}
	
	public int calculateYob(int age) {
		LocalDateTime  datenow = LocalDateTime .now();
		LocalDateTime yob = datenow.minusYears(age);

		return yob.getYear();
	}

}
