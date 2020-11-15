package LinkedList;

public class MaximumHappiness {

	// Check if the number in queue is valid
	public static boolean isValid( int [] [] line, int i, int j ) {

		if ( i < 0 || i >= line.length || j < 0 || j >= line [0].length || line [i] [j] == -1 ) {
			return false;

		}
		return true;
	}

	public static int maximumHappiness( int [] [] line, int i, int j ) {

		if ( !isValid ( line, i, j ) ) {
			return 0;
		}

		if ( i % 2 != 0 ) {
			return line [i] [j]
					+ Integer.max ( maximumHappiness ( line, i, j - 1 ), maximumHappiness ( line, i + 1, j ) );
		} else {
			return line [i] [j]
					+ Integer.max ( maximumHappiness ( line, i, j + 1 ), maximumHappiness ( line, i + 1, j ) );
		}

	}

	public static void main( String [] args ) {
		int [] [] line = { { 0, 0, 0, 0, 9 }, { 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0 },
				{ 7, 0, 0, 0, 0 } };

		System.out.println ( maximumHappiness ( line, 5, 4 ) );
	}

}
