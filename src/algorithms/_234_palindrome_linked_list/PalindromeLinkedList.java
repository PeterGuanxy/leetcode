package algorithms._234_palindrome_linked_list;

/**
 * ** Created by peter.guan on 2021/06/02.
 *
 * @author peter.guan
 */
public class PalindromeLinkedList {

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

    public boolean isPalindromeList(ListNode head) {

        if (head == null|| head.next ==null) {
            return true;
        }

        ListNode midNode = midNode(head);
        ListNode halfNode = midNode.next;
        midNode.next = null;

        halfNode = reverseList(halfNode);

        ListNode list1 = head;
        ListNode list2 = halfNode;

        while (list1 != null && list2 != null) {
            if (list1.val != list2.val) {
                return false;
            }
            list1 = list1.next;
            list2 = list2.next;
        }

        return true;
    }

    public ListNode midNode(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode slowNode = head;
        ListNode fastNode = head;

        while (fastNode.next != null && fastNode.next.next != null) {
            slowNode = slowNode.next;
            fastNode = fastNode.next.next;
        }

        return slowNode;
    }

    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode pre = null;
        ListNode curr = head;
        ListNode next = null;

        while (curr != null) {
            next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }
        return pre;
    }

    public static void main(String[] args) {


    }
}
