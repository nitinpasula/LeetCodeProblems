package linkedlist;

import sun.awt.image.ImageWatched;

import java.util.Scanner;

/**
 * Merge two sorted linked lists and return it as a new sorted list. The new list should be made by splicing together the nodes of the first two lists.
 *
 * Example:
 *
 * Input: 1->2->4, 1->3->4
 * Output: 1->1->2->3->4->4
 */
public class MergeTwoSortedLists {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String input1 = s.nextLine();
        String input2 = s.nextLine();
        ListNode l1 = LinkedListHelper.createNode(input1);
        ListNode l2 = LinkedListHelper.createNode(input2);
        LinkedListHelper.printNode(l1);
        LinkedListHelper.printNode(l2);
        ListNode mergedList = mergeLists(l1, l2);
        LinkedListHelper.printNode(mergedList);
    }
    public static ListNode mergeLists(ListNode l1, ListNode l2){
        ListNode dummy = new ListNode();
        ListNode previousNode = dummy;
        dummy.next = previousNode;
        if (l1 == null) {
            return l2;
        }
        if ( l2 == null){
           return l1;
        }
        while (l1 != null || l2 != null){
            int val1 = l1 == null ? 999999 : l1.val;
            int val2 = l2 == null ? 999999: l2.val;
            if ( val1 < val2){
                ListNode newNode = new ListNode(val1);
                previousNode.next = newNode;
                previousNode = newNode;
                l1 = l1.next;
            } else {
                ListNode newNode = new ListNode(val2);
                previousNode.next = newNode;
                previousNode = newNode;
                l2 = l2.next;
            }
        }
        return dummy.next;
    }
}
