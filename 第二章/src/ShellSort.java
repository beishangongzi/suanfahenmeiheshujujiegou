public class ShellSort {
    public static void main(String[] args) {
        int[] arr = {9, 1, 3, 5, 3, 2, 5, 6, 7, 8, 3, 5};
        shellSort(arr);
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
    public static void shellSort(int[] arr){
        for (int interval = arr.length / 2; interval > 0; interval /= 2) {
            for (int i = interval; i < arr.length; i++) {
                int target = arr[i];
                int j = i - interval;
                while (j > -1 && target < arr[j]){
                    arr[j + interval] = arr[j];
                    j -= interval;
                }
                arr[j+interval] = target;
            }
        }
    }
}
