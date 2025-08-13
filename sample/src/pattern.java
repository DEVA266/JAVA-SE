package src;
import java.util.Scanner;
public class pattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = scanner.nextInt();
        //first half of the triangle
        for(int i=1; i<=n; i++){
            // printing the left angle triangle
            //spaces
            for(int j=0; j<2*(n-i); j++){
                System.out.print(" ");
            }
            //numbers and dot
            for(int j=1; j<=i; j++){
                if(j%2!=0) System.out.print("1" + " ");
                else System.out.print("." + " ");
            }
            //printing right angle triangle
            for(int j=i; j>=1; j--){
                if(j%2!=0) System.out.print("1" + " ");
                else System.out.print("." + " ");
            }
            System.out.println();
        }
        //second half of the triangle
        for(int i=n; i>=1; i--){
            //spaces
            for(int j=2*(n-i); j>=1; j--){
                System.out.print(" ");
            }
            //numbers
            for(int j=1; j<=i; j++){
                if(j%2!=0) System.out.print("1" + " ");
                else System.out.print("." + " ");
            }
            //right angle
            for(int j=i; j>=1; j--){
                if(j%2!=0) System.out.print("1" + " ");
                else System.out.print("." + " ");
            }
            System.out.println();
        }
    }
}

