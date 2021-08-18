public class ReverseKZero {
    public static void main(String[] args) {

    }

    static String remove(String src, int k){
        String regexp = "0{" + k + "}";
        return src.replaceAll(regexp, "");
    }

    static String remove2(String src, int k){
        char[] arr = src.toCharArray();
        int count = 0;
        StringBuilder sb = new StringBuilder();
        for (char c : arr) {
            if (c == '0') {
                count++;
            } else {
                sb.append("0".repeat(Math.max(0, count % k)));
                sb.append(c);
                count = 0;
            }
        }
        sb.append("0".repeat(Math.max(0, count % k)));
        return sb.toString();
    }
}
