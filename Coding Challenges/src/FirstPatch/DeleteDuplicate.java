

public class DeleteDuplicate {

	public static void main ( String [] args ) {

		int [] arr = { 1, 2, 3, 9, 5, 3, 7, 4, 6, 2, 9, 1 };
		deleteDuplicate ( arr );
		// sortArray(arr);
		System.out.println ( );

	}

	private static void deleteDuplicate ( int [] arr ) {
		int len = arr.length - 1;
		for ( int i = 0; i < len; i++ ) {

			for ( int j = i + 1; j < len; j++ ) {

				if ( arr [i] == arr [j] ) {

					for ( int k = j; k < len; k++ ) {
						arr [k] = arr [k + 1];
					}
					len-- ;

				}
			}

		}

		for ( int i = 0; i < len; i++ ) {

			System.out.print ( arr [i] + " " );
		}

	}

	private static void sortArray ( int [] arr ) {

		for ( int i = 0; i < arr.length; i++ ) {
			for ( int j = 1; j < arr.length - i; j++ ) {
				if ( arr [j - 1] > arr [j] ) {

					int temp = arr [j - 1];
					arr [j - 1] = arr [j];
					arr [j]     = temp;
				}

			}

		}

		for ( int i : arr ) {

			System.out.print ( i + " " );
		}

	}

}
