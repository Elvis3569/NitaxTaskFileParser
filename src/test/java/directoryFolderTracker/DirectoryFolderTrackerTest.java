package directoryFolderTracker;
import org.junit.Test;

import java.nio.file.Path;

import static org.mockito.Mockito.*;


public class DirectoryFolderTrackerTest {

    @Test
    public void DirectoryFolderTracker() {
        DirectoryFolderTracker directoryFolderTracker =  mock(DirectoryFolderTracker.class);
        doNothing().when(directoryFolderTracker).monitorDirectoryFolder();
        directoryFolderTracker.monitorDirectoryFolder();
        verify(directoryFolderTracker, times(1)).monitorDirectoryFolder();
    }



    @Test
    public void createProcessedFolder() {
        Path path = mock(Path.class);
        DirectoryFolderTracker directoryFolderTracker = new DirectoryFolderTracker(path);
        directoryFolderTracker.createProcessedFolder(path);

        verify(path, times(1)).resolve("processedFolder");
    }
}
