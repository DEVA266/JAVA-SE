import java.util.Scanner;

public class rectangle {
    public static void main(String[] args){

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
}
