import java.util.Arrays;

public class _1_3_Same {
    public static void main(String[] args) {

    }

    public boolean checkSame(String s1, String s2){
        int len1 = s1.length();
        int len2 = s2.length();

        if(len1 != len2){
            return false;
        }
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }

    public boolean checkSame2(String s1, String s2){
        return false;
    }
}
