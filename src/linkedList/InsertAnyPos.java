package linkedList;

public class InsertAnyPos {

	Node head;

	class Node {
		int data;
		Node next;

		public Node(int data) {

			this.data = data;
			this.next = null;
		}

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

	public void print() {
		Node current = head;
		while (current != null) {
			System.out.print(current.data + " , ");
			current = current.next;
		}
		System.out.println(" ");
	}

	public void insert(int pos, int data) {
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
		} else {
			Node current = head;
			int count = 0;
			while (count < pos - 1) {
				current = current.next;
				count++;
			}
			newNode.next = current.next;
			current.next = newNode;
		}
	}

	public static void main(String[] args) {
		InsertAnyPos iap = new InsertAnyPos();
		iap.create(10);
		iap.create(30);
		iap.create(26);
		iap.create(14);
		iap.print();
		iap.insert(0, 15);
		iap.print();
	}

}
