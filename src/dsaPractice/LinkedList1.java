package dsaPractice;

public class LinkedList1 {

	class Node {
		int val;
		Node next;

		public Node(int val) {
			this.val = val;
		}
	}

	static Node head = null;
	Node tail = null;

	public void addNodeAtEnd(int val) {
		Node newNode = new Node(val);
		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			tail.next = newNode;
			newNode.next = null;
			tail = newNode;
		}
	}

	public void addNodeAtStart(int val) {
		Node newNode = new Node(val);
		newNode.next = head;
		head = newNode;
	}

	public void addNodeAtGivenIndex(int val, int index) {
		Node curr = head;
		int count = 0;
		while (curr != null && count != index - 1) {
			curr = curr.next;
			count++;
		}
		Node newNode = new Node(val);
		Node temp = curr.next;
		curr.next = newNode;
		newNode.next = temp;
	}

	public void deleteNodeAtEnd(Node head) {
		Node curr = head;
		while (curr.next.next != null) {
			curr = curr.next;
		}
		curr.next = null;
	}

	public void deleteNodeAtStart(Node head) {
		head = head.next;
	}

	public void deleteNodeAtGivenIndex(Node head, int index) {
		Node curr = head;
		int count = 0;
		while (curr != null && count != index - 1) {
			curr = curr.next;
			count++;
		}
		Node temp = curr.next.next;
		curr.next = temp;
	}

	private void removeNodeWithGivenValues(Node head, int val) {
		if (head.val == val)
			deleteNodeAtStart(head);
		else if (tail.val == val)
			deleteNodeAtEnd(head);
		else {
			Node curr = head;
			Node prev = null;
			while (curr != null && curr.val != val) {
				prev = curr;
				curr = curr.next;
			}
			if (curr == null)
				throw new RuntimeException("Node with given value is not found");
			else
				prev.next = curr.next;
		}
	}
	
	public void deleteNodeWithEvenValues(Node head) {
		Node curr=head;
		while(curr!=null) {
			if(curr.val%2==0) {
				removeNodeWithGivenValues(head,curr.val);
			}
			curr=curr.next;
		}
	}
	
	public void reverseList(Node head) {
		Node curr=head;
		Node prev=null;
		Node next=null;
		while(curr!=null) {
			next=curr.next;
			curr.next=prev;
			
			prev=curr;
			curr=next;
		}
		print(prev);
	}

	public void print(Node head) {
		int count = 0;
		Node curr = head;
		while (curr != null) {
			System.out.print(curr.val + " ");
			curr = curr.next;
			count++;
		}
		System.out.println();
		System.out.println("Total number of Nodes in the list = " + count);
	}

	public static void main(String[] args) {
		LinkedList1 l = new LinkedList1();
		l.addNodeAtEnd(1);
		l.addNodeAtEnd(2);
		l.addNodeAtEnd(3);
		l.addNodeAtStart(0);
		l.addNodeAtGivenIndex(5, 2);
		// l.deleteNodeAtEnd(head);
		// l.deleteNodeAtGivenIndex(head, 2);
		//l.removeNodeWithGivenValues(head, 2);
		//l.deleteNodeWithEvenValues(head);
		l.reverseList(head);
		//l.print(head);

	}

}
