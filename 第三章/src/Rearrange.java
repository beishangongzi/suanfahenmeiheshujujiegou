public class Rearrange {
    public int findSegment(int[] arr, int n){
        int p1= -1;
        int p2 = -1;
        int max = arr[0];
        int min = arr[n-1];
        for (int i = 0; i < n; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i] < max){
                p2 = i;
            }
        }
        for (int i = n-1; i > 0; i--) {
            if(arr[i] < min){
                min = arr[i];
            }
            if(arr[i] > min){
                p1 = i;
            }
        }
        return p2-p1;
    }
}
