

import java.util.Arrays;
import java.util.LinkedList;

/*
 * Convert list to array and via versa using linkedlist
 * @author Hossam
 *
 */
public class ConvertListToArray {

	public static void main ( String [] args ) {

		/*
		 * use Arrays.asList method to add the array to linkedlist
		 */
		String [] names1 = { "hossam", "nadim", "karim", "jelena", "Alex," };
		LinkedList < String > list1  = new LinkedList < String > ( Arrays.asList ( names1 ) );

		list1.add ( "Amany" );
		list1.addFirst ( "Hanem" );
		list1.addFirst ( "Mohamadi" );

		for ( String x : list1 ) {     

			System.out.print ( x + " " );
		}

		// convert the list an array by using "toArray method" and initiate new array
		// using the list size
		String [] array1 = list1.toArray ( new String [list1.size ( )] );

		for ( String y : array1 ) {
			System.out.printf ( "%s " , y );
		}

	}

}
