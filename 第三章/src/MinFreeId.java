public class MinFreeId {
    public static int find(int[] arr, int l, int r){
        if(l > r){
            return l + 1;
        }

        int midIndex = (l + r) >> 1;
        int q = orederStatic.selectK(arr, l, r, midIndex -l + 1);
        int t = midIndex + 1;
        if(q==t){
            return find(arr, midIndex+1, r);
        }else {
            return find(arr, l, midIndex-1);
        }
    }

    public static void main(String[] args) {
//        int[] arr = {1, 2, 3};
        int[] arr = {1,};
        System.out.println(find(arr, 0, 0));

    }
}
