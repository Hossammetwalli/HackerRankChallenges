
public class ArraySum {

	public static void main ( String [] args ) {
		int [] arr = {10,20,30};
		int sum =0;
		for ( int i : arr ) {
			sum+= i;
			
		}
		System.out.println ( sum );
		
		for ( int i = arr.length-1; i >= 0; i-- ) {
			
			System.out.println ( arr[i] );
		}
	}

}
