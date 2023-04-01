package com.promineotech;

import java.util.Arrays;

public class ArrayExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.	Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
		int ages[] = {3,9,23,64,2,8,28,93};
		printAge(ages);
		
		/**
		 Create an array of String called names that contains the following values:
		 “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
		*/
		
		String names[] = {"Sam","Tommy","Tim","Sally","Buck","Bob"};
		printNames(names);
		
		//3.	How do you access the last element of any array?
		lastElement(names);
		//4.	How do you access the first element of any array?
		firstElement(names);
		
		int nameLengths[] = new int[names.length];
		
		/*
		 * 5.	Create a new array of int called nameLengths. Write a loop to 
		 * iterate over the previously created names array and add the length 
		 * of each name to the nameLengths array.
		 */
		nameLengths(nameLengths,names);
		
		/*
		 * 7.	Write a method that takes a String, word, and an int, n, as
		 *  arguments and returns the word concatenated to itself n number of 
		 *  times. (i.e. if I pass in “Hello” and 3, I expect the method to
		 *  return “HelloHelloHello”).
		 */
		String word =concatWord("Hello",6);
		System.out.println("Concated word "+word);
		
		/*
		 * 8.	Write a method that takes two Strings, firstName and lastName, and 
		 * returns a full name (the full name should be the first and the last 
		 * name as a String separated by a space).
		 */
		String fullname=fullName("Ian","Smith");
		System.out.println("Fullname "+fullname);
		
		/*
		 * 9.	Write a method that takes an array of int and returns true if 
		 * the sum of all the ints in the array is greater than 100.
		 */
		boolean sumOfArray=sumofArray(ages);
		System.out.println("Sum of array values "+sumOfArray);
		
		/*
		 * 10.	Write a method that takes an array of double and returns the
		 * average of all the elements in the array.
		 */
		double dblVal[]= {5.34,12.89,31.01,24.38};
		double avgDblVal=averageDblVal(dblVal);
		System.out.println("Average of double arrays "+avgDblVal);
		
		/*
		 * 11.	Write a method that takes two arrays of double and returns 
		 * true if the average of the elements in the first array is greater 
		 * than the average of the elements in the second array.
		 */
		double arrayTwo[]= {9.07,6.38,23.67,4.09,7.89,11.97};
		boolean twoArray=compareArray(dblVal,arrayTwo);
		System.out.println("Compare two double arrays "+twoArray);
		
		/*
		 * 12.	Write a method called willBuyDrink that takes a boolean isHotOutside,
		 *  and a double moneyInPocket, and returns true if it is hot outside and if 
		 *  moneyInPocket is greater than 10.50.
		 */
		System.out.println("willBuyDrink "+willBuyDrink(true,10.51));
		
		/*
		 * 13.	Create a method of your own that solves a problem. In comments, 
		 * write what the method does and why you created it.
		 * This calculates the area of a rectangle
		 */
		int area=areaOfRectangle(7,4);		
		System.out.println("Area of Rectangle "+area);		
		
	}

	public static void printAge(int ages[]) {
		
		/**
		a.	Programmatically subtract the value of the first element in the array from 
		the value in the last element of the array (i.e. do not use ages[7] in your code). 
		Print the result to the console. 
		**/
		System.out.println("Ages last element minus one "+(ages[ages.length-1]-ages[0]));
		/**
		 * b.	Add a new age to your array and repeat the step above to ensure it is dynamic
		 * (works for arrays of different lengths).
		 */
		ages = Arrays.copyOf(ages, (ages.length)+1);
		ages[ages.length-1]=42;
		
		System.out.println("Ages last element minus one again  "+(ages[ages.length-1]-ages[0]));
		/**
		 c.	Use a loop to iterate through the array and calculate the average age.
		 Print the result to the console.
		 */
		int average=0;
		for(int i=0;i<ages.length;i++) {
			average+=ages[i];
		}
		
		System.out.println("Average age "+average/ages.length);
	}
	
	public static void printNames(String names[]) {
		
		int average=0;
		/*
		 * a.	Use a loop to iterate through the array and calculate the average number 
		 * of letters per name. Print the result to the console.
		 */
		for(int i=0;i<names.length;i++) {
			average+=names[i].length();
		}
		
		System.out.println("Average name length "+average/names.length);
		/**
		 * b.	Use a loop to iterate through the array again and concatenate all the names
		 *  together, separated by spaces, and print the result to the console.
		 */
		String allNames="";
		for(String str:names) {
			allNames+=str+" ";
		}
		
		System.out.println("All concatenated names "+allNames);
	}
	
	public static void lastElement(String names[]) {
		System.out.println("Last element in an array "+names[names.length-1]);
	}
	
	public static void firstElement(String names[]) {
		System.out.println("First element in an array "+names[0]);
	}
	public static void nameLengths(int nameLengths[],String names[]) {
		/*
		 * 5.	Create a new array of int called nameLengths. Write a loop to
		 *  iterate over the previously created names array and add 
		 *  the length of each name to the nameLengths array.
		 */
		for(int i=0;i<names.length;i++) {
		 	nameLengths[i]=names[i].length();
		}
		/*
		 * 6.	Write a loop to iterate over the nameLengths array and calculate 
		 * the sum of all the elements in the array. Print the result to the console.
		 */
		int nameLengthsSum=0;
		for(int i:nameLengths) {
			nameLengthsSum+=i;
		}
		System.out.println("Name lengths sum "+nameLengthsSum);
		
	}
	public static String concatWord(String word,int num) {
		String concatword="";
		for(int i =0;i<num;i++) {
			concatword+=word;
		}
		
		return concatword;
	}
	
	public static String fullName(String firstName,String lastName) {
	
		return firstName+" "+lastName;
	}
	/*
	 * 9.	Write a method that takes an array of int and returns true 
	 * if the sum of all the ints in the array is greater than 100.
	 */
	public static boolean sumofArray(int ages[]) {
		
		boolean sumOfArray=false;
		int sumOfArrayVal=0;
		for(int i=0;i<ages.length;i++) {
			sumOfArrayVal+=ages[i];
		}
		
		if(sumOfArrayVal>100) {
			sumOfArray=true;
		}
		return sumOfArray;
	}
	/*
	 * 10.	Write a method that takes an array of double and returns
	 * the average of all the elements in the array.
	 */
	public static double averageDblVal(double dblVal[]) {
		double dblSum=0;
		for(int i=0;i<dblVal.length;i++) {
			dblSum+=dblVal[i];
		}
		return dblSum/dblVal.length;
	}
	/*
	 * 11.	Write a method that takes two arrays of double and 
	 * returns true if the average of the elements in the first array 
	 * is greater than the average of the elements in the second array.
	 */
	public static boolean compareArray(double arrayOne[],double arrayTwo[]) {
		boolean compareTwoArray=false;
		
		int sumArrValOne=0;
		int sumArrValTwo=0;
		for(double dbl:arrayOne) {
			sumArrValOne+=dbl;
		}
		for(double dbl:arrayTwo) {
			sumArrValTwo+=dbl;
		}
		
		if(sumArrValOne>sumArrValTwo) {
			compareTwoArray=true;
		}
		
		return compareTwoArray;
		
	}
	/*
	 * 12.	Write a method called willBuyDrink that takes a boolean 
	 * isHotOutside, and a double moneyInPocket, and returns true if 
	 * it is hot outside and if moneyInPocket is greater than 10.50.
	 */
			
	public static boolean willBuyDrink(boolean isHotOutside,double moneyInPocket) {
		boolean isDrink=false;
		
		if(isHotOutside && moneyInPocket>10.5) {
			isDrink=true;
		}
		
		return isDrink;
	}
	/*
	 * 13.	Create a method of your own that solves a problem. 
	 * In comments, write what the method does and why you created it.
	 */
	public static int areaOfRectangle(int length,int width) {
		
		return 2*length*width;
	}

}