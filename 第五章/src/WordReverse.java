public class WordReverse {
    static String reverse(String src){
        String s1 = reverseString(src);
        String[] words = s1.split("\\s");
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            sb.append(reverseString(word)).append(" ");
        }
        return sb.deleteCharAt(sb.length() - 1).toString();
    }

    public static String reverseString(String s){
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString();
    }
}
