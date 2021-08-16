import java.util.Arrays;

public class ContainAll {
    public static boolean check(String s1, String s2){
        char[] s2_arr = s2.toCharArray();
        Arrays.sort(s2_arr);
        for (char c :
                s1.toCharArray()) {
            int index = Arrays.binarySearch(s2_arr, c);
            if(index < 0){
                return false;
            }
        }
        return true;
    }
}
