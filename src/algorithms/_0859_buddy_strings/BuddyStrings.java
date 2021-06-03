package algorithms._0859_buddy_strings;

/**
 * ** Created by peter.guan on 2021/06/03.
 *
 * @author peter.guan
 */
public class BuddyStrings {

    public boolean buddyStrings(String s, String goal) {

        if (s.length() != goal.length()) {
            return false;
        }

        if (s.equals(goal)) {
            char[] elements = s.toCharArray();
            for (char e : elements) {
                if (s.indexOf(e) != s.lastIndexOf(e)) {
                    return true;
                }
            }
            return false;
        }

        int first = 0;
        int last = 0;
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != goal.charAt(i)) {
                count++;
                if (count == 1) {
                    first = i;
                }
                if (count == 2) {
                    last = i;
                    s = swap(s, first, last);
                    return s.equals(goal);
                }
            }
        }

        return false;
    }

    public String swap(String s, int first, int last) {
        char[] array = s.toCharArray();
        char temp = array[first];
        array[first] = array[last];
        array[last] = temp;
        return String.valueOf(array);
    }

    public static void main(String[] args) {
        BuddyStrings buddyStrings = new BuddyStrings();
        System.out.println(buddyStrings.buddyStrings("ab", "ba"));
    }
}
