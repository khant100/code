package DesignPattern.BuilderDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class EnggStudentBuilder extends StudentBuilder{

    @Override
    public StudentBuilder setSubjects(){
        List<String> sub = new ArrayList<>();
        sub.add("DSA");
        sub.add("Computer Science");
        sub.add("System Design");
        this.subjects=sub;
        return this;
    }
}
