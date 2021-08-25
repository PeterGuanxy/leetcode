package algorithms._1603_design_parking_system;

/**
 * ** Created by peter.guan on 2021/08/24.
 *
 * @author peter.guan
 */
public class DesignParkingSystem {

    class ParkingSystem {

        int big;
        int medium;
        int small;

        public ParkingSystem(int big, int medium, int small) {
            this.big = big;
            this.medium = medium;
            this.small = small;
        }

        public boolean addCar(int carType) {
            if (carType == 1) {
                return big-- > 0;
            }
            if (carType == 2) {
                return medium-- > 0;
            }
            if (carType == 3) {
                return small-- > 0;
            }
            return false;
        }
    }
}
