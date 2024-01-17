package ex18;

import java.util.ArrayList;

public class WarOfNumbers {
    public static int warOfNumbers(int[]numbers){

        int sumEven = 0;
        int sumOdd = 0;
        int result = 0;

        ArrayList<Integer> evenNumbers = new ArrayList<>(); // n%2 == 0
        ArrayList<Integer> oddNumbers = new ArrayList<>(); // n%2 != 0
        
        for(int i = 0; i<numbers.length; i++){
            if(numbers[i] % 2 == 0){
                evenNumbers.add(numbers[i]);
            } else {
                oddNumbers.add(numbers[i]);
            }
        }
        for(Integer i : evenNumbers){
            sumEven += i;
        }

        for(Integer i : oddNumbers){
            sumOdd += i;
        }

        result = Math.abs(sumOdd - sumEven);

        return result;

    }

}
