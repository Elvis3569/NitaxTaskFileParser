package fileStatistics;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GetAllWordsTest {
    private GetAllWords getAllWords;

    @Before
    public void setUp() throws Exception {
        getAllWords = new GetAllWords();
    }

    @Test
    public void processStats() {
        String expected = "The total number of words is = " + 8;
        String actual = getAllWords.processStatistics(expected);

        assertEquals(expected, actual);

    }
}
