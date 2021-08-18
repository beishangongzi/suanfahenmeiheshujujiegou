import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Case_最短摘要 {
    public static void solve1(String[] w, String[] q){
        int length = Integer.MAX_VALUE;
        int begin = -1;
        int end = -1;
        for (int i = 0; i < w.length; i++) {
            for (int j = i+1; j < w.length; j++) {
                if(containsAll(q, w, i, j)){
                    if(j-i+1<length){
                        length = j -i + 1;
                        begin = i;
                        end = j;
                    }
                    break;
                }
            }
        }
        print(w, begin, end);
    }

    public static void solve2(String[] w, String[] keys){
        Arrays.sort(keys);
        int begin = -1;
        int end = -1;

        int j = -1;
        int minLen = Integer.MAX_VALUE;
        for (int i = 0; i < w.length; i++) {
            String word1 = w[i];
            int index = Arrays.binarySearch(keys, word1);
            if(index == -1){
                continue;
            }else {
                if(j < w.length && j >= i && containsAll(keys, w, i, j)){
                    if(j - i + 1 < minLen){
                        minLen = j - i + 1;
                        begin = i;
                        end = j;
                    }
                    continue;
                }
            }
            if(j==-1) j = i + 1;
            while (j < w.length){
                String word2 = w[j];
                int index1 = Arrays.binarySearch(keys, word2);
                if(index1 == -1){
                    j++;
                }else {
                    if(containsAll(keys, w, i, j)){
                        if(j - i + 1 < minLen){
                            minLen = j - i + 1;
                            begin = i;
                            end = j;
                        }
                        break;
                    }else {
                        j++;
                    }
                }
            }
        }
        print(w, begin, end);
    }

    private static void print(String[] w, int begin, int end) {
        System.out.println(begin + " " + end);
        for (int i = begin; i <= end; i++) {
            System.out.println(w[i] + " ");
        }
        System.out.println();
    }

    public static boolean containsAll(String[] keywords, String[] w, int i, int j){
        Map<String, Integer> map = new HashMap<>();
        for (String key : keywords) {
            map.merge(key, 1, Integer::sum);
        }
        Map<String, Integer> map2 = new HashMap<>();
        for(String key : w){
            map2.merge(key, 1, Integer::sum);
        }
        for (Map.Entry<String, Integer> e :
                map.entrySet()) {
            if (map2.get(e.getKey()) == null || map2.get(e.getKey()) < e.getValue()) {
                return false;
            }
        }
        return true;
    }

}


