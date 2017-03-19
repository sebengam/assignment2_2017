import junit.framework.Assert;

/**
 * Created by Tank on 3/18/2017.
 */
public class floatingPointsTest {

    floatingPoints newSalary = new floatingPoints();

    @org.junit.Test
    public void testFloat() throws Exception {

        float results = newSalary.salaryIncrease(500.0f,15.2f);
        Assert.assertEquals(515.2f,results, 0.0f);
    }
}
