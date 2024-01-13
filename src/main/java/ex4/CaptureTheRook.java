package ex4;

public class CaptureTheRook {
    public static boolean canCapture(String[] rooks) {

        String rooks1 = rooks[0];
        String rooks2 = rooks[1];

        // first word
        String subRooks11 = "";
        String subRooks12 = "";

        // second word
        String subRooks21 = "";
        String subRooks22 = "";

        // first part of word
        subRooks11 = rooks1.substring(0,1);
        subRooks21 = rooks2.substring(0,1);

        // second part of word
        subRooks12 = rooks1.substring(1,2);
        subRooks22 = rooks2.substring(1,2);

        if((subRooks11.equals(subRooks21)) || (subRooks12.equals(subRooks22))){
            return true;
        } else {
            return false;
        }

    }
}
