package otherExample.recursive.ex4;

public class Palindrome {

    public static boolean isPalRec(String word, int a, int b){

        if(a==b){
            return true;
        }

        if((word.charAt(a)) != (word.charAt(b))){
            return false;
        }

        if(a < b + 1){
            return isPalRec(word, a+1, b-1);
        }

        return true;


    }

    public static boolean isPalindrome(String word){

        int n = word.length();

        if(n == 0){
            return true;

        }
        return isPalRec(word, 0, n-1);
    }

    public static void main(String[] args){

        String word = "aka";

        if(isPalindrome(word)){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}
