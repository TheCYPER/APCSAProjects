package APCSAGuides.Lesson3;

public class Demo03 {
    public static void main(String[] args) {
        int x = 10;
        int y = 5;

        boolean isEqual = x == y;
        boolean isNotEqual = x != y;
        boolean isGreater = x > y;
        boolean isLess = x < y;
        boolean isGreaterOrEqual = x >= y;
        boolean isLessOrEqual = x <= y;

        System.out.println("Equal: " + isEqual);
        System.out.println("Not Equal: " + isNotEqual);
        System.out.println("Greater: " + isGreater);
        System.out.println("Less: " + isLess);
        System.out.println("Greater or Equal: " + isGreaterOrEqual);
        System.out.println("Less or Equal: " + isLessOrEqual);
    }
}

