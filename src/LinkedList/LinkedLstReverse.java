package LinkedList;

public class LinkedLstReverse {
	Node head;

	static class Node {
		Node next;
		int data;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	public LinkedLstReverse insert(LinkedLstReverse lst, int d) {
		Node newNode = new Node(d);
		if (lst.head == null) {
			lst.head = newNode;
		} else {
			Node currNode = lst.head;

			while (currNode.next != null) {
				currNode = currNode.next;
			}
			currNode.next = newNode;
		}
		return lst;
	}

	public LinkedLstReverse reverse(LinkedLstReverse lst) {
		Node curr = lst.head;
		Node prev = null;
		while (null != curr) {
			Node next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		lst.head = prev;
		return lst;
	}

	public LinkedLstReverse reverseEveryKNodes_(LinkedLstReverse lst, int k) {
		Node curr = lst.head; 
		Node prev = null;
		int count = 0;
		Node firstNode = null;
		Node currKnode = null;
		Node lastKnode = null;
		while (curr != null) {
			if (count == 0) {
				if(null != currKnode)
				{
					lastKnode = currKnode;
				}
				currKnode = curr; 
			}
			if (count < k) {
				Node next = curr.next; 
				curr.next = prev; 
				prev = curr; 
				curr = next; 
				count++;
			}
			if (count == k || curr == null) {
				if (firstNode == null) {
					firstNode = prev;
					lst.head = prev;
				} else {
					firstNode = prev;
					lastKnode.next = firstNode;
				}
				count = 0;
			}
		}
		currKnode.next = null;
		return lst;
	}

	public void print(LinkedLstReverse lst) {
		if (lst.head != null) {
			Node curr = lst.head;
			while (curr != null) {
				System.out.println(curr.data);
				curr = curr.next;
			}
		}
	}

	public static void main(String[] args) {
		LinkedLstReverse lst = new LinkedLstReverse();
		lst.insert(lst, 10);
		lst.insert(lst, 20);
		lst.insert(lst, 30);
		lst.insert(lst, 50);
		lst.insert(lst, 80);
		lst.insert(lst, 70);

		lst.print(lst);
		System.out.println("After reversal");
		
		lst = lst.reverseEveryKNodes_(lst, 5);

		lst.print(lst);
	}

	// 10 20 30 50 80 70
	// 50 30 20 10 70 80
}
