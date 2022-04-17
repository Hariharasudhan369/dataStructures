package list.doubleLinkedList;

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
	}


	public void show() {

		Node temp = head;
		while (temp != null) {
			System.out.print(temp.val+" ");
			temp = temp.next;
		}
	}
	public void rshow() {

		Node temp = tail;
		while (temp != null) {
			System.out.print(temp.val+" ");
			temp = temp.pre;
		}
	}
}
