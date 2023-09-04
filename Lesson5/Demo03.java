package APCSAGuides.Lesson5;

public class Demo03 {
    public static void main(String[] args) {
        int num = 15;

        if (num < 10) {
            System.out.println("Number is less than 10.");
        } else if (num >= 10 && num < 20) {
            System.out.println("Number is between 10 and 19.");
        } else if (num >= 20 && num < 30) {
            System.out.println("Number is between 20 and 29.");
        } else {
            System.out.println("Number is greater than or equal to 30.");
        }
    }
}
