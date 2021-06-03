package algorithms._0014longest_common_prefix;

/**
 * ** Created by peter.guan on 2021/06/03.
 *
 * @author peter.guan
 */
public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        String str = strs[0];

        for (int i = 0; i < strs.length; i++) {
            if (strs[i].startsWith(str)) {
                continue;
            }
            str = str.substring(0, str.length() - 1);
            while (!strs[i].startsWith(str)) {
                str = str.substring(0, str.length() - 1);
            }
            if (str.length() == 0) {
                break;
            }
        }

        return str;
    }

    public String longestCommonPrefix2(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        if (strs.length == 1) {
            return strs[0];
        }
        for (int i = 0; i < strs[0].length(); i++) {
            boolean flag = true;
            char ch = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].length() == i || ch != strs[j].charAt(i)) {
                    return strs[0].substring(0, i);
                }
            }
        }
        return strs[0];
    }

    public static void main(String[] args) {
        LongestCommonPrefix longest = new LongestCommonPrefix();
        System.out.println(longest.longestCommonPrefix(new String[]{"abc", "abcesa", "aberw"}));
    }
}
