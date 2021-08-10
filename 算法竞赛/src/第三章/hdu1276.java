package 第三章;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class hdu1276 {
    public static void main(String[] args) {
        int t, n;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        while ((t--) > 0){
            n = sc.nextInt();
            int k = 2;
            LinkedList<Integer> l = new LinkedList<Integer>();
            Iterator<Integer> it;
            for (int i = 0; i < n; i++) {
                l.add(i);
            }
            while (l.size() >3){
                it = l.iterator();
                while (it.hasNext()){
                    int item = it.next();
                    if(item%k==0){
                        it.remove();
                    }
                }
                if(k==2){
                    k=3;
                }else {
                    k=2;
                }
            }
            it = l.iterator();
            while (it.hasNext()){
                System.out.print(it.next());
                System.out.print(" ");
            }
            System.out.println();


        }
    }
}
