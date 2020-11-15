

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CountCharacters {

	public static void main ( String [] args ) {
		String name = "hossammohamadiandelsalam";

		char [] nameCh = name.toCharArray ( );

		Map < Character, Integer > map = new HashMap < Character, Integer > ( );

		for ( char c : nameCh ) {
			if ( map.containsKey ( c ) ) {
				map.put ( c , map.get ( c ) + 1 );
			} else {
				map.put ( c , 1 );
			}

		}
		Set < Character > keySet = map.keySet ( );
		for ( Character character : keySet ) {
			
				System.out.println ( "Character "+character + " repeated " + map.get ( character )+ " time/s " );
			
		}
		System.out.print ( map+ " " );
	}

}
