package ex12;

import java.util.Arrays;

//"(123) 456-7890"

public class PhoneNumberFormatting {
    public static String formatPhoneNumber(int[] nums) {
        String sentence = "";
        String oneS = "";
        String secondS = "";
        String thirdS = "";
        String phoneNumber ="";

        int sizeNums = nums.length;

        String str = Arrays.toString(nums);

        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < nums.length; i++) {
            sb.append(nums[i]);
        }
        sentence = sb.toString();


        oneS = sentence.substring(0,3);
        secondS = sentence.substring(3,6);
        thirdS = sentence.substring(6,sizeNums);

        phoneNumber = "("+oneS+")"+" "+secondS+"-"+thirdS;

        return phoneNumber;



    }
}
