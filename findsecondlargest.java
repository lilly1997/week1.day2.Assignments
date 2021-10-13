package week1day2;

import java.util.Arrays;

public class findsecondlargest {

	public static void main(String[] args) {

		
		// Here is the input
				int[] data = {3,2,11,4,6,7};
   
				Arrays.sort(data);
				int length = data.length;
				
				
				System.out.println("THE SECOND LARGEST NUMBER IS " + data[length - 2] );
				
				/*
				 Pseudo Code:
				 1) Arrange the array in ascending order
				 2) Pick the 2nd element from the last and print it
				 */
				
	
	}

}
