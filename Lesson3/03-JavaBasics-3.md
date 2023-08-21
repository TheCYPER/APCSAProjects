# JavaBasics-3
## Java Operators
- Explanation of various operators in Java, such as arithmetic, assignment, comparison, logical, etc.
- 当谈到 Java 运算符(Operators)时，涉及到各种用于进行计算、比较和操作值的符号
- 下面我们将分别解释**数学运算运算符**、**比较运算符**以及**自增和自减运算符**

### 数学运算运算符()
- 这些运算符用于执行基本数学运算。以下是几个常见的运算符：

- 加法 `+`：将两个值相加
- 减法 `-`：从第一个值减去第二个值
- 乘法 `*`：将两个值相乘
- 除法 `/`：将第一个值除以第二个值
- 取模(mode) `%`：获取余数

- **Try it yourself**
`Demo01.java`
```java
public class Demo01 {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        
        int sum = a + b;
        int difference = a - b;
        int product = a * b;
        double quotient1 = a / b;
        double quotient2 = (double) a / b;
        // 注意强制类型转换，以保留小数部分 
        // 这里是一个考点 但是先不说了 回头再聊
        
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("QuotientWithoutFractions: " + quotient1);
        System.out.println("QuotientWithFractions: " + quotient2);
    }
}
```

### 比较运算符
- 比较运算符用于比较两个值之间的关系，返回一个布尔值 `true` 或 `false`。
- 完了突然想起来上次忘记讲**布尔变量**了
- **布尔变量**
  - 布尔变量是一种数据类型，只有两种值，即真（`true`）或假（`false`）。
  - 在 Java 中，布尔变量用于执行条件检查和逻辑判断。
  - 布尔变量通常用于控制流语句（如 `if` 和 `while`）中，以确定是否执行特定的代码块。
    - 这个回头会再讲 先直接看一下代码吧

- **Try it yourself**
`Demo02.java`
```java
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
```
    
- 再回到**比较运算符**
- ==：检查两个值是否相等。
- !=：检查两个值是否不相等。
- >：检查第一个值是否大于第二个值。
- <：检查第一个值是否小于第二个值。
- >=：检查第一个值是否大于等于第二个值。
- <=：检查第一个值是否小于等于第二个值。

- **Try it yourself**
`Demo03.java`
```java
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

```

### 自增和自减运算符
- ++：将变量的值增加 1。
- --：将变量的值减少 1。
- Useful in loop(`for`) 主要用来控制次数 回头再聊

- **Try it yourself**
`Demo04.java`
```java
public class Demo04 {
    public static void main(String[] args) {
        int num = 5;
        
        System.out.println("Original Value: " + num);
        
        num++; // 自增操作
        System.out.println("After Increment: " + num);
        
        num--; // 自减操作
        System.out.println("After Decrement: " + num);
    }
}
```

- 至此，我们就完成了基本的Java语法的讲解
- 所以我们写个小东西吧！！！
- 在文件夹**Project01**中
