import java.util.Scanner;
import java.util.Random;

public class projects { 
    public static void main(String[] args){
        username_password(args);
    }

    public static void Rectangle(String[] args) {
        
        double length,breadth,area = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Length of the Rectangle :  ");
        length = input.nextDouble();
        input.nextLine();

        System.out.print("Enter the Breadth of the Rectangle :  ");
        breadth = input.nextDouble();
        // input.nextLine();

        area = length*breadth;
        System.out.println("The area of the Rectangle : " + area);
        input.close();

    }

    public static void mid_labs(String[] args) {
        Scanner input = new Scanner(System.in);
        String adjective1,adjective2,noun,verb,adjective3;

        System.out.print("Enter an Adjective (description) : ");
        adjective1 = input.nextLine();

        System.out.print("Enter a Noun (animal or person) : ");
        noun = input.nextLine();

        System.out.print("Enter an Adjective (description) : ");
        adjective2 = input.nextLine();

        System.out.print("Enter a verb (action word) : ");
        verb = input.nextLine();

        System.out.print("Enter an Adjective (description) : ");
        adjective3 = input.nextLine();

        System.out.println("Today i went to a " + adjective1 + " zoo\n" + "In exhibit, i saw a " + noun + ".\n" + noun + " was " + adjective2 + " and " + verb + " !\n" + "I was " + adjective3 + "!");

        input.close();

    }

    public static void shopping_cart(String[] args) {
        Scanner i = new Scanner(System.in);
        
        System.out.print("what item would you to like to buy ? ");
        String item_name = i.nextLine();

        System.out.print("What is the price of each ? ");
        float price = i.nextFloat();
        i.nextLine();

        System.out.print("How many would to like to buy ? ");
        int quantity = i.nextInt();
        i.nextLine();

        System.out.println("\nYou have bought " + quantity + " " + item_name );
        System.out.println("The total price was : $" + price*quantity);

        i.close();
    }

    public static void Random_numbers(String[] args) {
        Random random = new Random();
        int num1,num2,num3;
        num1 = random.nextInt(1,101);
        num2 = random.nextInt(1,101);
        num3 = random.nextInt(1,101);

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);

        // the nextdouble method is used to generate a number between 0 to 1 , inbetween floating points
        double number1 = random.nextDouble();
        System.out.println(number1);

        boolean isName = random.nextBoolean();
        System.out.println(isName);

    }

    public static void Sphere(String[] args) {
        Scanner i = new Scanner(System.in);

        System.out.println("What would you like to calculate : ");
        System.out.println("1.Area");
        System.out.println("2.Volume");
        System.out.println("3.Circumference");
        System.out.println("4.All");
        System.out.println("Enter The option number : ");
        int option = i.nextInt();
        i.nextLine();

        System.out.println("Enter the Radius of the Sphere : ");
        double radius = i.nextDouble();

        // radius checking 
        if (radius==0){
            System.out.println("Please enter a valid radius ");
        }
        else {
            // calculating 
            double area,circumference,volume;
            area = (Math.PI * Math.pow(radius,2));
            volume = (4.0/3.0) * Math.PI * Math.pow(radius,3);
            circumference = 2*Math.PI*radius;

            if (option == 1){
                System.out.println("The Area of the Sphere: " + area);
            }

            else if (option == 2 ){
                System.out.println("The Volume of the sphere: " + volume);
            }

            else if (option == 3 ) {
                System.out.println("The Cirucumference of the Sphere: " + circumference);
            }

            else if (option == 4 ){
                System.out.println("The Area of the Sphere: " + area);
                System.out.println("The Volume of the sphere: " + volume);
                System.out.println("The Cirucumference of the Sphere: " + circumference);
            }

            else {
                System.out.println("You entered a wrong option : ");
            }

        }

        i.close();
    }

    public static void format(String[] args) {
        
        // the format operator is used to print the values in between strings
        String name = "Deva";
        int age = 18;
        double mark = 7.958850;
        boolean isstudent = true;
        char section = 'A';

        System.out.printf("%s is %d years old \nHe scored an cgpa of %.2f in the Semester \nIs Deva a KPRIET Student ? %b \nHe is Student of CSE section %c \n\n\n\n",name,age,mark,isstudent,section);

        // format operator for numbers and signs
        double num1 = 101.3456;
        double num2 = 7896473558.344;
        double num3 = -49.568;

        // + add for postive and - for negative
        // , group the numbers 
        // ( = the negatives are enclosed in the brackets
        // space =  gives space for postive and minus for negatives

        System.out.printf("%+.2f \n%+.2f \n%+.2f \n\n\n",num1,num2,num3);

        System.out.printf("%,.2f \n%,.2f \n%,.2f \n\n\n",num1,num2,num3);

        System.out.printf("%(.2f \n%(.2f \n%(.2f \n\n\n",num1,num2,num3);

        System.out.printf("% .2f \n% .2f \n% .2f \n\n\n",num1,num2,num3);
    }

    public static void compound_intrest(String[] args) {
        
        Scanner input = new Scanner(System.in);
        double principle_amount,total_amount,intrest,times_compound,years;

        System.out.print("Enter the principle amount : ");
        principle_amount = input.nextDouble();
        input.nextLine();

        System.out.print("Enter the amount of Interest per year (in %): ");
        intrest = input.nextDouble()/100;
        input.nextLine();

        System.out.print("Enter the time the amount compounded per year : ");
        times_compound = input.nextDouble();
        input.nextLine();

        System.out.print("Enter the total no of years : ");
        years = input.nextDouble();
        input.nextLine();

        total_amount = principle_amount * Math.pow((1+intrest/times_compound),(times_compound*years));

        System.out.printf("The Total amount after %.1f years = %,.2f$",years,total_amount);
        input.close();
    }

    public static void username_password(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Email Id : ");
        String email = input.nextLine();

        String username = email.substring(0,email.indexOf("@"));
        String domain = email.substring(email.indexOf("@")+1);

        System.out.println("Your username : " + username);
        System.out.println("Your domain : " + domain);
    }
}
