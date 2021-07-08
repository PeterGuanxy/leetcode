package algorithms._0061_rotate_list;

/**
 * ** Created by peter.guan on 2021/07/08.
 *
 * @author peter.guan
 */
public class RotateList {

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

    public ListNode rotateRight(ListNode head, int k) {

        if (head == null) {
            return head;
        }

        int count = 1;
        ListNode curr = head;
        while (curr.next != null) {
            curr = curr.next;
            count++;
        }
        k = k % count;
        curr.next = head;
        for (int i = 0; i < count - k; i++) {
            curr = curr.next;
        }
        head = curr.next;
        curr.next = null;
        return head;
    }
}
