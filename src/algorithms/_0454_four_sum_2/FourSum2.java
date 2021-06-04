package algorithms._0454_four_sum_2;

import java.util.*;

/**
 * ** Created by peter.guan on 2021/06/04.
 *
 * @author peter.guan
 */
public class FourSum2 {

    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {

        int n = nums1.length;
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int sum = nums1[i] + nums2[j];
                map.put(-sum, map.getOrDefault(-sum, 0) + 1);
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int sum = nums3[i] + nums4[j];
                count = count + map.getOrDefault(sum, 0);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        FourSum2 fourSum2 = new FourSum2();
        System.out.println(fourSum2.fourSumCount(new int[]{1, 1, -1, -1}, new int[]{-1, -1, 1, 1},
                new int[]{1, -1, 0, -1}, new int[]{1, 1, -1, 1}));
    }


}
