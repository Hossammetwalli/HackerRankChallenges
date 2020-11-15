

import java.util.Arrays;
import java.util.Scanner;

public class LittleGirl2 {

	public static void main( String [] args ) {
		
		// Getting input from the user
		
		Scanner scanner = new Scanner ( System.in );
		
		// User input number of elements in array
		System.out.print ( "please enter N: " );
		int elementsN = scanner.nextInt ();
	
		// User input number of queries
		System.out.print ( "please enter Q: " );
		int queriesQ = scanner.nextInt ();
		
		// Getting and storing elements	in an array
		System.out.println ( "Please enter the array elements: " );
		int [] elementArray = new int [elementsN];
		for ( int i = 0; i < elementsN; i++ ) {
			System.out.print ( "Array element: " + i +" :- " );
			elementArray [i] = scanner.nextInt ();
		}
		
		// Getting and storing queries in an
		System.out.println ( "Please enter quiry elements: " );
		
		int [] [] queriesArray = new int [queriesQ] [2]; // Two spaces
		for ( int i = 0; i < queriesQ; i++ ) {
			System.out.print ( "quiry elements: "+ i+" :- " );
			queriesArray [i] [0] = scanner.nextInt ();
			System.out.print ( "quiry elements: "+ i +" :- " );
			queriesArray [i] [1] = scanner.nextInt ();
		}
		scanner.close ();
		
		
		// Calculating the frequencies
		int [] frequencies = new int [elementsN];
		for ( int i = 0; i < queriesQ; i++ ) {
			for ( int j = queriesArray [i] [0] - 1; j < queriesArray [i] [1]; j++ ) {
				frequencies [j]++ ;
				
			}
			
		}
		
		Arrays.sort ( elementArray );
		Arrays.sort ( frequencies );
		long maxSum = 0;
		
		for ( int i = 0; i < elementsN; i++ ) {
			maxSum += frequencies [i] * elementArray [i];
		}
		System.out.println ( maxSum );
	}

}
