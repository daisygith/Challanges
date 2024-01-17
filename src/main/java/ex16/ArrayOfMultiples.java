package ex16;

public class ArrayOfMultiples {
    public static int[] arrayOfMultiples(int num, int length) {

        int[] arrayOfMultiples = new int[length];

        arrayOfMultiples[0] = num;
        for(int i = 1; i<arrayOfMultiples.length; i++){
            arrayOfMultiples[i] = arrayOfMultiples[i-1] + num;
        }
        return arrayOfMultiples;
    }
}
