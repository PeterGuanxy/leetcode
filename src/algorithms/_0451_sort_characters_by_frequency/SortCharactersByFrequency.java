package algorithms._0451_sort_characters_by_frequency;

import javafx.beans.binding.StringBinding;

import java.util.*;

/**
 * ** Created by peter.guan on 2021/10/25.
 *
 * @author peter.guan
 */
public class SortCharactersByFrequency {

    public String frequencySort(String s) {

        int[] arr = new int['z' - '0'];
        for (char c : s.toCharArray()) {
            arr[c - '0']++;
        }

        StringBuilder builder;
        Map<Integer, String> map = new HashMap<>(66);
        for (int i = 0; i < 'z' - '0'; i++) {
            if (arr[i] != 0) {
                builder = new StringBuilder(map.getOrDefault(arr[i], ""));
                for (int j = 0; j < arr[i]; j++) {
                    builder.append((char) (i + '0'));
                }
                map.put(arr[i], builder.toString());
            }
        }

        List<Integer> list = new ArrayList<>(map.keySet());
        Collections.sort(list);

        builder = new StringBuilder();
        for (int k = list.size() - 1; k >= 0; k--) {
            builder.append(map.get(list.get(k)));
        }
        return builder.toString();
    }
}
