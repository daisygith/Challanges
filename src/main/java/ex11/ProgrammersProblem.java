package ex11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProgrammersProblem {
    public static int programmers(int one, int two, int three) {
        int result = 0;

        List<Integer> listNumber = new ArrayList<>();
        listNumber.add(one);
        listNumber.add(two);
        listNumber.add(three);

        int max = Collections.max(listNumber);
        int min = Collections.min(listNumber);

        result = max - min;

        return result;

    }
}
