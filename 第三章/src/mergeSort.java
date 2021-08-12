public class mergeSort {

    private  static  int[] helper;

    public  static void sort(int[] arr){
        helper = new int[arr.length];
        sort(arr, 0, arr.length-1);
    }

    private static void sort(int[] arr, int p, int r){
        if(p<r){
            int mid = p + ((r-p)>>1);
            sort(arr, p, mid);
            sort(arr, mid+1, r);
            merge(arr, p, mid, r);
        }
    }

    static int nixu = 0;

    private static void merge(int[] arr, int p, int mid, int r){
        System.arraycopy(arr, p, helper, p, r-p+1);
        int left = p;
        int right = mid + 1;
        int current = p;
        while (left < mid && right <= r){
            if(helper[left] <= helper[right]){
                arr[current++] = helper[left++];
            }else {
                arr[current++] = helper[right++];
                nixu += mid-left+1;
            }
        }
        while (left<mid){
            arr[current++] = helper[left];
            left++;
        }
        while (right>=mid){
            arr[current++] = helper[right];
            right--;
        }
    }
    public static void main(String[] args) {

    }

}
