public class orederStatic {
    public static void main(String[] args) {
        int[] arr = {3, 9, 7, 6, 1, 2};
        int k = selectK(arr, 0, arr.length-1, 2);
        System.out.println(k);

    }

    public static int selectK(int[] arr, int p, int r, int k){
        int q = partition(arr, p, r);
        int qk = q - p + 1;
        if(qk==k) return arr[q];
        else if(qk > k){
            return selectK(arr, p, q-1, k);
        }else {
            return selectK(arr, q+1, r, k-qk);
        }
    }

    public static int partition(int[] arr, int p, int r){
        int scan = p+1;
        int pivot = arr[p];
        int bigger = r;
        while (scan <= bigger){
            if(arr[scan] < pivot){
                scan++;
            }else {
                int temp = arr[scan];
                arr[scan] = arr[bigger];
                arr[bigger--] = temp;
            }
        }
        int temp = arr[bigger];
        arr[bigger] = pivot;
        arr[p] = temp;
        return bigger;
    }

}
