package ex20;

public class ArraySum {
    public static int sum(int[] arr) {

        int sum = 0;

        for(Integer i : arr){
            sum +=i;
        }
        return sum;

    }
}
