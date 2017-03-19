import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Tank on 3/19/2017.
 */
public class nonNullnessTest {
    private manager informationTechnology;

    @Before
    public void setUp() throws Exception {
        informationTechnology = new manager("Lebo","informationTechnology");

    }

    @Test
    public void testNonNullnessObject() throws Exception {
        Assert.assertNotNull(informationTechnology);
    }


}
