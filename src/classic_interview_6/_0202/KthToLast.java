package classic_interview_6._0202;

/**
 * ** Created by Peter on 2023年05月04日, 0004.
 *
 * @author Peter
 */
public class KthToLast {

  public class ListNode {

    int val;
    ListNode next;

    ListNode(int x) {
      val = x;
    }
  }

  public int kthToLast(ListNode head, int k) {
    ListNode fast = head;
    ListNode slow = head;
    while (k > 1) {
      fast = fast.next;
      k--;
    }

    while (fast.next != null) {
      fast = fast.next;
      slow = slow.next;
    }

    return slow.val;
  }

}
