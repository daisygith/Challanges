package ex33;

public class BinarySearch {
    public static boolean binarySearch(int arr[], int left, int right, int elem) {
        return binarySearchRec(arr, left, right, elem);
//        while(left<=right){
//            int middle = (left+right)/2;
//            if (arr[middle] <elem){
//                left=middle+1;
//            } else if (arr[middle] > elem) {
//                right=middle-1;
//            }
//            else {
//                return true;
//            }
//        }
//
//        return false;

    }
    public static boolean binarySearchRec(int arr[], int left, int right, int elem) {

        if (left <= right) {
            int middle = (left+right)/2;
            if (arr[middle] <elem){
                return binarySearchRec(arr, middle+1, right, elem);
            } else if (arr[middle] > elem) {
                return binarySearchRec(arr, left, middle-1, elem);
            }
            else {
                return true;
            }
        }
        return false;
    }
}
