package ex10;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class ReformWordTest {
    @Test
    public void test1() {
        assertEquals("Magazine", ReformWord.getWord("maga", "zine"));
    }

    @Test
    public void test2() {
        assertEquals("Reliable", ReformWord.getWord("reli", "able"));
    }

    @Test
    public void test3() {
        assertEquals("Implicit", ReformWord.getWord("impl", "icit"));
    }

    @Test
    public void test4() {
        assertEquals("Document", ReformWord.getWord("docu", "ment"));
    }

    @Test
    public void test5() {
        assertEquals("Opposite", ReformWord.getWord("oppo", "site"));
    }

    @Test
    public void test6() {
        assertEquals("Official", ReformWord.getWord("offi", "cial"));
    }

    @Test
    public void test7() {
        assertEquals("Disagree", ReformWord.getWord("disa", "gree"));
    }

    @Test
    public void test8() {
        assertEquals("Accident", ReformWord.getWord("acci", "dent"));
    }

    @Test
    public void test9() {
        assertEquals("Omission", ReformWord.getWord("omis", "sion"));
    }

    @Test
    public void test10() {
        assertEquals("Vigorous", ReformWord.getWord("vigo", "rous"));
    }

    @Test
    public void test11() {
        assertEquals("Predator", ReformWord.getWord("pred", "ator"));
    }

    @Test
    public void test12() {
        assertEquals("Progress", ReformWord.getWord("prog", "ress"));
    }

    @Test
    public void test13() {
        assertEquals("Invasion", ReformWord.getWord("inva", "sion"));
    }

    @Test
    public void test14() {
        assertEquals("Farewell", ReformWord.getWord("fare", "well"));
    }

    @Test
    public void test15() {
        assertEquals("Majority", ReformWord.getWord("majo", "rity"));
    }

    @Test
    public void test16() {
        assertEquals("Personal", ReformWord.getWord("pers", "onal"));
    }

    @Test
    public void test17() {
        assertEquals("Sequence", ReformWord.getWord("sequ", "ence"));
    }

    @Test
    public void test18() {
        assertEquals("Governor", ReformWord.getWord("gove", "rnor"));
    }

    @Test
    public void test19() {
        assertEquals("Ignorant", ReformWord.getWord("igno", "rant"));
    }

    @Test
    public void test20() {
        assertEquals("Finished", ReformWord.getWord("fini", "shed"));
    }
}
