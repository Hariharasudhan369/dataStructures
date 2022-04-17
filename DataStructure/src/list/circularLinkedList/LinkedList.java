package list.circularLinkedList;

public class LinkedList {

	private Node head;
	private Node tail;

	public void insert(int data) {

		Node node = new Node(data);

		if(head == null) {
			head = node;
		}
		else {
			node.pre = tail;
			tail.next = node;

		}
		tail = node;
		tail.next = head;
		head.pre = tail;
	}


	public void show() {

		Node temp = head;
		do{
			System.out.print(temp.val+" ");
			temp = temp.next;
		}while (temp != head);
	}
	public void rshow() {

		Node temp = tail;
		do{
			System.out.print(temp.val+" ");
			temp = temp.pre;
		}while (temp != tail);
	}
}

