package APCSAGuides.Lesson4Project1;

public class Demo01 {
    public static void main(String[] args) {
        // 在Java中，可以使用Math.pow()方法来进行幂运算。
        // Math.pow()方法接受两个参数，第一个参数是底数，第二个参数是指数，它返回底数的指数次幂的结果。
        double base = 2.0;
        double exponent = 3.0;

        double result = Math.pow(base, exponent);

        System.out.println(base + " 的 " + exponent + " 次幂是 " + result);
        // 2.0 的 3.0 次幂是 8.0
    }
}
