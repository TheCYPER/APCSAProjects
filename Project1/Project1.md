# Project 1 - A calculator for quadratic equation
## Objective
* 完成一个计算器，计算**一元二次方程式**
* 对于一个形式为 0 = ax^2 + bx + c 的一元二次方程式
* 它的两个解为：
* x1 = (-b + (b^2 - 4a*c) ^ 1/2)/2a
* x2 = (-b - (b^2 - 4a*c) ^ 1/2)/2a
* 所以我们如果知道 **a, b, c**
* 我们就可以解这个方程了
* 那么我们如何编写出一个这个的Java程序呢？
## Walk Through
* 首先我们需要new一个java文件
* 然后把它命名为Project1
### What we have learn so far
* Variables (**int a = xxx**, **double b = xxx**...)
* Operates for calculation (`+-*/`)
* Output (`System.out.println();`)
* there are also other things...
### What do we need
* **Input: three variable refer to a, b, c**
* something like this
```java
double/int a = 
double/int b = 
double/int c = 
```
* 思考一下这里应该使用int还是double呢？
* 如果忘了 可以试试参考一下第2节中的一些信息
* **Process: calculation**
* 把这个两个解表示出来并放在变量里面
```java
double x1 = // (-b + (b^2 - 4a*c) ^ 1/2)/2a
double x2 = // (-b - (b^2 - 4a*c) ^ 1/2)/2a
// 有关Operates的使用
```
* 你可能已经意识到了我们还没有讲解如何幂运算
* 我希望可以锻炼一下你的查文档能力
* google/baidu Java幂运算 or 直接查看Java doc
* 相信你一定可以明白（如果不行，请移步至Demo01.java）
* **Output: the two solution**
* 直接print出来
## Sample Answer
- your solution could be totally different but it's ok
- `Project1.java`
```java
public class Project1 {
    public static void main(String[] args){
        // 3个参数
        double a = 10;
        double b = 6;
        double c = 7;
        // process
        // 我们在这里先使用了一个中间变量 以让下一步处理看上去舒服一些
        double delta = Math.pow(b, 2) - 4 * a * c;
        // (-b + (b^2 - 4a*c) ^ 1/2)/2a
        double x1 = (-b + Math.pow(delta, 0.5)) / 2 * a;
        // (-b - (b^2 - 4a*c) ^ 1/2)/2a
        double x2 = (-b - Math.pow(delta, 0.5)) / 2 * a;

        System.out.println("The first solution is " + x1);
        System.out.println("The second solution is " + x2);
    }
}
```