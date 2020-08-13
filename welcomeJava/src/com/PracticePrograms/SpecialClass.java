package com.PracticePrograms;

public class SpecialClass {
	
	public int factCalc(int num)
	{
		if(num <= 1)
		{
			return 1;
		}
		else
		{
			return num * factCalc(num-1);
		}

	}
	
	public void removeElementArray(int remind) {
		int[] arrNum = {10,20,30,40,50,60,70};
		
		for(int i = remind; i<arrNum.length -1 ; i++) {
			arrNum[i] = arrNum[i+1];
		}
		arrNum[arrNum.length-1] = null;
		
		System.out.println("Printing the array:\n");
		
		for(int i=0; i< arrNum.length;i++) {
			System.out.println(arrNum[i]);
		}

		
		
	}
	
	

}
