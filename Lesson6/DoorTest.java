package APCSAGuides.Lesson6;

// 类名一般大写
class Door {
    // 1.每个对象将会有的属性

    // 颜色
    // 已经生产多久了
    // 是否是打开的
    private String color;
    private boolean isOpen;
    private int age;
    // 一般设为private
    // 外界无法很容易的获得 保护数据

    // 2.Constructor method: 创建和初始化对象
    // 没有返回值这个要写的东西
    // 与void不一样 就是不需要写返回值
    public Door(String color, boolean isOpen, int age) {
        this.color = color;
        this.isOpen = isOpen;
        this.age = age;
        // 对于对象属性的**初始化**
        // this.的东西是上面的对象的属性
        // 后面的是传进来的参数
        // this.color = color
        // this.color 我自己的color 现在是空的
        // = 赋值号
        // color 从外部传入的color
    }

    // 3.Mutator method: 操作对象属性
    // 给门换个新颜色
    public void paintDoor(String newColor) {
        setColor(newColor);
    }

    // 给门加一岁
    public void addYear() {
        this.age++;
    }

    // 4.Getter & Setter
    // 外界必须要用这些方法来获取这些数据
    // 保护数据 因为我们拥有了给不给他们权限的能力

    // 大家都可以查看门的数据 因为是public
    public int getAge() {
        return age;
    }

    // 比如 如果我把这个setter设为private
    // 就没有人能直接瞎改门的年龄了
    private void setAge(int newAge) {
        this.age = newAge;
    }

    public String getColor() {
        return color;
    }

    // 同理，这样用户就只能用paintDoor方法来改颜色
    private void setColor(String color) {
        // 虽然是一个private函数 但是在类的内部都是可以使用的
        // 所以刚刚在paintDoor方法中使用了这个方法
        this.color = color;
    }

    public boolean getIsOpen() {
        return isOpen;
    }

    private void setIsOpen(boolean isOpen) {
        this.isOpen = isOpen;
    }

    // 当人们想要print一个door object
    // 就会自动使用这个函数
    public String toString() {
        String openOrNot;
        if (isOpen) {
            openOrNot = "open";
        } else {
            openOrNot = "close";
        }
        return "A Door's Info" +
                "Color: " + this.color + "\n" +
                "Age: " + this.age + "\n" +
                "OpenOrNot: " + openOrNot;
    }
}

public class DoorTest {
    // 一个.java中只能有一个Public Class且和文件名重名
    // 刚刚花这么多时间创建的类可以使用了
    public static void main(String[] args) {
        Door classroomDoor = new Door("brown", false, 12);
        // 创建一个名字叫做 classroomDoor 的 Door对象
        // 使用Door类的构造函数 Door("brown", false, 12);
        // 进了Door() 函数后，这个classroomDoor就会变成棕色的 关着的 12年的一个门

        System.out.println(classroomDoor);
        // 这行的话 == System.out.println(classroomDoor.toString());

        System.out.println("当前年龄" + classroomDoor.getAge() + "年");
        classroomDoor.addYear();  // 使用Mutator method加一年
        // 对象名.函数名(参数);
        System.out.println("现在年龄" + classroomDoor.getAge() + "年");

        System.out.println("当前颜色" + classroomDoor.getColor());
        classroomDoor.paintDoor("red");  // 使用Mutator method改颜色
        // 对象名.函数名(参数);
        System.out.println("现在颜色" + classroomDoor.getColor());

        // 报错 因为color无法直接从外界获取/修改
        // classroomDoor.color = "red";
        // System.out.println(classroomDoor.color);

        // 创建了一个新的对象 Door类就是一个工厂
        Door bigGate = new Door("grey", false, 30);
        System.out.println(bigGate);
    }
}