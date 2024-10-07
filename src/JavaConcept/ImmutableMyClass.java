package JavaConcept;


import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

// make sure  all the value are final and privte
// there is no setter in the class
// constructor to initilize the class
 // return deep copy of object instead of reference for composite type
final class ImmutableMyClass {
    final private String name;
    final private int age;

    public ImmutableMyClass(String name, int age, Map<String, String> metadat) {
        this.name = name;
        this.age = age;
        Map<String,String> m1 = new HashMap<>();
        for(Map.Entry m : metadat.entrySet()){
            m1.put((String) m.getKey(), (String) m.getValue());
        }

        this.metadat = m1;
    }

    final private Map<String,String> metadat;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Map<String, String> getMetadat() {

        Map<String,String> m1 = new HashMap<>();
        for(Map.Entry m : metadat.entrySet()){
            m1.put((String) m.getKey(), (String) m.getValue());
        }
        return m1;
    }
}
