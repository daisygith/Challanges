package ex19;

import java.util.Arrays;

public class SquarePatch {
    public static int[][] squarePatch(int n) {

        int[][] newArray = new int[n][n];
        for(int[] row : newArray) {
            Arrays.fill(row, n);
        }

        return newArray;

    }
}
