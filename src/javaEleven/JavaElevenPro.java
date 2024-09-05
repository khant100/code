package javaEleven;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class JavaElevenPro {

    // in java 11 lines() method is used to read line by line from data
    // string thers is strip() method used to remove space from frond and back of the string
    // repeat is used to repeat thing multiple times
    // new file methods are added to readString and writeString
    public static void main(String[] args) throws IOException {
        String xyz = "hello\n how are you?\n I am fine. \n hope you are well. ";
        String re = "khant is great".repeat(108);
        String strip = " he llo ";
        List<String> line = new ArrayList<>();
        xyz.lines().forEach(l->line.add(l));
        System.out.println(" "+line);
        System.out.println(" "+re);
        System.out.println(" Sting :"+strip.strip());
        System.out.println(" Sting"+strip.stripLeading());
        System.out.println(" Sting"+strip.stripTrailing());


     String s = Files.readString(Path.of("C:/Users/khant/Downloads/test.txt"));
     StringBuilder sb = new StringBuilder();
     sb.append(s);
     sb.append("\n");
     Files.writeString(Path.of("C:/Users/khant/Downloads/test.txt"),sb.append(" Learn a lot").toString());
     System.out.println(s);
    }
}
