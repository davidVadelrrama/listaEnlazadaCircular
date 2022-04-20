package main;

import model.*;

public class Main {

	public static void main(String[] args) {
		
		List list = new List();
		
		list.addFirst(new Node(1));
		list.addFirst(new Node(2));
		list.addFirst(new Node(3));
		list.addFirst(new Node(4));
		list.addFirst(new Node(5));
		list.addFirst(new Node(6));
		list.addFirst(new Node(7));
		list.addFirst(new Node(8));
		list.addFirst(new Node(9));
		list.addFirst(new Node(10));
		list.addFirst(new Node(11));
		Node head = new Node(12);
		head.setPlayer(new Player("David"));
		list.addFirst(head);
		
		list.print();
		
		int dice = (int) (Math.random() * 12 + 1);
		list.advance(dice);
		System.out.println("\n--------------------------------\n");
		list.print();
	}

}
