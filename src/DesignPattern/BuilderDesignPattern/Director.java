package DesignPattern.BuilderDesignPattern;

public class Director {

    StudentBuilder studentBuilder;

    Director(StudentBuilder builder){
        this.studentBuilder=builder;
    }

    public Student createStudent(){
        if(studentBuilder instanceof EnggStudentBuilder){
            return  createEnggStudent();
        }
        if(studentBuilder instanceof MBAStudentBuilder){
            return createMBAStudent();
        }
    return null;
    }

    private Student createEnggStudent(){
        return studentBuilder.setRollNumber(1).setAge(20).setName("khant").setSubjects().build();
    }

    private Student createMBAStudent(){
        return studentBuilder.setRollNumber(4).setAge(20)
                .setName("Raj").setSubjects().setFatherName("father")
                .setMotherName("Mother").build();
    }

}
