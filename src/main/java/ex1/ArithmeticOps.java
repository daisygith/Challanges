package ex1;

public class ArithmeticOps {
    public static int operate(int num1, int num2, String operator) {

        int result = 0;


        if(num2 <= 0 && operator.equals("/")){
            return 0;
        } else if (operator.equals("+")) {
            result  =num1+num2;
        } else if (operator.equals("-")) {
            result = num1 - (num2);
        } else if (operator.equals("*")) {
            result = num1 * num2;
        } else if (operator.equals("/")) {
            result = num1 / num2;
        } else {
            result = num1 % num2;
        }
        return result;
    }
}
