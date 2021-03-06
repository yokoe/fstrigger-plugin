package org.jenkinsci.plugins.fstrigger.triggers.filecontent;

import org.jenkinsci.plugins.fstrigger.core.FSTriggerContentFileType;
import org.junit.Before;
import org.mockito.MockitoAnnotations;

import java.io.File;
import java.net.URISyntaxException;

/**
 * @author Gregory Boissinot
 */
public class ZIPFileContentTest extends AbstractArchiveFileContentTest {

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        type = new ZIPFileContent();
    }

    public FSTriggerContentFileType getTypeInstance() {
        return type;
    }

    protected File getInitFile() throws URISyntaxException {
        return new File(this.getClass().getResource("ZIPFileContent/initFile.zip").toURI());
    }

    protected File getNewFileAddedFile() throws URISyntaxException {
        return new File(this.getClass().getResource("ZIPFileContent/newFileAddedFile.zip").toURI());
    }

    protected File getNewFileChangedContentOneFile() throws URISyntaxException {
        return new File(this.getClass().getResource("ZIPFileContent/newFileChangedContentOneFile.zip").toURI());
    }

    protected File getNoExistFile() {
        return new File("noExist");
    }

    protected File getNotGoodTypeFile() throws URISyntaxException {
        return new File(this.getClass().getResource("ZIPFileContent/noZIPFile.zip").toURI());
    }
}
