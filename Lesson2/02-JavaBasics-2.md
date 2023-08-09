# JavaBasics-2

## Java Primitive Data Types
- Introduction to the basic data types available in Java, such as int, float, boolean, etc.
- **这个部分非常重要！！！**
- CSA很爱考一些这里面的内容
- 所有**好好试试**每一个Demo 确保你可以理解这里面的知识的

### Basic things
1. 变量就是内存里的一个部分的内容
     - 比如 int 整数, double 浮点数(就是小数的意识)
2. 当创建变量的时候，需要在内存中申请一块空间
3. 根据**变量的类型**为变量分配存储空间 
   - **Thus,** 分配的空间只能用来储存该类型数据(后面会提)
4. 通过定义不同类型的变量，可以在内存中储存整数、小数或者字符
5. Java 的两大数据类型:
	- 内置数据类型(马上要讲)
	- 引用数据类型(以后到类与对象会讲)  
反正先看个Demo   
`Demo01.java`
```java
public class Demo01{
    public static void main(String[] args) {
        // 声明整数变量，并赋值
        int num = 10;
        // 声明一个变量需要三个部分
        // 变量类型 变量名 = 值;
        // int num = 10
        
        // 声明整数变量，后赋值
        int num1;
        num1 = 20;

        // 声明浮点数变量，并赋值
        double num2 = 3.14;

        // 声明布尔型变量，并赋值
        boolean flag = true;

        // 进行简单的运算和使用
        int result = num1 * 5;
        double piValue = num2 * 2.0;

        // 输出结果
        System.out.println("num:" + num);
        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);
        System.out.println("flag: " + flag);
        System.out.println("result: " + result);
        System.out.println("piValue: " + piValue);
    }
}
```
1. 在AP CSA考试中 我们只会使用这三种基本数据类型:
2. int: An integer. For example, 2,-26, 3000 
3. boolean: A boolean. Just two values, true or false 
4. double: A double precision floating-point number. For example, 2.718,-367189.41, 1.6e4

### 那么如果出现`int num = 3.14`会怎么样呢？
### try it yourself!
`Demo02.java`
```java
public class Demo02 {
    public static void main(String[] args) {
        double num1 = 3.14;
        int num2 = num1; // what will be happening here

        System.out.println("num2 (int): " + num2);
    }
}

```
1. `"Incompatible types. Found: 'double', required: 'int':6"`
2. 出现了报错！这是因为 int在内存中的地方一共就那么大 放不下double这样的小数
- 但是如果是给double一个int值呢？
`Demo02.java`
```java
public class Demo02 {
    public static void main(String[] args) {
//        double num1 = 3.14;
//        int num2 = num1; // 报错! 不容许将double值赋给int类型的变量
//
//        System.out.println("num2: " + num2);

        double num3 = 10; // !允许将int值赋给double类型的变量!
        System.out.println("num3 (double): " + num3);  // 输出是10.0
    }
}
```
1. 输出为10.0
2. 这是因为在内存中给double的空间比int大
3. 另外Java**自动**帮你把它转化成了一个double: 10.0
4. 通过自动帮你加了一个`.0`

- 那么我们如何才可以给int一个double值呢
`Demo02.java`
```java
public class Demo02 {
    public static void main(String[] args) {
//        double num1 = 3.14;
//        int num2 = num1; // 报错! 不容许将double值赋给int类型的变量
//
//        System.out.println("num2 (int): " + num2);

        double num3 = 10; // !允许将int值赋给double类型的变量!
        System.out.println("num3 (double): " + num3);  // 输出是10.0

        // 给int一个double值 用强制类型转换的方式
        double num4 = 7.8;
        int num5 = (int) num4; // 将double类型的num4转换为int类型
        System.out.println("num5 (int): " + num5);  // num5 = 7
    }
}
```
1. 在这段样例中，我们使用`(int)`进行了强制类型转换
2. 在Java中使用`(想转换成的类型)`进行类型转换
3. 这种转换就是直接把**小数部分直接搞掉**
- 如果我们想四舍五入呢(CSA考点注意)
`Demo03.java`
```java
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
```
1. 在直接记录下这两个方法前，希望你可以先思考一下为什么是这样的
2. 方法：正数+0.5 取整；负数-0.5 取整

### Java Constant
1. 在Java中我们会使用`final`关键字表示常量
2. 被标记为`final`的变量不可以再次被赋值
`Demo04.java`
```java
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
        // 或者其他一些固定值的场景
    }
}
```

