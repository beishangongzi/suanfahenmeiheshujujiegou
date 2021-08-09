public class _4_奇偶位置互换 {
    public static void main(String[] args) {
        int a = 0b01000000_00000000_00000000_00000000;
        System.out.println(a);
        int b = m(a);
        System.out.println(b);
        System.out.println(Integer.toString(b, 2));

    }
    private static int m(int i){
        int ou = i & 0xaaaaaaaa;
        int ji = i & 0x55555555;
        return (ou >> 1) ^ (ji << 1);
    }
}
