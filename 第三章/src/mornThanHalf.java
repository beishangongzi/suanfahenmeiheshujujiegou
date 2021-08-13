public class mornThanHalf {
    public static void main(String[] args) {

    }

    public static void solve(int arr[]){
        int candiate = arr[0];

        int nTimes = 1;

        for (int i = 0; i < arr.length; i++) {
            if(nTimes == 0){
                candiate = arr[i];
                nTimes++;
                continue;
            }
            if(arr[i] == candiate){
                nTimes++;
            }else {
                nTimes--;
            }
        }
        System.out.println(candiate);
    }

    public static void solve1(int[] arr){
        int candidate = arr[0];
        int nTimes = 0;
        int countOfLast = 0;
        int N = arr.length;
        for (int j : arr) {
            if (j == arr[N - 1]) {
                countOfLast++;
            }
            if (nTimes == 0) {
                candidate = j;
                nTimes = 1;
                continue;
            }
            if (j == candidate) {
                nTimes++;
            } else {
                nTimes--;
            }

        }
        if (countOfLast == N / 2) {
            System.out.println(arr[N - 1]);
        } else {
            System.out.println(candidate);
        }
    }
}
