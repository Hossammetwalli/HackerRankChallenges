

public class DaystoYears {

	public static void main ( String [] args ) {
		int numberOfDays = 770;
		int year = 365;
		int month = 30;
		int week = 7;
		
		int years = numberOfDays / year;
		int remainderMonth = numberOfDays % year;
		int months = remainderMonth/month;
		int remainderDays = remainderMonth % month;
		int weeks = remainderDays / week;
		int days = remainderDays % week;
		
		
		
		
		
		System.out.println ("years = "+ years );
		System.out.println ( "months = "+months );
		System.out.println ( "remainder days = " +remainderDays );
		System.out.println ( "weeks = "+weeks );
		System.out.println ( "days = " + days );
		

	}

}
