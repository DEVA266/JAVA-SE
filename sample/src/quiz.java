import java.util.Scanner;
public class quiz {
    public static void main(String[] args) {
        weight_converter(args);
    }

    public static void weight_converter(String[] args) {
        Scanner input = new Scanner(System.in);

        int option;
        double lb;
        double kg;

        System.out.println("Weight Conversion Program".toUpperCase());
        System.out.println("1.Convert lb to kg ");
        System.out.println("2.Convert kg to lb ");
        System.out.print("Choose an option : ");
        option = input.nextInt();
        input.nextLine();

        if (option == 1) {
            System.out.print("Enter the weight in lb : ");
            lb = input.nextDouble();
            input.nextLine();

            kg = lb * 0.453592;
            System.out.printf("%.3f lbs = %.3f kg", lb, kg);
        } else if (option == 2) {
            System.out.print("Enter the Weight in kg : ");
            kg = input.nextDouble();
            input.nextLine();

            lb = kg * 2.20462;
            System.out.printf("%.3f kg = %.3f lb ", kg, lb);
        } else {
            System.out.println("Enter a Valid option !");
        }

        input.close();
    }
}
