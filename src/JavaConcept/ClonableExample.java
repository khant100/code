package JavaConcept;

public class ClonableExample {

    public static void main(String[] args) throws CloneNotSupportedException {

        Employee e1 = new Employee("ram", "e123", 1500000);
        Employee e2 = (Employee) e1.clone();
        //e2.setName("khant");
        System.out.println(e2.getId()+"e2"+e2.getName()+" e2 sal"+e2.getSal());
        System.out.println(e1.getId()+"e1"+e1.getName()+" e1 sal"+e1.getSal());
    }
}
