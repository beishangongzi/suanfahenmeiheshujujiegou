import java.util.Arrays;

public class Kmp {
    public static void main(String[] args) {
        String src = "babababcbabababb";
//        int index = indexOf(src, "bababb");
        int index = indexOf2(src, "bab");
        System.out.println(index);
        System.out.println(Arrays.toString(next("baba")));

    }

    private static int indexOf(String s, String p){
        int i = 0;
        int sc = i;
        int j = 0;
        while (sc < s.length()){
            if(s.charAt(sc) == p.charAt(j)){
                sc++;
                j++;
                if(j==p.length()){
                    return i;
                }
            }else {
                i++;
                sc = i;
                j = 0;
            }
        }
        return -1;
    }

    private static int indexOf2(String s, String p){
        if(s.length() == 0 || p.length() == 0){
            return -1;
        }
        if(p.length() > s.length()){
            return -1;
        }

        int count = 0;
        int[] next = next(p);
        int i = 0;
        int j = 0;
        int sLen = s.length();
        int pLen = p.length();

        while (i < sLen){
            if(j == -1 || s.charAt(i) == p.charAt(j)){
                i++;
                j++;
            }else {
                j = next[j];
            }
            if(j == pLen){
                count++;
                i--;
                j = next[j-1];
            }
        }
        return count;
    }

    private static int[] next(String ps) {
       int pLength = ps.length();
       int[] next = new int[pLength+1];
       char[] p = ps.toCharArray();
       next[0] = -1;
       if(ps.length()==1){
           return next;
       }
       next[1] = 0;
       int j = 1;
       int k = next[j];
       while (j < pLength){
           if(k < 0 || p[j] == p[k]){
               next[++j] = ++k;
           }else {
               k = next[k];
           }
       }
       return next;
    }
}
