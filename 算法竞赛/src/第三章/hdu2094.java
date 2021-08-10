package 第三章;

import java.util.HashSet;
import java.util.Scanner;

public class hdu2094 {
    public static void main(String[] args) {
        HashSet<String> s1 = new HashSet<String>();
        HashSet<String> s2 = new HashSet<String>();
        Scanner sc = new Scanner(System.in);
        int all = sc.nextInt();
        for (int i = 0; i < all; i++) {
            s1.add(sc.nextLine());
        }
        int losers = sc.nextInt();
        for (int i = 0; i < losers; i++) {
            s2.add(sc.nextLine());
        }
        if(s1.size() - s2.size() == 0){
            System.out.println("yes");
        }else {
            System.out.println("no..");
        }
    }
}
