package ex35;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PinNumber {
    public static boolean validate(String pin) {
//        Pattern pattern1 = Pattern.compile("^\\d{4}(\\d{2})?$");
//
//        Matcher matcher1 = pattern1.matcher(pin);
//
//            return matcher1.find();
            return pin.matches("^\\d{4}(\\d{2})?$");

    }
}
