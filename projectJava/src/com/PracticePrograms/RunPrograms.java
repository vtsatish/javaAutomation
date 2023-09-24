package com.PracticePrograms;

public class RunPrograms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SpecialClass spl = new SpecialClass();
		//recursion
		System.out.println(spl.factCalc(15));
		//
		spl.removeElementArray(3);

		LnkLstClass lks = new LnkLstClass();
		lks.addNode(20);
		lks.addNode(25);
		lks.addNode(35);
		lks.addNode(45);
		lks.addNode(55);
		lks.addNode(65);

		System.out.println("Printing linked list:");
		lks.printList();
		System.out.println("\nReversing linked list:");
		lks.reverseList();
		System.out.println("Printing linked list:");
		lks.printList();
	}

}
