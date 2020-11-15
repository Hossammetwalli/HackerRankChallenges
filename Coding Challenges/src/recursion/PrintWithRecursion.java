package recursion;

public class PrintWithRecursion {
	
	

	public static void main ( String [] args ) {
		print ( 5 );

	}

	
	
	
	private static void print ( int num ) {
		
		if(num == 0) {
			return;
		} else {
			System.out.println ( num );
			print(num-1);
		}
		
	}

}
