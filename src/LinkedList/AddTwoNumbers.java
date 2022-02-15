package LinkedList;

import LinkedList.LinkedList.ListNode;
// You are given two non-empty linked lists representing two non-negative integers.
// The digits are stored in reverse order, and each of their nodes contains a single digit.
// Add the two numbers and return the sum as a linked list.
// You may assume the two numbers do not contain any leading zero, except the number 0 itself.

//Constraints:
//        The number of nodes in each linked list is in the range [1, 100].
//        0 <= Node.val <= 9
//        It is guaranteed that the list represents a number that does not have leading zeros.

//        Input: l1 = [2,4,3], l2 = [5,6,4]
//        Output: [7,0,8]
//        Explanation: 342 + 465 = 807.

//    {@link https://leetcode.com/problems/add-two-numbers/}

public class AddTwoNumbers {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode curr1 = l1;
        ListNode curr2 = l2;
        ListNode outputHead = null;
        ListNode outputCurr = null;
        int remainder = 0;
        int firstVal;
        int secondVal;
        while(curr1 != null || curr2 != null)
        {
            firstVal = 0;
            secondVal = 0;
            if(null != curr1)
            {
                firstVal = curr1.val;
            }
            if(null != curr2)
            {
                secondVal = curr2.val;
            }
            int currSum = firstVal + secondVal + remainder;

            remainder = currSum / 10;
            currSum = currSum % 10;

            if(outputHead == null)
            {
                outputHead = new ListNode(currSum);
                outputCurr = outputHead;
            }
            else
            {
                ListNode newSum = new ListNode(currSum);
                outputCurr.next = newSum;
                outputCurr = outputCurr.next;
            }
            if(null != curr1)
            {
                curr1 = curr1.next;
            }
            if(null != curr2)
            {
                curr2 = curr2.next;
            }
        }
        if(remainder != 0)
        {
            ListNode last = new ListNode(remainder);
            outputCurr.next = last;
            outputCurr = outputCurr.next;
        }
        return outputHead;
    }

    public static void main(String[] args)
    {
        LinkedList lst1 = new LinkedList();
        lst1.insert(lst1, 2);
        lst1.insert(lst1, 4);
        lst1.insert(lst1, 3);
        LinkedList lst2 = new LinkedList();
        lst2.insert(lst2, 5);
        lst2.insert(lst2, 6);
        lst2.insert(lst2, 4);
        lst1.print(addTwoNumbers(lst1.head,lst2.head));
    }
}
