package ex38;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ConsecutiveNumbers {
    public static boolean cons(int[] arr) {

        Arrays.sort(arr);
        for(int i = 0; i <= arr.length-2; i++){
            if ((arr[i + 1] - arr[i]) != 1) {
                return false;
            }
        }
        return true;

    }
}
