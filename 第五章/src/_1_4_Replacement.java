import java.util.Arrays;

public class _1_4_Replacement {
    public String replaceSpace(String s, int length){
        return s.replaceAll("\\s","%20" );
    }

    public String replaceSpace2(char[] s, int length){
        int count = length;
        for (int i = 0; i < length; i++) {
            if(s[i]==' '){
                count+=2;
            }
        }
        int p1 = length - 1;
        int p2 = count -1;
        while (p1 >= 0){
            if(s[p1] == ' '){
                s[p2--] = '0';
                s[p2--] = '2';
                s[p2--] = '%';
            }else {
                s[p2--] = s[p1];
            }
            p1--;
        }
        return new String(s, 0, count);
    }
}
