import java.util.Arrays;

public class HeapSort {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        sort(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void makeMinHeap(int[] arr){
        int n = arr.length;
        for (int i = n / 2 - 1; i >= 0; i--) {
            minHeapFixDown(arr, i, n);
        }
    }

    static void minHeapFixDown(int[] arr, int i, int n){
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        if(left >= n){
            return;
        }
        int min = left;
        if(right < n && arr[right] < arr[left]){
            min = right;
        }
        if(arr[i] <= arr[min]){
            return;
        }
        int temp = arr[i];
        arr[i] = arr[min];
        arr[min] = temp;
        minHeapFixDown(arr, min, n);
    }

    static void sort(int[] arr){
        makeMinHeap(arr);
        for (int i = arr.length-1; i >= 0 ; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            minHeapFixDown(arr, 0, i);
        }
    }
}
