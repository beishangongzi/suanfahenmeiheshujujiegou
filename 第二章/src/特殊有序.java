import com.sun.source.tree.BreakTree;

public class 特殊有序 {
    public static void main(String[] args) {
        String[] arr = {"a", "", "ac", "", "ad", "b", "", "ba"};
//        String[] arr = {"abc", "", "ac", "", "", "", "", ""};
        int res = indexOf(arr, "ac");
        System.out.println(res);
    }
    private static int indexOf(String[] arr, String p){
        int begin = 0;
        int end = arr.length - 1;
        while (begin <= end){
            int indexOfMid = (begin + end) >> 1;
            int temp = indexOfMid;
            while (arr[indexOfMid].equals("")){
                indexOfMid++;
                if(indexOfMid > end){
                    indexOfMid = temp;
                    while (arr[indexOfMid].equals("")){
                        indexOfMid--;
                        if(indexOfMid < begin){
                            return -1;
                        }
                    }
                }
            }
            if(arr[indexOfMid].compareTo(p)>0){
                end = indexOfMid -1;
            }else if(arr[indexOfMid].compareTo(p)<0){
                begin = indexOfMid + 1;

            }else {
                return indexOfMid;
            }
        }
        return -1;
    }

}
