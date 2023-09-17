public class DelScore {
    ComputerAver computer;

    DelScore(ComputerAver computer) {
        this.computer = computer;
    }

    public void doDetele(double[] a) {
        java.util.Arrays.sort(a); // 数组 a 从小到大排序
        System.out.print("去掉一个最高分:" + a[a.length - 1] + ", ");
        System.out.print("去掉一个最低分:" + a[0] + ". ");
        double b[] = new double[a.length - 2];
        for (int i = 1; i < a.length - 1; i++) {
            b[i - 1] = a[i];
        }

        computer.giveAver(b);
    }
}