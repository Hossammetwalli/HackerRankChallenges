

import java.util.Arrays;

import java.util.Collections;
import java.util.List;

public class UsageOfCollection {

	public static void main ( String [] args ) {
		
		
		String [] names1 = { "hossam", "nadim", "karim", "jelena", "Alex," };
		List < String > list = Arrays.asList ( names1 );
		
		Collections.sort ( list );
		System.out.printf ( "%s\n", list );
		Collections.sort ( list, Collections.reverseOrder ( ) );
		System.out.printf ( "%s\n", list );
		
		
	}

}
