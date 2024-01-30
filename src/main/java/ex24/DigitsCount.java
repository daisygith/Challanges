package ex24;

public class DigitsCount {
    public static int count(int n) {

        int count =0;

        if (n==0){
            count =1;
        }
        if(n<0){
            n=Math.abs(n);
        }
        while (n>0){
            n=n/10;
            count++;
        }

        return count;

    }
}
