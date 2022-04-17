package tree.binarySearchTree;

import java.util.Scanner;

public class binarySearchTree {
	
	private Node root;
	
	public void insert(int data) {
		
		Node node = new Node(data);
		
		if(root == null) {
			root = node;			
		}
		else {
			Node temp = root;
			while(temp != null) {
				Node parent = temp;
				if(data > temp.val) {
					temp = temp.right;
					if(temp == null) {
						parent.right = node;
						temp = node;
						return ;
					}
				}
				else if(data < temp.val) {
					temp = temp.left;
					if(temp == null) {
						parent.left = node;
						temp = node;
						return ;
					}
				}
				else {
					System.out.println("Duplicate values not allowed");
					return;
				}
			}
			
		}
	}
	
	public void show() {
		Scanner sc = new Scanner(System.in);
		Node temp = root;
		System.out.println(temp.val);
		while(temp!=null) {
			System.out.println("Enter 1 for child 1 and 2 for child 2:");
			int choice = sc.nextInt();
			if(choice == 1) {
				temp = temp.left;
			}
			else {
				temp = temp.right;
			}
			if(temp != null) {
				System.out.println(temp.val);
			}
			else {
				System.out.println("No Child");
			}
		
		}
	}

}
