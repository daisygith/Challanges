package ex39;

import java.util.ArrayList;

public class HarshadNumber {
    public static boolean isHarshad(int n) {
        int m = n;
        int count =0;

        ArrayList<Integer> list = new ArrayList<>();
        while (n > 0) {
            list.add(n%10);
            n/=10;
        }

        for (int i=0; i<=list.size()-1; i++){
            count = list.get(i) + count;
        }

        if(m % count == 0){
            return true;
        } else {
            return false;
        }
//        return isHarshadRec(n);
//    }

//    public static boolean isHarshadRec(int n) {
//        ArrayList<Integer> list = new ArrayList<>();
//        if (n != 0) {
//            list.add(n % 10);
//
//        }
    }
}


