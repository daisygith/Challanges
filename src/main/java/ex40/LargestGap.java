package ex40;

import java.util.Arrays;

public class LargestGap {
    public static int largestGap(int[] numbers) {
        int sum = 0;

        Arrays.sort(numbers);
        for (int i = 0; i<=numbers.length-2; i++){
            if(sum > (numbers[i+1]-numbers[i]) ){
                sum = sum;
            } else {
                sum = numbers[i+1]-numbers[i];
            }
        }
        return sum;

    }
}
