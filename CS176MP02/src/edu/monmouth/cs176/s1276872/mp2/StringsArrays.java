package edu.monmouth.cs176.s1276872.mp2;

import java.util.Arrays;
import java.util.Scanner;

public class StringsArrays {
	Scanner in = new Scanner(System.in);
	final int MAX_ARRAY_SIZE = 100;
	int arraySize = 0;
	int counter = 0;
	boolean isFinishedInputting = false;
	String load = "";
	String max = "";
	String longest= "";
	String min = "";
	String shortest = "";
	String [] stringArray;
	
	public  StringsArrays() {
		stringArray = new String[MAX_ARRAY_SIZE];
	}//constructor ArraysClass
	
	public void load () {

		System.out.println("Enter some arbitrary number of strings, enter DONE to finish: ");
		
		while (isFinishedInputting == false ) {
			load = in.next();
			if (load.contentEquals("DONE")) {
				isFinishedInputting = true;
				counter--;
				}
			else {
				stringArray[counter] = load;
				if (counter == 1 ) {
					if (stringArray[counter].compareTo(stringArray[counter-1]) < 0) {
					max = stringArray[counter];
					min = stringArray[counter-1];
					counter++;
					}
					else {
						min =stringArray[counter-1];
						max = stringArray[counter];
						counter++;
					}
				}//if
				else if (counter > 1) {
					if (stringArray[counter].compareTo(min) < 0){
							min = stringArray[counter];
					}//if
					if (stringArray[counter].compareTo(max) > 0){
							max = stringArray[counter];
					}
					counter++;
				}//else if
				else
					counter++;
				//Print Test for Counter System.out.print(counter);

			}//else
				
		}//while
		//System.out.println(Arrays.toString(stringArray));
	}//method load	
	public boolean search(String inWord) {
		boolean isInArray = false;
		for (int i = 0; i <= counter; i++) {
			if (stringArray[i].contentEquals(inWord))
					isInArray = true;
		}
		return isInArray;
		
	}//boolean search	
	public void findMax() {
		System.out.println(max + " max");
	}//findMax()
	public void findMin() {
		System.out.println(min + " min");
	}
	public String findLongest() {
		String longest = "";
		for(int i = 0; i <= counter; i++) {
			if (stringArray[i].length() > longest.length()) {
				longest = stringArray[i];
			}
		}
		return longest;
	}
	
	public String findShortest() {
		String shortest = "";
		int shortCounter = 0;
		String multipleShortest = "";
		for(int i = 0; i <= counter; i++) {
			if (i == 0) {
				shortest = stringArray[i];
				shortCounter = 1;
				multipleShortest = stringArray[i];
			}
			else if (stringArray[i].length() < shortest.length()) {
				shortest = stringArray[i];
				counter = 1;
			}
			else if (stringArray[i].length() == shortest.length()) {
				multipleShortest = multipleShortest + ", and " + stringArray[i];
				shortCounter++;
			}
		}
		if (shortCounter == 1)
			return shortest;
		else
			return multipleShortest;
	}
}//class