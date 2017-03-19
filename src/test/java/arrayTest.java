import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by Tank on 3/19/2017.
 */
public class arrayTest {

    @Test
    public void testArrayMethod() throws Exception {
        ArrayList<String> list = new ArrayList<String>();
        for (int counter = 0; counter < list.size(); counter++) {
            Assert.assertNull(list.indexOf(counter));
        }

    }
}
