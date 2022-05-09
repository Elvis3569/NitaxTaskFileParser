package fileProcessing;

import org.junit.Before;
import org.junit.Test;

import java.nio.file.Path;
import static org.junit.Assert.*;


public class FileProcessTest {
    FileProcess fileProcess;

    @Before
    public void setup() throws Exception {
        fileProcess = new FileProcess();
    }

    @Test
    public void readFileShouldReadARandomFile() {
        String expected = "Random test";
        String actual = fileProcess.readFile(Path.of("src/test/resources/testfile.txt"));
        assertEquals("Should return random Test", expected, actual);

    }

}
