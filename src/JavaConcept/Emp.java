package JavaConcept;

import java.util.Objects;

public class Emp {
    private String name;
    private Integer id;

    public Emp(String name, Integer id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public boolean equals(Object object){
        if(this==object) return true;
        if(object==null|| getClass() !=object.getClass()) return false;
        Emp employee = (Emp) object;
       return Objects.equals(employee.id,id) && Objects.equals(employee.name,name);
    }

    @Override
    public int hashCode(){
        return Objects.hash(id,name);
    }
}
