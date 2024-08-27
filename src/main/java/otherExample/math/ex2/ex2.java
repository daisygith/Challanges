package otherExample.math.ex2;

public class ex2 {

    public static void main(String[] args) {
        double a = 12.56;

        int wholeParts = (int) a;

        double rest = a - wholeParts;

        System.out.println("original number: " + a);
        System.out.println("whole number: " + wholeParts);
        System.out.println("rest number: " + rest);
    }
}
