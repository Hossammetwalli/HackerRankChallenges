

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;


public class MergeTwoArrays {

	public static void main ( String [] args ) {
		String []       names1 = { "hossam", "nadim", "karim", "jelena", "Alex," };
		List < String >  list1 = new LinkedList < String >();
		
		for ( String x : names1 ) {
			list1.add ( x );
		}
		
		
		String []       names2 = { "Amany", "Samah", "Elham", "Aya", "Hanem" };
		List < String > list2 = new LinkedList < String >();
		
		for ( String y : names2 ) {
			list2.add ( y );
		}
		
		// add two lists together
		
		list1.addAll ( list2 );
		list2.clear ( );
		
		// calling methods of reverse, print and remove
		
		reverseMe(list1);
		System.out.println ( "\n  reverse first:" );
		printMe(list1);
		System.out.println ( "\n print the reveresed list:" );
		removeMe(list1, 2, 5);
		printMe(list1);
		System.out.println ( "\n print the list after removal" );
		reverseMe(list1);
		System.out.println ( "\n reverse the list after removal" );
		
		
		}

	private static void reverseMe ( List < String > list1 ) {
		ListIterator < String >  list3 = list1.listIterator (list1.size ( ) );
		while ( list3.hasPrevious ( ) ) {
			String previous = list3.previous ( );
			System.out.print ( previous +" "  );
			
			
		}
		
	}

	private static void removeMe ( List < String > list1, int from, int to ) {
		list1.subList ( from , to ).clear ( );
		
	}

	private static void printMe ( List < String > list1 ) {
		for ( String s : list1 ) {
			System.out.print (s  +" ");
			
		}
		
	}
		
	}
	
	
	
	


