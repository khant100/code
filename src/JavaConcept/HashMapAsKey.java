package JavaConcept;


import java.util.HashMap;

public class HashMapAsKey {
    public static void main(String[] args) {
        // Create HashMap with custom class as key
        HashMap<Emp, String> employeeMap = new HashMap<>();
        employeeMap.put(new Emp("vyas",1),"bombay");
        employeeMap.put(new Emp("vyas",1),"pune");
        employeeMap.put(new Emp("vyas",2),"Ahmedabad");
        employeeMap.put(new Emp("bobby",1),"Rajkot");
        System.out.println(employeeMap);

    }
}