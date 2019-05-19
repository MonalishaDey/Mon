package linkedList;

public class ListCreateDynamically {
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

	public void show() {
		Node current = head;
		while (current != null) {
			System.out.print(current.data + " , ");
			current = current.next;
		}
	}

	public static void main(String[] args) {
		ListCreateDynamically lcd = new ListCreateDynamically();
		lcd.create(10);
		lcd.create(34);
		lcd.create(23);
		lcd.create(7);
		lcd.create(40);
		lcd.show();

	}

}
