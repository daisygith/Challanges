package ex36;

import java.util.ArrayList;
import java.util.List;

public class PrisonersDilemma {
    public static int[] getCoinBalances(String[] r, String[] b) {

        int [] resultArray = new int[2];

        String steal = "steal";
        String share = "share";

        int personOne = 3;
        int personTwo = 3;

        int length1 = r.length;
        int length2 = b.length;

        if(length1 == length2) {
            for(int i = 0; i <length1; i++){
                if(r[i].equals(share) && b[i].equals(share)){
                    personOne = personOne + 2;
                    personTwo = personTwo + 2;
                } else if (r[i].equals(steal) && b[i].equals(share)) {
                    personOne = personOne + 3;
                    personTwo = personTwo - 1;
                } else if (r[i].equals(share) && b[i].equals(steal)) {
                    personOne = personOne - 1;
                    personTwo = personTwo + 3;
                } else {
                    personOne = personOne;
                    personTwo = personTwo;
                }
            }
        }

        resultArray[0] = personOne;
        resultArray[1] = personTwo;

        return resultArray;
    }
}
