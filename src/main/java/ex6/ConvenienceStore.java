package ex6;

/*
 * quarter: 25 cents / $0.25
 * dime: 10 cents / $0.10
 * nickel: 5 cents / $0.05
 * penny: 1 cent / $0.01
 */
public class ConvenienceStore {
    public static boolean changeEnough(int[] change, double amountDue) {

        double quarter = change[0] * 0.25;
        double dime = change[1] * 0.10;
        double nickel = change[2] * 0.05;
        double penny = change[3] * 0.01;

        double sumAll = quarter+dime+nickel+penny;

        if(sumAll>= amountDue){
            return true;
        } else {
            return false;
        }
    }
}
