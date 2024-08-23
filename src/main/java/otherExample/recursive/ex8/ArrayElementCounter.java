package otherExample.recursive.ex8;

public class ArrayElementCounter {

    public static <T> int countNum(T[] arr, int target) {
        return countNum(arr,target,0);
    }

    public static <T> int countNum(T[] arr, int target, int i) {
        if (i == arr.length) {
            return 0;
        }

        int count = countNum(arr, target, i + 1);
        if (arr[i].equals(target)) {
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Integer[] numbers = {
                10,
                20,
                30,
                40,
                20,
                50,
                20,
                60
        };
        int target = 20;
        int occurrences = countNum(numbers, target);
        System.out.println("The number of occurrences of " + target + " in the array is: " + occurrences);
    }
    }
