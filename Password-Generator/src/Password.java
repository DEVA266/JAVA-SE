public class Password {
    String userPassword;
    int userPasswordLength;
    int passwordScore;
    Alphabet alphabet = new Alphabet();

    Password(String value){
        this.userPassword = value;
        this.userPasswordLength = value.length();
        this.passwordScore = 0;
    }

    public void strengthChecker(){
        for(int i = 0; i<this.userPasswordLength; i++){
            String currentElement =  String.valueOf(this.userPassword.charAt(i));
            if(alphabet.upperAlphabet.contains(currentElement)){
                this.passwordScore++;
            }
            if(alphabet.lowerAlphabet.contains(currentElement)){
                this.passwordScore++;
            }
            if(alphabet.numbers.contains(currentElement)){
                this.passwordScore++;
            }
            if(alphabet.numbers.contains(currentElement)){
                this.passwordScore++;
            }
            if(this.userPasswordLength > 8 && this.userPasswordLength < 16){
                this.passwordScore++;
            }
        }
        ScoreCalculator(this.passwordScore);
    }

    private void ScoreCalculator(int score){
        if(score==5){
            System.out.println("You Have a Very Secure Password ! ");
        }
        else if(score>=3){
            System.out.println("You have a Strong Password, But it needs some improvement");
        }
        else if(score==2){
            System.out.println("Passwords needs more security !");
        }
        else{
            System.out.println("Your Password is very weak, change it for better security !");
        }
    }
}
