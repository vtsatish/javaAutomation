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
	
	public void removeElementArray(int remind) 
	{
		int[] arrNum = {10,20,30,40,50,60,70};
		boolean replace = false;
		try {
			for(int i = remind-1; i<arrNum.length -1 ; i++) {
				arrNum[i] = arrNum[i+1];
				replace = true;
			}
			if(replace == true || remind == arrNum.length) {
				arrNum[arrNum.length-1] = 0;
			}
			else {
				System.out.println("Nothing replaced");
			}
			
		}
		catch (Exception e) {
			System.out.println("Caught.." + e.toString());
		}
		


		
		System.out.println("Printing the array:\n");
		
		for(int i=0; i< arrNum.length;i++) {
			System.out.println(arrNum[i]);
		}

		
		
	}
	
	

}
