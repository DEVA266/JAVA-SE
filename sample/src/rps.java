import java.util.Scanner;
import java.util.Random;

public class rps {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        double computerGuess = random.nextDouble(0,1);
        String computerChoice ;
        boolean isRunning = true;
        String userChoice ;
        int win=0,loss=0,tie=0;
        String nextround;

        // System.out.println(computerGuess);
        // Determine computer's choice based on the random number
        if(computerGuess <= 1/3){
            computerChoice = "rock";
        }
        else if (computerGuess <= 2/3){
            computerChoice = "scissors";
        }
        else {
            computerChoice = "paper";
        }
        
        System.out.println("Rock Paper Scissor Game");
        System.out.println();
    
        while (isRunning) {
            System.out.print("Enter Your Choice (rock,paper,scissors) : ");
            userChoice = scanner.nextLine().toLowerCase();
            
            if(userChoice.equals("rock")){
                if(computerChoice.equals("scissors")){
                    System.out.println("\nYour Guess : " + userChoice);
                    System.out.println("Computer Guess : " + computerChoice);
                    System.out.println("You Won The Game !");
                    win++;
                }
                else if(computerChoice.equals("rock")){
                    System.out.println("\nYour Guess : " + userChoice);
                    System.out.println("Computer Guess : " + computerChoice);
                    System.out.println("Match Tie");
                    tie++;
                }
                else{
                    System.out.println("\nYour Guess : " + userChoice);
                    System.out.println("Computer Guess : " + computerChoice);
                    System.out.println("You Loss The Game !");
                    loss++;
                }
            }

            if(userChoice.equals("scissors")){
                if(computerChoice.equals("paper")){
                    System.out.println("\nYour Guess : " + userChoice);
                    System.out.println("Computer Guess : " + computerChoice);
                    System.out.println("You Won The Game !");
                    win++;
                }
                else if(computerChoice.equals("scissors")){
                    System.out.println("\nYour Guess : " + userChoice);
                    System.out.println("Computer Guess : " + computerChoice);
                    System.out.println("Match Tie !");
                    tie++;
                }
                else{
                    System.out.println("\nYour Guess : " + userChoice);
                    System.out.println("Computer Guess : " + computerChoice);
                    System.out.println("You Loss The Game !");
                    loss++;
                }
            }

            if(userChoice.equals("paper")){
                if(computerChoice.equals("rock")){
                    System.out.println("\nYour Guess : " + userChoice);
                    System.out.println("Computer Guess : " + computerChoice);
                    System.out.println("You Won The Game !");
                    win++;
                }
                else if(computerChoice.equals("paper")){
                    System.out.println("\nYour Guess : " + userChoice);
                    System.out.println("Computer Guess : " + computerChoice);
                    System.out.println("Match Tie !");
                    tie++;
                }
                else{
                    System.out.println("\nYour Guess : " + userChoice);
                    System.out.println("Computer Guess : " + computerChoice);
                    System.out.println("You Loss The Game!");
                    loss++;
                }
            }
            else{
                System.out.println("\nInvalid Input! Please enter rock, paper, or scissors.");
                continue;
            }

            System.out.print("Do you Want to Continue (Yes/No) : ");
            nextround = scanner.nextLine().toLowerCase();
            if(nextround.equals("no")){
                isRunning = false;
            }   
        
        }
        System.out.println("\nGame Over");
        

        if(win > loss){
            System.out.println("\nYou are the Winner of the Game!");
        }
        else if(loss > win){
            System.out.println("\nYou are the Loser of the Game!");
        }
        else{
            System.out.println("\nMatch Tie!");
        }
        System.out.println("Thank you for playing!");
        System.out.println("Exiting the game...");


        scanner.close();
    }
}
