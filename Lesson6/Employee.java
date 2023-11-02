package APCSAGuides.Lesson6;

public class Employee {
    private final String ID;
    private final String name;
    private int salary;
    private String branch;

    public Employee(String ID, String name, int salary, String branch){
        this.ID = ID;
        this.name = name;
        this.salary = salary;
        this.branch = branch;
    }

    public void addSalary(int increment){
        this.salary += increment;
    }

    public void changeBranch(String newBranch){
        setBranch(newBranch);
    }

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
