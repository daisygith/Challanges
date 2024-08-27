package otherExample.recursive.ex12;

public class ArrayMaxElementFinder {

    public static int arrayMaxFind(int[] arr){
        return arrayMaxFind(arr, 0);
    }

    public static int arrayMaxFind(int[] arr, int i){

        if(i==arr.length){
            return 0;
        }

        int max = arrayMaxFind(arr,i+1);

        if(arr[i] > max){
            max = arr[i];
        }

        return max;
    }


    public static void main(String[] args) {
        int[] array = {
                34,
                45,
                34,
                23,
                56,
                62,
                27,
                55
        };

        int max = arrayMaxFind(array);
        System.out.println("max for array1 = " + max);

        int[] array2 = { 10, 324, 45000, 90, 9808 };

        int max2 = arrayMaxFind(array2);
        System.out.println("max for array2 = " + max2);
    }
}
