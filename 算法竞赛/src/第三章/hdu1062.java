package 第三章;

import java.util.ArrayDeque;
import java.util.Scanner;

public class hdu1062 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] c= sc.nextLine().toCharArray();
        var stack = new ArrayDeque<Character>();
        for (char a :
                c) {
            stack.push(a);
        }
        while (true){
            try {
                System.out.print(stack.pop());
            }catch (Exception e){
                break;
            }
        }


    }
}
