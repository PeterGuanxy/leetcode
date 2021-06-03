package algorithms._0002_add_two_number;

/**
 * ** Created by guanxy on 2018/7/6.
 *
 * @author guanxy
 */
public class AddTwoNumber {

  public static class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
      this.val = x;
    }
  }

  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ListNode newNode = new ListNode(0);
    ListNode node1 = l1, node2 = l2, current = newNode;
    int upper = 0;
    while (node1 != null || node2 != null) {
      int a = (node1 != null) ? node1.val : 0;
      int b = (node2 != null) ? node2.val : 0;
      int sum = a + b + upper;
      upper = sum / 10;
      current.next = new ListNode(sum % 10);
      current = current.next;
      if (node1 != null) {
        node1 = node1.next;
      }
      if (node2 != null) {
        node2 = node2.next;
      }
    }
    if (upper > 0) {
      current.next = new ListNode(upper);
    }

    return newNode.next;
  }


  public static void main(String[] args) {

  }
}
