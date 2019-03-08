package za.ac.cput.projects;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    private static App time;

    @BeforeClass
    public static void init() {
        time = new App(500000, 100);
    }

    @Test(timeout = 2000)
    public void totalCashTest() throws InterruptedException {
        assertThat(10.0, is(time.getCash()));
    }

    @Test(timeout = 1000)
    public void totalAccountTest() throws InterruptedException {
        assertThat(100, is(time.getAccount()));
    }
}
