package algorithms._0020_valid_parentheses;

import java.util.Stack;

/**
 * ** Created by peter.guan on 2021/06/07.
 *
 * @author peter.guan
 */
public class ValidParentheses {

    public boolean isValid(String s) {
        if (s.length() == 1) {
            return false;
        }


        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
                continue;
            }

            if (stack.isEmpty() || stack.peek() != getInverseChar(c)) {
                return false;
            }

            stack.pop();
        }

        return stack.isEmpty();
    }

    public char getInverseChar(char c) {
        switch (c) {
            case ')':
                return '(';
            case ']':
                return '[';
            case '}':
                return '{';
            default:
                return '.';
        }
    }

    public static void main(String[] args) {
        ValidParentheses validParentheses = new ValidParentheses();
        System.out.println(validParentheses.isValid("()[]{}"));
    }
}
