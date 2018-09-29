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
        String expectedOutput = new String();
        expectedOutput = "lipps";
        assertEquals(expectedOutput, testCeaserCipher.doCeaserCipher("hello", 4));

    }

    @Test
    public void ceaserCipher_doesDecryption_string() {
        CeaserCipher testCeaaserCipher =  new CeaserCipher();
        String expectedOutput = new String();
        expectedOutput = "hello";
        assertEquals(expectedOutput, testCeaaserCipher.unDoCeaserCipher("lipps", 4));
    }
}