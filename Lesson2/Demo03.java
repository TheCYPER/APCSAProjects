package APCSAGuides.Lesson2;

public class Demo03 {
    public static void main(String[] args){
        double posNum = 9.4;      // 正的小数
        int roundNum1 = (int) (posNum + 0.5);  // 加五再截掉后面的
        System.out.println(roundNum1);

        double negNum = 9.4;      // 负的小数
        int roundNum2 = (int) (negNum + 0.5);  // 减五再截掉后面的
        System.out.println(roundNum2);
    }
}
