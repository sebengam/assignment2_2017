import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Tank on 3/19/2017.
 */
public class truthTest {

    private employee developer;

    @Before
    public void setUp() throws Exception {
        developer = new employee("Cindy", "Science");

    }

    @Test
    public void testTruth() throws Exception {
        Assert.assertTrue(true);
        Assert.assertTrue(developer.getName().equalsIgnoreCase(developer.getName()));
    }

}
