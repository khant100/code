package DesignPattern.BuilderDesignPattern;

import java.util.List;

public class Student {
    int rollNumber;

    String name;

    String fatherName;

    String motherName;

    int age ;

    List<String> subjects;

    @Override
    public String toString() {
        return "" +
                "rollNumber=" + rollNumber +
                ", name='" + name  +
                ", fatherName='" + fatherName +
                ", motherName='" + motherName +
                ", age=" + age +
                ", subjects=" + subjects.get(0) +","+subjects.get(1)+","+subjects.get(2);
    }

    public Student(StudentBuilder studentBuilder){
        this.rollNumber=studentBuilder.rollNumber;
        this.name=studentBuilder.name;
        this.age=studentBuilder.age;
        this.fatherName=studentBuilder.fatherName;
        this.motherName=studentBuilder.motherName;
        this.subjects=studentBuilder.subjects;

    }
}
