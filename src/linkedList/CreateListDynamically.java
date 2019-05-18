package linkedList;

public class CreateListDynamically {
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
		Node n2 = new Node(data);
		if (head == null) {
			head = n2;
		} else {
			Node current = head;
			while (current.next != null) {
				current = current.next;
			}
			current.next = n2;
		}

	}

	public void show() {
		Node current = head;
		while (current != null) {
			System.out.print(current.data + " , ");
			current = current.next;
		}
	}

	public static void main(String[] args) {
		CreateListDynamically cls = new CreateListDynamically();
		cls.create(10);
		cls.create(20);
		cls.create(15);
		cls.create(30);
		cls.create(17);
		cls.show();

	}

}
