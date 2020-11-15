

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DeleteDuplicate2 {

	public static void main ( String [] args ) {
		Integer [] arr = { 1, 2, 3, 9, 5, 3, 7, 4, 6, 2, 9, 1 };
		
		List < Integer > list = Arrays.asList ( arr );
	
		Set < Integer > set = new HashSet < Integer > (list);
		//list=null;
		System.out.print ( set + "   "  ); 
		System.out.print ( list +" " );
	}
	
	
	
	

}
