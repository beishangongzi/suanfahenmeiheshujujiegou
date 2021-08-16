public class MaxSum {
    protected static int maxSum(int[] arr){
        if(arr.length == 0){
            return 0;
        }
        int sumJ = arr[0];
        int max = sumJ;
        int left = 0, right = 0;
        for (int i = 1; i < arr.length; i++) {
            if(sumJ >= 0){
                sumJ += arr[i];
            }else {
                sumJ = arr[i];
                left = i;
            }
            if(sumJ > max){
                max = sumJ;
                right = i;
            }
        }
        return max;
    }
}
