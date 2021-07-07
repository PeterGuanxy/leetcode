package algorithms._0160_intersection_of_two_linked_lists;

/**
 * ** Created by peter.guan on 2021/07/07.
 *
 * @author peter.guan
 */
public class IntersectionOfTwoLinkedLists {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        ListNode curr = headA;
        int countA = 0;
        while (curr != null) {
            countA++;
            curr = curr.next;
        }
        curr = headB;
        int countB = 0;
        while (curr != null) {
            countB++;
            curr = curr.next;
        }

        if (countA > countB) {
            for (int i = 0; i < countA - countB; i++) {
                headA = headA.next;
            }
        }

        if (countB > countA) {
            for (int i = 0; i< countB - countA; i++) {
                headB = headB.next;
            }
        }

        while (headA != null) {
            if (headA == headB) {
                return headA;
            }
            headA = headA.next;
            headB = headB.next;
        }

        return null;
    }
}
