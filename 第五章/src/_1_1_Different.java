public class _1_1_Different {
    public boolean checkDifferent(String iniString){
        if(iniString.length() == 0 || iniString.length() == 1){
            return true;
        }
        int[] flag = new int[128];
        for (int i = 0; i < iniString.length(); i++) {
            int c = (int) (iniString.charAt(i));
            flag[c]++;
            if(flag[c]>1) return false;
        }
        return true;
    }
}
