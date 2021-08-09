import java.util.Random;

public class _01唯一成对的数 {
    public static void main(String[] args) {
        int N = 1001;
        int[] arr = new int[N];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        arr[arr.length - 1] = new Random().nextInt(N-1) + 1;
        int index = new Random().nextInt(N);
        int temp = arr[arr.length -1];
        arr[arr.length -1] = arr[index];
        arr[index] = temp;
        System.out.println(arr[index]);
        int x = 0;
        for (int i = 1; i <= N - 1; i++) {
            x ^= i;
        }
        for (int i = 0; i < N; i++) {
            x ^= arr[i];
        }
        System.out.println(x);
        System.out.println("========");
        int[] helper = new int[N];
        for (int i = 0; i < N; i++) {
            helper[arr[i]]++;
        }
        for (int i = 0; i < N; i++) {
            if(helper[i] == 2){
                System.out.println(i);
                break;
            }
        }
    }
}
