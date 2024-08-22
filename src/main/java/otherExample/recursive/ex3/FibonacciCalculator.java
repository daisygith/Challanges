package otherExample.recursive.ex3;

public class FibonacciCalculator {

    public static int calFibo(int n){

        if (n <= 1){
            return n;
        } else {
            return calFibo(n-1) + calFibo(n-2);
        }

    }

    public static void main(String[] args){

        int num = 0;
        int fibo = calFibo(num);

        System.out.println("Fibonacci: "+ num + " is : " + fibo);

        num = 1;
        fibo = calFibo(num);

        System.out.println("Fibonacci: "+ num + " is : " + fibo);

        num = 9;
        fibo = calFibo(num);

        System.out.println("Fibonacci: "+ num + " is : " + fibo);

    }

}
