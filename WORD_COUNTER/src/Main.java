import java.io.*;
import java.util.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("If You Need To Enter String Press 1, If You Need To Enter File Press 2");
        int option=0;
        option= sc.nextInt();
        sc.nextLine(); // Consume the newline left in the buffer
        String s=" ";
        if (option==1)
        {
            System.out.println("Enter The String: ");
             s = sc.nextLine();
        }
        else if(option==2)
        {

                System.out.println("Enter The Path Of File: ");
                String p = sc.nextLine(); // Use nextLine to read the entire line
                Path fileName = Path.of(p);
                s = Files.readString(fileName);

        }

        if (s == null || s.isEmpty())
        {
            System.out.println("0");
        } else {
            String[] words = s.split("\\s+");
            System.out.println(words.length + " Words");
        }
    }
}
