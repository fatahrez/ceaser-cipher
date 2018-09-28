import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class CeaserCipherTest {
    @Test
    public void ceaserCipher_takeStringInput_arrayList() {
        CeaserCipher testCeaserCipher = new CeaserCipher();
        List<Object> expectedOutput = new ArrayList<Object>();
        expectedOutput.add("");
        assertEquals(expectedOutput, testCeaserCipher.doCeaserCipher("hello"));
    }

    @Test
    public void ceaserCipher_changesStringTOArrayChar() {
        CeaserCipher testCeaserCipher = new CeaserCipher();
        
    }
}

