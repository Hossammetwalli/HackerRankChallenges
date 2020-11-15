

public class Fibonacci2 {

	public static void fab ( int n ) {

		 int [] fib = new int [n+1];
		fib[0] = 0;
		 fib[1] = 1;
		 
		 for ( int i = 2; i <= n; i++ ) {
			fib[i] = fib[i-1] + fib[i-2];
		}
		 
		 for ( int i : fib ) {
			System.out.println ( i );
		}
		

	}

	public static void main ( String [] args ) {

		fab ( 10 );
		
	}

}
