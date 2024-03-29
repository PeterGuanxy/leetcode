package classic_interview_6._0205;

/**
 * ** Created by Peter on 2023年08月01日, 0001.
 *
 * @author Peter
 */
public class AddTwoNumbers {

  public class ListNode {

    int val;
    ListNode next;

    ListNode(int x) {
      val = x;
    }
  }

  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

    ListNode head = new ListNode(0);
    ListNode pos = head;
    int up = 0;

    while (l1 != null || l2 != null) {

      int sum = up;
      if (l1 != null) {
        sum += l1.val;
        l1 = l1.next;
      }

      if (l2 != null) {
        sum += l2.val;
        l2 = l2.next;
      }

      pos.next = new ListNode(sum % 10);
      pos = pos.next;
      up = sum / 10;
    }

    if (up != 0) {
      pos.next = new ListNode(up);
    }

    return head.next;
  }

}
