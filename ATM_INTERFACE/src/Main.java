// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import java.util.*;


public class Main {

    public static class client
    {
        private String name;
        private String pass;
        private double money=0;
        public client() {
        }

        public client(String name,String pass)
        {
            this.name=name;
            this.pass=pass;
        }

    }
    public static class ATM
    {
        private Stack<client> stack = new Stack<client>();
        public void add(client c)
        {
            stack.add(c);
        }
        public void deposit(String pass, double money) {
            for (int i = 0; i < stack.size(); i++)
            {
                client xx = stack.get(i);
                if (xx.pass.equals(pass)) // Use .equals() for String comparison
                {
                    xx.money += money;
                    stack.set(i, xx);
                    System.out.println("Success");
                    return; // Exit the loop once the deposit is made
                }
            }
            System.out.println("Invalid password"); // Password not found
        }
        public void withdraw(String pass,double money)
        {
            for (int i = 0; i < stack.size(); i++)
            {
                client xx = stack.get(i);
                if (xx.pass.equals(pass)) // Use .equals() for String comparison
                {
                    xx.money -= money;
                    stack.set(i, xx);
                    System.out.println("Success");
                    return; // Exit the loop once the deposit is made
                }
            }
            System.out.println("Invalid password"); // Password not found

        }
        public void checking(String pas)
        {
            for (int i = 0; i < stack.size(); i++)
            {
                client xx = stack.get(i);
                if (xx.pass.equals(pas)) // Use .equals() for String comparison
                {
                    System.out.println("Your Name is: "+xx.name);
                    System.out.println("Your Password is : "+xx.pass);
                    System.out.println("Your Money : "+xx.money);
                    return; // Exit the loop once the deposit is made
                }

            }
            System.out.println("Invalid password"); // Password not found
        }

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



        ATM ob=new  ATM();
        while (true)
        {
            System.out.println("press 1 to create account");
            System.out.println("press 2 to deposit money");
            System.out.println("press 3 to withdraw money");
            System.out.println("press 4 to checking");
            System.out.println("press 5 to Exit");

            int x;
            x=sc.nextInt();
            sc.nextLine();
            switch (x)
            {
                case 1:

                    String name;
                    String pass;

                    System.out.println("Enter Your Name :");
                    name=sc.nextLine();
                    System.out.println("Enter Your Password");
                    pass=sc.nextLine();
                    client new_client = new client(name,pass);
                    ob.add(new_client);
                    break;
                case 2:
                    System.out.println("Enter Your Password");
                    String pas;
                    pas=sc.nextLine();
                    System.out.println("Enter the money");
                    double mo;
                    mo=sc.nextDouble();
                    ob.deposit(pas,mo);
                    break;
                case 3:
                    System.out.println("Enter Your Password");
                    String pa;
                    pa=sc.nextLine();
                    System.out.println("Enter the money");
                    double m;
                    m=sc.nextDouble();
                    ob.withdraw(pa,m);
                    break;
                case 4:
                    System.out.println("Enter Your Password");
                    String p;
                    p=sc.nextLine();
                    ob.checking(p);
                    break;
                case 5:
                    return;



            }




        }
    }
}