package com.DSA;

public class ClassArray {
	int[] arrayVariable;
	
	public ClassArray(int size) {
		arrayVariable = new int[size];
		
	}

	public void showArray() {
		for(int item: arrayVariable)
		{
			System.out.println(item);
		}
		
	}

}
