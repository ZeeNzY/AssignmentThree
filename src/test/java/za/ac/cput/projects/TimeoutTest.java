package za.ac.cput.projects;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class TimeoutTest {

    private static Timeout time;

    @BeforeClass
    public static void init() {
        time = new Timeout(500000, 100);
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