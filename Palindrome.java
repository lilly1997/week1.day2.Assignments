package week1day2;

import java.util.Iterator;

public class Palindrome {

	public static void main(String[] args) {

		
		//Build a logic to find the given string is palindrome or not
	     
		/*
		 * Pseudo Code
		
		 * a) Declare A String value as"madam"
		 
		 * b) Declare another String rev value as ""
		 * c) Iterate over the String in reverse order
		 * d) Add the char into rev
		 * e) Compare the original String with the reversed String, if it is same then print palinDrome 
		 
		 * Hint: Use .equals or .equalsIgnoreCase when you compare a String 
		 */

		
		String value = "madam";
		String revvalue = "";
		int length = value.length();
char[] charArray = value.toCharArray();
		for (int i = length - 1; i >=0; i--) 
        {
        	revvalue=revvalue+charArray[i];
        	
        	if(value.equals(revvalue))
        	{
        		System.out.println("palindrome");
		   }
		
		}
		
	
		}
	}


