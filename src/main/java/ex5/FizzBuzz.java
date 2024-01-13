package ex5;

public class FizzBuzz{
    public static String fizzBuzz(int n) {

        Integer diffN = n;

        if((n%3 == 0)&&(n%5 == 0)){
            return "FizzBuzz";
        } else if (n%5 == 0){
            return "Buzz";
        } else if (n%3 == 0) {
            return "Fizz";
        } else{
            return diffN.toString(n);
        }
    }
}
