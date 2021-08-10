public class TowerofHanoi {
    public static void main(String[] args) {
        printHanoiTower(3, "A", "B", "C");

    }

    static void printHanoiTower(int N, String from, String to, String help) {
        if (N == 1) {
            System.out.println("move " + N + " from " + from + " to " + to);
            return;
        }

        printHanoiTower(N - 1, from, help, to); // 先把前N-1个盘子挪到辅助空间上去
        System.out.println("move " + N + " from " + from + " to " + to);  // N可以顺利到达target
        printHanoiTower(N - 1, help, to, from); // 让N-1从辅助空间回到源空间上去

    }
}
