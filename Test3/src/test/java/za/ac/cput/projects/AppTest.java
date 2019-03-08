package za.ac.cput.projects;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    App fail;

    @Before
    public void setUp() {
        fail = new App();
    }

    @Test
    public void failExampleTest() {

        if(fail == null){
            fail("Null");
        }

        try {
            fail.method(-1);
            fail("IllegalArgumentException");
        } catch (IllegalArgumentException e) {

        }

    }
}
