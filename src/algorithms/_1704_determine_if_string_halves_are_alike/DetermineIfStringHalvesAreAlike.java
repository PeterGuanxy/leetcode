package algorithms._1704_determine_if_string_halves_are_alike;

import java.util.ArrayList;
import java.util.List;

/**
 * ** Created by peter.guan on 2021/08/19.
 *
 * @author peter.guan
 */
public class DetermineIfStringHalvesAreAlike {

    public boolean halvesAreAlike(String s) {

        List<Character> list = new ArrayList<>(5);
        list.add('a');
        list.add('e');
        list.add('o');
        list.add('u');
        list.add('i');
        s = s.toLowerCase();
        String str1 = s.substring(0, s.length() / 2);
        String str2 = s.substring(s.length() / 2);

        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < str1.length(); i++) {
            if (list.contains(str1.charAt(i))) {
                count1++;
            }
            if (list.contains(str2.charAt(i))) {
                count2++;
            }
        }
        return count1 == count2;

    }

}
