public class Example8_1 {
    public static void main(String[] args) {
        String hello = "你好";
        String testOne = "你" + "好"; // 代码 1
        System.out.println(hello == testOne); // 输出结果是 true
        System.out.println("你好" == testOne); // 输出结果是 true
        System.out.println("你好" == hello); // 输出结果是 true
        String you = "你";
        String hi = "好";
        String testTwo = you + hi; // 代码 2
        System.out.println(hello == testTwo); // 输出结果是 false
        String testThree = you + hi;
        System.out.println(testTwo == testThree); // 输出结果是 false
    }
}