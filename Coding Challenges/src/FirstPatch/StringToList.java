

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class StringToList {

	public static void main ( String [] args ) {

		// create String Array and add it to a list

		String []       names = { "hossam", "nadim", "karim", "jelena", "Alex" };
		List < String > list1 = new ArrayList < String > ( );
		for ( String x : names ) {

			list1.add ( x ); // adding array element to list
		}

		// create second array and list
		String []       names2 = { "Samah", "nadim", "karim", "Amany" };
		List < String > list2  = new ArrayList < String > ( );

		for ( String y : names2 ) {

			list2.add ( y ); // adding array elements to second list

		}

		editList ( list1 , list2 ); // calling a method to edit the list and print the result
		System.out.println ( );

		for ( int i = 0; i < list2.size ( ); i++ ) {

			System.out.printf ( "%s " , list2.get ( i ) );
		}

	}

	// create a method to iterate throw the two lists and remove the duplicate
	// elements

	private static void editList ( Collection < String > list1, Collection < String > list2 ) {

		// Iterator to iterate through one of the lists and check if it contains
		// duplicates
		Iterator < String > list = list2.iterator ( );
		while ( list.hasNext ( ) ) {

			if ( list1.contains ( list.next ( ) ) ) {
				list.remove ( );

			}

		}

	}

}
