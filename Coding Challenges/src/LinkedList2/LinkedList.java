package LinkedList2;

import java.util.NoSuchElementException;

public class LinkedList {

	private class Node {

		int  data;
		Node next;

		public Node ( int data ) {
			super ( );
			this.data = data;
			this.next = null;
		}

	}

	private Node head;
	private Node tail;
	private int  currentSize;

	public LinkedList ( ) {
		super ( );
		head        = null;
		currentSize = 0;
	}
	
					public void addLast(int item) {
						
						Node node = new Node ( item );
						if(isEmpty ( )) {  head = tail = node;
						currentSize++;
					}else {
						tail.next = node;
						tail= node;
							
						}
						
						currentSize++;
						
						
						
					}

					public void addFirst ( int item ) {
						Node node = new Node ( item );
						
						if(isEmpty ( ))  head= tail = null;
						
						node.next = head;
						head      = node;
				
						currentSize++ ;
				
					}
					
					
					public int removeFirst() {
						int temp = head.data;
						if(isEmpty ( )) {
							throw new NoSuchElementException ( );
						}
						if(head == tail) {
							head = tail = null;
						}
						else {
							head = head.next;
							
							
						}
						currentSize-- ;
						return temp;
						
					}
					
					private boolean isEmpty() {
						return head == null;
					}

}
