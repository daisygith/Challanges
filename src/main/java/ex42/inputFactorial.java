package ex42;

public class inputFactorial {
    public static boolean isFactorial(int n) {
        int m = n;
        int pom = 1;
        for (int i = 1; i <= n; i++){
            if (i<=n){
                pom = pom * i;
                n = n/i;
            }
        }

        if(pom == m){
            return true;
        }
        else {
            return false;
        }

    }
}
