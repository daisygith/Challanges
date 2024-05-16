package ex43;


public class perimeterTriangle {
    public static double perimeter(int[][] point) {

        double x1 = point[0][0];//A
        double y1 = point[0][1];//A
        double x2 = point[1][0];//B
        double y2 = point[1][1];//B
        double x3 = point[2][0];//C
        double y3 = point[2][1];//C

        double ab1 = Math.pow(x2-x1,2);
        double ab2 = Math.pow(y2-y1,2);

        double aB = Math.sqrt(ab1+ab2);

        double ac1 = Math.pow(x3-x1,2);
        double ac2 = Math.pow(y3-y1,2);

        double aC = Math.sqrt(ac1+ac2);

        double bc1 = Math.pow(x3-x2,2);
        double bc2 = Math.pow(y3-y2,2);

        double bC = Math.sqrt(bc1+bc2);

        return aB+aC+bC;

    }
}
