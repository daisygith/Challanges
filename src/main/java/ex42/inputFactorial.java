package ex42;

public class inputFactorial {
    public static boolean isFactorial(int n) {
//        int m = n;
//        int pom = 1;
//        for (int i = 1; i <= n; i++){
//            if (i<=n){
//                pom = pom * i;
//                n = n/i;
//            }
//        }
//
//        if(pom == m){
//            return true;
//        }
//        else {
//            return false;
//        }

        //        Recursion
        return silnia(n, 1, 1);
    }

    public static boolean silnia(int n, int i, int sum){
        if(n==0 || n == sum) return true;
        else if (i > n || n < sum) return false;
        else {
            sum *= i;
            return silnia(n, ++i, sum);
        }
    }

}
