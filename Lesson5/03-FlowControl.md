# Java Flow Control
## Flow & Flow statements
- Java compiler executes the code from **top to bottom** (顺序执行) 
- executed according to the order
- but there are statements that can be used to **control the flow** of Java code.
- it is one of the fundamental features of Java
## Java Conditional Statements (if-else)
- using `if` and `else` statements => making decisions based on conditions.
- if 和 else 语句允许我们根据条件true false来选择性地执行不同的代码
![example of condition](https://www.runoob.com/wp-content/uploads/2013/11/if-condition.jpg)
- example of condition
![the if in python](https://static.runoob.com/images/mix/python-if.webp)
- The if statement in Python, but it is the same for Java
- The most basic: one `if`
```java
if(布尔表达式) {
   //如果布尔表达式为true将执行的语句
}
```
`Demo01.java`
```java
public class Demo01 {
 
   public static void main(String args[]){
      int x = 10;
 
      if( x < 20 ){
         System.out.print("This number is smaller than 20");
      }
   }
}
```
- `if...else...` 
```java
    if(someSortOfBool){
        statement happening when true;
    } else {
        statement happening when false;
    }
```
`Demo1.java`
```java
public class Demo01 {
    public static void main(String[] args) {
        int age = 18;

        if (age >= 18) {
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are a minor.");
        }
    }
}
```
- `if...else if...else if...else...`
- There can be infinite many of `else if` statements
```java
    if(condion1){
        statement happening when true;
    } else if(condion2){
        statement happening when condion1 is false;
        but the condion2 is true;
    } else if(condion3){
        statement happening when condion1 is false;
        and condion2 is false;
        but the condion3 is true;
    } else {
        statement happening when all the condions above is false;
    }
```
- 可以有很多很多的else if来判断各种情况
### rules for else if
- start to include more logic in it
- if 语句至多有 1 个 else 语句，else 语句在所有的 else if 语句之后
- if 语句可以有若干个 else if 语句，它们必须在 else 语句之前
- 一旦其中一个 else if 语句检测为 true，其他的 else if 以及 else 语句都将跳过执行
`Demo03.java`
```java
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

```
## Java Loops (for/while)
- Explanation of using `for` and `while` loops in Java for iterative tasks.
- 