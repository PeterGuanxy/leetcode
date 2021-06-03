package algorithms._1684_count_the_number_of_consistent_strings;

/**
 * ** Created by peter.guan on 2021/06/03.
 *
 * @author peter.guan
 */
public class CountTheNumberOfConsistentStrings {

    /**
     * too slow not good
     */
    public int countConsistentStringsSlow(String allowed, String[] words) {
        int count = 0;
        if (words.length == 0) {
            return count;
        }
        String[] allowedArr = allowed.split("");

        out:
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < allowedArr.length; j++) {
                words[i] = words[i].replaceAll(allowedArr[j], "");
                if (words[i].length() == 0) {
                    count++;
                    continue out;
                }
            }
        }

        return count;
    }

    /**
     * 知识点：char可以直接转换int，利用这一特性使用countArray，好方法
     */
    public int countConsistentStrings(String allowed, String[] words) {
        int[] countArray = new int[26];
        for(char c : allowed.toCharArray()){
            countArray[c-'a']++;
        }

        int count=0;
        for(String str : words){
            boolean isValid = true;
            for(char c : str.toCharArray()){
                if(countArray[c-'a'] == 0 ){
                    isValid=false;
                    break;
                }
            }
            if(isValid) {
                count++;
            }
        }
        return count;
    }



    public static void main(String[] args) {
//        CountTheNumberOfConsistentStrings count = new CountTheNumberOfConsistentStrings();
//        System.out.println(count.countConsistentStrings("cad", new String[]{"cc","acd","b","ba","bac","bad","ac","d"}));
        int b = 'c' - 'a';
        System.out.println(b);
    }

}
