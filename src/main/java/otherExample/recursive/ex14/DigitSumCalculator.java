package otherExample.recursive.ex14;

public class DigitSumCalculator {

//    public static int sumDigit(int number){
//        return sumDigit(number,0);
//    }

    public static int sumDigit(int number) {

        if(number == 0){
            return 0;
        }

        return (number%10) + sumDigit(number/10);

    }

    public static void main(String[] args) {

        int number = 123456;
        int digitSum = sumDigit(number);
        System.out.println("The sum of the digits of " + number + " is: " + digitSum);
    }
}
