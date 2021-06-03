package algorithms._0011_container_with_most_water;

/**
 * ** Created by peter.guan on 2021/06/03.
 *
 * @author peter.guan
 */
public class ContainerWithMostWater {

    /**
     * time out failed
     */
    public static int maxAreaFailed(int[] height) {
        int max = 0;
        int area = 0;
        for (int i = 0; i < height.length; i++) {
            for (int j = 0; j < height.length; j++) {
                int width = Math.abs(i-j);
                if (width == 0) {
                    continue;
                }
                int h = 0;
                if (height[i] >= height[j]) {
                    h = height[j];
                } else {
                    h = height[i];
                }
                area = width * h;
                if (area > max) {
                    max = area;
                }
            }
        }

        return max;
    }

    public static int maxArea(int[] height) {
        int max = 0;
        int i = 0;
        int j = height.length -1;
        while (i<j) {
            int h = Math.min(height[i], height[j]);
            int w = j - i;
            int area = h*w;
            if (area > max) {
                max = area;
            }

            if (height[i] > height[j]) {
                j--;
            } else {
                i++;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
    }
}
