package ex39;

import java.util.ArrayList;

public class HarshadNumber {
    public static boolean isHarshad(int n) {
//        int m = n;
//        int count =0;
//
//        ArrayList<Integer> list = new ArrayList<>();
//        while (n > 0) {
//            list.add(n%10);
//            n/=10;
//        }
//
//        for (int i=0; i<=list.size()-1; i++){
//            count = list.get(i) + count;
//        }
//
//        if(m % count == 0){
//            return true;
//        } else {
//            return false;
//        }

        return isHarshadRec(n,n,0);
    }

    public static boolean isHarshadRec(int originalN, int n, int count) {
        if (n < 10) {
            count += n;
            return originalN % count == 0;
        } else {
            count += n % 10;
            return isHarshadRec(originalN, n / 10, count);
        }
//        //        int count =0;
//        ArrayList<Integer> list = new ArrayList<>();
//        if (n >0) {
//            list.add(n % 10);
//            n /= 10;
//        } if (n<=0) {
//            for (int i=0; i<=list.size()-1; i++){
//            count = list.get(i) + count;
//            }
//            return isHarshadRec(n,count);
//        } else if ( %count==0){
//            return true;
//        } else {
//            return false;
//        }
    }
}


