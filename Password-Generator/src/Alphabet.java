
public class Alphabet {
    // declaring all those needed required information
    public  final String upperAlphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public  final String lowerAlphabet = upperAlphabet.toLowerCase();
    public  final String numbers = "1234567890";
    public  final String symbols = "!@#$%^&*()?><?,.';\"][}{/";

    //creating a new StringBuilder for storing a new Password
    private final StringBuilder answer = new StringBuilder();

    Alphabet(){
    }

    public Alphabet (boolean isUpper, boolean isLower, boolean isNumber, boolean isSymbol){
        if(isUpper){
            answer.append(upperAlphabet);
        }
        if(isLower){
            answer.append(lowerAlphabet);
        }
        if(isNumber){
            answer.append(numbers);
        }
        if(isSymbol){
            answer.append(symbols);
        }
    }

    public String getAlphabet(){
        return answer.toString();
    }
}
