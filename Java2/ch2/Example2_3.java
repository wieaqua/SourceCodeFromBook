import java.util.Scanner;

public class Example2_3 {
    public static void main(String args[]) {
        System.out.println("请输入若干个数，每输入一个数回车确认");
        System.out.println("最后输入数字 0 结束输入操作");
        Scanner reader = new Scanner(System.in);
        double sum = 0;
        double x = reader.nextDouble();
        while (x != 0) {
            sum += x;
            x = reader.nextDouble();
        }
        System.out.println(("sum=" + sum));
        reader.close();
    }
}
