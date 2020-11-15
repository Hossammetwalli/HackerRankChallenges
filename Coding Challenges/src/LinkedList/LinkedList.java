package LinkedList;

import java.util.NoSuchElementException;

public class LinkedList {
	private Node first;
	private Node last;
	
	
	
	
	public void addFirst ( int item ) {
		var node = new Node (item );
		
		if(isEmpty ( ))
			first = last = node;
		else {
			node.setNext ( first );
			first = node;
		}
		
		
		
	}
	public void addLast ( int item ) {
		
		var node = new Node (item );
		if(isEmpty ( ))
			first = last = node;
		else {
			last.setNext ( node );
			last = node;
		}
		
	}
	
	private boolean isEmpty() {
		return first == null;
	}
	
	
	public int indexOf ( int item ) {
		int index =0;
		var current = first;
		
		while(current !=null) {
			if(current.getValue ( )== item) {
				return index;
				
			}
			current = current.getNext ( );
			index++;
		}
		return -1;
		
	}
	public boolean contains ( int item ) {
		return indexOf ( item ) != -1;
		
		
	}
	public void deleteFirst ( ) {
		if(isEmpty ( )) {
			throw new NoSuchElementException ( );
		}
		if (first == last) {
			first = last = null;
		} else {
		var second = first.getNext ( );
		first.setNext ( null );
		first = second;
		}
	}
	
	private Node getPrevious(Node node) {
		var current = first;
		while(current != null) {
			if(current.getNext ( )==node) return current;
			current = current.getNext ( );
		}
		return null;
	}
	public void deleteLast ( ) {
		
		if(isEmpty ( )) {
			throw new NoSuchElementException ( );
		} if (first == last) {
			first = last = null;
		} else {
		var previous = getPrevious ( last );
		last = previous;
		last.setNext (null );}
		
	}
	
	

}
