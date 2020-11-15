package recursion;

public class CountOfNumbers {

	public static void main ( String [] args ) {
		
		System.out.println ( countOfNumber(4 ,544446544));
	}

	private static int countOfNumber (int input, int num ) {
		//int input= 5;
		if(num <= 9) {
			if(num == input ) {return 1;}
			else {return 0;}
		} else {
			if (num % 10 == input) {
				return 1+ countOfNumber ( input, num/10 );
			} else {
				return 0 +countOfNumber (input , num/10 );
			}
		}
		
	}

}
