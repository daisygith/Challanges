package ex34;


import java.util.Arrays;


public class SevenBoom {
    public static String sevenBoom(int[] arr) {

        String[] strArray = Arrays.stream(arr)
                .mapToObj(String::valueOf)
                .toArray(String[]::new);

        for(String i : strArray){
            if(i.contains("7")){
                return "Boom!";
            }
        }
        return "there is no 7 in the array";

    }
}
