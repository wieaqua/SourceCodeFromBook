public class Example8_7 {
    public static void main(String[] args) {
        byte d[] = "Java 你好".getBytes();
        System.out.println("数组 d 的长度是:" + d.length);
        String s = new String(d, 6, 2); // 输出 好
        System.out.println(s);
        s = new String(d, 0, 6);
        System.out.println(s); // 输出 Java 你
    }
}