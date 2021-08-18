import java.util.HashMap;
import java.util.Map;

public class _1_6_HasSameCharSet {
    static boolean check(String s1, String s2){
        int[] help = new int[256];
        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            if(help[c]==0){
                help[c]++;
            }
        }
        for (int i = 0; i < s2.length(); i++) {
            char c = s2.charAt(i);
            if(help[c] == 0){
                return false;
            }
        }
        return true;
    }

    static boolean check2(String s1, String s2){
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            map.putIfAbsent(c, 1);
        }
        for (int i = 0; i < s2.length(); i++) {
            char c = s2.charAt(i);
            if(map.get(c)==null){
                return false;
            }
        }
        return true;
    }
}
