package recursion;

public class BinarySearch {

	public static void main ( String [] args ) {
		int [] arr = {1,2,3,4,5,6,7,8};
		arraySorting(arr);
		System.out.println ( binarySearch(arr, 6, 0, arr.length-1));
		
		

	}

	private static int binarySearch ( int [] arr, int key, int start, int end ) {
		if(start <= end) {
			
		
		int middle= (start + end)/2;
		
		if (arr[middle] > key) {
			
			return binarySearch ( arr , key, start,  middle-1 );
		} else if(arr[middle] < key ) {
			return binarySearch ( arr , key, middle+1,  end );
		} else {
			return middle;
		}
		} else {
		return -1;
		}
		
			
		
	}

	private static void arraySorting ( int [] arr ) {
		
		
		int temp = 0;
		for ( int i =1 ; i <arr.length; i++ ) {
			for ( int j = i; j > 0; j-- ) {
					
			if(arr[j] < arr[j-1]) {
				temp = arr[j];
				arr[j ] = arr[j-1];
				arr[j-1] = temp;
			} 
			}	
			
		}
		for ( int i : arr ) {
			System.out.println ( i );
		}
	}

}
