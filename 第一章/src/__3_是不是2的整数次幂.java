import java.util.Scanner;

public class __3_是不是2的整数次幂 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println((n & (n - 1)) == 0);
    }
}
