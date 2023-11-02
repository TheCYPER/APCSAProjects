package APCSAGuides.Lesson6;

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
