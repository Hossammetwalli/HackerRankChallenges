


public class SplitString {

	public static void main ( String [] args ) {

		String str = "Hossam";
		System.out.println ( str );
		String reverse= "";
		for ( int i = 0 ; i < str.length ( ) ; i++ ) {
			
			reverse =  str.charAt ( i ) + reverse ;
			
		}

		System.out.println ( reverse );
		
		
	}

}
