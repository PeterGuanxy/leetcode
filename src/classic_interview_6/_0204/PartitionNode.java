package classic_interview_6._0204;

import classic_interview_6._0202.KthToLast;
import classic_interview_6._0202.KthToLast.ListNode;

/**
 * ** Created by Peter on 2023年05月08日, 0008.
 *
 * @author Peter
 */
public class PartitionNode {

  public class ListNode {

    int val;
    ListNode next;

    ListNode(int x) {
      val = x;
    }
  }

  public ListNode partition(ListNode head, int x) {

    if (head == null) {
      return head;
    }

    ListNode fast = head.next;
    ListNode slow = head;

    while (fast != null) {
      if (slow.val < x && fast.val < x) {
        fast = fast.next;
        slow = slow.next;
      } else if (slow.val >= x && fast.val >= x) {
        fast = fast.next;
      } else if (slow.val < x && fast.val >= x) {
        fast = fast.next;
        slow = slow.next;
      } else {
        int temp = fast.val;
        fast.val = slow.val;
        slow.val = temp;
        fast = fast.next;
        slow = slow.next;
      }
    }
    return head;
  }

}
