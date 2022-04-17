package list.SortLinkedList;

public class LinkedList {

	private Node head;
	private Node tail;

	public void insert(int data) {

		Node node = new Node(data);
		if(head == null) {
			head = tail = node;
		}
		else {
			if(data<=head.val) {
				node.next = head;
				head = node;
			}
			else if(data>=tail.val) {
				tail.next = node;
				tail = node;
			}
			else {
				Node temp = head.next;
				Node prev = head;
				while(temp != null) {
					
					if (data <= temp.val) {
						node.next = temp;
						prev.next = node;
						break;
					}
					prev = temp;
					temp = temp.next;
				}
			}
		}
		
	}

	
	public void show() {
		
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.val+" ");
			temp = temp.next;
		}
	}
	public int[] toArray(int n) {
		int[] arr = new int[n];
		int i=0;
		Node temp = head;
		while (temp != null) {
			arr[i++] = temp.val;
			temp = temp.next;
		}
		return arr;
	}
}
