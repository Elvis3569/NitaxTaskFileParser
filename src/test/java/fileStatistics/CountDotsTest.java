package fileStatistics;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CountDotsTest {
    CountDots countDots;

    @Before
    public void setUp() throws Exception {
        countDots = new CountDots();
    }

    @Test
    public void shouldCountTheNumberOfDots_SimpleTest() {
        String expected = "The total number of dots is = " + 5;
        String actual = countDots.processStatistics(".....");

        assertEquals(expected, actual);

    }
}
