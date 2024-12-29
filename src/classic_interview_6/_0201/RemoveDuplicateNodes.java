package classic_interview_6._0201;

/**
 * ** Created by Peter on 2023年04月24日, 0024.
 *
 * @author Peter
 */
public class RemoveDuplicateNodes {

  public class ListNode {

    int val;
    ListNode next;

    ListNode(int x) {
      val = x;
    }
  }

  public ListNode removeDuplicateNodes(ListNode head) {
    if (head == null) {
      return null;
    }
    boolean[] check = new boolean[20000];
    ListNode pos = head;
    check[head.val] = true;

    while (pos.next != null) {
      ListNode curr = pos.next;
      if (check[curr.val]) {
        pos.next = pos.next.next;
      } else {
        check[curr.val] = true;
        pos = pos.next;
      }
    }
    return head;
  }

}
