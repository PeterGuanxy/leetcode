package algorithms._1451_rearrange_words_in_a_sentence;

import java.util.*;

/**
 * ** Created by peter.guan on 2021/08/24.
 *
 * @author peter.guan
 */
public class RearrangeWordsInASentence {

    public String arrangeWords(String text) {

        String[] arr = text.split(" ");
        arr[0] = arr[0].toLowerCase();

        Map<Integer, List<String>> map = new HashMap<>();
        for (String str : arr) {
            List<String> list = map.getOrDefault(str.length(), new ArrayList<>());
            list.add(str);
            map.put(str.length(), list);
        }

        List<Integer> numList = new ArrayList<>(map.keySet());
        Collections.sort(numList);

        StringBuilder builder = new StringBuilder();
        for (int n : numList) {
            for (String str : map.get(n)) {
                builder.append(str).append(" ");
            }
        }
        String res = builder.toString();
        res = res.substring(0, 1).toUpperCase() + res.substring(1, res.length() - 1);
        return res;
    }
}
