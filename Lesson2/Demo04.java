package APCSAGuides.Lesson2;

public class Demo04 {
    public static void main(String[] args) {
        // 定义一个常量，并赋值
        final int MAX_VALUE = 100;

        // 试图修改常量的值会导致编译错误
        // MAX_VALUE = 200; // 会报错，常量不可再次赋值

        // 常量的命名约定是大写字母
        final double PI = 3.14159;

        System.out.println("MAX_VALUE: " + MAX_VALUE);
        System.out.println("PI: " + PI);

        // 常量常用于数组的大小
        int[] array = new int[MAX_VALUE];
        System.out.println(array.length);
        // 或者其他一些固定值的场景
    }
}
