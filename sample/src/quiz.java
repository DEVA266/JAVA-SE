import java.util.Scanner;
public class quiz {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws InterruptedException {

        System.out.println("--------------------------");
        System.out.println("      `` QUIZ GAME ``     ");
        System.out.println("--------------------------");

        System.out.println("\nThere Are Totally 10 questions " );
        Thread.sleep(1500);
        System.out.println("\nYour game starts now ");



        String[] questions = {"1. What does CPU stand for in computer science?",
         "2. Which data structure uses the Last In, First Out (LIFO) principle?", 
         "3. What is the primary purpose of an operating system?", 
         "4. Which programming language is primarily used for web development?",
         "5. What does HTML stand for?",
         "6. What is the time complexity of binary search in the worst case?" ,
          "7. Which sorting algorithm is based on the divide-and-conquer principle?" , 
          "8. What is the primary function of DNS in computer networks?" , 
          "9. Which of the following is a NoSQL database?" , 
          "10. What is the purpose of a foreign key in a relational database?" };
        

        String[][] options = {
            {"1. Central Processing Unit","2. Computer Processing Unit","3. Central Programming Unit","4. Control Processing Unit"},
        {"1. Queue","2. Stack"," 3. Array","4. Linked List"},
        {"1. To manage hardware and software resources","2. To compile code","3. To connect to the internet","4. To store data"},
        {"1. Python","2. JavaScript","3. C++","4. Java"},
        {"1. HyperText Markup Language","2. HighText Machine Language","3. HyperText Machine Language","4. HighText Markup Language"},

        {"1. O(n)","2. O(log n)","3. O(n²)","4. O(1)"},
        {"1. Bubble Sort","2. Quick Sort","3. Insertion Sort","4. Selection Sort"},
        {"1. To encrypt data","2. To resolve domain names to IP addresses","3. To manage network traffic","4. To establish secure connections"},
        {"1. MySQL","2. PostgreSQL","3. MongoDB","4. Oracle Database"},
        {"1. To uniquely identify a record","2. To establish a relationship between tables","3. To store large amounts of data","4. To index the database"}
        };

        int[] answer = {1,2,1,2,1,2,2,2,3,2};
        int guess;
        int totalScore = 0;
        System.out.println("5 Questions : Level Easy\n");
        Thread.sleep(1000);
        for(int i=0; i<questions.length; i++){
            System.out.println("\n" + questions[i]);
            System.out.println();
            System.out.println("OPTIONS : ");
            for(String option : options[i]){
                System.out.println(option);
            }
            System.out.print("Choose one option : ");
            guess = scanner.nextInt();
            if (guess == answer[i]){
                System.out.println("----------------");
                System.out.println("Correct answer! ");
                System.out.println("----------------");
                totalScore++;
            }
            else{
                System.out.println("--------------");
                System.out.println("Wrong answer! ");
                System.out.println("--------------");
            }
            Thread.sleep(500);
        }
        System.out.println("\nQuiz Completed");
        System.out.println("You scored " + totalScore + " out of " + questions.length);
        System.out.println("Thank You!");
    }
}
