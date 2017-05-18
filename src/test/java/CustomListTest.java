import org.junit.Before;
import org.junit.Test;

import java.math.BigInteger;
import java.util.Random;

import static org.junit.Assert.*;

public class CustomListTest {
    private CustomList<String> testStringsList;

    @Before
    public void init() {
        testStringsList = new CustomList<>();
    }

    @Test
    public void addMoreValuesTest() {
        for (int i = 0; i < 1000; ++i) {
            testStringsList.add((new BigInteger(130, new Random())).toString(32));
        }
        assertTrue("Size should to be 1000" + testStringsList.size(), testStringsList.size() == 1000);
    }

}