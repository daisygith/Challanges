package ex32;

public class EuclideanAlgorithm {
    public static int euclidean(int a, int b) {

//        int r = 0;
//        int r2 =0;
//
//        while ((a != b && b != r)) {
//            if (a < b) {
//                b = a;
//                a = b;
//            }
//            if (a >= b) {
//                r = a % b;
//            }
//            if (r != 0) {
//                r2 = b % r;
//                b = r;
//                r = r2;
//            } else {
//                break;
//            }
//        }
        return wynik(a,b);
    }

    private static int wynik(int a, int b) {
        if (a < b) {
            return wynik(b, a);
        } else if (b != 0) {
            return wynik(b, a%b);
        } else {
            return a;
        }
    }
}
