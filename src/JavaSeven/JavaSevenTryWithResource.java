package JavaSeven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
// try with resource where we dont need to close the connection of file
// try with multiple exception of different types in same catch block
//
public class JavaSevenTryWithResource {
    public static void main(String args[]){

        try(FileOutputStream fileOutputStream = new FileOutputStream("C:/Users/khant/Downloads/test.txt")) {
            String msg = "I am khant vyas";
            byte bytearry[] = msg.getBytes();
            fileOutputStream.write(bytearry);
            System.out.println("fine written successfully");

        }catch (IOException | ArrayIndexOutOfBoundsException | NullPointerException exception){
            System.out.println(exception.getMessage());
        }
    }
    }
