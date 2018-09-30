import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class CeaserCipherTest {
    @Test
    public void ceaserCipher_takeStringInput_string() {
        CeaserCipher testCeaserCipher = new CeaserCipher();
        String expectedOutput = new String();
        expectedOutput = "lipps";
        assertEquals(expectedOutput, testCeaserCipher.doCeaserCipher("hello", 4));
    }

    @Test
    public void ceaserCipher_doesEncryption_string() {
        CeaserCipher testCeaserCipher = new CeaserCipher();
        StringBuffer expectedOutput = new StringBuffer();
        expectedOutput.append("lipps");
        assertEquals(expectedOutput, testCeaserCipher.doCeaserCipher("hello", 4));

    }

    @Test
    public void ceaserCipher_doesDecryption_string() {
        CeaserCipher testCeaserCipher =  new CeaserCipher();
        String expectedOutput = new String();
        expectedOutput = "hello";
        assertEquals(expectedOutput, testCeaserCipher.unDoCeaserCipher("lipps", 4));
    }
}