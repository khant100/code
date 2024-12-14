package InterviewCodeQues.JAVAEIGHT;

public class Employee {
    String name;
    Integer sal;
    Integer Age;

    public Employee(String name, Integer sal, Integer age) {
        this.name = name;
        this.sal = sal;
        Age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSal() {
        return sal;
    }

    public void setSal(Integer sal) {
        this.sal = sal;
    }

    public Integer getAge() {
        return Age;
    }

    public void setAge(Integer age) {
        Age = age;
    }
}
