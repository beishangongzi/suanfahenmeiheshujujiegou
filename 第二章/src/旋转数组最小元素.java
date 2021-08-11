public class 旋转数组最小元素 {
    public static void main(String[] args) {
        int res = min(new int[]{1, 0, 1, 1, 1});
        System.out.println(res);
    }
    static int min(int[] arr){
        int begin = 0;
        int end = arr.length - 1;
        if(arr[begin]<arr[end]) return arr[begin];
        if(arr[begin] == arr[end]){
            int res = arr[0];
            for (int i = 0; i < arr.length; i++) {
                if(arr[i]>= res){
                    res = arr[i];
                }else {
                    return arr[i];
                }
            }
            return res;
        }
        while (begin + 1 < end){
            int mid = begin + ((end - begin) >> 1);
            if(arr[mid] >= arr[begin]){
                begin = mid;
            }else {
                end = mid;
            }
        }
        return arr[end];
    }
}
