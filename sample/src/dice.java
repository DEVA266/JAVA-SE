import java.util.Scanner;
import java.util.Random;

public class dice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        boolean isRunning = true;
        int dice = 0;
        int diceTotal = 0 ;
        int dieNumber = 0;
        System.out.println("Dice Rolling Game \n");

        while(isRunning) {
            System.out.print("Enter the no of Dice to be rolled : ");
            dice = scanner.nextInt();

            if(dice > 0){
                for(int i=0; i<dice;i++){
                    dieNumber = random.nextInt(1,7);
                    diceTotal += dieNumber;
                    printDieShape(dieNumber);
                    System.out.println("You Rolled : " + dieNumber + "\n");
                }
                System.out.println("The Die Total = " + diceTotal);
            }

            else{
                System.out.println("The # dice must be greater than 0");
                break;
            }
            System.out.println("Enter the # die as 0 to EXIT !");
        }
        scanner.close();
    }    

    static void printDieShape(int dieNumber){
        String dice1 = """
                 ---------
                |         |
                |    ●    |
                |         |
                 ---------
        """;

        String dice2 = """
                 ---------
                | ●       |
                |         |
                |       ● |
                 ---------
        """;

        String dice3 = """
                 ---------
                | ●       |
                |    ●    |
                |       ● |
                 ---------
        """;

        String dice4 = """
                 ---------
                | ●     ● |
                |         |
                | ●     ● |
                 ---------
        """;

        String dice5 = """
                 ---------
                | ●     ● |
                |    ●    |
                | ●     ● |
                 ---------
        """;

        String dice6 = """
                 ---------
                | ●     ● |
                | ●     ● |
                | ●     ● |
                 ---------
        """;

        switch (dieNumber) {
            case 1 -> {
                System.out.print(dice1);
                break;
            }
            case 2 -> {
                System.out.print(dice2);
                break;
            }
            case 3 -> {
                System.out.print(dice3);
                break;
            }
            case 4 -> {
                System.out.print(dice4);
                break;
            }
            case 5 -> {
                System.out.print(dice5);
                break;
            }
            case 6 -> {
                System.out.print(dice6);
                break;
            }
            
            default -> {
                System.out.println("Invalid Number !");
                break;
            }
        }
    }
}
