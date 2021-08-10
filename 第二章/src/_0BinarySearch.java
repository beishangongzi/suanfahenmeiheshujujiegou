public class _0BinarySearch {
    public static void main(String[] args) {

    }
    public static int binarySearch0(int[] arr, int low, int high, int key){
        while (low <=high){
            int mid = (low + high) >>>1;
            int midVal = arr[mid];
            if(midVal < key){
                low = mid + 1;
            }else if(midVal > key){
                high = mid - 1;
            }else {
                return mid;
            }
        }
        return -1;
    }

    private static int binarySearch(int[] arr, int low, int high, int key){
        if(low > high){
            return -1;
        }
        int mid = (low + high) >>> 1;
        int midVal = arr[mid];
        if(midVal < key){
            return binarySearch0(arr, low+1, high, key);
        }else if(midVal > key){
            return binarySearch0(arr, low,high-1, key);
        }else {
            return mid;
        }
    }

    private static int search(int[] arr, int key){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }


}
