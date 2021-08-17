package algorithms._0148_sort_list;

/**
 * ** Created by peter.guan on 2021/08/17.
 *
 * @author peter.guan
 */
public class SortList {

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

    public ListNode sortList(ListNode head) {
        return sort(head, null);
    }

    public ListNode sort(ListNode start, ListNode end) {
        if (start == end) {
            return start;
        }
        ListNode fast = start, slow = start;
        while (fast != end && fast.next != end) {
            fast = fast.next.next;
            slow = slow.next;
        }

        ListNode l2 = sort(slow.next, end);
        slow.next = null;
        ListNode l1 = sort(start, slow);

        return merge(l1, l2);
    }

    public ListNode merge(ListNode l1, ListNode l2) {
        if (l1 == null || l2 == null) {
            return l1 == null ? l2 : l1;
        }

        if (l1.val < l2.val) {
            l1.next = merge(l1.next, l2);
            return l1;
        } else {
            l2.next = merge(l2.next, l1);
            return l2;
        }
    }
}
