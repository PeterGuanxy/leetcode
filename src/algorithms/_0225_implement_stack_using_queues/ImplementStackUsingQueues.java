package algorithms._0225_implement_stack_using_queues;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * ** Created by peter.guan on 2021/06/17.
 *
 * @author peter.guan
 */
public class ImplementStackUsingQueues {

    List<Integer> list = new ArrayList<>();

    /**
     * Initialize your data structure here.
     */
    public ImplementStackUsingQueues() {

    }

    /**
     * Push element x onto stack.
     */
    public void push(int x) {
        list.add(x);
    }

    /**
     * Removes the element on top of the stack and returns that element.
     */
    public int pop() {
        return list.remove(list.size() - 1);
    }

    /**
     * Get the top element.
     */
    public int top() {
        return list.get(list.size() - 1);
    }

    /**
     * Returns whether the stack is empty.
     */
    public boolean empty() {
        return list.isEmpty();
    }
}
