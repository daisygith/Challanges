package ex29;

public class VideoLength {
    public static int minutesToSeconds(String tm) {

        int result = 0;

        String[] arrTm = tm.split(":");

        int numberOne = Integer.valueOf(arrTm[0]);
        int numberTwo = Integer.valueOf(arrTm[1]);

        if(numberTwo >= 60){
            result  = -1;
        } else{
            numberOne = numberOne*60;
            result = numberOne + numberTwo;
        }
        return result;
    }
}
