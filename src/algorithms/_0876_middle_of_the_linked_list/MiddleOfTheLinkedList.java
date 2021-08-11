package algorithms._0876_middle_of_the_linked_list;

/**
 * ** Created by peter.guan on 2021/08/11.
 *
 * @author peter.guan
 */
public class MiddleOfTheLinkedList {

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

    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(true) {
            if (fast.next == null) {
                return slow;
            }
            if (fast.next.next == null) {
                return slow.next;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
    }

}
