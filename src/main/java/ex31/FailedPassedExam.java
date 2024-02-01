package ex31;

public class FailedPassedExam {
    public static String gradePercentage(String userScore, String passScore){
        /*
        	String s = "";
	if (Integer.parseInt(userScore.substring(0,userScore.length())) <= Integer.parseInt(passScore.substring(0,passScore.length()))){
	  s += "PASSED";
	}
	if (Integer.parseInt(userScore.substring(0,userScore.length())) >= Integer.parseInt(passScore.substring(0,passScore.length()))){
	  s += "FAILED";
	}
	return "You " + s + " the Exam";
	}
         */

        String s = "";
        if (Integer.parseInt(userScore.substring(0,userScore.length()-1))
                >= Integer.parseInt(passScore.substring(0,passScore.length()-1))){
            s += "PASSED";
        }
        if (Integer.parseInt(userScore.substring(0,userScore.length()-1)) < Integer.parseInt(passScore.substring(0,passScore.length()-1))){
            s += "FAILED";
        }
//        String user = userScore.substring(0,2);
        return "You " + s + " the Exam";
    }
}
