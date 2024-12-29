package classic_interview_6._0206;

/**
 * ** Created by Peter on 2023年08月01日, 0001.
 *
 * @author Peter
 */
public class IsPalindrome {

  public class ListNode {

    int val;
    ListNode next;

    ListNode(int x) {
      val = x;
    }
  }

  public boolean isPalindrome(ListNode head) {

    // 1. 快慢指针找到中点
    ListNode fast = head;
    ListNode slow = head;
    while (fast != null && fast.next != null) {
      fast = fast.next.next;
      slow = slow.next;
    }

    // 2. 反转后半部分
    ListNode pre = null;
    ListNode curr = slow;
    while (curr != null) {
      ListNode temp = curr.next;
      curr.next = pre;
      pre = curr;
      curr = temp;
    }

    // 3. 比较
    while (pre != null) {
      if (pre.val != head.val) {
        return false;
      }
      pre = pre.next;
      head = head.next;
    }
    return true;




//    List<Integer> list = new ArrayList<>();
//    while (head != null) {
//      list.add(head.val);
//      head = head.next;
//    }
//
//    int l = 0;
//    int r = list.size() - 1;
//
//    while (l < r) {
//      if (list.get(l).intValue() != list.get(r).intValue()) {
//        return false;
//      }
//      l++;
//      r--;
//    }
//    return true;
  }

}
