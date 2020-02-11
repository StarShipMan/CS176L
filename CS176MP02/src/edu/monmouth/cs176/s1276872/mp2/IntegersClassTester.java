package edu.monmouth.cs176.s1276872.mp2;
import java.util.Scanner;

public class IntegersClassTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		boolean inArray = false;
		int searchFor = 0;
		int max = 0;
		int min = 0;
		String maxPos ="";
		String minPos = "";
		IntegersClass integer = new IntegersClass();
		integer.load();
		inArray = integer.search(searchFor);
		System.out.println(inArray);
		max = integer.findMax();
		System.out.println(max + " max");
		min = integer.findMin();
		System.out.println(min + " min");
		maxPos = integer.findMaxPos();
		System.out.println(maxPos + " maxPosition(s)");
		
		}//main

}//class
