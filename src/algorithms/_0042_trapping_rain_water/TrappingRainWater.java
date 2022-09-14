package algorithms._0042_trapping_rain_water;

/**
 * ** Created by Peter on 2022年09月14日, 0014.
 *
 * @author Peter
 */
public class TrappingRainWater {

  public int trap(int[] height) {

    int heightL = 0;
    int heightR = 0;
    int left = 0;
    int right = height.length - 1;
    int count = 0;

    while (right > left) {
      if (height[left] >= height[right]) {
        if (height[right] > heightR) {
          heightR = height[right];
        } else {
          count += heightR - height[right];
        }
        right--;
      } else {
        if (height[left] > heightL) {
          heightL = height[left];
        } else {
          count += heightL - height[left];
        }
        left++;
      }
    }
    return count;
  }

}
