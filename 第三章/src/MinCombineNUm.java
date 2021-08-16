import java.util.Arrays;
import java.util.Comparator;

public class MinCombineNUm {
    public static void main(String[] args) {
        int res = f(new Integer[]{3, 32, 321});
        System.out.println(res);
    }

    public static int f(Integer[] arr){
        Arrays.sort(arr, (integer, t1) -> {
            String s1 = integer + "" + t1;
            String s2 = t1 + "" + integer;
            return s1.compareTo(s2);
        });
        StringBuilder sb = new StringBuilder();
        for (Integer i :
                arr) {
            sb.append(i);
        }
        return Integer.parseInt(sb.toString());
    }
}
