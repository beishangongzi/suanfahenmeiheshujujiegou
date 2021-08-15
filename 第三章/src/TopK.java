import java.util.Arrays;
import java.util.Scanner;

public class TopK {
    static int[] heap;
    static int index = 0;
    static int k;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        k = sc.nextInt();
        heap = new int[k];
        int x = sc.nextInt();
        while (x != -1){
            deal(x);
            x = sc.nextInt();
        }
        HeapSort.sort(heap);
        System.out.println(Arrays.toString(heap));

    }

    private static void deal(int x){
        if(index < k){
            heap[index++] = x;
            if(index == k){
                HeapSort.makeMinHeap(heap);
            }
        }else if(heap[0] < x){
            heap[0] = x;
            HeapSort.makeMinHeap(heap);
        }
    }
}
