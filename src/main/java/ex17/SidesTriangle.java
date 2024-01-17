package ex17;

public class SidesTriangle {
    public static double[] otherSides(int n) {

        double[] array = new double[2];

        double oneSide = 2*n;
        double sqrt = Math.sqrt(3);
        double secondSide = n*sqrt;

        array[0] = oneSide;
        array[1] = secondSide;

        return array;

    }
}
