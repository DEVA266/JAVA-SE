import java.util.Scanner;
public class bank {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        boolean running = true;
        double balance = 0;
        int choice;
        
        while(running){
        System.out.println("\n-------------------------");
        System.out.println(" Online Banking Program  ");
        System.out.println("-------------------------");
        System.out.println();

        System.out.println("1.Show Balance");
        System.out.println("2.Deposit");
        System.out.println("3.Withdraw Amount");
        System.out.println("4.Exit");
        System.out.println("-------------------------");
        System.out.println();

        System.out.print("Enter your choice between(1-4) : ");
        choice = scanner.nextInt();

            switch (choice) {
                case 1 : {
                    showBalance(balance);
                    break ; 
                }

                case 2 : {
                    balance = depositAmount(balance);
                    
                    break;
                }

                case 3 : {
                    balance = withdramAmount(balance);
                    break;
                }
                case 4 : {
                    System.out.println("\nExiting The Process !");
                    System.out.println("Thank You");
                    System.out.println("Welcome");
                    running = false;
                    break;
                }
        
            default:{
                System.out.println("\nInvalid Choice");
                break;
            }
            }
        }
    }

    static void showBalance(double balance){
        System.out.println("\nAccount Balance ");
        System.out.printf("$%.2f",balance);
    }

    static double depositAmount(double balance){
        double amount ;
        System.out.println("\nDeposting Amount ");
        System.out.print("Enter the Amount to be Added : ");
        amount = scanner.nextDouble();
        if(amount <= 0){
            System.out.println("Invalid operation !");
            return 0;
        }
        else{
            balance += amount;
            System.out.println("\nThe Amount Added Successfully !");
            System.out.printf("Balance : $%.2f",balance);
            return balance;
        }   
    }

    static double withdramAmount(double balance){
        double withdramAmount;
        System.out.print("\nEnter the Amount to Be withdraw : ");
        withdramAmount = scanner.nextDouble();
        if(withdramAmount > balance) {
            System.out.println("\nInsufficient Funds");
            return 0 ;
        }
        else{
            balance -= withdramAmount;
            System.out.println("\nAmount Withdrawn successfully ");
            System.out.printf("Balance : $%.2f",balance);
            return balance;
        }
    }
}
