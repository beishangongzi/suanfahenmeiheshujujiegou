import org.jetbrains.annotations.NotNull;

public class quickSort {
    public static void main(String[] args) {
        int[] arr = {1, 4, 6, 3, 7, 2, 10, 19, 12, 0};
        quickSort(arr, 0, arr.length-1);
        for (int j : arr) {
            System.out.print(j + " ");
        }

    }

    public static void quickSort(int[] arr, int p, int r){
        if(p<r){
            int q = partition(arr, p, r);
            quickSort(arr, p, q-1);
            quickSort(arr, q+1, r);
        }

    }
    public static int partition(int @NotNull [] arr, int p, int r){
        int pivot = arr[p];
        int sp = p + 1;
        int bigger = r;
        while (sp <= bigger){
            if(arr[sp] <= pivot){
                sp++;
            }else {
                int temp = arr[sp];
                arr[sp] = arr[bigger];
                arr[bigger] = temp;
                bigger--;
            }

        }
        int temp = arr[p];
        arr[p] = arr[bigger];
        arr[bigger] = temp;
        return bigger;
    }

    public static int partition2(int @NotNull [] arr, int p, int  r){
        int midIndex = (p + r) >> 1;
        int midValueIndex = -1;
        if((arr[p] <= arr[midIndex] && arr[p] >= arr[r]) || (arr[p] >= arr[midIndex] && arr[p] <=arr[r])){
            midValueIndex = p;
        }else if((arr[midIndex] <= arr[p] && arr[midIndex] >= arr[r]) || (arr[midIndex] >= arr[p] && arr[midIndex] <=arr[r])){
            midValueIndex = midIndex;
        }else {
            midValueIndex = r;
        }
        int temp = arr[midValueIndex];
        arr[midValueIndex] = arr[p];
        arr[p] = temp;
        int pivot = arr[p];

        int left = p + 1;
        int right = r;
        while (left < right){
            while (left <= right && arr[left] < pivot){
                left ++;
            }
            while ((left <= right) && arr[right] > pivot ){
                right--;
            }
            temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
        }
        temp = arr[right];
        arr[right] = arr[p];
        arr[p] = temp;
        return right;
    }
}
