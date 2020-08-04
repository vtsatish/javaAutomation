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
	
	

}
