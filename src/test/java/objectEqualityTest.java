import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Tank on 3/19/2017.
 */
public class objectEqualityTest {
    private employee developer;

    @Before
    public void setUp() throws Exception {
        developer = new employee("Tankiso","developer");
    }

    @Test
    public void testObjectEquality() throws Exception {
        Assert.assertEquals(developer,developer);
    }
}
