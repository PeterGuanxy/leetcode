package algorithms._0049_group_anagrams;

import java.util.*;

/**
 * ** Created by peter.guan on 2021/07/01.
 *
 * @author peter.guan
 */
public class GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            String target = count(strs[i]);
            List<String> list = map.getOrDefault(target, new ArrayList<>());
            list.add(strs[i]);
            map.put(target, list);
        }

        return new ArrayList<>(map.values());

    }

    public String count(String str) {

        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        return String.valueOf(chars);

    }


}
