package za.ac.cput.projects;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FailingTest {


    Failing fail;

    @Before
    public void setUp() {
        fail = new Failing();
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