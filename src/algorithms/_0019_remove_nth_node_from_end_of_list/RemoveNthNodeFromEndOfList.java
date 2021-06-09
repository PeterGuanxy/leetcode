package algorithms._0019_remove_nth_node_from_end_of_list;

/**
 * ** Created by peter.guan on 2021/06/08.
 *
 * @author peter.guan
 */
public class RemoveNthNodeFromEndOfList {

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

    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode countNode = head;
        int count = 0;

        while (countNode != null) {
            countNode = countNode.next;
            count++;
        }

        if (n == count) {
            return head.next;
        }

        ListNode curr = head;
        int idx = count - n;
        for (int i = 1; i <= count; i++) {
            if (i == count - 1) {
                curr.next = null;
                return head;
            }
            if (i == idx) {
                curr.next = curr.next.next;
                return head;
            }
            curr = curr.next;
        }
        return head;
    }

    public ListNode twoPointerFaster(ListNode head, int n) {
        ListNode fast = head;
        ListNode slow = new ListNode(-1);
        ListNode start = slow;
        slow.next = head;
        // 先移动n 这样同时移动时 慢指针就在倒数n停下
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;

        }
        slow.next = slow.next.next;
        return start.next;
    }

}