# 01-JavaBasics
## Prerequisite
1. Ensure you have **Java installed** on your machine.
    - Check by entering `java -version` in your machine's terminal.

2. Install an **Integrated Development Environment** (IDE).
    - BlueJ, IntelliJ, Eclipse...

3. **Eager to start learning Java!!!**


## First Java Program 
下面看一个简单的 Java 程序，它将输出字符串 **Hello World**
It is also in the File `Demo01.java`
```java
public class HelloWorld {
    /* 第一个Java程序 
     * 它将输出字符串 Hello World
     */
    public static void main(String[] args) {
        System.out.println("Hello World"); // 输出 Hello World
    }
}
```
### Try it yourself!  
如果你在使用**IntelliJ**  
1. StartingPage
   ![StartingPage Image](https://github.com/TheCYPER/APCSAProjects/raw/main/Lesson1/Pics/1_StartingPage.png)

2. NewProject
   - Just copy my configurations
     ![NewProject Image](https://github.com/TheCYPER/APCSAProjects/raw/main/Lesson1/Pics/2_NewProject.png)

3. Success!
   ![Success Image](https://github.com/TheCYPER/APCSAProjects/raw/main/Lesson1/Pics/3_Success.png)

4. New a .java file called Demo01.java
   ![New Java File Image](https://github.com/TheCYPER/APCSAProjects/raw/main/Lesson1/Pics/4_NewJavaFile.png)

5. Put the things I said inside
   ![Put Things Inside Image](https://github.com/TheCYPER/APCSAProjects/raw/main/Lesson1/Pics/5_Copy.png)

6. Run it!
   ![Run Image](https://github.com/TheCYPER/APCSAProjects/raw/main/Lesson1/Pics/6_running.png)

**Congratulation!   
You have just run a Java program on you computer!!!**

## Basic Syntax
- Introduction to the fundamental syntax rules in Java programming.(And basically every language)
观察刚才的`Demo01.java`我们发现：
1. Java run from a function named
   `public static void main(String[] args)`
   which we called the main function(主函数)
   It is the start of running everything in Java
2. `{}` <= 这是一个成对的花括号
   在Java中我们用它来说明一个代码块的开始和结束
3. `System.out.println("Hello World");`
   here we used a function called `println`
   正如它的名字一样 it can **print a line**
4. 在Java和很多语言中，我们用缩进来表示层次

### Try it yourself!
now change the thing in the `"change me!"`
and see what is happening in the output
`Demo02.java`
```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("change me!");
    }
}
```

## Java Comments
- Explanation of how to use comments in Java code to provide explanations and documentation.
1. 虽然我们是为了机器去读所以编程，但是有时候你也需要让人读你的代码
2. 所以你就会需要一些**Comments**
3. which is **parts that human can read but java won't run**
4. 类似于 C/C++、Java 也支持单行以及多行注释
5. 注释中的字符将被 Java 编译器忽略

`Demo03.java`
```java
public class HelloWorld {
    /* 
    * Java编译器 cannot see me!
    * 这是一个多行注释的示例
     * hahahahaha! 
    */
    public static void main(String[] args){
        // 这是单行注释的示例
       // you can put things inside and not be noticed by Java编译器
       /* 这个也是单行注释的示例 */
        System.out.println("Hello World");  // 这一行代码会输出Hello World
        //System.out.println("Hello World"); 这一行代码被注释掉了 Java不会run这一行
    }
}
```



## Java Output
- How to display output in Java programs using methods.

## Java Primitive Data Types
- Introduction to the basic data types available in Java, such as int, float, boolean, etc.

## Java Identifiers
- Explanation of Java identifiers, naming conventions, and rules for naming variables, classes, etc.

## Java Keywords
- An overview of Java keywords and their significance in the language.
