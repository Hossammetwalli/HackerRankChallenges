

public class FactorsOfNumbers {

	public static void main ( String [] args ) {
		
		int num=10;
		
		for ( int i = 1; i <= num; i++ ) {
			
			System.out.println ( "Factors of number: " + i + " is:" );
			for ( int j = 1; j <= i; j++ ) {
				if(i%j == 0) {
					System.out.println ( " " +j );
				}
				
			}
			
		}

	}

}
