package LinkedList;

public class LinkedListMain {

	public static void main ( String [] args ) {
		
		LinkedList list = new LinkedList ( );
		list.addFirst(50);
		list.addLast (40);
		list.addLast (30);
		list.addLast (20);
		list.deleteFirst();
		list.deleteLast();
		
		System.out.println( list.indexOf ( 50 ));
		System.out.println ( list.contains(60) );
		

	}

}
