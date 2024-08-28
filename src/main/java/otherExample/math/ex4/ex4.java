package otherExample.math.ex4;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ex4 {

    public static void main(String[] args) {
        float x = 18.2437964212f;

        int decimal_palace = 5;

        //BigDecimal result;

        System.out.println("Given number:" + x);
        BigDecimal num = new BigDecimal(Float.toString(x));
        num = num.setScale(decimal_palace, RoundingMode.HALF_UP);
        System.out.println("Rounded upto 2 decimal: " + num);


    }

}
