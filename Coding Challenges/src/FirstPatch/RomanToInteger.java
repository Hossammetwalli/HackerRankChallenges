

import java.util.HashMap;
import java.util.Map;


/*
 * using map 
 */
public class RomanToInteger {

	/*
	 * Roman numbers I = 1 V = 5 X = 10 L = 50 C = 100 D = 500 M = 1000
	 */

	public static void main ( String [] args ) {
		
		System.out.println ( romanToInteger ( "VI" ) );

	}

	public static int romanToInteger ( String roman ) {

		Map < Character, Integer > map = new HashMap < Character, Integer > ( );
		map.put ( 'I' , 1 );
		map.put ( 'V' , 5 );
		map.put ( 'X' , 10 );
		map.put ( 'L' , 50 );
		map.put ( 'C' , 100 );
		map.put ( 'D' , 500 );
		map.put ( 'M' , 1000 );

		int result = 0;
		for ( int i = 0; i < roman.length ( ); i++ ) {
			if ( i > 0 && map.get ( roman.charAt ( i ) ) > map.get ( roman.charAt ( i - 1 ) ) ) {
				
				// if the roman number has higher number after, we need to deduct the number twice 
				result += map.get ( roman.charAt ( i ) ) - 2 * map.get ( roman.charAt ( i - 1 ) );

			} else {
				result += map.get ( roman.charAt ( i ) );
			}
		}
		return result;

	}

}
