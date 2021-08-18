public class _1_4_ziper {
    public static String zipString(String s){
        int count = 0;
        char last = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char charAt = s.charAt(i);
            if(sb.length() == 0){
                sb.append(charAt);
                count++;
            }else {
                if(last == charAt){
                    count++;
                }else {
                    sb.append(count).append(charAt);
                    count = 1;
                }
            }
            last = charAt;
        }
        if(count >= 1){
            sb.append(count);
        }
        if(sb.length() < s.length()){
            return sb.toString();
        }else {
            return s;
        }
    }
}
