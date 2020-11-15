

import java.util.ArrayList;

import java.util.List;

public class BubbleSort {

	public static void main ( String [] args ) {

		int [] arr = { 1, 2, 5, 9, 3, 8, 15, 0, 4 };
		List <Integer > list = new ArrayList < Integer > ( );
		for ( int x : arr ) {
			list.add ( x );
		}
		
		
		
		for ( int x : arr ) {
			System.out.println (  x );

		}

		bubblesort ( arr );

	}

	private static void bubblesort ( int [] arr ) {
		System.out.println ( );
		for ( int i = 0; i < arr.length; i++ ) {
			for ( int j = 1; j < ( arr.length - i ); j++ ) {

				if ( arr [j - 1] > arr [j] ) {
					int temp = arr [j - 1];
					arr [j - 1] = arr [j];
					arr [j]     = temp;

				}

			}
		}

		for ( int i : arr ) {
			System.out.printf ( "%s  " , i );
		}
	}

}
