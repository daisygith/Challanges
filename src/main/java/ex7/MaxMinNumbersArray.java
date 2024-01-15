package ex7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaxMinNumbersArray {
    public static int differenceMaxMin(int[] arr) {

        int diffMaxMin = 0;

        List<Integer> list = new ArrayList<>();
        for(Integer i : arr){
            list.add(i);
        }

        int max = Collections.max(list);
        int min = Collections.min(list);

        int minAbs = Math.abs(min);

        if(min < 0){
            diffMaxMin = minAbs + max;
        } else {
            diffMaxMin = max - min;
        }
        return diffMaxMin;
    }
}
