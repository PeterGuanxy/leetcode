package algorithms._0082_remove_duplicates_from_sorted_list_2;

/**
 * description
 *
 * @author Peter Guan
 * @date 2022/3/9
 */
public class RemoveDuplicatesFromSortedList2 {

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

  public ListNode deleteDuplicates(ListNode head) {

    ListNode dummy = new ListNode();
    dummy.next = head;

    ListNode prev = dummy;
    ListNode curr = head;

    while (curr != null) {
      if (curr.next != null && curr.val == curr.next.val) {
        while (curr.next != null && curr.val == curr.next.val) {
          curr = curr.next;
        }
        prev.next = curr.next;
      } else {
        prev = curr;
      }
      curr = curr.next;
    }

    return dummy.next;

  }

  public static void main(String[] args) {
    RemoveDuplicatesFromSortedList2 list2 = new RemoveDuplicatesFromSortedList2();

    ListNode last = new ListNode(5);
    ListNode node4 = new ListNode(4, last);
    ListNode node41 = new ListNode(4, node4);
    ListNode node3 = new ListNode(3, node41);
    ListNode node2 = new ListNode(2, node3);
    ListNode node21 = new ListNode(2, node2);
    ListNode head = new ListNode(1, node21);

    list2.deleteDuplicates(head);

    System.out.println(head.next.val);

  }

}
