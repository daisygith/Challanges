package ex46;

public class LeftShift {
    public static int shiftToLeft(int x, int y) {
        // recursive code here
//        int solution = 0;

//        return (int)(x * Math.pow(2,y));
        return isRec(x,y);
    }

    public static int isRec(int x, int y){

        if(y < 0 ) {
            return 0;
        } else {
            return (int)(x * Math.pow(2,y));
        }
    }


}
