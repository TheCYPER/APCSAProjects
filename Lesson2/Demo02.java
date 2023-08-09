package APCSAGuides.Lesson2;

public class Demo02 {
    public static void main(String[] args) {
//        double num1 = 3.14;
//        int num2 = num1; // 报错! 不容许将double值赋给int类型的变量
//
//        System.out.println("num2 (int): " + num2);

        double num3 = 10; // !允许将int值赋给double类型的变量!
        System.out.println("num3 (double): " + num3);  // 输出是10.0

        // 给int一个double值 用强制类型转换的方式
        double num4 = 7.8;
        int num5 = (int) Math.round(num4); // 将double类型的num4转换为int类型，使用Math.round进行四舍五入
        System.out.println("num5 (int): " + num5);  // num5 = 7
    }
}
