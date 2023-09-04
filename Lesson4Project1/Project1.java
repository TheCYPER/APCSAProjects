package APCSAGuides.Lesson4Project1;

public class Project1 {
    public static void main(String[] args){
        // 3个参数
        double a = 10;
        double b = 6;
        double c = 7;
        // process
        // 我们在这里先使用了一个中间变量 以让下一步处理看上去舒服一些
        double delta = Math.pow(b, 2) - 4 * a * c;
        // (-b + (b^2 - 4a*c) ^ 1/2)/2a
        double x1 = (-b + Math.pow(delta, 0.5)) / 2 * a;
        // (-b - (b^2 - 4a*c) ^ 1/2)/2a
        double x2 = (-b - Math.pow(delta, 0.5)) / 2 * a;

        System.out.println("The first solution is " + x1);
        System.out.println("The second solution is " + x2);
    }
}
