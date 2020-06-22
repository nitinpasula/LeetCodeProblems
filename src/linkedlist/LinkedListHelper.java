package linkedlist;

public class LinkedListHelper {
    /**
     * creates Linked list like "3->4->5" given 543
     * @param value
     * @return
     */
    public static ListNode createReverseNode(String value){
        ListNode dummyNode = new ListNode();
        ListNode previousNode = dummyNode;
        for ( int i = value.length() - 1; i >= 0; i--){
            int n = Integer.parseInt(value.substring(i, i+1));
            ListNode node = new ListNode(n);
            if ( previousNode.next == null){
                previousNode.next = node;
            }
            previousNode = node;
        }
        return dummyNode.next;
    }

    /**
     * creates Linked list like "5->4->3" give 543
     * @param value
     * @return
     */
    public static ListNode createNode(String value){
        ListNode dummyNode = new ListNode();
        ListNode previousNode = dummyNode;
        for ( int i = 0; i < value.length(); i++){
            int n = Integer.parseInt(value.substring(i, i+1));
            ListNode node = new ListNode(n);
            if ( previousNode.next == null){
                previousNode.next = node;
            }
            previousNode = node;
        }
        return dummyNode.next;
    }

    public static void  printNode(ListNode node){
        StringBuilder result = new StringBuilder();
        ListNode nextNode = null;
        if ( node == null){
            System.out.println("empty node");
        } else{
            while(true){
                result.append(node.val);
                result.append("->");
                if ( node.next == null){
                    break;
                }else{
                    node = node.next;
                }
            }
            System.out.println(result.substring(0, result.length() - 2));
        }

    }

}
