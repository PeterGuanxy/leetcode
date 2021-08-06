package algorithms._1184_distance_between_bus_stops;

/**
 * ** Created by peter.guan on 2021/08/06.
 *
 * @author peter.guan
 */
public class DistanceBetweenBusStops {

    public int distanceBetweenBusStops(int[] distance, int start, int destination) {

        int clock = 0;
        for (int i = Math.min(start, destination); i < Math.max(start, destination); i++) {
            clock += distance[i];
        }

        int counterclock = 0;
        for (int i = 0; i < Math.min(start, destination); i++) {
            counterclock += distance[i];
        }
        for (int i = Math.max(start, destination); i < distance.length; i++) {
            counterclock += distance[i];
        }

        return Math.min(clock, counterclock);

    }

}
