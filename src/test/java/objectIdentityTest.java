import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Tank on 3/19/2017.
 */
public class objectIdentityTest {
    private manager informationTechnology;
    private employee developer;
    private employee analyst;

    @Before
    public void setUp() throws Exception {
        informationTechnology = new  manager("Tankiso", "informationTechnology");
        developer = new employee("Luthando", "developer");
        analyst = new employee("Lusanda","analyst");
    }

    @Test
    public void testObjectIdentity() throws Exception {
        Assert.assertSame(informationTechnology, informationTechnology);
        Assert.assertNotSame(developer,analyst);
    }

}
