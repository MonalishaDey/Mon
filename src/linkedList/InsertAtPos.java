package linkedList;

public class InsertAtPos {
	Node head;

	class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public void insert(int data) {
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

	public void print() {
		Node current = head;
		while (current != null) {
			System.out.print(current.data + " , ");
			current = current.next;
		}
		System.out.println(" ");
	}

	public void insertNth(int data, int pos) {
		Node newNode = new Node(data);
		if (head == null) {
			if (pos != 0) {
				return;
			} else { 
				head = newNode;
			}
		}

		if (head != null && pos == 0) {
			newNode.next = head;
			head = newNode;
			return;
		}

		Node current = head;
		Node previous = null;

		int i = 0;

		while (i < pos) {
			previous = current;
			current = current.next;

			if (current == null) {
				break;
			}

			i++;
		}

		newNode.next = current;
		previous.next = newNode;
	}

	public static void main(String[] args) {
		InsertAtPos iap = new InsertAtPos();
		iap.insert(10);
		iap.insert(30);
		iap.insert(15);
		iap.insert(14);
		iap.print();
		iap.insertNth(25, 2);
		iap.print();

	}

}
