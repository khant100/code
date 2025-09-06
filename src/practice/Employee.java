package practice;

import java.util.List;

public class Employee {
    String name ;

    public Double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getAddress() {
        return address;
    }

    public void setAddress(List<String> address) {
        this.address = address;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    Double salary;

    public Employee(String name, Double salary, List<String> address) {
        this.name = name;
        this.salary = salary;
        this.address = address;
    }

    List<String> address;

}
