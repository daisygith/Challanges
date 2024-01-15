package ex10;

public class ReformWord {
    public static String getWord(String left, String right) {

        String letter = "";
        String bigLetter = "";
        String restWord ="";

        String allWord = "";

        int sizeLest = left.length();

        letter = left.substring(0,1); // first letter
        restWord = left.substring(1,sizeLest); // rest of left word

        bigLetter = letter.toUpperCase();

        allWord = bigLetter+restWord+right; // all word = left + right

        return allWord;

    }
}
