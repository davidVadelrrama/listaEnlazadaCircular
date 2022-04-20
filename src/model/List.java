package model;

public class List {
	
	private Node head;
	
	public void addFirst(Node n) {
		if(head == null) {
			head = n;
			head.setNext(head);
			head.setPrev(head);
		}else {
			Node tail = head.getPrev();
			n.setNext(head);
			head.setPrev(n);
			
			
			tail.setNext(n);
			n.setPrev(tail);
			
			head = n;
		}
	}
	
	public void print() {
		print(head);
	}
	
	private void print(Node n) {
		//Condicion de parada
		if(n.getNext() == head) {
			System.out.println(n.getValue() + " " + (n.getPlayer() != null ? n.getPlayer().getName():""));
			return;
		}
			System.out.println(n.getValue() + " " + (n.getPlayer() != null ? n.getPlayer().getName():""));
		
		print(n.getNext());
	}
	
	public void advance(int dice) {
		Node nPlayer = findPlayer(head);
		Player p = nPlayer.getPlayer();
		nPlayer.setPlayer(null);
		advance(nPlayer, p, dice);
		
	}
	
	private Node findPlayer(Node current) {
		if(current.getPlayer() != null) {
			return current;
		}
		return findPlayer(current.getNext());

	}

	private void advance(Node current, Player player, int i) {
		//Condicion de parada
		if(i == 0) {
			current.setPlayer(player);
			return;
		}
		//Metodo recursivo
		advance(current.getNext(), player, i-1);
	}
	
}
