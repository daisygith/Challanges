package ex22;

public class BasicArithOper {
    public static int operation(String a, String b, String op) {
        /*
        add +
        subtract -
        divide /
        multiply *
         */

        int result = 0;
        int one = Integer.valueOf(a);
        int two = Integer.valueOf(b);

        try{
            if(op.equals("add")){
                result = one + two;
            } else if (op.equals("subtract")) {
                result = one - two;
            } else if (op.equals("multiply")) {
                result = one * two;
            } else{
                result = one/two;
            }

        } catch (ArithmeticException e){
            //System.out.println(e);
            return Integer.MIN_VALUE;
        }
        return result;



    }
}
