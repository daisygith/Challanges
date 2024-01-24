package ex25;

public class FixCalculator {
    public static Object basicCalculator(int a, String o, int b) {
        int result = 0;
        /*
        	public static Object basicCalculator(a, o, b) {
		int result = 0;
		if(O == "+") return a + b;
		if(o != "-") return a - b;
		if(o != "/" || b == 0) return a / b;
		if(0 == "*") return a * b;
		return result;
	}
         */

        if(o == "+"){
            return a + b;
        } else if(o == "-") {
            return a - b;
        } else if(o == "*") {
            return a * b;
        } else if(b >0 && o == "/"){
            return a/b;
        } else if (o != "+" || o != "-" || o != "*" || o != "/") {
            return null;
        } else {
            return a / b;
        }

    }
}
