package algorithms._1290_convert_binary_number_in_a_linked_list_to_integer;

/**
 * ** Created by peter.guan on 2021/12/07.
 *
 * @author peter.guan
 */
public class ConvertBinaryNumberInALinkedListToInteger {

    public class ListNode {
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

    public int getDecimalValue(ListNode head) {

        StringBuilder binaryBuilder = new StringBuilder();
        while (true) {
            binaryBuilder.append(head.val);
            if (head.next == null) {
                break;
            }
            head = head.next;
        }

        int amount = 0;
        String binary = binaryBuilder.toString();
        int length = binary.length();
        for (int i = 0; i < length; i++) {
            if (binary.charAt(i) == '1') {
                amount += Math.pow(2, length - 1 - i);
            }
        }

        return amount;

    }
}
