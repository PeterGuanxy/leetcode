package algorithms._0090_subsets_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * ** Created by guanxy on 2022/7/14.
 *
 * @author guanxy
 */
public class Subsets2 {

  public List<List<Integer>> subsetsWithDup(int[] nums) {

    Set<String> StringSet = new HashSet<>();
    Arrays.sort(nums);
    List<List<Integer>> res = new ArrayList<>();
    res.add(new ArrayList<>());

    for (int i = 0; i < nums.length; i++) {
      List<Integer> list = new ArrayList<>();
      String sub = "";
      for (int j = i; j < nums.length; j++) {
        list = new ArrayList<>(list);
        sub += nums[j];
        list.add(nums[j]);
        if (StringSet.contains(sub)) {
          continue;
        }
        StringSet.add(sub);
        res.add(list);
      }
    }
    return res;
  }

  public static void main(String[] args) {
    Subsets2 subsets2 = new Subsets2();
    int[] nums = new int[]{1, 2, 2};
    subsets2.subsetsWithDup(nums);
  }

}
