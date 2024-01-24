package ex27;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class RockPaperScissorsTest {
    @Test
    public void test1() {
        assertEquals("Player 2 wins", RockPaperScissors.rps("rock", "paper"));
    }

    @Test
    public void test2() {
        assertEquals("Player 1 wins", RockPaperScissors.rps("paper", "rock"));
    }

    @Test
    public void test3() {
        assertEquals("Player 2 wins", RockPaperScissors.rps("paper", "scissors"));
    }

    @Test
    public void test4() {
        assertEquals("TIE", RockPaperScissors.rps("scissors", "scissors"));
    }

    @Test
    public void test5() {
        assertEquals("Player 1 wins", RockPaperScissors.rps("scissors", "paper"));
    }
}
