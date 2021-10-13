package week1day2;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {


		
		/*
		 * Pseudo Code
		  
		 *Declare a String 
			String text1 = "stops";
		 *Declare another String
			String text2 = "potss"; 
		 * a) Check length of the strings are same then (Use A Condition)
		 * b) Convert both Strings in to characters
		 * c) Sort Both the arrays
		 * d) Check both the arrays has same value
		 * 
		 */

		
		String text1 = "stops";
		String text2 = "potss";
		
		if(text1.length()==text2.length()) {
			
			char[] charArray = text1.toCharArray();
			char[] charArray2 = text2.toCharArray();
			
			Arrays.sort(charArray);
			Arrays.sort(charArray2);
			
			boolean equals = Arrays.equals(charArray, charArray2);
			
			if(equals==true) {
				System.out.println(" GIVEN STRINGS ARE ANAGRAM");
			}
			else {
				System.out.println("GIVEN STRINGS ARE NOT ANAGRAM");
			}
			
			
		}
				
				
			
	      	
			
		
	}

}
