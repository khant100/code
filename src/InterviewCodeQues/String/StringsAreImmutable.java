package InterviewCodeQues.String;

public class StringsAreImmutable {
    public static void main(String[] args) {
        // Original string
        String originalString = "Hello";

        // Attempt to change the string by concatenating
        String modifiedString = originalString.concat(" World");
        String s1="hello";
        String s2 = "hello";
        String s3 = new String("hello");
        // Output the original and modified strings
        System.out.println("Original String: " + originalString);
        System.out.println("Modified String: " + modifiedString);
        System.out.println(s1==s2);
        System.out.println(s1==s3);

        // Check if the original string has changed
        if (originalString.equals("Hello")) {
            System.out.println("The original string is unchanged, proving immutability.");
        } else {
            System.out.println("The original string has changed, which shouldn't happen.");
        }
    }
}

