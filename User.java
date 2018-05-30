import java.util.ArrayList;
public class User {
    private String name;
    private int numOfGuesses;
    private ArrayList<Character> wrongGuesses;
    private ArrayList<Character> correctGuesses;
    public User(){
        name = "Bob";
        numOfGuesses=10;
        wrongGuesses=new ArrayList<Character>();
        correctGuesses=new ArrayList<Character>();
    }
    public void changeName(String name){
        this.name=name;
    }
    public void wrongGuess(char chars){
        wrongGuesses.add(chars);
        numOfGuesses-=1;
    }
    public void correctGuess(char chars){
        correctGuesses.add(chars);
    }
    public int getNumOfGuesses(){
        return numOfGuesses;
    }

    public ArrayList<Character> getCorrectGuesses() {
        return correctGuesses;
    }

    public void displayMessage(){
        String string = "";

        for(int i = 0;i<wrongGuesses.size();i++){
            string+=wrongGuesses.get(i)+",";
        }
        System.out.println("Hi "+name+", You have "+numOfGuesses+" remaining.");
        System.out.println("Your incorrect guesses are:"+string);
        System.out.println("Guess another letter!");
    }
}
