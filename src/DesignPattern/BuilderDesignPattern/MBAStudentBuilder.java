package DesignPattern.BuilderDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class MBAStudentBuilder extends StudentBuilder{
    @Override
    public StudentBuilder setSubjects(){
        List<String> sub = new ArrayList<>();
        sub.add("Econimics");
        sub.add("Business Management");
        sub.add("Communication");
        this.subjects=sub;
        return this;
    }
}
