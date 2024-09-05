package JavaConcept;

public class Employee implements Cloneable{
    String name;

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", sal=" + sal +
                '}';
    }

    String id;
    Integer sal;

    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
    public Employee(String name, String id, Integer sal) {
        this.name = name;
        this.id = id;
        this.sal = sal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getSal() {
        return sal;
    }

    public void setSal(Integer sal) {
        this.sal = sal;
    }
}