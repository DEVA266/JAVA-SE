import java.util.Scanner;
import java.util.Random;

public class demo {
    public static void main(String[] args) {
        demojet();
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

    public static void switch_use(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the day : ");
        String day = input.nextLine();
        switch (day) {
            case "Monday","Tuesday","Wednesday","Thrusday","Friday" -> System.out.println("Its Weekday ");
            case "Saturday" , "Sunday" -> System.out.println("Its weekend !");
            default -> System.out.printf("%s is not a day",day);
        }
        input.close();
    }

    public static void username_validator(String[] args) {
        Scanner s = new Scanner(System.in);

        String userName ;
        System.out.print("Enter Your new useername : ");
        userName = s.nextLine();

        if(userName.length() < 4 || userName.length() > 12){
            System.out.println("Invalid username !");
            System.out.println("Username must be between 4-12 characters");
        }
        else if (userName.contains(" ") || userName.contains("_")){
            System.out.println("Invalid username !");
            System.out.println("Username must not contain spaces and underscore ");
        }
        else {
            System.out.printf("Welcome %s",userName);
        }
        s.close();
    }

    public static void Basic_Calculator(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean valid = true;

        double result = 0;
        System.out.print("Enter the first number : ");
        double num1 = input.nextDouble();
        
        System.out.print("Enter the operator (+,-,*,/,^) : ");
        char operator = input.next().charAt(0);

        System.out.print("Enter the second number : ");
        double num2 = input.nextDouble();

        switch (operator) {
            case '+' -> result = num1+num2;
            case '-' -> result = num1-num2;
            case '*' -> result = num1*num2;
            case '^' -> result = Math.pow(num1, num2);
            case '/' -> {
                if(num2 == 0){
                    System.out.println("Cannot divided by zero !");
                    valid = false;
                }
                else{
                    result = num1/num2;
                }
            }
            default ->{
                System.out.println("Invalid operator !");
                valid = false;}
        }
        if(valid){
            System.out.println("Result = "+result);
        }
        input.close();
    }

    public static void number_guessing_game(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int userGuess = 0;

        System.out.println("Number guessing game : ");
        System.out.print("Guess a number between 1 to 100 : ");
        userGuess = scanner.nextInt();
        int computerGuess = random.nextInt(1,100);
        int count = 0;

        while(userGuess!=computerGuess){
            count += 1;
            if(userGuess>computerGuess){
                System.out.println("Too High!, Try Again");
            }
            else{
                System.out.println("Too Less!, Try Again");
            }
            System.out.print("Guess a number between 1 to 100 : ");
            userGuess = scanner.nextInt();
        }
        System.out.println("\nCongratualtions");
        System.out.printf("The number computer guessed is %d and the number you guessed is %d \n",computerGuess,userGuess);
        if(count == 0){
            System.out.println("You Won the Game !");
        }
        else{
            System.out.printf("You Won the Game after %d trail,But still you are good !",count+1);
        }
        scanner.close();   
    }

    public static void countDown(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Countdown time ! ");
        System.out.print("Enter total no of seconds : ");
        System.out.println("Enter the message to be displayed the countdown : ");
        String message = scanner.nextLine();
        int seconds = scanner.nextInt();
        System.out.println("The Count Down starts now !");
        for(int i = seconds ; i > 0 ; i--){
            System.out.println(i);
            Thread.sleep(1000);
        }
        System.out.println(message);

        scanner.close();
    }

    public static void matrix(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the no of rows : ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns : ");
        int col = scanner.nextInt();
        System.out.print("Enter the character to be printed : ");
        String c = scanner.next();
        
        for(int i = 0;i<rows;i++){
            for(int j = 0; j<col;j++){
                System.out.print(c+" ");
            }
            System.out.println();
        }

        scanner.close();
    }

    public static void license_verification(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter User age : ");
        int age = scanner.nextInt();
        System.out.println(ageVerification(age));
        scanner.close();
    }
    static String ageVerification(int age){
        if(age<0){
            return "Age Invalid !";
        }
        else if (age < 18){
            return "Not Eligible for License ";
        }
        else{
            return "Eligible for License";
        }
    }

    public static void average(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the total no of num to find average : ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];

        for(int i=0;i<size;i++){
            System.out.print("Enter the number : ");
            numbers[i] = scanner.nextInt();
        }
        System.out.print("The Average of the numbers are : " + averageFinder(numbers));

        scanner.close();

    }
    static int averageFinder(int... numbers){
        int sum = 0;
        for(int num : numbers){
            sum += num;
        }
        return sum;
    }
    public static void demojet(){
        System.out.println("Modified in Vs code");
    }
}
