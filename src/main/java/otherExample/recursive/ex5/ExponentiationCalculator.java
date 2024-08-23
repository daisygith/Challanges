package otherExample.recursive.ex5;

public class ExponentiationCalculator {

    public static double power(double a, double b){

        if(b == 0){
            return 1;
        }

        return a * power(a,b-1);

    }

    public static void main(String[] args){
        double a = 3.5, b = 4;
        double res = power(a,b);

        System.out.println(res);
    }
}
