package linkedList;

public class FindMiddleElement {

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
		Node newnode = new Node(data);
		if (head == null) {
			head = newnode;
		} else {
			Node current = head;
			while (current.next != null) {
				current = current.next;
			}
			current.next = newnode;
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

	public int findMiddle() {
		Node front = head;
		Node mid = head;
		while (front.next != null) {
			mid = mid.next;
			front = front.next.next;
		}
		return mid.data;
	}

	public static void main(String[] args) {
		FindMiddleElement fe = new FindMiddleElement();
		fe.create(10);
		fe.create(20);
		fe.create(15);
		fe.create(30);
		fe.create(67);
		fe.create(14);
		fe.create(37);
		fe.print();
		int data = fe.findMiddle();
		System.out.println(data);

	}

}
