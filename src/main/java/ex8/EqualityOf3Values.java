package ex8;

public class EqualityOf3Values {
    public static int equal(int a, int b, int c) {
        int count = 0;

        if (a==b && b==c) {
            count = 3;
        } else if ((a==b && b!=c) || (a==c && a!=b)) {
            count = 2;
        }

        return count;
    }
}
