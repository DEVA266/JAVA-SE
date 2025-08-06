package org.example;
import java.util.*;
import java.util.Scanner;

public class LoginDetails {
    //creating object for those classes in the user selecting option
    OldUser oldUser = new OldUser();
    NewUser newUser = new NewUser();
    BankAdmin admin = new BankAdmin();

    // getting input from the user
    Scanner scanner = new Scanner(System.in);

    public void mainFunction(){
        //calling the staring gesture
        startingGesture();
        //getting option form the user
        int userOption = scanner.nextInt();
        //calling the based on the user option
        loginType(userOption);
    }

    private void startingGesture(){
        System.out.println("----- WELCOME -----");
        System.out.println();
        System.out.println("Choose Login : ");
        System.out.println("1. Account Holder");
        System.out.println("2. Account Opening");
        System.out.println("3. Bank Administrator");
        System.out.println("4. Quit");
        System.out.print("Enter Your Option : ");
    }

    private void loginType(int userChoice){
        switch (userChoice){
            case 1 -> {
                
             }

            default -> {
                System.out.println("Invalid Option choose by the User !");
                mainFunction();
            }
        }
    }
}
