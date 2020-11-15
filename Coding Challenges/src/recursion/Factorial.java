package recursion;

public class Factorial {

	public static void main ( String [] args ) {
		System.out.println (  factorial(5));

	}

	private static int factorial ( int num ) {
		
		if(num == 0 || num == 1) {
			return 1;
		} else {
			return num * factorial ( num-1 );
		}
	}

}
