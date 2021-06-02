package algorithms._092_reverse_linked_list_2;

/**
 * ** Created by peter.guan on 2021/06/02.
 *
 * @author peter.guan
 */
public class ReverseLinkedList2 {

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

    public static ListNode reverseLinkedList(ListNode head, int left, int right) {

        if (head == null || head.next == null) {
            return head;
        }

        int n = 0;
        ListNode first = head;
        ListNode firstEnd = null;
        ListNode midStart = null;
        ListNode midEnd = null;
        ListNode lastStart = null;
        ListNode curr = head;
        ListNode pre = null;
        ListNode next = null;

        while (curr != null) {
            n++;

            if (n < left) {
                if (n == left-1) {
                    firstEnd = curr;
                    midEnd = curr.next;
                }
                curr = curr.next;
                continue;
            }


            if (n == right) {
                midStart = curr;
                lastStart = curr.next;
            }

            if (n > right) {
                break;
            }

            next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }

        if (left == 1) {
            first = midStart;
            midEnd = head;
        } else {
            firstEnd.next = midStart;
        }

        midEnd.next = lastStart;

        return first;
    }

    public static void main(String[] args) {
        ListNode node = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));

        ListNode list = reverseLinkedList(node,1,5);

        while (list!=null) {
            System.out.print(list.val + " ");
            list = list.next;
        }
    }
}
