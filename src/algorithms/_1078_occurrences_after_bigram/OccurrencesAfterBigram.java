package algorithms._1078_occurrences_after_bigram;

import java.util.ArrayList;
import java.util.List;

/**
 * ** Created by peter.guan on 2021/08/12.
 *
 * @author peter.guan
 */
public class OccurrencesAfterBigram {

    public String[] findOcurrences(String text, String first, String second) {
        String[] texts = text.split(" ");
        int n = 0;
        List<String> list = new ArrayList<>();
        while (n < texts.length - 2) {
            if (texts[n].equals(first) && texts[n + 1].equals(second)) {
                list.add(texts[n + 2]);
                if (texts[n].equals(texts[n + 1])) {
                    n++;
                } else {
                    n += 2;
                }
                continue;
            }
            n++;
        }
        return list.toArray(new String[list.size()]);
    }
}
