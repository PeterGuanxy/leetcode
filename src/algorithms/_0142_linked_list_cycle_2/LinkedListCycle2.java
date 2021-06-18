package algorithms._0142_linked_list_cycle_2;

import java.util.ArrayList;
import java.util.List;

/**
 * ** Created by peter.guan on 2021/06/18.
 *
 * @author peter.guan
 */
public class LinkedListCycle2 {

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode detectCycle(ListNode head) {

        if (head == null || head.next == null) {
            return null;
        }

        List<ListNode> list = new ArrayList<>();
        while (head != null) {
            if (list.contains(head)) {
                return head;
            } else {
                list.add(head);
            }
            head = head.next;
        }
        return null;
    }

    public ListNode faster(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }

        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow) {
                while (head != null) {
                    if (head == fast) {
                        return fast;
                    }
                    head = head.next;
                    fast = fast.next;
                }
            }
        }
        return null;
    }
}
