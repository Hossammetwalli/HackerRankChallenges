

/*
 * Roman numbers 
 *     I = 1
 *     V = 5
 *     X = 10
 *     L = 50
 *     C = 100
 *     D = 500
 *     M = 1000
 */
public class ConvertIntegerToRomanNumber {

	public static void main ( String [] args ) {

		System.out.println ( inToRoman ( 555 ) );

	}

	public static String inToRoman ( int number ) {

		String [] units     = { "", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
		String [] tens      = { "", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC" };
		String [] hundreds  = { "", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM" };
		String [] thousands = { "", "M", "MM", "MMM", "MMMM", "MMMMM", "MMMMMM", "MMMMMMM", "MMMMMMMM", "MMMMMMMMM" };

		return thousands [number / 1000] + hundreds [( number % 1000 ) / 100] + tens [( number % 100 ) / 10]
				+ units [( number % 10 )];

	}

}
