package otherExample.recursive.ex10;

public class StringLengthCalculator {

    public static int calculatorString(String word) {

        if(word.isEmpty()){
            return 0;
        }

        return 1 + calculatorString(word.substring(1));

    }

    public static void main(String[] args) {
        String str = "Geeks for Geeks";

        int length = calculatorString(str);

        System.out.println(length);
    }
}
