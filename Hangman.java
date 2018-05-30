import java.util.Scanner;
import java.util.ArrayList;
public class Hangman {
    public static void main(String [] args){
        User user = new User();
        Words words = new Words();
        String actualWord = words.pickRandomWord();
        Scanner scanner = new Scanner(System.in);
        System.out.println("What's your name: ");
        String userName = scanner.nextLine();
        user.changeName(userName);
        boolean win = false;
        while(user.getNumOfGuesses()>0){
            String string="";

            for(int a = 0;a<actualWord.length();a++){
                int count = 0;
                for(int i = 0; i<user.getCorrectGuesses().size();i++){
                    if(actualWord.charAt(a)==user.getCorrectGuesses().get(i)){
                        string+=actualWord.charAt(a);
                        count++;
                        break;
                    }
                }
                if(count==0){
                    string+="_";
                }
            }
            if(string.equals(actualWord)){
                System.out.println("Game Over, You Win!");
                win=true;
                break;
            }
            System.out.println("Here's the word so far: "+string);
            user.displayMessage();
            String line = scanner.nextLine();
            char userGuess = line.charAt(0);
            int a = 0;
            for(int i = 0;i<actualWord.length();i++){
                if(actualWord.charAt(i)==userGuess){
                    System.out.println("Correct Guess!");
                    user.correctGuess(userGuess);
                    a++;
                    break;
                }
            }
            if(a==0){
                user.wrongGuess(userGuess);
            }


        }
        if(!win){
            System.out.println("Hold this L");
        }
    }
}
