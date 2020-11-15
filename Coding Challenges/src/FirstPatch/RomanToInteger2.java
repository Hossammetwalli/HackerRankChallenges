





/*
 * using switch 
 */
public class RomanToInteger2 {

	/*
	 * Roman numbers I = 1 V = 5 X = 10 L = 50 C = 100 D = 500 M = 1000
	 */

	public static void main ( String [] args ) {
		
		System.out.println ( romanToInteger ( "TT" ) );

	}

	public static int romanToInteger ( String roman ) {
		 
		int result =0;
		
		for ( int i = roman.length ( )-1; i >=0; i-- ) {
			
			switch ( roman.charAt ( i ) ) {
				case 'M' : result += 1000; 	break;
				case 'D' : result += 500; 	break;
				case 'C' : result += 100 * (result >=500? -1: 1); 	break;
				case 'L' : result += 50; 	break;
				case 'X' : result += 10 * (result >=50? -1 :1); 	break;
				case 'V' : result += 5; 	break;
				case 'I' : result += 1 * (result >=5? -1:1) ; 	break;

				default : 
				System.out.println ( "Number includes Non roman Letters"); 	break;
					
			}
			
		}
		
		return result;

	}

}
