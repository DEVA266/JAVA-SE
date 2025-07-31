import java.util.Scanner;

public class Generator {
    // this mainFunction is going to be run on the first iteration
    // this mainFunction contains all those necessary code
    Alphabet alphabet;
    Password password;
    private int length;

    public Generator() {
        this.length = 0;
    }

    public boolean mainFunction(){
        //printing choices
        Scanner scanner = new Scanner(System.in);
        this.choice();
        // getting input from the user
        int option = scanner.nextInt();

        switch (option){
            case 1 : {
                String generatedPassword = this.combinationPassword();
                String realPassword = this.passwordGenerator(generatedPassword,this.length);
                System.out.println();
                System.out.println("Your Password is generated Successfully : " + realPassword);
                return true;
            }

            case 2 : {
                System.out.println();
                System.out.print("Enter Your Password : ");
                String userPassword = scanner.next();
                password = new Password(userPassword);
                password.strengthChecker();
                return true;
            }

            case 3 : {
                creatingTips();
                return true;
            }

            case 4 : {
                System.out.println("Exiting the Program !");
                System.out.println("Thank You!");
                return false;
            }

            default:{
                System.out.println("You entered a wrong option");
                return true;
            }
        }
    }

    private void choice(){
        System.out.println();
        System.out.println("-------WELCOME-------");
        System.out.println("1.Generate Password");
        System.out.println("2.Password Strength Checker ");
        System.out.println("3.Password Creating Tips");
        System.out.println("4.Exit");
        System.out.print("Choose one option : ");
    }

    private String combinationPassword(){
        boolean isUpperCase = false;
        boolean isLowerCase = false;
        boolean isNumber = false;
        boolean isSymbol = false;

        Scanner scanner = new Scanner(System.in);
        System.out.println();

        System.out.println("Requirements of Password to be Generated");
        System.out.println("Answer the Questions below : ");
        System.out.println();
        boolean loop = true;

        while(loop){
            System.out.print("Do you want Upper Case Alphabets (YES/NO) ? : ");
            String input = scanner.next();
            if(this.requirementChecking(input)){
                isUpperCase = true;
            }

            System.out.print("Do you want Lower Case Alphabets (YES/NO) ? : ");
            input = scanner.next();
            if(this.requirementChecking(input)){
                isLowerCase = true;
            }

            System.out.print("Do you want Numbers ? ");
            input = scanner.next();
            if(this.requirementChecking(input)){
                isNumber = true;
            }

            System.out.print("Do you want Symbols ? : ");
            input = scanner.next();
            if(this.requirementChecking(input)){
                isSymbol = true;
            }

            System.out.print("Great now enter the Length of the Password (8-15) : ");
            this.length = scanner.nextInt();
            if(!(length>=8 && length<16)){
                if(length>16){
                    System.out.println();
                    System.out.println("The value You entered is too large !");
                    System.out.println("Length set to 10 !");
                    this.length = 10;
                }
                else{
                    System.out.println();
                    System.out.println("The value you entered is too small !");
                    System.out.println("Length set to 10 !");
                    this.length = 10;
                }
            }

            if(!(isUpperCase || isLowerCase || isNumber || isSymbol )){
                System.out.println();
                System.out.println("Please select at Least one Requirement to generate the Password !");
            }
            else {
                loop = false;
            }
        }
        alphabet = new Alphabet(isUpperCase,isLowerCase,isNumber,isSymbol);
        return alphabet.getAlphabet();
    }

    private boolean requirementChecking(String input){
        if(input.equalsIgnoreCase("yes")){
            return true;
        } else if (input.equalsIgnoreCase("no")) {
            return false;
        }
        else {
            System.out.println();
            System.out.println("You entered Wrong word !");
            System.out.println("The answer for this Question is Set As \"YES\" ");
            System.out.println();
            return true;
        }
    }

    private String passwordGenerator(String values,int length){
        int range = values.length()-1;
        StringBuilder password = new StringBuilder();
        for(int i=0; i<length; i++){
            int index = (int) (Math.random() * (double)range);
            password.append(values.charAt(index));
        }
        return password.toString();
    }

    private void creatingTips(){
        System.out.println();
        System.out.println("Tips for more Secured Password ");
        System.out.println("Your Password must contain at least one Uppercase and one Lowercase Alphabet ");
        System.out.println("It should contain at least one number and one Symbol (special character) ");
        System.out.println("The length of the Password must be Greater than 7 and Should less than 16");
        System.out.println();
        System.out.println("Use of Password Generator to Check your Password Strength ");
        System.out.println("Thank you!");
        System.out.println();
    }
}
