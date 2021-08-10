package 第三章;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class hud4841 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        var table = new ArrayList<Integer>();
        int n= sc.nextInt();
        int m = sc.nextInt();
        for (int i = 0; i < 2 * n; i++) {
            table.add(i);
        }
        int pos = 0;
        for (int i = 0; i < n; i++) {
            pos = (pos + m - 1) %(table.size());
            table.remove(pos);
        }
        int j = 0;
        for (int i = 0; i < 2 * n; i++) {
            if(i % 50 == 0 && i!=0){
                System.out.println();
            }
            if(j < table.size() && i==table.get(j)){
                j++;
                System.out.print("G");
            }else {
                System.out.print("B");
            }
        }
    }
}
