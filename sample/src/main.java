import java.util.Scanner;

public class main {
    public static void main (String[] args){
        /* int age = 18;
        String name = "Deva";
        String email = "24cs043@kpriet.ac.in";
        String college_name = "KPRIET";

        System.out.println("Hello " + name);
        System.out.println("We are proudly welcoming you to our college " + college_name);
        System.out.println("Your official mail ID is : " + email);
        */
        
        Scanner s = new Scanner(System.in);
        System.out.print("enter your name : ");
        String name = s.nextLine();
        System.out.println("Enter your age : ");
        int age = s.nextInt();
        System.out.println("Enter your CGPA : "); 
        double cgpa = s.nextDouble();
        System.out.println("Are you a student (true/false) : ");
        boolean isstudent = s.nextBoolean();

        System.out.println("Hello Mr." + name + "\n You are " + age + " years old \n" + "Your CGPA is : " + cgpa + "\n you are a student : " + isstudent );

        s.close();
    }
    
}
