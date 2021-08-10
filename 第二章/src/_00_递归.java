public class _00_递归 {
    static void f(int i){
        if(i==0){
            return;
        }
        f(i-1);
    }

    static int f1(int n){
        if (n==1){
            return 1;
        }
        return n * f1(n-1);
    }

    static void f2(int i, int j){
        if(i > j){
            return;
        }
        System.out.println(i);
        f2(i+1, j);
    }

    static int f3(int[] arr, int begin){
        if(begin == arr.length -1){
            return arr[begin];
        }else {
            return arr[begin] + f3(arr, begin + 1);
        }
    }

    static String reverse(String src, int end){
        if(end == 0){
            return ""+src.charAt(0);
        }
        return src.charAt(end) + reverse(src, end-1);
    }

    static int fib(int n){
        if(n == 1 || n==2){
            return 1;
        }else {
            return fib(n-1) + fib(n-2);
        }
    }

    static int gcd(int m, int n){
        if(n==0){
            return m;
        }
        return gcd(n, m%n);
    }

    static void insertSort(int[] arr, int k){
        if(k==0){
            return;
        }
        insertSort(arr, k-1);
        int x= arr[k];
        int index = k-1;
        while (index > -1 && arr[index] > x){
            arr[index + 1] = arr[index];
            index--;
        }
        arr[index+1] = x;
    }
}
