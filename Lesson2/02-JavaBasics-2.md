# JavaBasics-2

## Java Primitive Data Types
- Introduction to the basic data types available in Java, such as int, float, boolean, etc.
- **这个部分非常重要！！！**
- CSA很爱考一些这里面的内容
- 所有**好好试试**每一个Demo 确保你可以理解这里面的知识的

1. 变量就是内存里的一个部分的内容
     - 比如 int 整数, double 浮点数(就是小数的意识)
2. 当创建变量的时候，需要在内存中申请一块空间
3. 根据变量的类型为变量分配存储空间   
**Thus,**分配的空间只能用来储存该类型数据(后面会提)
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
        int num1 = 10;
        // 声明一个变量需要三个部分
        // 变量类型 变量名 = 值;
        // int num = 10

        // 声明浮点数变量，并赋值
        double num2 = 3.14;

        // 声明布尔型变量，并赋值
        boolean flag = true;

        // 进行简单的运算和使用
        int result = num1 * 5;
        double piValue = num2 * 2.0;

        // 输出结果
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
但是如果是给double int值呢？
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
    }
}
```
1. 输出为10.0
2. 这是因为在内存中给double的空间比int大
3. 另外Java自动帮你把它转化成了一个double: 10.0

- 那么我们如何才可以给int一个double值呢？
`Demo02.java`



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
2. 不可以数字开头！！！
3. 标识符是大小写敏感的
     - 所以Num 和 num是不一样的
4. 一个`.java`中只能有一个(返回为空, 参数为String args[])的`main`函数
    要不然Java就不知道跑哪个了
5. 不能有空格
   
`合法标识符举例：age、$salary、_value、__1_value`
`非法标识符举例：123abc、-salary`

- 但是只合法还不够，我们还需要一些大家都看着舒服的约定俗成的命名法
- 大驼峰命名法：用于类名
- 单词的首字母都大写，没有使用下划线或其他分隔符来连接单词
- `MobilePhone`
  `CustomerOrder`
  `BankAccount`
  `Demo01`
  `CSADemo01`
- 小驼峰命名法：用于函数名和变量

## Java Keywords
- An overview of Java keywords and their significance in the language.
