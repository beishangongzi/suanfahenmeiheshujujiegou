import java.util.Arrays;

public class BucketSort {
    private static int hash(int element, int max, int length){
        return (element * length) / (max + 1);
    }

    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5, 6, 9, 10, 12, 11};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void sort(int[] arr) {
        int length = arr.length;
        LinkedNode[] bucket = new LinkedNode[length];
        int max = maxof(arr);
        for (int i = 0; i < arr.length; i++) {
            int value = arr[i];
            int hash = hash(arr[i], max, length);
            if(bucket[hash]==null){
                bucket[hash] = new LinkedNode(value);
            }else {
                insertInto(value, bucket[hash], bucket, hash);
            }
        }
        int k = 0;
        for(LinkedNode node: bucket){
            if(node !=null){
                while (node != null){
                    arr[k++] = node.value;
                    node = node.next;
                }
            }
        }
    }

    private static void insertInto(int value, LinkedNode linkedNode, LinkedNode[] bucket, int hash) {
        LinkedNode newNode = new LinkedNode(value);
        if(value < linkedNode.value){
            newNode.next = linkedNode;
            bucket[hash] = newNode;
            return;
        }
        LinkedNode p = linkedNode;
        LinkedNode pre = p;
        while (p!=null && value > p.value){
            pre = p;
            p = p.next;
        }
        if(p==null){
            pre.next = newNode;
        }else {
            pre.next = newNode;
            newNode.next = p;
        }
    }

    private static int maxof(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int j : arr) {
            if (max < j) {
                max = j;
            }
        }
        return max;
    }
}

class LinkedNode{
    public int value;
    public LinkedNode next;

    public LinkedNode(int value){
        this.value = value;
    }
}
