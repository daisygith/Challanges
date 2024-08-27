package otherExample.recursive.ex13;

public class calculateProduct {

    public static int calProduct(int[] arr){
        return calProduct(arr, 0);
    }

    public static int calProduct(int[] arr, int i){

        if(i==arr.length){
            return 1;
        }

        int count = calProduct(arr,i+1);
        if(i < arr.length){
            count *= arr[i];
        }

        return count;
    }


    public static void main(String[] args) {
        int[] array = {
                1,
                3,
                5,
                7
        };

        int cal = calProduct(array);
        System.out.println(cal);
    }

}
