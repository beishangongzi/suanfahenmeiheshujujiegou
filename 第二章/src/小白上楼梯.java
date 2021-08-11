import java.util.Scanner;

public class 小白上楼梯 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            int n = sc.nextInt();
            int res = f(n);
            System.out.println(res);
        }

    }
    private static int f(int n){
        if (n==0 || n == 1){
            return 1;
        }
        if(n==2){
            return 2;
        }
        return f(n-2) + f(n-2) + f(n-3);
    }
}
