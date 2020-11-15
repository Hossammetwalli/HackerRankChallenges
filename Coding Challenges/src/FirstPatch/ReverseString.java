

public class ReverseString {

	public static void main( String [] args ) {

		String str = "Hossam Metwalli";

		char [] ch = str.toCharArray ();

		for ( int i = 0; i < ch.length - 1; i++ ) {
			String str2 = "";
			while ( i < ch.length && ch [i] != ' ' ) {
				// str2 = str2 +ch[i];
				str2 = ch [i] + str2;
				i++ ;
			}

			if ( str2.length () > 0 ) {
				System.out.println ( str2 + "  " + str2.length () );
			}

		}

	}

}
