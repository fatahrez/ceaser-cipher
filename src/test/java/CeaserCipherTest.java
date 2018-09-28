import org.junit.Test;
import static org.junit.Assert.*;

public class CeaserCipherTest {
    @Test
    public void ceaserCipher_takeStringInput_stringType() {
        CeaserCipher testCeaserCipher = new CeaserCipher();
//        String expectedOutput = new String();
        assertEquals(true, testCeaserCipher.doCeaserCipher("hello"));
    }
}
