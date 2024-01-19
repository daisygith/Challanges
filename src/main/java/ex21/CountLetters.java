package ex21;

public class CountLetters {
    public static int letterCounter(char[][] arr, char c) {

        int count = 0;

        for(char[] i : arr){
            for(char j : i){
                if (j == c){
                    count ++;
                } else {
                    count = count;
                }
            }
        }
        return count;
    }
}
