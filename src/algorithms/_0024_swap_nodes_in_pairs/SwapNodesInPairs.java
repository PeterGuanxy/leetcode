package algorithms._0024_swap_nodes_in_pairs;

/**
 * ** Created by peter.guan on 2021/06/08.
 *
 * @author peter.guan
 */
public class SwapNodesInPairs {

    public static class ListNode {
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

    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode start = new ListNode(0);
        ListNode pre = start;
        ListNode curr = head;
        start.next = head;

        // 排序
        while (curr != null && curr.next != null) {
            pre.next = curr.next;
            curr.next = curr.next.next;
            pre.next.next = curr;
            curr = curr.next;
            pre = pre.next.next;
        }

        return start.next;
    }

    public static void main(String[] args) {
        SwapNodesInPairs pairs = new SwapNodesInPairs();
        ListNode four = new ListNode(4);
        ListNode three = new ListNode(3, four);
        ListNode two = new ListNode(2, three);
        ListNode head = new ListNode(1, two);
        pairs.swapPairs(head);
    }

}
