import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class CeaserCipherTest {
    @Test
    public void ceaserCipher_takeStringInput_string() {
        CeaserCipher testCeaserCipher = new CeaserCipher();
        String expectedOutput = new String();
        expectedOutput = "";
        assertEquals(expectedOutput, testCeaserCipher.doCeaserCipher(""));
    }

    @Test
    public void ceaserCipher_changesStringToArrayChar_charArray() {
        CeaserCipher testCeaserCipher = new CeaserCipher();
//        List<Object> expectedOutput = new ArrayList<Object>();
        char expectedChar[] = "hello".toCharArray();
        String expectedOutput = expectedChar.toString();
        //        expectedOutput.add(expectedChar);
        assertEquals(expectedOutput, testCeaserCipher.doCeaserCipher("hello"));

    }
}

