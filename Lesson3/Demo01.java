package APCSAGuides.Lesson3;

public class Demo01 {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        int sum = a + b;
        int difference = a - b;
        int product = a * b;
        double quotient1 = a / b;
        double quotient2 = (double) a / b;
        // 注意强制类型转换，以保留小数部分
        // 这里是一个考点 但是先不说了 回头再聊

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("QuotientWithoutFractions: " + quotient1);
        System.out.println("QuotientWithFractions: " + quotient2);
    }
}
