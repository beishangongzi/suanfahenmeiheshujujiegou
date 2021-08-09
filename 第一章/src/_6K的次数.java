public class _6K的次数 {
    public static void main(String[] args) {
        int[] arr = {2, 2, 2, 9, 7, 7, 7, 3, 3, 3, 6, 6, 6, 0, 0, 0};
        int len = arr.length;
        char[][] kRdix = new char[len][];
        int k = 3;
        int maxLen = 0;

        for (int i = 0; i < len; i++) {
            kRdix[i] = new StringBuilder(Integer.toString(arr[i], k)).reverse().toString().toCharArray();
            if(kRdix[i].length > maxLen) maxLen=kRdix.length;
        }
        int[] resArr = new int[maxLen];
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < maxLen; j++) {
                if(j>=kRdix[i].length){
                    resArr[j] += 0;
                }else {
                    resArr[j] += (kRdix[i][j] - '0');
                }
            }
        }

        int res = 0;
        for (int i = 0; i < maxLen; i++) {
            res += (resArr[i] % k) * (int)(Math.pow(k, i));
        }
        System.out.println(res);
    }
}
