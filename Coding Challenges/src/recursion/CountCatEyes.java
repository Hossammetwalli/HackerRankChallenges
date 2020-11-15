package recursion;

public class CountCatEyes {

	public static void main ( String [] args ) {
		System.out.println ( "cat eyes = "+ catEyes(5) );

	}

	private static int catEyes ( int catNum ) {
		if(catNum ==0) {
			return 0;
		} else {
			
			return 2 + catEyes(catNum-1);
		}
		
	}

}
