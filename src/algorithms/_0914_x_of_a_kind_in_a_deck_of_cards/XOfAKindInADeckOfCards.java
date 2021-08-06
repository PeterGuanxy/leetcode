package algorithms._0914_x_of_a_kind_in_a_deck_of_cards;

import java.util.*;

/**
 * ** Created by peter.guan on 2021/08/06.
 *
 * @author peter.guan
 */
public class XOfAKindInADeckOfCards {

    public boolean hasGroupsSizeX(int[] deck) {
        if (deck.length == 1) {
            return false;
        }

        Map<Integer, Integer> map = new HashMap<>();
        for (int n : deck) {
            int count = map.getOrDefault(n, 0);
            map.put(n, ++count);
        }

        List<Integer> list = new ArrayList<>(map.values());
        Collections.sort(list);

        int unit = list.get(0);

        for (int i = unit; i >= 2; i--) {
            boolean lcd = true;

            for (int n : list) {
                if (n % i != 0) {
                    lcd = false;
                    break;
                }
            }

            if (lcd) {
                return true;
            }
        }
        return false;
    }
}
