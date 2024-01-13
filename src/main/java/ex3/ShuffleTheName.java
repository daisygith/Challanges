package ex3;

public class ShuffleTheName {
    public static String nameShuffle(String s) {

        String[] arrString = s.split(" ");

        for(int i=0; i<=arrString.length-1;i++) {
            System.out.println(arrString[i]);
        }
        String firstName = arrString[0];
        String lastName = arrString[1];

        String fullOfName = lastName + " "+ firstName;

        return fullOfName;
    }
}
