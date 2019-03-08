package za.ac.cput.projects;

import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.isA;
import static org.junit.Assert.*;

public class DisablingTest {

    private String zeeMsg = "Zinzi Testing";
    private Disabling dis = new Disabling(zeeMsg);

    @Test
    public void testPrintMessage() {
        assertThat(dis.printMessage(), isA(String.class));
        assertEquals(zeeMsg, dis.printMessage());

    }

    @Test
    public void testSalutationMessage() {
        String messageSal = dis.sayHi();
        assertThat(messageSal, isA(String.class));
        assertEquals("Heyie!" + zeeMsg,messageSal);
    }


    @Ignore
    @Test
    public void testSalutationMessageForExecutives() {
        assertThat(dis.zinziMessage(), isA(String.class));
        assertEquals(zeeMsg, dis.sayHi());
    }


}