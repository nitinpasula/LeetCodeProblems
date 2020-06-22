package linkedlist;

import java.util.Scanner;

/**
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
 * <p>
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 * <p>
 * Example:
 * <p>
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 * Explanation: 342 + 465 = 807.
 */
public class AddTwoNumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String number1 = s.nextLine();
        String number2 = s.nextLine();
        ListNode l1 = LinkedListHelper.createReverseNode(number1);
        ListNode l2 = LinkedListHelper.createReverseNode(number2);
        System.out.println("Input Node 1 ");
        LinkedListHelper.printNode(l1);
        System.out.println("Input Node 2 ");
        LinkedListHelper.printNode(l2);
        ListNode sum = addTwoNodes(l1, l2);
        System.out.println("Result of Adding Node 1 and 2 ");
        LinkedListHelper.printNode(sum);
    }

    public static ListNode addTwoNodes(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode();
        ListNode previousNode = dummy;
        int carry = 0;
        while (true) {
            if (l1 == null && l2 == null) {
                if (carry != 0) {
                    previousNode.next = new ListNode(carry);
                }
                break;
            }
            if (l1 == null) {
                l1 = new ListNode();
            }
            if (l2 == null) {
                l2 = new ListNode();
            }
            int val1 = l1 == null ? 0 : l1.val;
            int val2 = l2 == null ? 0 : l2.val;
            int sum = val1 + val2 + carry;
            carry = sum / 10;
            sum = sum % 10;
            ListNode addedNode = new ListNode(sum);
            previousNode.next = addedNode;
            previousNode = addedNode;
            l1 = l1.next;
            l2 = l2.next;
        }
        return dummy.next;
    }
}
