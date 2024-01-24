package ex26;

public class AddingNumbers {
    public static String add(String a, String b) {

        int result = 0;
        String resultString = "";

        if(a.equals("") || a.equals(null) || b.equals("") || b.equals(null)){
            resultString = "Invalid Operation";
        } else {
            Integer valueOfA = Integer.valueOf(a);
            Integer valueOfB = Integer.valueOf(b);

            result = valueOfA+valueOfB;

            resultString = Integer.toString(result);
        }

        return resultString;

    }
}
