package JavaNine;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TryWithResourceImproment {
    public static void main(String args[]) throws FileNotFoundException {
        FileOutputStream fileOutputStream = new FileOutputStream("C:/Users/khant/Downloads/test.txt");
        try(fileOutputStream) {
            String msg = "I am khant vyas in java 9 compilte";
            byte bytearry[] = msg.getBytes();
            fileOutputStream.write(bytearry);
            System.out.println("fine written successfully");

        }catch (IOException | ArrayIndexOutOfBoundsException | NullPointerException exception){
            System.out.println(exception.getMessage());
        }
    }
}
