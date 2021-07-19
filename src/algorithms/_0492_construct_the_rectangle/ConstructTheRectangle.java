package algorithms._0492_construct_the_rectangle;

/**
 * ** Created by peter.guan on 2021/07/19.
 *
 * @author peter.guan
 */
public class ConstructTheRectangle {

    public int[] constructRectangle(int area) {

        int sqrt = (int) Math.sqrt(area);
        for (int i = sqrt; i > 1; i--) {
            if (area % i == 0) {
                return new int[]{Math.max(area / i, i), Math.min(area / i, i)};
            }
        }
        return new int[]{area, 1};
    }

}
