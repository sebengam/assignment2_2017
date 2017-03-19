import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Tank on 3/19/2017.
 */
public class nullNessTest {
    private employee developer;

    @Before
    public void setUp() throws Exception {
        developer = new employee("tankiso","developer");
    }

    @Test
    public void testNullness() throws Exception {
        developer = null;
        Assert.assertNull(developer);
    }
}


