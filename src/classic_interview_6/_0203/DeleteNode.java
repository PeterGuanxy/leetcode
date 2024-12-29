package classic_interview_6._0203;

import classic_interview_6._0202.KthToLast;
import classic_interview_6._0202.KthToLast.ListNode;

/**
 * ** Created by Peter on 2023年05月04日, 0004.
 *
 * @author Peter
 */
public class DeleteNode {

  public class ListNode {

    int val;
    ListNode next;

    ListNode(int x) {
      val = x;
    }
  }

  public void deleteNode(ListNode node) {

    node.val = node.next.val;
    node.next = node.next.next;

  }

}
