package list.SortLinkedList;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		LinkedList l = new LinkedList();
		System.out.println("Enter the no of elements needed to insert:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			System.out.println("Enter "+(i+1)+" element: ");
			l.insert(sc.nextInt());
		}
		System.out.println("\nStraight Order");
		l.show();
		int[] arr = l.toArray(n);
		System.out.println("\nArray format is ");
		for (int i : arr) {
			System.out.print(i+" ");
		}
	}
}
