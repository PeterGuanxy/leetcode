package algorithms._0021_merge_two_sorted_lists;

/**
 * ** Created by peter.guan on 2021/06/08.
 *
 * @author peter.guan
 */
public class MergeTwoSortedLists {

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

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode curr = result;

        while (l1 != null & l2 != null) {
            if (l1.val < l2.val) {
                curr.next = l1;
                curr = l1;
                l1 = l1.next;
            } else {
                curr.next = l2;
                curr = l2;
                l2 = l2.next;
            }
        }

        while (l1 != null && l2 == null) {
            curr.next = l1;
            curr = l1;
            l1 = l1.next;
        }

        while (l1 == null && l2 != null) {
            curr.next = l2;
            curr = l2;
            l2 = l2.next;
        }

        return result.next;
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(2);
        ListNode node = new ListNode(1, listNode);

        ListNode listnode1 = new ListNode(4);
        ListNode node1 = new ListNode(3, listnode1);
        mergeTwoLists(node, node1);

    }
}
