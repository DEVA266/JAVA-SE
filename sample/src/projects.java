import java.util.Scanner;

public class projects { 
    public static void main(String[] args){
        mid_labs(args);
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
}
