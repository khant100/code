package JavaEight;
import java.util.StringJoiner;

public class StringJoiner1 {
    public static void main(String[] args) {

        StringJoiner s = new StringJoiner(",");
        s.add("khant");
        s.add("vyas");
        s.add("Raju");

        System.out.println(s.toString());

    }

}
