public class CountSort {
    public static void sort(int[] arr){
        int[] helper = new int[maxof(arr)+1];
        for (int e :
                arr) {
            helper[e]++;
        }
        int current = 0;
        for (int i = 0; i < helper.length; i++) {
            while (helper[i] > 0){
                arr[current++] = i;
                helper[i]--;
            }
        }
    }

    private static int maxof(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int j : arr) {
            if (max < j) {
                max = j;
            }
        }
        return max;
    }
}

