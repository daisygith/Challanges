package ex28;

public class EmptySquareSequence {
    public static int emptySq(int step) {

        int result = 0;

        result = (((step * step) - step)*4);

        return result;
    }
}
