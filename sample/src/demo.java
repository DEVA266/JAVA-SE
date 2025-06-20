import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        temperature_converter(args);
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

        if(option==1){
            System.out.print("Enter the weight in lb : ");
            lb = input.nextDouble();
            input.nextLine();

            kg = lb*0.453592;
            System.out.printf("%.3f lbs = %.3f kg",lb,kg);
        }

        else if (option == 2){
            System.out.print("Enter the Weight in kg : ");
            kg = input.nextDouble();
            input.nextLine();

            lb = kg * 2.20462;
            System.out.printf("%.3f kg = %.3f lb ",kg,lb);    
        }

        else{
            System.out.println("Enter a Valid option !");
        }

        input.close();
    }

    public static void temperature_converter(String[] args) {
        Scanner input = new Scanner(System.in);

        String option ;
        double temp ;

        System.out.print("Enter the Temperature : ");
        temp = input.nextDouble();
        input.nextLine();

        System.out.print("Convert to Celsius of Farhenheit (C or F) : ");
        option = input.nextLine();
        double new_temp = (option.equalsIgnoreCase("C")) ? ((temp-32)*5/9) : ((temp*9/5) + 32) ;
        System.out.printf("% .1f%s",new_temp,option.toUpperCase());
        input.close();
    }
}
