
import java.util.HashSet;

public class CheckSubset {

	public static void main ( String [] args ) {
		int [] arr  = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int [] arr1 = { 1, 6, 7, 8, 1, 2, 3, 4 };

		isSubset ( arr , arr1 );

	}

	static boolean isSubset ( int [] arr, int [] arr1 ) {
		System.out.println ( "No" );
		HashSet < Integer > hashset = new HashSet < Integer > ( );

		int len  = arr.length;
		int len1 = arr1.length;

		for ( int i = 0; i < len; i++ ) {
			if ( !hashset.contains ( arr1 [i] ) ) {
				hashset.add ( arr [i] );
			}
		}
		
		for ( int j = 0; j < len1; j++ ) {
			if ( !hashset.contains ( arr1 [j] ) ) {
				return false;
			}

		}

		return true;

	}

}
