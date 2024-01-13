package ex2;

public class Stuttering {
    public static String stutter(String word) {

        String subWord = "";
        String allSentence = "";

        subWord = word.substring(0,2); //so

        allSentence = subWord+"... "+subWord+"... "+word+"?";

        return allSentence;
    }
}
