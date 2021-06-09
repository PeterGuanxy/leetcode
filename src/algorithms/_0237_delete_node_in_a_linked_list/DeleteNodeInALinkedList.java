package algorithms._0237_delete_node_in_a_linked_list;

/**
 * ** Created by peter.guan on 2021/06/08.
 *
 * @author peter.guan
 */
public class DeleteNodeInALinkedList {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public void deleteNode(ListNode head, int node) {

        ListNode curr = head;

        while (curr.next != null) {
            if (curr.next.val == node) {
                curr.next = curr.next.next;
                return;
            }
        }

    }
}
