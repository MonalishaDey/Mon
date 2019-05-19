package linkedList;

public class InsertAtBeginning {

	static Node head;

	class Node {
		int data;
		Node next;

		public Node(int data) {

			this.data = data;
			this.next = null;
		};
	}

	public void create(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
		} else {
			Node current = head;
			while (current.next != null) {
				current = current.next;
			}
			current.next = newNode;
		}

	}

	public void display(Node head) {
		Node current = head;
		while (current != null) {
			System.out.print(current.data + " , ");
			current = current.next;
		}
		System.out.println(" ");
	}

	public Node insertAtbeg(int data) {
		
		Node newNode = new Node(data);
		Node current = null;
		if (head == null) {
			head = newNode;
		} else {
			 current = head;
			if(current != null) {
				newNode.next = current;
				current = newNode;
			}
			
		}
      
	return current;
	}

	public static void main(String[] args) {
		InsertAtBeginning iab = new InsertAtBeginning();
		iab.create(5);
		iab.create(15);
		iab.create(9);
		iab.create(8);
		iab.create(13);
		iab.display(head);
		Node insert = iab.insertAtbeg(7);
		iab.display(insert);

	}

}
