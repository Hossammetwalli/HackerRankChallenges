

public class SamallestandLargest {

	public static void main ( String [] args ) {
		
		int [] arr = {1,2,3,4,5,6,7,8,9};
		
		int smallest = Integer.MAX_VALUE;
		int largest = Integer.MIN_VALUE;
		
		for ( int number : arr ) {
			
			if (number > largest) {
				largest = number;
			}
			if(number < smallest ) {
				smallest = number;
			}
			
		}
		System.out.println ( largest );
		System.out.println ( smallest );
	}

}
