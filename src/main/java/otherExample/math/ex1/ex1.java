package otherExample.math.ex1;

public class ex1 {

    public static int integerDivision(int a, int b){
        int div = a / b;

        int rest = a%b;

        if(rest > 0){
            div = div + 1;
        }

        return div;
    }

    public static void main(String[] args) {
        int a = 9, b = 3;

        int result =  integerDivision(a,b);

        System.out.println(result);
    }

}
