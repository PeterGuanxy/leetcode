package algorithms._0383_ransom_note;

import java.util.Arrays;

/**
 * ** Created by peter.guan on 2021/11/26.
 *
 * @author peter.guan
 */
public class RansomNote {

    public boolean canConstruct(String ransomNote, String magazine) {

        if (ransomNote.length() > magazine.length()) {
            return false;
        }

        char[] rs = ransomNote.toCharArray();
        char[] ms = magazine.toCharArray();
        Arrays.sort(rs);
        Arrays.sort(ms);


        int i = 0;
        int j = 0;

        while (i < rs.length && j < ms.length) {
            if (rs[i] == ms[j]) {
                i++;
                j++;
            } else {
                j++;
            }
        }
        return i == rs.length;

    }

    public boolean faster(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()) {
            return false;
        }
        int[] arr = new int[26];

        for (int i = 0; i < magazine.length(); i++) {
            arr[magazine.charAt(i) - 'a']++;
        }

        for (int i = 0; i < ransomNote.length(); i++) {
            if (arr[(ransomNote.charAt(i) - 'a')] == 0) {
                return false;
            } else {
                arr[(ransomNote.charAt(i) - 'a')]--;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        RansomNote ransomNote = new RansomNote();
        System.out.println(ransomNote.canConstruct("bg",
                "efjbdfbdgfjhhaiigfhbaejahgfbbgbjagbddfgdiaigdadhcfcj"));
    }

}
