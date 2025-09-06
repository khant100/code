package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class ImmutableClass {

    final private Integer salary;
   final private String name;

   final private List<String > address;
    public Integer getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public List<String> getAddress() {
        return Collections.unmodifiableList(address);
    }

    public ImmutableClass(Integer salary, String name, List<String> address) {
        this.salary = salary;
        this.name = name;
        this.address = new ArrayList<String>(address);
    }

}
