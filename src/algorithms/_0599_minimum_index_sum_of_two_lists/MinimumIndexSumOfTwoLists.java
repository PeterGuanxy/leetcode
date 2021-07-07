package algorithms._0599_minimum_index_sum_of_two_lists;

import java.util.*;
import java.util.List;

/**
 * ** Created by peter.guan on 2021/07/07.
 *
 * @author peter.guan
 */
public class MinimumIndexSumOfTwoLists {

    public String[] findRestaurantSlow(String[] list1, String[] list2) {

        Map<String, Integer> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();
        for (int i = 0; i < list1.length; i++) {
            map1.put(list1[i], i);
        }
        for (int i = 0; i < list2.length; i++) {
            map2.put(list2[i], i);
        }

        Set<String> keys = map1.keySet();
        Map<Integer, List<String>> result = new HashMap<>();
        for (String key : keys) {
            int sum = map1.getOrDefault(key, 2000) + map2.getOrDefault(key, 2000);
            List<String> resultList = result.getOrDefault(sum, new ArrayList<>());
            resultList.add(key);
            result.put(sum, resultList);
        }
        List<Integer> sumList = new ArrayList<>(result.keySet());
        Collections.sort(sumList);
        List<String> res = result.get(sumList.get(0));
        String[] resStr = new String[res.size()];
        return res.toArray(resStr);
    }

    public String[] findRestaurant(String[] list1, String[] list2) {

        if (list1.length > list2.length) {
            return findRestaurant(list2, list1);
        }

        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < list1.length; i++) {
            map.put(list1[i], i);
        }

        List<String> minList = new ArrayList<>();
        int minSum = 2001;
        for (int i = 0; i < list2.length; i++) {
            if (map.containsKey(list2[i])) {
                int sum = i + map.get(list2[i]);
                if (sum < minSum) {
                    minList = new ArrayList<>();
                    minSum = sum;
                }
                if (sum == minSum) {
                    minList.add(list2[i]);
                }
            }
        }

        return minList.toArray(new String[minList.size()]);
    }
}
