import org.junit.Test;
import static org.junit.Assert.*;

public class CeaserCipherTest {
    @Test
    public void ceaserCipher_takeStringInput_stringArray() {
        CeaserCipher testCeaserCipher = new CeaserCipher();
        String[] expectedOutput = {};
        assertEquals(expectedOutput, testCeaserCipher.doCeaserCipher("hello"));
    }
}
