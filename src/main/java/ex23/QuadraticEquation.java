package ex23;

public class QuadraticEquation {
    public static int quadraticEquation(int a, int b, int c) {
        int x1=0;

        int x3 = 2*a;
        int x2 = b*b ;
        int x22 = -4*a*c;
        int x222 =0;
        if(c<0){
            x222 = x2 + x22;
        } else {
             x222 = x2 - x22;
        }
        if(x2<x22){
            x1 = 0;
        } else {
            double sqrt = Math.sqrt(x222);
            x1 = (int)sqrt;
        }


        int result = Math.abs((-b+x1)/x3);

        return result;


    }
}
