import java.util.Random;
public class Words {
    private String [] strings;
    public Words(){
        strings = new String[5];
        strings[0]="hello";
        strings[1]="hey";
        strings[2]="there";
        strings[3]="cow";
        strings[4]="pig";
    }
    public String pickRandomWord(){
        Random random = new Random();
        int index = random.nextInt(strings.length-1);
        return strings[index];
    }
    public String [] getStrings(){
        return strings;
    }
}
