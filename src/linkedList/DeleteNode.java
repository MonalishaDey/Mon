package linkedList;

public class DeleteNode {
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
			System.out.print(current.data + " ==> ");
			current = current.next;

		}
		System.out.println("  ");

	}

	public void delete(int pos) {
		if (head == null) {
			if (pos != 0) {
				return;
			}
		}
		if (head != null && pos == 0) {
			Node current = head;
			head = current.next;
			current.next = null;
		} else {
			Node current = head;
			int count = 0;
			while (count < pos - 1) {
				current = current.next;
				count++;

			}
			current.next = current.next.next;

		}
	}

	public static void main(String[] args) {
		DeleteNode dn = new DeleteNode();
		dn.create(10);
		dn.create(16);
		dn.create(21);
		dn.create(15);
		dn.create(53);
		dn.print();
		dn.delete(4);
		dn.print();

	}

}
