import java.util.Scanner;
import java.util.Random;

public class projects { 
    public static void main(String[] args){
        Random_numbers(args);
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

    }
}
