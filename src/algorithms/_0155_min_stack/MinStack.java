package algorithms._0155_min_stack;

/**
 * ** Created by peter.guan on 2021/06/17.
 *
 * @author peter.guan
 */
public class MinStack {

    class ListNode {
        int val;
        int min;
        ListNode next;
    }

    ListNode node = null;

    /** initialize your data structure here. */
    public MinStack() {

    }

    public void push(int val) {
        ListNode temp = new ListNode();
        temp.val = val;
        temp.min = (node == null || node.min > val) ? val : node.min;
        temp.next = node;
        node = temp;
    }

    public void pop() {
        node = node.next;
    }

    public int top() {
        return node.val;
    }

    public int getMin() {
        return node.min;
    }
}
