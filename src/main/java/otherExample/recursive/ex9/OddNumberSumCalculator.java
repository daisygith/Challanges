package otherExample.recursive.ex9;

public class OddNumberSumCalculator {

    public static int countNumber(int[]arr){
        return countNumber(arr,0);
    }

    public static int countNumber(int[]arr, int i){
        if(i==arr.length){
            return 0;
        }

        int count = countNumber(arr,i+1);
        if(arr[i]%2 != 0){
            count +=arr[i];
        }
        return count;
    }


    public static void main(String[] args) {
        int[] numbers = {
                1,
                2,
                3,
                4,
                5,
                6,
                7,
                8,
                9
        };
        int sum = countNumber(numbers);
        System.out.println("The sum of all odd numbers in the array is: " + sum);

    }

}
