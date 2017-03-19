import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Tank on 3/18/2017.
 */
public class integerTest {
    integers exam = new integers();

    @Test
    public void testNumbers() throws Exception {
        int results = exam.marks(20,5);
        Assert.assertEquals(25,results);
    }

}
