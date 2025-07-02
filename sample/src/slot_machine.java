import java.util.Random;
import java.util.Scanner;   
// Slot Machine Game in Java
// This is a simple slot machine game where the player can spin the slots and try to win        
public class slot_machine {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        int balance;
        int bet = 0;
        String[] symbols = {"♠️","♣️","♥️","♦️","⭐"};
        boolean isRunning = true;
        String[] row ;
        int winningPrize = 0 ;
        String nextRound;

        System.out.println("--------------------------");
        System.out.println("  JAVA SLOT MACHINE GAME  ");
        System.out.println("--------------------------");

        System.out.println();
        System.out.println("Welcome To The Game !");
        System.out.println("Let's Test Your Luck Here ");
        System.out.println("\nThe Available Symbols are : ");
        
        for(String object : symbols){
            System.out.print(object + " ");
        }

        // System.out.println("\n\nInsufficient Fund In Your Wallet ");
        System.out.print("\n\nEnter The amount to be added in Wallet  : ");
        balance = scanner.nextInt();
        scanner.nextLine();

        while(isRunning){

            System.out.println("\nWallet Balance : " + balance);

            System.out.print("Enter The Bet amount : ");
            bet = scanner.nextInt();
            scanner.nextLine();

            if(bet>balance){
                System.out.println("\nInsufficient Funds in Your Wallet ");
                System.out.println("Add Funds in Your Wallet to continue ");
                System.out.print("\nEnter The amount to be added : ");
                balance = scanner.nextInt();
                scanner.nextLine();
                // System.out.println("Wallet Balance : " + balance);
                continue;
            }

            if (bet<=0) {
                System.out.println("Bet Amount Wants to be greater than zero !");
                continue;
            }
            else{
                balance -= bet;
            }

            row = symbolRow(symbols);
            System.out.println();
            System.out.println("Your Slot is Here !");
            System.out.println(" " + String.join(" | ",row));
            System.out.println();

            winningPrize = winningMoney(row, bet);
            System.out.println("Your Winning Prize : " + winningPrize);
            balance += winningPrize;

            System.out.println("\nTotal Wallet Balance : " + balance);

            System.out.print("\nDo you want to continue (Y/N) : ");
            nextRound = scanner.nextLine().toUpperCase();

            if(nextRound.equals("Y")){
                continue;
            }
            else if(nextRound.equals("N")){
                isRunning = false;
            }
            else{
                System.out.println("Enter a valid Answer !");
                continue;
            }
        }
    }

    static String[] symbolRow(String[] symbols){
        Random random = new Random();
        String[] answer = new String[3];
        for(int i=0; i<answer.length; i++){
            answer[i] = symbols[random.nextInt(symbols.length)];
        }
        return answer;
    }

    static int winningMoney(String[] row,int bet){

        // {"♠️","♣️","♥️","♦️","⭐"}

        if ((row[0].equals(row[1])) && (row[1].equals(row[2]))) {

            if(row[0].equals("♠️")){
                return bet*6;
            }
            else if(row[0].equals("♣️")){
                return bet*7;
            }
            else if(row[0].equals("♥️")){
                return bet*8;
            }
            else if(row[0].equals("♦️")){
                return bet*9;
            }
            else if(row[0].equals("⭐")){
                return bet*10;
            }
        }

        else if((row[0].equals(row[1])) || row[1].equals(row[2]) ){

            if(row[1].equals("♠️")){
                return bet*2;
            }
            else if(row[1].equals("♣️")){
                return bet*2;
            }
            else if(row[1].equals("♥️")){
                return bet*3;
            }
            else if(row[1].equals("♦️")){
                return bet*3;
            }
            else if(row[1].equals("⭐")){
                return bet*5;
            }
        }
        else {
            return 0;
        }
        return 0;
    }
}
