package otherExample.recursive.ex7;

public class GCDCalculator {

    public static int calcGCDC(int num1, int num2){
        if(num2==0){
            return num1;
        }

        return calcGCDC(num2, num1%num2);

    }


    public static void main(String[] args) {
        int number1 = 16;
        int number2 = 18;
        int gcd = calcGCDC(number1, number2);
        System.out.println("The GCD of " + number1 + " and " + number2 + " is: " + gcd);
    }
}
