package recursion;

public class PowerAndBase {

	public static void main ( String [] args ) {
		
		System.out.println ( power(5,4));

	}

	private static int power ( int base, int num ) {
		if(num == 1) {
			return base;
		} else {
			return base * power ( base , num -1 );
		}
		
	}

}
