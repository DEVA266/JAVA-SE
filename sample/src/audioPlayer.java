import javax.sound.sampled.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class audioPlayer {
    public static void main(String[] args) {
        String filepath = "C:\\Users\\Admin\\Downloads\\maranam.wav";
        File file = new File(filepath);

        try(Scanner scanner = new Scanner(System.in); AudioInputStream audioStream = AudioSystem.getAudioInputStream(file)){
            System.out.println("Welcome to Audio Player !\n Today's Song is : Maranam\n");

            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);

            String userChoice = "";
            while(!userChoice.equals("Q")){
                System.out.println("P : Play");
                System.out.println("S : Stop");
                System.out.println("R : Restart");
                System.out.println("Q : Quit");
                System.out.print("Enter your choice : ");
                userChoice = scanner.nextLine().toUpperCase();

                switch(userChoice){
                    case "P":
                        clip.start();
                        break;
                    case "S":
                        clip.stop();
                        break;
                    case "R":
                        clip.setMicrosecondPosition(0);
                }
            }

        }
        catch (FileNotFoundException e){
            System.out.println("The file is not found !");
        }
        catch(UnsupportedAudioFileException e){
            System.out.println("The file format is not supported !");
        }
        catch (IOException e){
            System.out.println("The file IO is not matched !");
        } catch (LineUnavailableException e) {
            throw new RuntimeException(e);
        }
        catch (RuntimeException e){
            System.out.println("Something went wrong");
        }

    }
}
