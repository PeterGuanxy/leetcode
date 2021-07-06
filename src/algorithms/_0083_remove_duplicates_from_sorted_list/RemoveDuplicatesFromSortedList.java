package algorithms._0083_remove_duplicates_from_sorted_list;

/**
 * ** Created by peter.guan on 2021/06/18.
 *
 * @author peter.guan
 */
public class RemoveDuplicatesFromSortedList {

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

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode fnode = head;
        ListNode nnode = head.next;

        while (nnode != null) {
            if (fnode.val == nnode.val) {
                fnode.next = nnode.next;
            } else {
                fnode = nnode;

            }
            nnode = nnode.next;
        }
        return head;
    }
}
