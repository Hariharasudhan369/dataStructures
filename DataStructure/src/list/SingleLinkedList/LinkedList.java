package list.SingleLinkedList;

public class LinkedList {

	private Node head;
	private Node tail;

	public void insert(int data) {

		Node node = new Node(data);
		if(head == null) {
			head = node;
		}
		else {
			tail.next = node;			
		}
		tail=node;		
	}

	public void show() {
		
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.val+" ");
			temp = temp.next;
		}
	}
	
}
