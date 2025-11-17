package InterviewCodeQues;

import java.util.Objects;

public class implement {
    public static void main(String args[]) {

        ObjectArray[] student = new ObjectArray[]{new ObjectArray("khant"), new ObjectArray("het"), new ObjectArray("Pooja")};

        
        for (ObjectArray m : student) {
            System.out.println(m.toString());
        }
    }

}
