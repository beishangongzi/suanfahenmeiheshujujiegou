public class _1_7_IsRoate {
    private static boolean isRoate(String a, String b){
        if(a.length() != b.length()){
            return false;
        }
        return (b + b).contains(b);
    }
}
