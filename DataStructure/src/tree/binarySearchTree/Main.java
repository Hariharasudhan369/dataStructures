package tree.binarySearchTree;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter total no of values to be inserted: ");
		binarySearchTree t = new binarySearchTree();
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			System.out.println("Enter "+(i+1)+" element: ");
    t.insert(sc.nextInt());
		}
		t.show();
	}

}
