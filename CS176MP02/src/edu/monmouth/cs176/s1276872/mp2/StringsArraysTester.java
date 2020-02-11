package edu.monmouth.cs176.s1276872.mp2;

public class StringsArraysTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inArray = "AA";
		boolean isInArray = false;
		StringsArrays string = new StringsArrays();
		string.load();
		String longest = "";
		String shortest = "";
		isInArray = string.search(inArray);
		if (isInArray == true)
			System.out.println("The string " + inArray + " is in the array.");
		else
			System.out.println("The string " + inArray + " is not in the array.");
		string.findMax();
		string.findMin();
		longest = string.findLongest();
		System.out.println(longest);
		shortest = string.findShortest();
		System.out.println(shortest);
		
	}//main

}//class
