package InterviewPractice;

public class Employee {
    String dept;
    Double salary;

    public Employee(String name,String dept, Double salary ) {
        this.dept = dept;
        this.salary = salary;
        this.name = name;
    }

    String name;

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "dept='" + dept + '\'' +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                '}';
    }
}
