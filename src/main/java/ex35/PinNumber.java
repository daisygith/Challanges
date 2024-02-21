package ex35;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PinNumber {
    public static boolean validate(String pin) {
        Pattern pattern1 = Pattern.compile("\\S+\\d\\w[^a-z]");
//        Pattern pattern2 = Pattern.compile("[\\w\\d][{6}]");
//        Pattern pattern1 = Pattern.compile("(?=[.\\w\\d][{4}])");
//        Pattern pattern2 = Pattern.compile("(?=[.\\w\\d][{6}])");
        Matcher matcher1 = pattern1.matcher(pin);
//        Matcher matcher2 = pattern2.matcher(pin);

        if((pin.length() == 6 || pin.length() == 4)){
            return matcher1.find();
        }
        return false;

    }
}
