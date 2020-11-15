package SecondPatch;

public class ArrayMain {

	public static void main ( String [] args ) {
		
		Arrays2 numbers = new Arrays2 ( 3 );
		
		numbers.insert ( 10 );
		numbers.insert ( 20 );
		numbers.insert ( 30 );
		numbers.insert ( 40 );
		numbers.insert ( 40 );
		numbers.insert ( 40 );
		numbers.insert ( 40 );
		
		numbers.removeAt( 0 );
		numbers.print ( );
		System.out.println ( numbers.search(40));
	}

}
