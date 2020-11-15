package LinkedList;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMap1 {

	public static void main ( String [] args ) {
		HashMap < Integer, String > map = new HashMap < Integer, String >();
		map.put ( 100 , "Hossam" );
		map.put ( 101 , "Nadim" );
		map.put ( 102 , "Karim" );
		
		for (  Map.Entry < Integer, String > entry: map.entrySet ( ) ) {
			
		}
		System.out.println ( map.keySet ( ));
		System.out.println ( map.values ( ) );
		
		System.out.println ( map );
		
		 Iterator  iterator = map.entrySet ( ).iterator ( );
		 while(iterator.hasNext ( )) {
			Map.Entry < Integer, String >  map1 = ( Entry < Integer, String > ) iterator.next ( );
			 System.out.println (map1.getValue ( ) + map1.getKey ( )  );
		 }

	}

}
