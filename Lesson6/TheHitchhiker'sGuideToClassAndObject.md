# 类与对象！！！
## BASIC IDEA
### 每个对象都有自己的**属性**和**方法**
- 将属性和方法捆绑在一起 就是一个对象
### 类就是**创建对象**的工厂 
- 可以批量在其他类创建对象
- 对象是类的一个**产品**

## 类是由什么组成的呢？
### 一个**标准的**类包括：
1. 每个对象的**属性**
   - 一般为private
2. 构造函数 
   - **Constructor method**
   - 没有返回值
   - 创造对象的方法
3. 变异子函数(是我认为的除了“鲁棒性”之外第二抽象的中文翻译)
   - **Mutator method**
   - 操作对象的属性
   - 返回值是void
4. 访问子函数
   - **Getter & Setter**
   - 这个对象和外界沟通的桥梁
   - 获取和设置属性

## 来点例子
- 类与对象在模拟现实世界很有用
- E.g.
- 每个门都是从`door`类 产出的
- 每个独特的门对象都有自己的
  - **颜色** 
  - **是否是打开的** 
  - **已经生产多久了**
- 每个独特的门对象都可以
  - **换颜色**
  - **加一年**
### 代码
`DoorTest.java`
```java
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
```

### 一个没有注释的例子 
- 看看自己能不能说出每行在干什么
- 其实一般将给Employee做test的class `EmployeeTest`叫做**client class**
- `client` 就是我们上文有时候说到的用户
- 而且一般分到两个类里面
`Employee.java`
`EmployeeTest.java`
```java
public class Employee {
    // 1.我是谁？
    private final String ID;
    private final String name;
    private int salary;
    private String branch;
    
    // 2.
    public Employee(String ID, String name, int salary, String branch){
        this.ID = ID;
        this.name = name;
        this.salary = salary;
        this.branch = branch;
    }
    
    // 3.
    public void addSalary(int increment){
        this.salary += increment;
    }

    public void changeBranch(String newBranch){
        setBranch(newBranch);
    }
    
    // 4.
    public int getMonthEarning(){
        return this.salary * 30;
    }

    public int getSalary() {
        return salary;
    }

    public String getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public String getBranch() {
        return branch;
    }

    @Override
    public String toString() {
        return  name + ": \n" +
                "ID: " + ID + '\n' +
                "salary: $" + salary + '\n' +
                "branch: '" + branch;
    }

    private void setBranch(String branch) {
        this.branch = branch;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
```

```java
public class EmployeeTest {
    public static void main(String[] args){
        Employee worker1 = new Employee("123423423", "James", 300, "Beijing");
        Employee worker2 = new Employee("123423344", "Robert ", 200, "ShangHai");
        Employee worker3 = new Employee("123452342", "Jennifer", 300, "Beijing");
        Employee worker4 = new Employee("123423423", "Mary", 200, "ShenZhen");
        Employee worker5 = new Employee("234111344", "William", 400, "Beijing");

        // 这个就是一个包含有这些worker的列表 就是Array
        Employee[] employees = {worker1, worker2, worker3, worker4, worker5};
        int sum = 0;
        int cnt = 0;
        // 对于每一个employees中的东西
        // 我们先叫他们tmp 这里每次for一遍 就换一个新的worker
        for (Employee tmp: employees) {
            if (tmp.getBranch().equals("Beijing")){
                sum += tmp.getSalary();
                cnt++;
            }
        }
        System.out.println("The mean of salary in Beijing Branch is: $" + sum/cnt);
    }
}
```
