package ex9;

public class ReverseOrder {
    public static String reverse(final String str) {

        StringBuffer strReverse = new StringBuffer(str).reverse();

        return String.valueOf(strReverse);

    }
}
