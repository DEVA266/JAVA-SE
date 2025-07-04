import java.util.Scanner;
import java.util.Random;

public class rps {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean isRunning = true;
        int win = 0, loss = 0, tie = 0;

        String[] choices = { "rock", "paper", "scissors" };

        System.out.println("Rock Paper Scissor Game\n");

        while (isRunning) {
            // Generate computer's choice each round
            String computerChoice = choices[random.nextInt(1, 4)];

            System.out.print("Enter Your Choice (rock, paper, scissors): ");
            String userChoice = scanner.nextLine().trim().toLowerCase();

            if (!userChoice.equals("rock") && !userChoice.equals("paper") && !userChoice.equals("scissors")) {
                System.out.println("Your input is invalid. Please enter rock, paper, or scissors.");
                continue;
            }

            System.out.println("\nYour Guess : " + userChoice);
            System.out.println("Computer Guess : " + computerChoice);

            if (userChoice.equals(computerChoice)) {
                System.out.println("Match Tie!");
                tie++;
            }
            else if ((userChoice.equals("rock") && computerChoice.equals("scissors")) ||
                    (userChoice.equals("scissors") && computerChoice.equals("paper")) ||
                    (userChoice.equals("paper") && computerChoice.equals("rock"))) {
                System.out.println("You Won The Game!");
                win++;
            } 
            else {
                System.out.println("You Lost The Game!");
                loss++;
            }

            System.out.print("Do you Want to Continue (Yes/No): ");
            String nextround = scanner.nextLine().trim().toLowerCase();
            if (nextround.equals("no")) {
                isRunning = false;
            }
        }

        System.out.println("\nGame Over");
        System.out.printf("Won : %d\nLoss : %d\nTie : %d\n", win, loss, tie);
        System.out.println("Thank you for playing!");
        System.out.println("Exiting the game...");
        scanner.close();
    }
}
