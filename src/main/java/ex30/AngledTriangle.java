package ex30;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AngledTriangle {
    public static boolean rightTriangle(int x, int y, int z) {

        int[] array = {x,y,z};
        Arrays.sort(array); // lowest - highest


        int a = array[0] * array[0];
        int b = array[1] * array[1];
        int sum = a + b;

        int c = array[2] * array[2];

        if(x <= 0 || y <= 0 || z <= 0) {
            return false;
        } else if(c == sum){
                return true;
            } else {
                return false;
            }
        }
    }

