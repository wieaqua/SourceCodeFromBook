public class Example5_1 {
    public static void main(String args[]) {
        Student zhang = new Student();
        zhang.age = 17; // 访问继承的成员变量
        zhang.number = 100101;
        zhang.showPeopleMass(); // 调用继承的方法
        int x = 9, y = 29;
        System.out.print("会做加法:");
        int result = zhang.add(x, y);
        System.out.printf("%d+%d=%d\n", x, y, result);
        UniverStudent geng = new UniverStudent();
        geng.age = 21; // 访问继承的成员变量
        geng.number = 6609;
        geng.showPeopleMass(); // 调用继承的方法
        geng.tellNumber();
        System.out.print("会做加法:");
        result = geng.add(x, y);
        System.out.printf("%d+%d=%d\t", x, y, result);
        System.out.print("会做乘法:");
        result = geng.multi(x, y);
        System.out.printf("%dx%d=%d\n", x, y, result);
    }
}