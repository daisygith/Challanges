package ex33;

public class BinarySearch {
    public static boolean binarySearch(int arr[], int left, int right, int elem) {

        while(left<=right){
            int middle = (left+right)/2;
            if (arr[middle] <elem){
                left=middle+1;
            } else if (arr[middle] > elem) {
                right=middle-1;
            }
            else {
                return true;
            }
        }

        return false;

    }

}
