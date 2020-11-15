package SecondPatch;



public class Array {

	private int [] items;
	private int    count;

	public Array ( int length ) {
		items = new int [length];
	}
	
	

	public void print ( ) {
				for ( int i = 0; i < count; i++ ) {
					System.out.println ( items [i] );
				}

	}

	public void insert ( int item ) {
		        items [count++ ] = item;
				
				if ( items.length == count ) {
					int [] newItems = new int [count * 2];
										
				for ( int i = 0; i < count; i++ ) {
					newItems [i] = items [i];
					
		
					}
				items = newItems;
				}
		
				

	}

	public void removeAt ( int index ) {
				if ( index < 0 || index >= count ) {
					throw new IllegalArgumentException ( );
				} else {
					for ( int i = index; i < count; i++ ) {
						items[i] = items[i+1];
					}
					count--;
				}
				
				
					}



	public int search ( int item ) {
		for ( int i = 0; i < count; i++ ) {
			if(items[i] == item) {
				return i;
			}
			
			}
		return -1;
		
	}
	
	
	
	

}
