package edu.monmouth.cs176.s1276872.mp2;

import java.util.Scanner;

public class IntegersClass {
		Scanner in = new Scanner(System.in);
		final int MAX_ARRAY_SIZE = 100;
		int arraySize = 0;
		int counter = 0;
		boolean isFinishedInputting = false;
		int load = 0;
		int max = 0;
		int min = 0;
		String maxPos = "";
		int minPos = 0;
		Integer [] integerArray;
		
		public  IntegersClass() {
			integerArray = new Integer[MAX_ARRAY_SIZE];
		}//constructor ArraysClass
		
		public void load () {
			System.out.println("Enter some arbitrary number of Integers, enter 999 to finish: ");
			
			while (isFinishedInputting == false ) {
				load = in.nextInt();
				if (load == 999) {
					isFinishedInputting = true;
					counter--;
					}//if 
				else {
					integerArray[counter] = load;
					counter++;
				}//else
	
			}//while

		}//method load
		public boolean search(int inNum) {
			boolean inArray = false;
			for (int i = 0; i <= counter; i++) {
				if(integerArray[i] == inNum)
					inArray = true;
			}//for
			return inArray;
		}// search method
		public  int findMax() {
			for (int i =0; i <= counter; i++) {
				if (i == 0)
					max = integerArray[i];
				else {
					if (integerArray[i] > max)
						max = integerArray[i];
				}//else
					
			}//for 
			return max;
		}// findMax method
		public  int findMin() {
			for (int i =0; i <= counter; i++) {
				if (i == 0)
					min = integerArray[i];
				else {
					if (integerArray[i] < max)
						min = integerArray[i];
				}//else
					
			}//for 
			return min;
		}// findMin method
		public String findMaxPos() {
			String MaxPos = "test";
			int maxCounter = 0;
			for (int i = 0; i <= counter; i++) {
				if (maxCounter == 0) {
					if (integerArray[i] == max) {
						maxPos = String.valueOf(i);
						maxCounter++;
						System.out.println(maxPos);
					}//if maxCounter == 0, and inegerArray[i] = max
				}//if maxCounter ==0
				else {
					if(integerArray[i] == max)
						maxPos = maxPos + ", and " + String.valueOf(i);		
				}//else
					
			}//for 
			return MaxPos;
		}
	}//class