package recursion;

public class CountNumbers {

	public static void main ( String [] args ) {
		System.out.println ( sumCount( 149 ) );
		
		System.out.println ( 149/10 );

	}

	private static int sumCount ( int num ) {
		
		if(num < 9) return num;
		return num % 10 + sumCount ( num /10 );
		
	}

}
