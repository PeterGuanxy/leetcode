package algorithms._0203_remove_linked_list_elements;

/**
 * ** Created by peter.guan on 2021/06/08.
 *
 * @author peter.guan
 */
public class RemoveLinkedListElements {

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


    public ListNode removeElements(ListNode head, int val) {

        if (head == null) {
            return head;
        }

        while (head.val == val) {
            head = head.next;
        }

        if (head == null) {
            return head;
        }

        ListNode curr = head;

        while (curr.next != null) {
            if (curr.next.val != val) {
                curr = curr.next;
            } else {
                curr.next = curr.next.next;
            }

            if (curr == null) {
                break;
            }
        }

        return head;
    }
}
