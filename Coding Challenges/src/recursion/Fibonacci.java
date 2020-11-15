package recursion;



public class Fibonacci {

	public static void main ( String [] args ) {
		System.out.println ( fib ( 10 ));
	
	}

	/*private static void fibonacci ( int num ) {
		int n1 = 0;
		int n2 = 1;
		int sum =0;
		System.out.println ( n1 );
		System.out.println ( n2 );
		for ( int i = 2; i <= num; i++ ) {
			sum = n2 +n1;
			n1 = n2;
			n2 =sum;
			System.out.println (sum );
		}*/
	
	//}
		
	
	/*
	 * public static int fib (int num) { int [] arr = new int[num +1]; arr[0] = 0;
	 * arr[1] = 1;
	 * 
	 * for ( int i = 2; i <=num; i++ ) { arr[i] = arr[i-1] + arr[i-2];
	 * 
	 * }
	 * 
	 * for ( int i : arr ) { System.out.println ( i ); }
	 * 
	 * return arr[num]; }
	 */
	
	public static int fib (int num) {
		int first =0;
		int second =1;
		int sum = 0;
		
		
			System.out.println ( first );
			System.out.println ( second );
		
		
		for ( int i = 2; i <=num; i++ ) {
			sum = first + second;
			first = second;
			second = sum;
			System.out.println ( sum );
		}
		return sum;
		
	
		
	}
	
			
		
	}


