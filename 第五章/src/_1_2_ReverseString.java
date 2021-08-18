public class _1_2_ReverseString {
    public String reverseString(String s){
        int len = s.length();
        char[] arr = new char[len];
        for (int i = 0; i < len; i++) {
            arr[i] = s.charAt(len-1-i);
        }
        return new String(arr);

    }
    public String reverseString2(String s){
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString();
    }
}
