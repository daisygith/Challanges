package otherExample.recursive.ex2;

public class SumCalculator {


    public static int calculatorSum(int n){

        if(n == 0){
            return 0;
        }

        return n + calculatorSum(n-1);
    }

    public static void main(String[] args) {
        int numb= 7;
        int sum = calculatorSum(numb);

        System.out.println("Sum number: " + numb + "is: " + sum);
    }
}
