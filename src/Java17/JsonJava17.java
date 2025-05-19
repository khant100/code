package Java17;

public class JsonJava17 {
    public static void main(String[] args){

        String json = """
                {
                    "name" : "%s",
                    "id" : "%d"
                }
                """.formatted("Khant",1111);

        System.out.println("--"+json);
    }
}
