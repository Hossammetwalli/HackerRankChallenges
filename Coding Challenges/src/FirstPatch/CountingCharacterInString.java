

public class CountingCharacterInString {

	

	public static void main ( String [] args ) {
		
		count ( "Heo Hossammmmm" );

	}

	private static void count ( String str ) {
		
		char [] ch = str.toCharArray ( );
		
		for ( int i = 0; i < ch.length; i++ ) {
			
			String str2 ="";
			
			while(i < ch.length && ch[i] != ' ') {
				
				str2 =  str2+ ch[i];
				i++;
			}
			
			if (str2.length ( ) > 0) {
				System.out.println ( str2 + "   has   "+ str2.length ( ) + "  characters" );
			}
		}
		
	}

	

}
