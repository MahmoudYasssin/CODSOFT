import java.util.*;

import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);    //System.in is a standard input stream


        Random rand = new Random();
        int int_random = rand.nextInt(100) + 1;

        int num=0;
        int Attempts=0;
        while (true)
        {
            System.out.println("Enter The Guss");
            num = sc.nextInt();

            if (num == int_random)
            {
                System.out.println("Correct");
                System.out.println(Attempts+1 +"Attempts");
                System.out.println("To play again press 1 --To Exit press 2");
                int s;
                s=sc.nextInt();
                if(s==1)
                {
                    rand = new Random();
                    int_random = rand.nextInt(100) + 1;
                    Attempts=0;
                }
                else if(s==2)
                {
                    break;
                }
            }
            else
            {

                if (num >= int_random + 10 && num <= 100)
                {
                    System.out.println("High");
                }
                else if (num <= int_random - 10 && num >= 1)
                {
                    System.out.println("Low");
                }
                else if(num>=int_random-10 && num<=int_random+10)
                {
                    System.out.println("Near");
                }

                Attempts++;
            }
        }


    }
}