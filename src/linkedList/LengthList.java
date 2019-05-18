package linkedList;


public class LengthList {

	private  Node head ;
	
	public void length(Node head)
	{
		int count = 0;
		Node current = head;
		while(current!=null)
		{
			count++;
			current = current.next;
		}
		System.out.println("Length of List is :" + count++);
	}
	
	static class Node{
		int data;
		Node next;
		public Node(int data) {
			
			this.data = data;
			this.next = null;
		}
	}

	public static void main(String[] args) {
		Node head = new Node(1);
		Node sec  = new Node(2);
		Node third  = new Node(3);
		Node fourth  = new Node(4);
		head.next = sec;
		sec.next = third;
		third.next = fourth;
		LengthList ll = new LengthList();
		ll.length(head);



	}

}
