package ex14;

public class VowelCounter {
    public static int getCount(String str) {

        int vowelsCount = 0;
        char ch = 0;

        str = str.toLowerCase();

        for(int i =0; i<str.length(); i++){
            ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                vowelsCount ++;
            } else {
                vowelsCount = vowelsCount;
            }
        }

        return vowelsCount;
    }
}
