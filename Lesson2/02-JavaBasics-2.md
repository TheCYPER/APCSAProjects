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
public class 
```


## Java Identifiers
- Explanation of Java identifiers, naming conventions, and rules for naming variables, classes, etc.
1. 刚刚我们介绍了变量 每个变量都有自己的名字
2. 还有像`public static void main()` main就是函数的名字
3. 在每个.java文件中都会有一个`public class xxx{}`
    这里的`xxx`就是它的名字
4. 所以这些东西都有名字
5. Thus, Java 所有的组成部分都需要名字
6. **类名**、**变量名**以及**方法名**都被称为**标识符(Identifiers)**.  
**Rules! Important!**
1. 开头：A-Z 或者 a-z 美元符$ 或者下划线_
      不可以数字开头！！！
2. 首字母后可以是任何字母 数字 美元符 下划线

1. 关键字(Java内置key word)不能用作标识符
2. 标识符是大小写敏感的
     - 所以Num 和 num是不一样的
3. 一个.java中只能有一个(返回为空, 参数为String args[])main函数
    要不然Java就不知道跑哪个了
   
`合法标识符举例：age、$salary、_value、__1_value`
`非法标识符举例：123abc、-salary`


## Java Keywords
- An overview of Java keywords and their significance in the language.
