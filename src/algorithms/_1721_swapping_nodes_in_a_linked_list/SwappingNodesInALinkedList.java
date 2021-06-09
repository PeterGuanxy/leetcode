package algorithms._1721_swapping_nodes_in_a_linked_list;

/**
 * ** Created by peter.guan on 2021/06/08.
 *
 * @author peter.guan
 */
public class SwappingNodesInALinkedList {

    public class ListNode {
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

    public ListNode swapNodes(ListNode head, int k) {

        if (head.next == null) {
            return head;
        }

        ListNode fast = head;
        ListNode slow = new ListNode(-1);
        slow.next = head;

        for (int i = 1; i < k; i++) {
            fast = fast.next;
        }
        ListNode a = fast;

        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        int temp = a.val;
        a.val = slow.val;
        slow.val = temp;

        return head;
    }
}
