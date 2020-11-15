

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetTest {

	public static void main ( String [] args ) {
		String [] names1 = { "hossam", "nadim", "karim", "jelena", "Alex", "nadim", "karim" };
			List < String > list = Arrays.asList ( names1 );
			System.out.print ( list );
			System.out.println (  );
			
			Set < String > set = new HashSet<String>(list);
			set.add ( "Amany" );
			System.out.print ( set );
			list = null;
			System.out.println ( list );

	}

}
