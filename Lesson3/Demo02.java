package APCSAGuides.Lesson3;

public class Demo02 {
    public static void main(String[] args) {
        boolean isRaining = true; // 声明一个布尔变量，表示是否下雨
        boolean hasUmbrella = false; // 声明一个布尔变量，表示是否带伞
        // 更改这两个布尔值 看看输出有什么变化

        if (isRaining) {
            System.out.println("It's raining outside.");

            if (hasUmbrella) {
                System.out.println("You have an umbrella. You can go out.");
            } else {
                System.out.println("You don't have an umbrella. Stay indoors.");
            }
        } else {
            System.out.println("It's not raining. You can go out.");
        }

    }
}

