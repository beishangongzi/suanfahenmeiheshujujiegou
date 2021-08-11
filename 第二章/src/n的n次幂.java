public class n的n次幂 {
    public static void main(String[] args) {
        System.out.println(pow(2, 10));
    }

    private static int pow(int a, int n){
        if(n==0) return 1;
        int res = a;
        int ex = 1;
        while ((ex<<1) <=n){
            res = res * res;
            ex <<= 1;
        }
        return res * pow(a, n - ex);
    }

}
