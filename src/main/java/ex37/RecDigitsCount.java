package ex37;

public class RecDigitsCount {
    public static int count(int n) {
       return countRec(0, n);
    }

    public static int countRec(int sum, int n){
        if(n==0){
            return sum>0 ? sum : 1;
        } else if(n<0){
            return countRec(sum, Math.abs(n));
        } else {
            return countRec(sum + 1, n/10);
        }
    }


}
