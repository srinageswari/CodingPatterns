package LinkedList;

public class LinkedList
{
    ListNode head;
    static class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
    public ListNode insert(LinkedList lst, int d) {
        ListNode newNode = new ListNode(d);
        if (lst.head == null) {
            lst.head = newNode;
        } else {
            ListNode currNode = lst.head;
            while (currNode.next != null) {
                currNode = currNode.next;
            }
            currNode.next = newNode;
        }
        return lst.head;
    }

    public void print(ListNode head) {
        if (head != null) {
            ListNode curr = head;
            while (curr != null) {
                System.out.println(curr.val);
                curr = curr.next;
            }
        }
    }
}

