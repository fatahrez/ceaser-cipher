import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class CeaserCipherTest {
    @Test
    public void ceaserCipher_takeStringInput_string() {
        CeaserCipher testCeaserCipher = new CeaserCipher();
        assertEquals("hello",testCeaserCipher.doCeaserCipher("hello"));
    }

    @Test
    public void ceaserCipher_changesStringToArrayChar_charArray() {
        CeaserCipher testCeaserCipher = new CeaserCipher();
        char expectedOutput[] = {'h','e','l','l','o'};
        assertEquals(expectedOutput, testCeaserCipher.doCeaserCipher("hello"));

    }
}