## Java Identifiers
- Explanation of Java identifiers, naming conventions, and rules for naming variables, classes, etc.
1. 刚刚我们介绍了变量 每个变量都有自己的名字
2. 还有像`public static void main()` main就是函数的名字
3. 在每个.java文件中都会有一个`public class xxx{}`
    这里的`xxx`就是它的名字
4. 所以这些东西都有名字
5. Thus, Java 所有的组成部分都需要名字
6. **类名**、**变量名**以及**方法名**都被称为**标识符(Identifiers)**

**Rules! Important!**
- what are valid:
1. 开头：A-Z 或者 a-z 美元符$ 或者下划线_
2. 首字母后可以是任何字母 数字 美元符 下划线

- what has to be avoided:
1. 关键字(Java内置的key word)不能用作标识符 
2. **不可以**数字开头！！！
3. 标识符是大小写敏感的
     - 所以Num 和 num是不一样的
4. 一个`.java`中只能有一个(返回为空, 参数为String args[])的`main`函数
    要不然Java就不知道跑哪个了
5. 不能有空格
   
- `合法标识符举例：age、$salary、_value、__1_value`
- `非法标识符举例：123abc、-salary`

### 命名规范(rules you **should be** following)
- 但是只合法还不够，我们还需要一些大家都看着舒服的约定俗成的命名法
- 大驼峰命名法：用于类名
- 单词的首字母都大写
- `MobilePhone`
  `CustomerOrder`
  `BankAccount`
  `Demo01`
  `CSADemo01`
- 小驼峰命名法：用于函数名和变量
- 第一个单词首字母都大写
- `personInfo`
  `stuScore`
  `indexForArr`
  `bookTitle`
  `numOfPos`


## Java Keywords
- An overview of Java keywords and their significance in the language.
- Java中有多个关键字用于特定的任务和功能。以下是这些关键字的列表，按照不同的类别进行分组
- 注意你 **不可以!!** 用Keyword来命名任何东西
- 这个列表只是让你稍微看一下 知道Java有**关键字**这个东西就行了
### 类别 1 - 修饰符和访问控制
1. [ ] public：表示成员（变量、方法等）是公共的，可以在其他类中访问。
2. [ ] protected：表示成员只能在同一包或子类中访问。
3. [ ] private：表示成员只能在当前类中访问。
4. [ ] static：表示成员属于类本身而不是实例。
5. [ ] final：表示成员是不可更改的常量。
6. [ ] abstract：表示类或方法是抽象的，不能被实例化。 
### 类别 2 - 类、对象和继承
1. [ ] class：定义一个类。
2. [ ] interface：定义一个接口。
3. [ ] extends：在类声明中表示继承一个类。
4. [ ] implements：在类声明中表示实现一个接口。
5. [ ] this：表示当前实例对象。
6. [ ] super：表示父类实例对象。
7. [ ] new：创建一个新的对象。 
### 类别 3 - 控制流和异常处理
1. [ ] if：条件语句，用于执行不同的代码块。
2. [ ] else：与if一起使用，表示条件不成立时执行的代码块。
3. [ ] switch：多分支条件语句，用于匹配不同的情况。
4. [ ] case：在switch中表示一个分支情况。
5. [ ] default：在switch中表示默认情况。
6. [ ] for：循环语句，用于重复执行一段代码。
7. [ ] while：循环语句，用于在条件满足时重复执行一段代码。
8. [ ] do：循环语句，先执行一次代码，然后在条件满足时重复执行。
9. [ ] break：在循环或开关语句中停止执行。
10. [ ] continue：在循环中跳过当前迭代，继续下一次迭代。
11. [ ] return：从方法中返回一个值。 
### 类别 4 - 数据类型和变量
1. [ ] int：表示整数数据类型。
2. [ ] double：表示双精度浮点数数据类型。
3. [ ] boolean：表示布尔数据类型。
4. [ ] char：表示字符数据类型。
5. [ ] String：表示字符串数据类型。
6. [ ] void：表示方法不返回任何值。
7. [ ] null：表示一个空引用。 
### 类别 5 - 异常处理
1. [ ] try：用于包围可能会引发异常的代码块。
2. [ ] catch：在try块中用于捕获并处理异常。
3. [ ] finally：无论是否引发异常，都会执行的代码块。
4. [ ] throw：用于在代码中抛出异常。
5. [ ] throws：在方法声明中指定可能抛出的异常。 
### 类别 6 - 其他
1. [ ] import：引入其他包中的类。
2. [ ] package：定义包，用于组织类。
3. [ ] native：表示使用本地方法。
4. [ ] strictfp：定义精确浮点计算。
### 共53个
- 这次课程后你就会知道大部分的关键字是干什么的了
