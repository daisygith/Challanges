package ex44;

public class palindromeRecursion {
    public static boolean isPalindrome(String wrd) {
        // your recursive solution here
//        return false;
        return isPalindromeRec(wrd);
    }

    public static boolean isPalindromeRec(String wrd){
//        StringBuilder drw = new StringBuilder();
//        drw.append(wrd);
//        drw.reverse();
//        String drw2 = drw.toString();
//
//        return drw2.equals(wrd);

        if(wrd.length() <= 1){
            return true;
        }

        String firstLetter  = String.valueOf(wrd.charAt(0));
        String lastLetter = String.valueOf(wrd.charAt(wrd.length()-1));

        if(!firstLetter.equals(lastLetter)) {
            return false;
        }

        String wrdRev = wrd.substring(1, wrd.length()-1);
        return isPalindromeRec(wrdRev);

    }
    }

